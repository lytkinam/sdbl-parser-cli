package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.FileSystemModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.api.ModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;

import java.nio.file.Path;
import java.util.Map;

/**
 * Command: hierarchy — read hierarchy from artifacts.
 * Refs SRS-10.06
 */
public class HierarchyCommand implements CliCommand {

  @Override
  public String getName() {
    return "hierarchy";
  }

  @Override
  public String getDescription() {
    return "Get node hierarchy from artifacts";
  }

  @Override
  public String getUsage() {
    return """
      Options:
        --artifacts-dir PATH  Directory with artifacts (required)
        --base-name NAME      Base name of artifacts (required)
        --help                Show this message
      """;
  }

  @Override
  public Object execute(Map<String, Object> args) {
    CliArgumentValidator.require(args, "artifactsDir");
    CliArgumentValidator.require(args, "baseName");

    Path artifactsDir = Path.of(CliArgumentValidator.getString(args, "artifactsDir"));
    String baseName = CliArgumentValidator.getString(args, "baseName");

    ModelRepository repository = new FileSystemModelRepository(artifactsDir);
    return repository.loadHierarchy(baseName);
  }
}
