package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.api.*;
import com.github._1c_syntax.bsl.parser.sdql.cli.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Command: analyze — full SQL package analysis.
 * Refs SRS-10.05, SRS-10.09
 */
public class AnalyzeCommand implements CliCommand {

  @Override
  public String getName() {
    return "analyze";
  }

  @Override
  public String getDescription() {
    return "Analyze SQL package and return metadata with artifact paths";
  }

  @Override
  public String getUsage() {
    return """
      Options:
        --sql-file PATH       Path to SQL file (alternative to --sql-text)
        --sql-text TEXT       SQL text directly
        --output-dir PATH     Directory for artifacts (required in offline mode)
        --base-name NAME      Base name for artifacts (optional, auto-generated)
        --detailed            Include detailed models
        --online              Do not persist artifacts (temp dir, inline models)
        --help                Show this message
      """;
  }

  @Override
  public Object execute(Map<String, Object> args) {
    String sqlText = CliArgumentValidator.getString(args, "sqlText");
    String sqlFile = CliArgumentValidator.getString(args, "sqlFile");
    String outputDirStr = CliArgumentValidator.getString(args, "outputDir");
    String baseName = CliArgumentValidator.getString(args, "baseName");
    boolean detailed = CliArgumentValidator.getBoolean(args, "detailed", false);
    boolean online = CliArgumentValidator.getBoolean(args, "online", false);

    // Resolve SQL text
    if (sqlText == null && sqlFile == null) {
      throw new CliValidationException("MISSING_ARGUMENT",
        "Either sqlText or sqlFile is required for command 'analyze'");
    }

    if (sqlText == null) {
      Path filePath = Path.of(sqlFile);
      if (!Files.exists(filePath)) {
        throw new CliValidationException("FILE_NOT_FOUND",
          "SQL file not found: " + sqlFile);
      }
      try {
        sqlText = Files.readString(filePath);
      } catch (IOException e) {
        throw new CliValidationException("READ_ERROR",
          "Failed to read SQL file: " + e.getMessage());
      }
    }

    // Size check (SRS-10.10)
    if (sqlText.length() > 10 * 1024 * 1024) {
      throw new CliValidationException("INPUT_TOO_LARGE",
        "SQL text exceeds 10 MB limit");
    }

    if (online) {
      SdqlPipeline pipeline = new SdqlPipelineImpl(new InMemoryModelRepository());
      // Online mode: in-memory analysis, inline models
      PipelineResult result = pipeline.analyzeInMemory(sqlText, baseName);
      Map<String, Object> response = new LinkedHashMap<>();
      response.put("baseName", result.getBaseName());
      response.put("nodesCount", result.getNodesCount());
      response.put("targetNodes", result.getTargetNodes());
      response.put("models", Map.of(
        "sdblPars", result.getSdblModel(),
        "linePars", result.getLineParsModel(),
        "fullPars", result.getFullParsModel()
      ));
      return response;
    }

    // Offline mode: require outputDir
    if (outputDirStr == null) {
      throw new CliValidationException("MISSING_ARGUMENT",
        "outputDir is required for offline mode (use --online to skip)");
    }

    Path outputDir = Path.of(outputDirStr);
    try {
      Files.createDirectories(outputDir);
    } catch (IOException e) {
      throw new CliValidationException("OUTPUT_DIR_ERROR",
        "Failed to create output directory: " + e.getMessage());
    }

    SdqlPipeline pipeline = new SdqlPipelineImpl(new FileSystemModelRepository(outputDir));
    PipelineResult result = pipeline.analyze(sqlText, outputDir, baseName, detailed);

    Map<String, Object> response = new LinkedHashMap<>();
    response.put("baseName", result.getBaseName());
    response.put("nodesCount", result.getNodesCount());
    response.put("targetNodes", result.getTargetNodes());

    Map<String, String> models = new LinkedHashMap<>();
    models.put("sdblPars", result.getSdblParsPath().toString());
    models.put("linePars", result.getLineParsPath().toString());
    models.put("fullPars", result.getFullParsPath().toString());
    response.put("models", models);

    Map<String, String> artifacts = new LinkedHashMap<>();
    artifacts.put("hierarchy", result.getHierarchyPath().toString());
    artifacts.put("fieldLineage", result.getFieldLineagePath().toString());
    artifacts.put("fullFieldLineage", result.getFullFieldLineagePath().toString());
    artifacts.put("restoredQueries", result.getRestoredQueriesPath().toString());
    artifacts.put("extractedQueries", result.getExtractedQueriesPath().toString());
    artifacts.put("verification", result.getVerificationPath().toString());
    response.put("artifacts", artifacts);

    return response;
  }
}
