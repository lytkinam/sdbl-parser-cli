package com.github._1c_syntax.bsl.parser.sdql.cli;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

/**
 * Input DTO for SDQL CLI (JSON from stdin).
 * Refs BRD10 OBJ-10.001
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CliRequest {
  private String command;
  private Map<String, Object> args;
}
