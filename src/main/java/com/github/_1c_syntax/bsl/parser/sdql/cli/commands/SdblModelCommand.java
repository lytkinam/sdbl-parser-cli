package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.FileSystemModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.api.ModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliValidationException;

import java.nio.file.Path;
import java.util.Map;

/**
 * Command: sdbl-model — read SDBL model from artifacts.
 * Refs SRS-10.06
 */
public class SdblModelCommand implements CliCommand {

  @Override
  public String getName() {
    return "sdbl-model";
  }

  @Override
  public String getDescription() {
    return "Get SDBL parse model from artifacts";
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
    return repository.loadSdblModel(baseName);
  }
}
