package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.FileSystemModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.api.ModelRepository;
import com.github._1c_syntax.bsl.parser.sdql.api.SdqlApiException;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliArgumentValidator;
import com.github._1c_syntax.bsl.parser.sdql.cli.CliCommand;
import com.github._1c_syntax.bsl.parser.sdql.query_extraction.VerificationReport;

import java.nio.file.Path;
import java.util.Map;

/**
 * Command: verify — read verification report from artifacts.
 * Refs SRS-10.06
 */
public class VerifyCommand implements CliCommand {

  @Override
  public String getName() {
    return "verify";
  }

  @Override
  public String getDescription() {
    return "Get verification report from artifacts";
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
    try {
      return repository.loadVerificationReport(baseName);
    } catch (SdqlApiException e) {
      // Return empty report if not found (same behavior as MCP)
      VerificationReport report = new VerificationReport();
      report.setBaseName(baseName);
      report.setTotalNodes(0);
      report.setMatched(0);
      report.setMismatched(0);
      return report;
    }
  }
}
