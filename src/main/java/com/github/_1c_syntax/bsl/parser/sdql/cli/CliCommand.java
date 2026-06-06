package com.github._1c_syntax.bsl.parser.sdql.cli;

import java.util.Map;

/**
 * Interface for all SDQL CLI commands.
 * Refs SRS-10.05
 */
public interface CliCommand {

  /**
   * Command name (e.g. "analyze", "sdbl-model").
   */
  String getName();

  /**
   * Execute the command with parsed arguments.
   *
   * @param args Map of argument names to values
   * @return Result object (will be wrapped in CliResponse)
   */
  Object execute(Map<String, Object> args);

  /**
   * Return a short description for --help.
   */
  String getDescription();

  /**
   * Return usage information for --help.
   */
  String getUsage();
}
