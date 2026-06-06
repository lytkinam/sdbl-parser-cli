package com.github._1c_syntax.bsl.parser.sdql.cli;

import lombok.Getter;

/**
 * Deterministic exit codes for SDQL CLI.
 * Refs SRS-10.03
 */
@Getter
public enum ExitCode {
  SUCCESS(0, "Success"),
  NETWORK_ERROR(1, "Network error — external service unavailable"),
  VALIDATION_ERROR(2, "Validation error — invalid input contract"),
  PARSE_ERROR(3, "SQL parse error — syntax or semantic issue"),
  INTERNAL_ERROR(4, "Internal error — unexpected exception");

  private final int code;
  private final String description;

  ExitCode(int code, String description) {
    this.code = code;
    this.description = description;
  }
}
