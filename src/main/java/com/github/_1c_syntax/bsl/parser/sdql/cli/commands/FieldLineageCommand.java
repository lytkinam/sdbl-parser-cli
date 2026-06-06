package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.*;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliValidationException;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsModel;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsNode;
import com.github._1c_syntax.bsl.parser.sdql.line_pars.FieldLineageNode;
import com.github._1c_syntax.bsl.parser.sdql.line_pars.HierarchyNode;
import com.github._1c_syntax.bsl.parser.sdql.line_pars.LineParsFieldExtractor;
import com.github._1c_syntax.bsl.parser.sdql.line_pars.LineParsModel;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Command: field-lineage — get field lineage for a node and alias.
 * Refs SRS-10.07
 */
public class FieldLineageCommand implements CliCommand {

  @Override
  public String getName() {
    return "field-lineage";
  }

  @Override
  public String getDescription() {
    return "Get field lineage for a specific node and alias";
  }

  @Override
  public String getUsage() {
    return """
      Options:
        --artifacts-dir PATH  Directory with artifacts (required)
        --base-name NAME      Base name of artifacts (required)
        --node-id ID          Node ID (alternative to --node-name)
        --node-name NAME      Node name (alternative to --node-id)
        --alias ALIAS         Field alias (required)
        --help                Show this message
      """;
  }

  @Override
  public Object execute(Map<String, Object> args) {
    CliArgumentValidator.require(args, "artifactsDir");
    CliArgumentValidator.require(args, "baseName");
    CliArgumentValidator.requireOneOf(args, "nodeId", "nodeName");
    CliArgumentValidator.require(args, "alias");

    Path artifactsDir = Path.of(CliArgumentValidator.getString(args, "artifactsDir"));
    String baseName = CliArgumentValidator.getString(args, "baseName");
    String alias = CliArgumentValidator.getString(args, "alias");

    ModelRepository repository = new FileSystemModelRepository(artifactsDir);
    FullParsModel model = repository.loadFullParsModel(baseName);

    NodeResolver resolver = new NodeResolverImpl();
    Integer nodeId = args.containsKey("nodeId") ? CliArgumentValidator.getInt(args, "nodeId", -1) : null;
    if (nodeId != null && nodeId == -1) nodeId = null;
    String nodeName = CliArgumentValidator.getString(args, "nodeName");
    FullParsNode node = resolver.resolve(model, nodeId, nodeName);

    FieldLineageNode lineage = repository.loadFieldLineage(baseName, node.getId(), alias);
    if (lineage == null) {
      lineage = buildOnTheFly(repository, baseName, node.getId(), alias);
    }

    Map<String, Object> response = new LinkedHashMap<>();
    response.put("baseName", baseName);
    response.put("nodeId", node.getId());
    response.put("nodeName", node.getName());
    response.put("alias", alias);
    response.put("lineage", lineage);
    return response;
  }

  private FieldLineageNode buildOnTheFly(ModelRepository repository, String baseName, int nodeId, String alias) {
    try {
      LineParsModel lineParsModel = repository.loadLineParsModel(baseName);
      List<HierarchyNode> hierarchy = repository.loadHierarchy(baseName);
      if (lineParsModel == null || hierarchy == null || hierarchy.isEmpty()) {
        FieldLineageNode node = new FieldLineageNode();
        node.setId(nodeId);
        node.setAlias(alias);
        return node;
      }
      LineParsFieldExtractor extractor = new LineParsFieldExtractor(lineParsModel, hierarchy);
      return extractor.extract(nodeId, alias);
    } catch (Exception e) {
      FieldLineageNode node = new FieldLineageNode();
      node.setId(nodeId);
      node.setAlias(alias);
      return node;
    }
  }
}
