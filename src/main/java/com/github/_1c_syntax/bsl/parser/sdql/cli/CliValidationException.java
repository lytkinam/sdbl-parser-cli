package com.github._1c_syntax.bsl.parser.sdql.cli;

import lombok.Getter;

/**
 * Exception thrown when CLI input validation fails.
 * Maps to exit code 2 (VALIDATION_ERROR).
 */
@Getter
public class CliValidationException extends RuntimeException {

  private final String errorCode;

  public CliValidationException(String errorCode, String message) {
    super(message);
    this.errorCode = errorCode;
  }
}
