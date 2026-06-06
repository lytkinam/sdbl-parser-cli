package com.github._1c_syntax.bsl.parser.sdql.cli;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Success response DTO for SDQL CLI.
 * Refs BRD10 OBJ-10.002
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CliResponse {
  private boolean success;
  private int exitCode;
  private Object data;

  public static CliResponse ok(Object data) {
    CliResponse r = new CliResponse();
    r.success = true;
    r.exitCode = ExitCode.SUCCESS.getCode();
    r.data = data;
    return r;
  }
}
