# SDQL CLI — Руководство пользователя

**Версия:** 1.0  
**Дата:** 2026-06-06  
**Задача:** Redmine #646

---

## 1. Назначение

SDQL CLI — инструмент для разбора SQL-запросов на диалекте 1С (SDBL). Превращает сложные пакетные запросы с временными таблицами (ВТ) в структурированные модели: иерархию узлов, lineage полей, восстановленный SQL.

**Для чего используется:**
- Анализ сложных запросов отчётов НПФ (форма 0420258 и др.)
- Построение lineage — откуда пришло поле в итоговой таблице
- Восстановление SQL по подмножеству полей
- Верификация соответствия исходного и восстановленного SQL

---

## 2. Быстрый старт

### 2.1 Проверить установку

```bash
sdql-cli --help
```

Должен вывести список команд.

### 2.2 Разобрать SQL-файл

```bash
sdql-cli analyze \
  --sql-file /path/to/query.sql \
  --output-dir /home/user/sdql-data/myquery \
  --base-name myquery
```

**Результат:** JSON с метаданными + артефакты в `/home/user/sdql-data/myquery/`.

### 2.3 Посмотреть узлы

```bash
sdql-cli list-nodes \
  --artifacts-dir /home/user/sdql-data/myquery \
  --base-name myquery
```

### 2.4 Восстановить SQL для узла

```bash
sdql-cli restore-query \
  --artifacts-dir /home/user/sdql-data/myquery \
  --base-name myquery \
  --node-name "ВТ_Результат" \
  --aliases "Поле1,Поле2"
```

---

## 3. Команды

### 3.1 analyze — разбор SQL-пакета

```bash
sdql-cli analyze [OPTIONS]
```

| Параметр | Обязательный | Описание |
|----------|-------------|----------|
| `--sql-text` | Да (или `--sql-file`) | SQL текст |
| `--sql-file` | Да (или `--sql-text`) | Путь к SQL-файлу |
| `--output-dir` | Да (в offline) | Директория для артефактов |
| `--base-name` | Нет | Имя для файлов (auto: `tmp_xxxx`) |
| `--detailed` | Нет | Детальные markdown-отчёты |
| `--online` | Нет | Не сохранять, вернуть inline JSON |

**Примеры:**

```bash
# Из файла
sdql-cli analyze --sql-file report_258.sql --output-dir ./out

# Из строки
sdql-cli analyze --sql-text "ВЫБРАТЬ 1 КАК Поле1" --output-dir ./out --base-name test

# Online (без сохранения)
sdql-cli analyze --sql-text "ВЫБРАТЬ 1" --online
```

### 3.2 Команды чтения моделей

Все требуют: `--artifacts-dir`, `--base-name`

```bash
sdql-cli sdbl-model       --artifacts-dir ./out --base-name test
sdql-cli line-pars-model  --artifacts-dir ./out --base-name test
sdql-cli full-pars-model  --artifacts-dir ./out --base-name test
sdql-cli hierarchy        --artifacts-dir ./out --base-name test
sdql-cli list-nodes       --artifacts-dir ./out --base-name test
sdql-cli verify           --artifacts-dir ./out --base-name test
```

### 3.3 field-lineage — lineage поля

```bash
sdql-cli field-lineage \
  --artifacts-dir ./out \
  --base-name test \
  --node-id 0 \
  --alias "Поле1"
```

### 3.4 full-field-lineage — полный lineage

```bash
sdql-cli full-field-lineage \
  --artifacts-dir ./out \
  --base-name test \
  --node-id 0 \
  --aliases "Поле1,Поле2"
```

### 3.5 restore-query — восстановить SQL

```bash
# Формат SQL (по умолчанию)
sdql-cli restore-query \
  --artifacts-dir ./out \
  --base-name test \
  --node-name "ВТ_Результат" \
  --aliases "Поле1,Поле2"

# Формат JSON
sdql-cli restore-query \
  --artifacts-dir ./out \
  --base-name test \
  --node-id 5 \
  --aliases "Поле1" \
  --format json
```

---

## 4. Формат выходных данных

### 4.1 Успех (exit code 0)

```json
{
  "success": true,
  "exitCode": 0,
  "data": { ... }
}
```

### 4.2 Ошибка валидации (exit code 2)

```json
{
  "success": false,
  "exitCode": 2,
  "errorCode": "MISSING_ARGUMENT",
  "message": "Missing required argument: outputDir",
  "details": {
    "field": "outputDir",
    "command": "analyze"
  }
}
```

### 4.3 Exit-коды

| Код | Значение | Действие |
|-----|----------|----------|
| 0 | Успех | Обработать результат |
| 1 | Сетевая ошибка | Повторить запрос |
| 2 | Ошибка валидации | Исправить аргументы |
| 3 | Ошибка парсинга SQL | Проверить SQL |
| 4 | Внутренняя ошибка | Обратиться к разработчику |

---

## 5. Где хранятся данные

```
/home/user/sdql-data/          # Рабочая директория
├── myquery/                   # Проект/запрос
│   ├── SDBL_PARS/             # SDBL модель
│   ├── LINE_PARS/             # LINE_PARS модель + иерархия
│   ├── FULL_PARS/             # FULL_PARS модель
│   ├── field_lineage/         # Field lineage
│   ├── full_field_lineage/    # Full field lineage
│   ├── RESTORED_QUERIES/      # Восстановленные SQL
│   ├── EXTRACTED_QUERIES/     # Извлечённые запросы
│   └── VERIFICATION/          # Отчёт верификации
```

---

## 6. Режимы работы

### 6.1 CLI-режим (аргументы)

Для человека — отладка, разовые запросы.

```bash
sdql-cli analyze --sql-file query.sql --output-dir ./out
```

### 6.2 JSON-режим (stdin)

Для интеграции — MCP_QUERY_1C и другие сервисы.

```bash
echo '{"command":"analyze","args":{"sqlText":"ВЫБРАТЬ 1","outputDir":"./out"}}' | sdql-cli
```

---

## 7. Типичные сценарии

### 7.1 Анализ отчёта 258

```bash
# Разбор
sdql-cli analyze \
  --sql-file /home/user/sdql-data/queries/report_258.sql \
  --output-dir /home/user/sdql-data/report_258 \
  --base-name report_258

# Список узлов
sdql-cli list-nodes \
  --artifacts-dir /home/user/sdql-data/report_258 \
  --base-name report_258 | jq '.data.nodes[] | {id, name, type}'

# Lineage поля
sdql-cli field-lineage \
  --artifacts-dir /home/user/sdql-data/report_258 \
  --base-name report_258 \
  --node-name "ВТ_Итоговая" \
  --alias "СуммаРезерва"
```

### 7.2 Восстановление SQL с нужными полями

```bash
sdql-cli restore-query \
  --artifacts-dir /home/user/sdql-data/report_258 \
  --base-name report_258 \
  --node-id 45 \
  --aliases "Сумма,Период,Организация" \
  > /tmp/restored.sql
```

---

## 8. Получить help

```bash
sdql-cli --help                    # Глобальный help
sdql-cli analyze --help            # Help по команде
sdql-cli field-lineage --help      # Help по команде
```

---

*Refs Redmine #646*
