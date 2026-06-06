package com.github._1c_syntax.bsl.parser.sdql.cli;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for SDQL CLI.
 * Refs SRS-10, BRD10
 */
public class SdqlCliTest {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  @Test
  void testAnalyzeStdinJson(@TempDir Path tempDir) throws Exception {
    String outputDir = tempDir.resolve("out").toString();
    String json = "{\"command\":\"analyze\",\"args\":{\"sqlText\":\"ВЫБРАТЬ 1 КАК Поле1 ПОМЕСТИТЬ ВТ_Тест\",\"outputDir\":\"" + outputDir.replace("\\", "\\\\") + "\",\"baseName\":\"test\"}}";

    String result = runCliWithStdin(json);
    JsonNode node = MAPPER.readTree(result);

    assertTrue(node.get("success").asBoolean());
    assertEquals(0, node.get("exitCode").asInt());
    assertEquals("test", node.get("data").get("baseName").asText());
    assertTrue(node.get("data").get("nodesCount").asInt() > 0);
    assertTrue(Files.exists(Path.of(outputDir, "SDBL_PARS", "sdbl_parse_model_test.json")));
  }

  @Test
  void testAnalyzeOnlineMode() throws Exception {
    String json = "{\"command\":\"analyze\",\"args\":{\"sqlText\":\"ВЫБРАТЬ 1 КАК Поле1 ПОМЕСТИТЬ ВТ_Тест\",\"online\":true}}";

    String result = runCliWithStdin(json);
    JsonNode node = MAPPER.readTree(result);

    assertTrue(node.get("success").asBoolean());
    assertEquals(0, node.get("exitCode").asInt());
    assertTrue(node.get("data").get("models").get("sdblPars").has("nodes"));
  }

  @Test
  void testMissingArgumentReturnsExitCode2() throws Exception {
    String json = "{\"command\":\"analyze\",\"args\":{}}";

    String result = runCliWithStdin(json);
    JsonNode node = MAPPER.readTree(result);

    assertFalse(node.get("success").asBoolean());
    assertEquals(2, node.get("exitCode").asInt());
    assertEquals("MISSING_ARGUMENT", node.get("errorCode").asText());
  }

  @Test
  void testUnknownCommandReturnsExitCode2() throws Exception {
    String json = "{\"command\":\"unknown\",\"args\":{}}";

    String result = runCliWithStdin(json);
    JsonNode node = MAPPER.readTree(result);

    assertFalse(node.get("success").asBoolean());
    assertEquals(2, node.get("exitCode").asInt());
    assertEquals("UNKNOWN_COMMAND", node.get("errorCode").asText());
  }

  @Test
  void testInvalidJsonReturnsExitCode2() throws Exception {
    String result = runCliWithStdin("not-json-at-all");
    JsonNode node = MAPPER.readTree(result);

    assertFalse(node.get("success").asBoolean());
    assertEquals(2, node.get("exitCode").asInt());
    assertEquals("INVALID_JSON", node.get("errorCode").asText());
  }

  @Test
  void testSdblModelCommand(@TempDir Path tempDir) throws Exception {
    // First analyze to create artifacts
    String outputDir = tempDir.resolve("out").toString();
    String analyzeJson = "{\"command\":\"analyze\",\"args\":{\"sqlText\":\"ВЫБРАТЬ 1 КАК Поле1 ПОМЕСТИТЬ ВТ_Тест\",\"outputDir\":\"" + outputDir.replace("\\", "\\\\") + "\",\"baseName\":\"test\"}}";
    runCliWithStdin(analyzeJson);

    // Then read model
    String readJson = "{\"command\":\"sdbl-model\",\"args\":{\"artifactsDir\":\"" + outputDir.replace("\\", "\\\\") + "\",\"baseName\":\"test\"}}";
    String result = runCliWithStdin(readJson);
    JsonNode node = MAPPER.readTree(result);

    assertTrue(node.get("success").asBoolean());
    assertEquals(0, node.get("exitCode").asInt());
    assertTrue(node.get("data").has("nodes"));
  }

  @Test
  void testListNodesCommand(@TempDir Path tempDir) throws Exception {
    String outputDir = tempDir.resolve("out").toString();
    String analyzeJson = "{\"command\":\"analyze\",\"args\":{\"sqlText\":\"ВЫБРАТЬ 1 КАК Поле1 ПОМЕСТИТЬ ВТ_Тест\",\"outputDir\":\"" + outputDir.replace("\\", "\\\\") + "\",\"baseName\":\"test\"}}";
    runCliWithStdin(analyzeJson);

    String readJson = "{\"command\":\"list-nodes\",\"args\":{\"artifactsDir\":\"" + outputDir.replace("\\", "\\\\") + "\",\"baseName\":\"test\"}}";
    String result = runCliWithStdin(readJson);
    JsonNode node = MAPPER.readTree(result);

    assertTrue(node.get("success").asBoolean());
    assertTrue(node.get("data").get("nodes").isArray());
    assertEquals(1, node.get("data").get("nodes").size());
  }

  @Test
  void testGlobalHelp() throws Exception {
    String result = runCliWithArgs(new String[]{"--help"});
    assertTrue(result.contains("SDQL CLI"));
    assertTrue(result.contains("analyze"));
    assertTrue(result.contains("Exit codes"));
  }

  @Test
  void testCommandHelp() throws Exception {
    String result = runCliWithArgs(new String[]{"analyze", "--help"});
    assertTrue(result.contains("Usage: sdql-cli analyze"));
    assertTrue(result.contains("--sql-text"));
  }

  @Test
  void testArgModeAnalyze(@TempDir Path tempDir) throws Exception {
    String outputDir = tempDir.resolve("out2").toString();
    String result = runCliWithArgs(new String[]{
      "analyze",
      "--sql-text", "ВЫБРАТЬ 1 КАК Поле1 ПОМЕСТИТЬ ВТ_Тест",
      "--output-dir", outputDir,
      "--base-name", "argtest"
    });
    JsonNode node = MAPPER.readTree(result);
    assertTrue(node.get("success").asBoolean());
    assertEquals("argtest", node.get("data").get("baseName").asText());
  }

  // Helper: run CLI with stdin JSON
  private String runCliWithStdin(String json) throws Exception {
    ByteArrayInputStream in = new ByteArrayInputStream(json.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayOutputStream err = new ByteArrayOutputStream();

    PrintStream oldOut = System.out;
    PrintStream oldErr = System.err;
    java.io.InputStream oldIn = System.in;

    try {
      System.setIn(in);
      System.setOut(new PrintStream(out));
      System.setErr(new PrintStream(err));

      SdqlCli cli = new SdqlCli();
      try {
        cli.run(new String[]{});
      } catch (SecurityException e) {
        // System.exit() triggers SecurityException in test context
      }
    } finally {
      System.setIn(oldIn);
      System.setOut(oldOut);
      System.setErr(oldErr);
    }

    return out.toString(java.nio.charset.StandardCharsets.UTF_8);
  }

  // Helper: run CLI with args (no stdin)
  private String runCliWithArgs(String[] args) throws Exception {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayOutputStream err = new ByteArrayOutputStream();

    PrintStream oldOut = System.out;
    PrintStream oldErr = System.err;

    try {
      System.setOut(new PrintStream(out));
      System.setErr(new PrintStream(err));

      SdqlCli cli = new SdqlCli();
      try {
        cli.run(args);
      } catch (SecurityException e) {
        // System.exit() triggers SecurityException in test context
      }
    } finally {
      System.setOut(oldOut);
      System.setErr(oldErr);
    }

    return out.toString(java.nio.charset.StandardCharsets.UTF_8);
  }
}
