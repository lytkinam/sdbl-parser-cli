package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.FileSystemModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.api.ModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;

import java.nio.file.Path;
import java.util.Map;

/**
 * Command: line-pars-model — read LINE_PARS model from artifacts.
 * Refs SRS-10.06
 */
public class LineParsModelCommand implements CliCommand {

  @Override
  public String getName() {
    return "line-pars-model";
  }

  @Override
  public String getDescription() {
    return "Get LINE_PARS model from artifacts";
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
    return repository.loadLineParsModel(baseName);
  }
}
