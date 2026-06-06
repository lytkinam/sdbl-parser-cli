package com.github._1c_syntax.bsl.parser.sdql.cli;

import java.util.Collection;

/**
 * Prints --help messages for CLI and individual commands.
 * Refs SRS-10.02
 */
public class CliHelpPrinter {

  public static void printGlobalHelp(Collection<CliCommand> commands) {
    StringBuilder sb = new StringBuilder();
    sb.append("Usage: sdql-cli [COMMAND] [OPTIONS]\n\n");
    sb.append("SDQL CLI — SQL analyzer for 1C (SDBL).\n");
    sb.append("Reads JSON from stdin (integration mode) or arguments from command line (human mode).\n\n");
    sb.append("Commands:\n");
    for (CliCommand cmd : commands) {
      sb.append(String.format("  %-20s %s%n", cmd.getName(), cmd.getDescription()));
    }
    sb.append("\nGlobal options:\n");
    sb.append("  --help                Show this message\n");
    sb.append("  --debug               Enable DEBUG logging to stderr\n");
    sb.append("\nExit codes:\n");
    for (ExitCode ec : ExitCode.values()) {
      sb.append(String.format("  %d  %s%n", ec.getCode(), ec.getDescription()));
    }
    sb.append("\nIntegration mode (stdin JSON):\n");
    sb.append("  echo '{\"command\":\"analyze\",\"args\":{\"sqlText\":\"...\"}}' | java -cp ... SdqlCli\n");
    System.out.println(sb);
  }

  public static void printCommandHelp(CliCommand command) {
    StringBuilder sb = new StringBuilder();
    sb.append("Usage: sdql-cli ").append(command.getName()).append(" [OPTIONS]\n\n");
    sb.append(command.getDescription()).append("\n\n");
    sb.append(command.getUsage()).append("\n\n");
    sb.append("Exit codes:\n");
    sb.append("  0  Success\n");
    sb.append("  2  Missing required argument / invalid input\n");
    sb.append("  3  SQL parse error\n");
    sb.append("  4  Internal error\n");
    System.out.println(sb);
  }
}
