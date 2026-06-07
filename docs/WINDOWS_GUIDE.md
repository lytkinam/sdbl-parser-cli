# Руководство по установке и использованию SD-CLI в Windows

## 1. Требования

- **Java 17+** (JDK)
- **Git for Windows** (поставляется с Bash — `Git Bash`)

## 2. Установка Java

Утилита требует **JDK версии 17 или выше**.

Подробная инструкция со ссылкой для скачивания: [install-java.md](install-java.md)

Быстрая проверка установки в `Git Bash`:

```bash
java -version
```

Должна отобразиться версия **17** или выше.

## 3. Установка утилиты

### 3.1. Клонирование репозитория

Откройте `Git Bash` и выполните:

```bash
cd /c/Users/$USER
git clone https://github.com/lytkinam/sdbl-parser-cli.git
cd sdbl-parser-cli
```

### 3.2. Сборка проекта

```bash
./gradlew classes
```

При первом запуске Gradle автоматически скачает дистрибутив. Дождитесь сообщения `BUILD SUCCESSFUL`.

### 3.3. Проверка работоспособности

```bash
bash sdql-cli --help
```

Для удобства создайте псевдоним `sd-cli`:

```bash
cp sdql-cli sd-cli
bash sd-cli --help
```

## 4. Важная особенность Windows — используйте абсолютные пути

**Критический баг:** при указании относительного пути (`./out` или `out`) часть артефактов (`field_lineage`, `full_field_lineage`, `RESTORED_QUERIES`, `VERIFICATION`) создаётся **в текущей директории проекта** вместо целевой папки.

**Последствия:**
- Команда `restore-query` возвращает пустую строку.
- Файлы разбрасываются по корню проекта.

**Решение:** всегда передавайте `--output-dir` как **абсолютный путь**.

Вариант 1 — через `$(pwd)` (автоматически подставит текущую директорию):
```bash
bash sd-cli analyze --sql-file query.sql --output-dir "$(pwd)/out" --base-name myquery
```

Вариант 2 — явный абсолютный путь с диском `C:`:
```bash
bash sd-cli analyze --sql-file query.sql --output-dir "/c/Users/$USER/sdbl-parser-cli/out" --base-name myquery
```

> В `Git Bash` диск `C:` пишется как `/c/`. Если используете обычный `cmd.exe` — путь будет `C:\Users\...`, но скрипт `sd-cli` рассчитан на Bash, поэтому рекомендуется `Git Bash`.

## 5. Пошаговый пример работы

### 5.1. Подготовка SQL-файла

В проекте уже есть пример:

```bash
cat examples/receipt_query.sql
```

**Содержимое файла `examples/receipt_query.sql`:**
```sql
ВЫБРАТЬ
    ПоступлениеТоваров.Ссылка КАК Документ,
    ПоступлениеТоваровУслуг.Номенклатура КАК Номенклатура,
    ПоступлениеТоваровУслуг.Количество КАК Количество
ИЗ
    Документ.ПоступлениеТоваров КАК ПоступлениеТоваров
    ЛЕВОЕ СОЕДИНЕНИЕ Документ.ПоступлениеТоваров.Товары КАК ПоступлениеТоваровУслуг
    ПО ПоступлениеТоваров.Ссылка = ПоступлениеТоваровУслуг.ссылка
```

### 5.2. Запуск анализа

```bash
# Автоматический абсолютный путь
OUTDIR="$(pwd)/out"
bash sd-cli analyze --sql-file examples/receipt_query.sql --output-dir "$OUTDIR" --base-name receipt

# Или явный путь с диском C:
# OUTDIR="/c/Users/$USER/sdbl-parser-cli/out"
# bash sd-cli analyze --sql-file examples/receipt_query.sql --output-dir "$OUTDIR" --base-name receipt
```

**Ожидаемый результат:** JSON с путями к созданным файлам.

### 5.3. Проверка созданных файлов

```bash
find "$OUTDIR" -type f | sort
```

**Ожидаемый список файлов:**
```
/c/Users/.../sdbl-parser-cli/out/SDBL_PARS/sdbl_parse_model_receipt.json
/c/Users/.../sdbl-parser-cli/out/LINE_PARS/LINE_PARS_model_receipt.json
/c/Users/.../sdbl-parser-cli/out/LINE_PARS/LINE_PARS_hierarchy_receipt.json
/c/Users/.../sdbl-parser-cli/out/FULL_PARS/FULL_PARS_model_receipt.json
/c/Users/.../sdbl-parser-cli/out/field_lineage/receipt/0_Результат_1/FLS_receipt_0_Результат_1_Документ.json
/c/Users/.../sdbl-parser-cli/out/field_lineage/receipt/0_Результат_1/FLS_receipt_0_Результат_1_Количество.json
/c/Users/.../sdbl-parser-cli/out/field_lineage/receipt/0_Результат_1/FLS_receipt_0_Результат_1_Номенклатура.json
/c/Users/.../sdbl-parser-cli/out/full_field_lineage/receipt/0_Результат_1/FFL_receipt_0_Результат_1_Документ.json
/c/Users/.../sdbl-parser-cli/out/full_field_lineage/receipt/0_Результат_1/FFL_receipt_0_Результат_1_Количество.json
/c/Users/.../sdbl-parser-cli/out/full_field_lineage/receipt/0_Результат_1/FFL_receipt_0_Результат_1_Номенклатура.json
/c/Users/.../sdbl-parser-cli/out/RESTORED_QUERIES/receipt/0_Результат_1/Документ.sql
/c/Users/.../sdbl-parser-cli/out/RESTORED_QUERIES/receipt/0_Результат_1/Количество.sql
/c/Users/.../sdbl-parser-cli/out/RESTORED_QUERIES/receipt/0_Результат_1/Номенклатура.sql
/c/Users/.../sdbl-parser-cli/out/VERIFICATION/receipt/verification_report.json
```

### 5.4. Просмотр результатов

**Иерархия таблиц:**
```bash
bash sd-cli hierarchy --artifacts-dir "$OUTDIR" --base-name receipt
cat "$OUTDIR/LINE_PARS/LINE_PARS_hierarchy_receipt.json"
```

**SDBL-модель (AST):**
```bash
cat "$OUTDIR/SDBL_PARS/sdbl_parse_model_receipt.json"
```

**FULL_PARS модель (lineage полей):**
```bash
cat "$OUTDIR/FULL_PARS/FULL_PARS_model_receipt.json"
```

**Восстановленный SQL для поля «Номенклатура»:**
```bash
cat "$OUTDIR/RESTORED_QUERIES/receipt/0_Результат_1/Номенклатура.sql"
```

**Lineage конкретного поля через CLI:**
```bash
bash sd-cli field-lineage --artifacts-dir "$OUTDIR" --base-name receipt \
  --node-id 0 --alias "Номенклатура"
```

**Полный lineage для набора полей:**
```bash
bash sd-cli full-field-lineage --artifacts-dir "$OUTDIR" --base-name receipt \
  --node-id 0 --aliases "Документ,Номенклатура,Количество"
```

### 5.5. Список узлов запроса

```bash
bash sd-cli list-nodes --artifacts-dir "$OUTDIR" --base-name receipt
```

## 6. Справочник команд

| Команда | Описание |
|---------|----------|
| `analyze` | Полный разбор SQL-пакета и генерация всех артефактов |
| `sdbl-model` | SDBL модель (AST) |
| `line-pars-model` | LINE_PARS модель |
| `full-pars-model` | FULL_PARS модель с lineage |
| `hierarchy` | Иерархия таблиц и источников |
| `field-lineage` | Lineage для одного поля |
| `full-field-lineage` | Полный lineage для набора полей |
| `restore-query` | Восстановление SQL-запроса из lineage |
| `list-nodes` | Список узлов запроса |
| `verify` | Отчёт верификации |

## 7. Интеграционный режим (stdin → stdout)

Для встраивания в другие инструменты (например, AI-ассистенты):

```bash
echo '{"command":"analyze","args":{"sqlText":"ВЫБРАТЬ 1 КАК А"}}' | bash sd-cli
```

## 8. Известные проблемы и решения

| Проблема | Причина | Решение |
|----------|---------|---------|
| Файлы `field_lineage`, `RESTORED_QUERIES` и др. создаются в корне проекта | Баг с `Path.getParent()` для относительных путей | Всегда указывать `--output-dir "$(pwd)/папка"` |
| `restore-query` возвращает пустую строку | Не найдена `full_field_lineage` по ожидаемому пути | Использовать абсолютный путь при `analyze` |
| Кракозябры в консоли Git Bash | Несовпадение кодировок терминала | JSON-файлы артефактов сохраняются в корректной UTF-8 — читайте их через `cat` |

## 9. Лицензия

LGPL-3.0
