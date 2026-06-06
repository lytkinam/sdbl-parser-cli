package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.FileSystemModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.api.ModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsModel;
import com.github._1c_syntax.bsl.parser.sdql.full_pars.FullParsNode;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Command: list-nodes — list all nodes from FULL_PARS model.
 * Refs SRS-10.06
 */
public class ListNodesCommand implements CliCommand {

  @Override
  public String getName() {
    return "list-nodes";
  }

  @Override
  public String getDescription() {
    return "List all nodes from artifacts";
  }

  @Override
  public String getUsage() {
    return """
      Options:
        --artifacts-dir PATH  Directory with artifacts (required)
        --base-name NAME      Base name of artifacts (required)
        --node-type TYPE      Filter by node type (optional)
        --help                Show this message
      """;
  }

  @Override
  public Object execute(Map<String, Object> args) {
    CliArgumentValidator.require(args, "artifactsDir");
    CliArgumentValidator.require(args, "baseName");

    Path artifactsDir = Path.of(CliArgumentValidator.getString(args, "artifactsDir"));
    String baseName = CliArgumentValidator.getString(args, "baseName");
    String nodeTypeFilter = CliArgumentValidator.getString(args, "nodeType");

    ModelRepository repository = new FileSystemModelRepository(artifactsDir);
    FullParsModel model = repository.loadFullParsModel(baseName);

    List<Map<String, Object>> nodes = new ArrayList<>();
    for (FullParsNode n : model.getNodes()) {
      if (nodeTypeFilter == null || nodeTypeFilter.equals(n.getType())) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("id", n.getId());
        m.put("name", n.getName());
        m.put("type", n.getType());
        m.put("sdblId", n.getSdblId());
        nodes.add(m);
      }
    }

    Map<String, Object> response = new LinkedHashMap<>();
    response.put("nodes", nodes);
    return response;
  }
}
