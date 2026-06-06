package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.*;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliValidationException;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsModel;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsNode;
import com.github._1c_syntax.bsl.parser.sdql.query_reconstruction.QueryNodeBuilder;
import com.github._1c_syntax.bsl.parser.sdql.query_reconstruction.RestoredQueryNode;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Command: restore-query — restore SQL from FFL nodes.
 * Refs SRS-10.07
 */
public class RestoreQueryCommand implements CliCommand {

  @Override
  public String getName() {
    return "restore-query";
  }

  @Override
  public String getDescription() {
    return "Restore SQL query from full field lineage";
  }

  @Override
  public String getUsage() {
    return """
      Options:
        --artifacts-dir PATH  Directory with artifacts (required)
        --base-name NAME      Base name of artifacts (required)
        --node-id ID          Node ID (alternative to --node-name)
        --node-name NAME      Node name (alternative to --node-id)
        --aliases ALIASES     Comma-separated list of field aliases (required)
        --format FORMAT       Output format: sql or json (default: sql)
        --help                Show this message
      """;
  }

  @Override
  public Object execute(Map<String, Object> args) {
    CliArgumentValidator.require(args, "artifactsDir");
    CliArgumentValidator.require(args, "baseName");
    CliArgumentValidator.requireOneOf(args, "nodeId", "nodeName");
    CliArgumentValidator.require(args, "aliases");

    Path artifactsDir = Path.of(CliArgumentValidator.getString(args, "artifactsDir"));
    String baseName = CliArgumentValidator.getString(args, "baseName");
    String format = CliArgumentValidator.getString(args, "format", "sql");

    List<String> aliases = CliArgumentValidator.getStringList(args, "aliases");
    if (aliases == null || aliases.isEmpty()) {
      String aliasesStr = CliArgumentValidator.getString(args, "aliases");
      if (aliasesStr != null && !aliasesStr.isEmpty()) {
        aliases = List.of(aliasesStr.split(","));
      }
    }
    if (aliases == null || aliases.isEmpty()) {
      throw new CliValidationException("MISSING_ARGUMENT", "aliases is required");
    }

    ModelRepository repository = new FileSystemModelRepository(artifactsDir);
    FullParsModel model = repository.loadFullParsModel(baseName);

    NodeResolver resolver = new NodeResolverImpl();
    Integer nodeId = args.containsKey("nodeId") ? CliArgumentValidator.getInt(args, "nodeId", -1) : null;
    if (nodeId != null && nodeId == -1) nodeId = null;
    String nodeName = CliArgumentValidator.getString(args, "nodeName");
    FullParsNode node = resolver.resolve(model, nodeId, nodeName);

    FflBuilder builder = new FflBuilder();
    List<FullParsNode> fflNodes = builder.build(model, node.getId(), aliases);

    Map<Integer, FullParsNode> fullParsById = model.getNodes().stream()
      .collect(Collectors.toMap(FullParsNode::getId, n -> n));

    if ("json".equals(format)) {
      Map<Integer, FullParsNode> fflById = fflNodes.stream()
        .collect(Collectors.toMap(FullParsNode::getId, n -> n));
      QueryNodeBuilder nodeBuilder = new QueryNodeBuilder(fflById, fullParsById);
      if (fflNodes.isEmpty()) {
        throw new CliValidationException("PIPELINE_ERROR", "No FFL nodes built");
      }
      RestoredQueryNode restored = nodeBuilder.build(fflNodes.get(0));
      Map<String, Object> response = new LinkedHashMap<>();
      response.put("restoredQueryNode", restored);
      return response;
    } else {
      QueryRestorer restorer = new QueryRestorerImpl();
      String sql = restorer.restore(fflNodes, fullParsById);
      Map<String, Object> response = new LinkedHashMap<>();
      response.put("baseName", baseName);
      response.put("nodeId", node.getId());
      response.put("nodeName", node.getName());
      response.put("aliases", aliases);
      response.put("sql", sql);
      return response;
    }
  }
}
