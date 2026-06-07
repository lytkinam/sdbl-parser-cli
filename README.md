# SD-CLI — SQL Analyzer for 1C (SDBL)

**SD-CLI** (Structured Data CLI) — изолированный интерфейс командной строки для разбора SQL-запросов на диалекте 1С (SDBL). Превращает сложные пакетные запросы с временными таблицами (ВТ) в структурированные модели: иерархию узлов, lineage полей, восстановленный SQL.

**Версия:** 1.0  
**Дата:** 2026-06-06  
**Задача:** Redmine #646

---

## Быстрый старт

```bash
# Проверить установку
sd-cli --help

# Разобрать SQL-файл
sd-cli analyze --sql-file query.sql --output-dir ./out --base-name myquery

# Список узлов
sd-cli list-nodes --artifacts-dir ./out --base-name myquery

# Восстановить SQL для узла
sd-cli restore-query --artifacts-dir ./out --base-name myquery --node-id 0 --aliases "Поле1,Поле2"
```

---

## Команды

| Команда | Описание |
|---------|----------|
| `analyze` | Полный разбор SQL-пакета |
| `sdbl-model` | SDBL модель |
| `line-pars-model` | LINE_PARS модель |
| `full-pars-model` | FULL_PARS модель |
| `hierarchy` | Иерархия узлов |
| `field-lineage` | Lineage поля |
| `full-field-lineage` | Полный lineage |
| `restore-query` | Восстановить SQL |
| `list-nodes` | Список узлов |
| `verify` | Отчёт верификации |

---

## Установка

### Требования
- Java 17+
- Gradle 8.5+ (для сборки)

### Сборка
```bash
git clone <repo>
cd sd-cli
./gradlew classes
```

### Глобальный доступ
```bash
ln -s $(pwd)/sd-cli ~/.local/bin/sd-cli
```

---

## Документация

- [Руководство пользователя](docs/USER_GUIDE.md)
- [Руководство администратора](docs/ADMIN_GUIDE.md)
- [Руководство разработчика](docs/DEV_GUIDE.md)
- [Руководство winodws](docs/WINDOWS_GUIDE.md)
---

## Архитектура

```
Kimi CLI / MCP_QUERY_1C
    │
    ▼ stdin/stdout
SD-CLI (JVM process)
    │
    ▼ Direct Java call
SdqlPipeline (API)
    │
    ▼ File system
Artifacts (SDBL_PARS, LINE_PARS, FULL_PARS)
```

---

## Благодарности

- **[1c-syntax/bsl-parser](https://github.com/1c-syntax/bsl-parser)** — базовый парсер BSL/SDBL на ANTLR4, на основе которого построен SDQL.
- **[Инфостарт: Анализатор запросов 1С](https://infostart.ru/1c/tools/617990/)** — вдохновение и подходы к анализу сложных 1С-запросов.
- **[Kimi Code](https://www.kimi.com/code)** — AI-ассистент, использованный при разработке CLI-интерфейса.

---

## Лицензия

LGPL-3.0

---

*Refs Redmine #646*
