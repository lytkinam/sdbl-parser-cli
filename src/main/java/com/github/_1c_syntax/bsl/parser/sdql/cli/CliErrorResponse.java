package com.github._1c_syntax.bsl.parser.sdql.cli;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

/**
 * Error response DTO for SDQL CLI.
 * Refs BRD10 OBJ-10.003
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CliErrorResponse {
  private boolean success;
  private int exitCode;
  private String errorCode;
  private String message;
  private Map<String, Object> details;

  public static CliErrorResponse of(ExitCode exitCode, String errorCode, String message) {
    CliErrorResponse r = new CliErrorResponse();
    r.success = false;
    r.exitCode = exitCode.getCode();
    r.errorCode = errorCode;
    r.message = message;
    return r;
  }

  public static CliErrorResponse of(ExitCode exitCode, String errorCode, String message, Map<String, Object> details) {
    CliErrorResponse r = of(exitCode, errorCode, message);
    r.details = details;
    return r;
  }
}
