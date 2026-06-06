package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.*;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsModel;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsNode;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Command: full-field-lineage — get full field lineage for a node and aliases.
 * Refs SRS-10.07
 */
public class FullFieldLineageCommand implements CliCommand {

  @Override
  public String getName() {
    return "full-field-lineage";
  }

  @Override
  public String getDescription() {
    return "Get full field lineage for a node and list of aliases";
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

    List<String> aliases = CliArgumentValidator.getStringList(args, "aliases");
    if (aliases == null || aliases.isEmpty()) {
      // Try comma-separated string
      String aliasesStr = CliArgumentValidator.getString(args, "aliases");
      if (aliasesStr != null && !aliasesStr.isEmpty()) {
        aliases = List.of(aliasesStr.split(","));
      }
    }
    if (aliases == null || aliases.isEmpty()) {
      throw new com.github._1c_syntax.bsl.parser.sdql.cli.CliValidationException("MISSING_ARGUMENT", "aliases is required");
    }

    ModelRepository repository = new FileSystemModelRepository(artifactsDir);
    FullParsModel model = repository.loadFullParsModel(baseName);

    NodeResolver resolver = new NodeResolverImpl();
    Integer nodeId = args.containsKey("nodeId") ? CliArgumentValidator.getInt(args, "nodeId", -1) : null;
    if (nodeId != null && nodeId == -1) nodeId = null;
    String nodeName = CliArgumentValidator.getString(args, "nodeName");
    FullParsNode node = resolver.resolve(model, nodeId, nodeName);

    FflBuilder builder = new FflBuilder();
    var fflNodes = builder.build(model, node.getId(), aliases);

    Map<String, Object> response = new LinkedHashMap<>();
    response.put("baseName", baseName);
    response.put("nodeId", node.getId());
    response.put("nodeName", node.getName());
    response.put("aliases", aliases);
    response.put("fflNodes", fflNodes);
    return response;
  }
}
