# SDQL CLI — Руководство разработчика

**Версия:** 1.0  
**Дата:** 2026-06-06  
**Задача:** Redmine #646

---

## 1. Архитектура

### 1.1 Принцип

CLI — это **обёртка** над существующим `SdqlPipeline`. Базовые классы (API, модели, парсеры) **не изменяются**. CLI живёт в отдельном пакете `com.github._1c_syntax.bsl.parser.sdql.cli`.

```
┌─────────────────┐
│   SdqlCli       │  ← Точка входа, JSON/args парсинг
│   (cli/)        │
└────────┬────────┘
         │
    ┌────▼────┐
    │CliCommand│  ← Интерфейс команды
    └────┬────┘
         │
┌────────▼────────┐
│  SdqlPipeline   │  ← Существующий API (без изменений)
│  (api/)         │
└────────┬────────┘
         │
┌────────▼────────┐
│  ANTLR4/Jackson │  ← Существующие парсеры
│  (model/, ...)  │
└─────────────────┘
```

### 1.2 Пакетная структура

```
src/main/java/.../sdql/cli/
├── SdqlCli.java              # Точка входа
├── CliRequest.java           # DTO вход
├── CliResponse.java          # DTO успех
├── CliErrorResponse.java     # DTO ошибка
├── ExitCode.java             # Exit-коды 0-4
├── CliCommand.java           # Интерфейс команды
├── CliArgumentValidator.java # Валидация аргументов
├── CliValidationException.java
├── CliHelpPrinter.java       # Вывод --help
└── commands/
    ├── AnalyzeCommand.java
    ├── SdblModelCommand.java
    ├── LineParsModelCommand.java
    ├── FullParsModelCommand.java
    ├── HierarchyCommand.java
    ├── FieldLineageCommand.java
    ├── FullFieldLineageCommand.java
    ├── RestoreQueryCommand.java
    ├── ListNodesCommand.java
    └── VerifyCommand.java
```

---

## 2. Добавление новой команды

### 2.1 Создать класс команды

```java
package com.github._1c_syntax.bsl.parser.sdql.cli.commands;

import com.github._1c_syntax.bsl.parser.sdql.cli.*;

import java.util.Map;

public class MyNewCommand implements CliCommand {

  @Override
  public String getName() {
    return "my-command";  // kebab-case
  }

  @Override
  public String getDescription() {
    return "What this command does";
  }

  @Override
  public String getUsage() {
    return """
      Options:
        --artifacts-dir PATH  Directory with artifacts (required)
        --base-name NAME      Base name of artifacts (required)
        --my-param VALUE      My parameter
        --help                Show this message
      """;
  }

  @Override
  public Object execute(Map<String, Object> args) {
    CliArgumentValidator.require(args, "artifactsDir");
    CliArgumentValidator.require(args, "baseName");

    // Бизнес-логика
    String myParam = CliArgumentValidator.getString(args, "myParam", "default");

    // Вернуть Map или любой POJO — Jackson сериализует
    Map<String, Object> result = new LinkedHashMap<>();
    result.put("myParam", myParam);
    return result;
  }
}
```

### 2.2 Зарегистрировать в SdqlCli

```java
// В SdqlCli.java конструктор
public SdqlCli() {
  register(new AnalyzeCommand());
  // ...
  register(new MyNewCommand());  // ← Добавить
}
```

### 2.3 Пересобрать

```bash
./gradlew classes
```

### 2.4 Протестировать

```bash
sdql-cli my-command --artifacts-dir /tmp/out --base-name test --my-param value
```

---

## 3. Конвенции кода

### 3.1 Именование

- Команды: `kebab-case` (`field-lineage`, `restore-query`)
- Аргументы CLI: `kebab-case` (`--artifacts-dir`, `--base-name`)
- Ключи в JSON: `camelCase` (`artifactsDir`, `baseName`)
- Классы команд: `PascalCase` + `Command` suffix

### 3.2 Валидация

Всегда валидировать **до** бизнес-логики:

```java
CliArgumentValidator.require(args, "fieldName");
CliArgumentValidator.requireOneOf(args, "nodeId", "nodeName");
```

### 3.3 Exit-коды

| Код | Когда использовать |
|-----|-------------------|
| 0 | Успех |
| 1 | Сетевая ошибка (для `--fetch-from-1c`) |
| 2 | Валидация входных данных |
| 3 | Ошибка парсинга SQL |
| 4 | Непредвиденное исключение |

### 3.4 Логирование

- **stdout** — только JSON результат
- **stderr** — логи, ошибки, debug

```java
System.err.println("[ERROR] " + message);  // Ошибка
System.err.println("[DEBUG] " + message);  // Debug
```

---

## 4. Тестирование

### 4.1 Запуск тестов

```bash
# Все тесты
./gradlew test

# Конкретный тест
./gradlew test --tests SdqlQueryPackageAnalyzerTest.testExampleSql
```

### 4.2 Тест CLI

```bash
# Ручной тест
sdql-cli analyze --sql-file examples/middle_example.sql --output-dir /tmp/test

# Проверить exit code
echo $?
```

### 4.3 JSON-режим тест

```bash
echo '{"command":"analyze","args":{"sqlText":"ВЫБРАТЬ 1","outputDir":"/tmp/test"}}' | sdql-cli
```

---

## 5. Сборка и деплой

### 5.1 Локальная сборка

```bash
./gradlew classes
```

### 5.2 Полная сборка

```bash
./gradlew build
```

### 5.3 Shadow JAR (fat jar)

Если нужен standalone jar:

```kotlin
// build.gradle.kts
plugins {
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

tasks.shadowJar {
    archiveClassifier.set("all")
    manifest {
        attributes["Main-Class"] = "com.github._1c_syntax.bsl.parser.sdql.cli.SdqlCli"
    }
}
```

```bash
./gradlew shadowJar
java -jar build/libs/*-all.jar analyze --help
```

---

## 6. Интеграция с существующим кодом

### 6.1 Использование ModelRepository

```java
ModelRepository repo = new FileSystemModelRepository(artifactsDir);
QueryModel model = repo.loadSdblModel(baseName);
```

### 6.2 Использование Pipeline

```java
SdqlPipeline pipeline = new SdqlPipelineImpl(new FileSystemModelRepository(outputDir));
PipelineResult result = pipeline.analyze(sqlText, outputDir, baseName, detailed);
```

### 6.3 Использование NodeResolver

```java
NodeResolver resolver = new NodeResolverImpl();
FullParsNode node = resolver.resolve(model, nodeId, nodeName);
```

---

## 7. Git workflow

### 7.1 Ветка

- Основная: `develop`

### 7.2 Формат коммитов

```
SDQL: add CLI field-lineage command
Refs Redmine #646
```

### 7.3 Порядок

1. Сначала пример (`middle_example` артефакты)
2. Потом код
3. Не коммитить артефакты `example/` (только `middle_example`, `example_258`)

---

## 8. Ссылки

| Документ | Описание |
|----------|----------|
| `BRD10_CLI.md` | Бизнес-требования |
| `SRS10_CLI.md` | Системные требования |
| `AI_INTRO_10.md` | Вводное руководство для AI-агентов |
| `PARSER_DETAILS.md` | Конвейер обработки |

---

*Refs Redmine #646*
