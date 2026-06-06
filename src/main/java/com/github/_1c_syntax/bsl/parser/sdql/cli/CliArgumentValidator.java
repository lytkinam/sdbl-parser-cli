package com.github._1c_syntax.bsl.parser.sdql.cli;

import java.util.Map;

/**
 * Validates CLI input arguments.
 * Refs SRS-10.04
 */
public class CliArgumentValidator {

  public static void requireOneOf(Map<String, Object> args, String... fields) {
    for (String field : fields) {
      if (hasValue(args, field)) {
        return;
      }
    }
    throw new CliValidationException(
      "MISSING_ARGUMENT",
      "One of the following arguments is required: " + String.join(", ", fields)
    );
  }

  public static void require(Map<String, Object> args, String field) {
    if (!hasValue(args, field)) {
      throw new CliValidationException(
        "MISSING_ARGUMENT",
        "Missing required argument: " + field
      );
    }
  }

  public static void requireNotEmpty(Map<String, Object> args, String field) {
    require(args, field);
    Object value = args.get(field);
    if (value instanceof String s && s.isEmpty()) {
      throw new CliValidationException(
        "EMPTY_ARGUMENT",
        "Argument must not be empty: " + field
      );
    }
  }

  public static String getString(Map<String, Object> args, String field) {
    if (args == null) return null;
    // Try exact match first, then snake_case, then camelCase
    Object value = args.get(field);
    if (value == null) {
      value = args.get(field.replace('_', '-'));
    }
    if (value == null) {
      value = args.get(toCamelCase(field));
    }
    if (value == null) {
      value = args.get(toSnakeCase(field));
    }
    return value == null ? null : value.toString();
  }

  private static String toCamelCase(String snake) {
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

  private static String toSnakeCase(String camel) {
    StringBuilder sb = new StringBuilder();
    for (char c : camel.toCharArray()) {
      if (Character.isUpperCase(c)) {
        sb.append('_').append(Character.toLowerCase(c));
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static String getString(Map<String, Object> args, String field, String defaultValue) {
    String value = getString(args, field);
    return value != null ? value : defaultValue;
  }

  public static boolean getBoolean(Map<String, Object> args, String field, boolean defaultValue) {
    Object value = args.get(field);
    if (value == null) return defaultValue;
    if (value instanceof Boolean b) return b;
    return Boolean.parseBoolean(value.toString());
  }

  public static int getInt(Map<String, Object> args, String field, int defaultValue) {
    Object value = args.get(field);
    if (value == null) return defaultValue;
    if (value instanceof Number n) return n.intValue();
    try {
      return Integer.parseInt(value.toString());
    } catch (NumberFormatException e) {
      return defaultValue;
    }
  }

  @SuppressWarnings("unchecked")
  public static java.util.List<String> getStringList(Map<String, Object> args, String field) {
    Object value = args.get(field);
    if (value == null) return null;
    if (value instanceof java.util.List<?> list) {
      java.util.List<String> result = new java.util.ArrayList<>();
      for (Object item : list) {
        result.add(item.toString());
      }
      return result;
    }
    return null;
  }

  private static boolean hasValue(Map<String, Object> args, String field) {
    return args != null && args.containsKey(field) && args.get(field) != null;
  }
}
