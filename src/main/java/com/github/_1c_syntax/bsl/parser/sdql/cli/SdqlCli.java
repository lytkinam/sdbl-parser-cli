package com.github._1c_syntax.bsl.parser.sdql.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github._1c_syntax.bsl.parser.sdql.cli.commands.*;

import java.util.*;

/**
 * SDQL CLI entry point.
 * Supports two modes:
 * 1. JSON from stdin (integration mode for MCP_QUERY_1C)
 * 2. Command-line arguments (human mode)
 *
 * Refs AI_INTRO_10, BRD10, SRS10
 */
public class SdqlCli {

  private static final ObjectMapper MAPPER = new ObjectMapper()
    .enable(SerializationFeature.INDENT_OUTPUT);

  private final Map<String, CliCommand> commands = new LinkedHashMap<>();

  public SdqlCli() {
    register(new AnalyzeCommand());
    register(new SdblModelCommand());
    register(new LineParsModelCommand());
    register(new FullParsModelCommand());
    register(new HierarchyCommand());
    register(new FieldLineageCommand());
    register(new FullFieldLineageCommand());
    register(new RestoreQueryCommand());
    register(new ListNodesCommand());
    register(new VerifyCommand());
  }

  private void register(CliCommand command) {
    commands.put(command.getName(), command);
  }

  public static void main(String[] args) {
    SdqlCli cli = new SdqlCli();
    try {
      cli.run(args);
    } catch (Exception e) {
      // Last-resort catch — should not happen if execute() handles everything
      System.err.println("[FATAL] Unexpected error: " + e.getMessage());
      e.printStackTrace(System.err);
      CliErrorResponse error = CliErrorResponse.of(ExitCode.INTERNAL_ERROR, "INTERNAL_ERROR", "Unexpected error: " + e.getMessage());
      try {
        System.out.println(MAPPER.writeValueAsString(error));
      } catch (Exception ex) {
        System.out.println("{\"success\":false,\"exitCode\":4,\"errorCode\":\"INTERNAL_ERROR\",\"message\":\"Unexpected error\"}");
      }
      System.exit(ExitCode.INTERNAL_ERROR.getCode());
    }
  }

  public void run(String[] args) throws Exception {
    // Mode 1: JSON from stdin (no args or stdin is a pipe)
    if (args.length == 0 || (args.length == 1 && !args[0].startsWith("-"))) {
      // Check if stdin has data (pipe/redirect)
      String json = new String(System.in.readAllBytes(), java.nio.charset.StandardCharsets.UTF_8).trim();
      if (!json.isEmpty()) {
        handleJsonMode(json);
        return;
      }
      // No stdin data, no args — print help
      CliHelpPrinter.printGlobalHelp(commands.values());
      System.exit(0);
      return;
    }

    // Mode 2: CLI arguments
    handleArgMode(args);
  }

  private void handleJsonMode(String json) throws Exception {
    CliRequest request;
    try {
      request = MAPPER.readValue(json, CliRequest.class);
    } catch (Exception e) {
      writeError(ExitCode.VALIDATION_ERROR, "INVALID_JSON",
        "Failed to parse JSON request: " + e.getMessage());
      System.exit(ExitCode.VALIDATION_ERROR.getCode());
      return;
    }

    if (request.getCommand() == null) {
      writeError(ExitCode.VALIDATION_ERROR, "MISSING_COMMAND",
        "Field 'command' is required");
      System.exit(ExitCode.VALIDATION_ERROR.getCode());
      return;
    }

    CliCommand command = commands.get(request.getCommand());
    if (command == null) {
      writeError(ExitCode.VALIDATION_ERROR, "UNKNOWN_COMMAND",
        "Unknown command: " + request.getCommand());
      System.exit(ExitCode.VALIDATION_ERROR.getCode());
      return;
    }

    executeCommand(command, request.getArgs() != null ? request.getArgs() : Map.of());
  }

  private void handleArgMode(String[] args) throws Exception {
    String first = args[0];

    if ("--help".equals(first)) {
      CliHelpPrinter.printGlobalHelp(commands.values());
      System.exit(0);
      return;
    }

    CliCommand command = commands.get(first);
    if (command == null) {
      writeError(ExitCode.VALIDATION_ERROR, "UNKNOWN_COMMAND",
        "Unknown command: " + first);
      System.exit(ExitCode.VALIDATION_ERROR.getCode());
      return;
    }

    // Parse remaining args into key-value pairs
    Map<String, Object> parsedArgs = parseArgs(Arrays.copyOfRange(args, 1, args.length));

    if (parsedArgs.containsKey("help") || parsedArgs.containsKey("--help")) {
      CliHelpPrinter.printCommandHelp(command);
      System.exit(0);
      return;
    }

    executeCommand(command, parsedArgs);
  }

  private void executeCommand(CliCommand command, Map<String, Object> args) throws Exception {
    try {
      Object result = command.execute(args);
      CliResponse response = CliResponse.ok(result);
      System.out.println(MAPPER.writeValueAsString(response));
      System.exit(ExitCode.SUCCESS.getCode());
    } catch (CliValidationException e) {
      System.err.println("[ERROR] " + e.getMessage());
      writeError(ExitCode.VALIDATION_ERROR, e.getErrorCode(), e.getMessage());
      System.exit(ExitCode.VALIDATION_ERROR.getCode());
    } catch (com.github._1c_syntax.bsl.parser.sdql.api.SdqlApiException e) {
      System.err.println("[ERROR] " + e.getMessage());
      ExitCode exitCode = mapApiError(e.getCode());
      writeError(exitCode, e.getCode(), e.getMessage());
      System.exit(exitCode.getCode());
    } catch (Exception e) {
      System.err.println("[ERROR] Internal error: " + e.getMessage());
      e.printStackTrace(System.err);
      writeError(ExitCode.INTERNAL_ERROR, "INTERNAL_ERROR", e.getMessage());
      System.exit(ExitCode.INTERNAL_ERROR.getCode());
    }
  }

  private Map<String, Object> parseArgs(String[] args) {
    Map<String, Object> result = new LinkedHashMap<>();
    for (int i = 0; i < args.length; i++) {
      String arg = args[i];
      if (arg.startsWith("--")) {
        String key = arg.substring(2);
        // Handle --key=value syntax
        int eqIdx = key.indexOf('=');
        if (eqIdx >= 0) {
          result.put(key.substring(0, eqIdx).replace('-', '_'), key.substring(eqIdx + 1));
          continue;
        }
        // Store both snake_case and camelCase keys for compatibility
        String snakeKey = key.replace('-', '_');
        String camelKey = toCamelCase(snakeKey);
        if (i + 1 < args.length && !args[i + 1].startsWith("--")) {
          result.put(snakeKey, args[i + 1]);
          if (!snakeKey.equals(camelKey)) {
            result.put(camelKey, args[i + 1]);
          }
          i++;
        } else {
          result.put(snakeKey, true);
          if (!snakeKey.equals(camelKey)) {
            result.put(camelKey, true);
          }
        }
      } else if (arg.startsWith("-")) {
        String key = arg.substring(1).replace('-', '_');
        if (i + 1 < args.length && !args[i + 1].startsWith("-")) {
          result.put(key, args[i + 1]);
          i++;
        } else {
          result.put(key, true);
        }
      }
    }
    return result;
  }

  private String toCamelCase(String snake) {
    StringBuilder sb = new StringBuilder();
    boolean nextUpper = false;
    for (char c : snake.toCharArray()) {
      if (c == '_' || c == '-') {
        nextUpper = true;
      } else if (nextUpper) {
        sb.append(Character.toUpperCase(c));
        nextUpper = false;
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  private void writeError(ExitCode exitCode, String errorCode, String message) {
    try {
      CliErrorResponse error = CliErrorResponse.of(exitCode, errorCode, message);
      System.out.println(MAPPER.writeValueAsString(error));
    } catch (Exception ex) {
      // Fallback if JSON serialization fails
      System.out.println("{\"success\":false,\"exitCode\":" + exitCode.getCode()
        + ",\"errorCode\":\"" + errorCode + "\",\"message\":\"" + message.replace("\"", "\\\"") + "\"}");
    }
  }

  private ExitCode mapApiError(String apiErrorCode) {
    return switch (apiErrorCode) {
      case "ARTIFACT_NOT_FOUND" -> ExitCode.VALIDATION_ERROR;
      case "MISSING_INPUT", "MISSING_NODE", "MISSING_ARGUMENT" -> ExitCode.VALIDATION_ERROR;
      case "PIPELINE_ERROR" -> ExitCode.PARSE_ERROR;
      default -> ExitCode.INTERNAL_ERROR;
    };
  }
}
