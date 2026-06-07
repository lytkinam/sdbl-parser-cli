# Руководство по установке и использованию SD-CLI в Windows

## 1. Требования

- **Java 17+** (JDK)
- Windows 10/11

## 2. Установка Java

Утилита требует **JDK версии 17 или выше**.

Подробная инструкция со ссылкой для скачивания: [install-java.md](install-java.md)

Проверка установки в `cmd`:

```cmd
java -version
```

Должна отобразиться версия **17** или выше.

## 3. Установка утилиты

### 3.1. Скачивание проекта

Скачайте репозиторий как ZIP и распакуйте, либо клонируйте через Git:

```cmd
cd C:\Users\%USERNAME%\Desktop
git clone https://github.com/lytkinam/sdbl-parser-cli.git
```

### 3.2. Готовый JAR (рекомендуется)

В папке `release\` уже лежит собранный fat JAR:
```
release\sd-cli.jar
```

Если хотите пересобрать самостоятельно:

```cmd
cd C:\Users\%USERNAME%\Desktop\sdbl-parser-cli
gradlew shadowJarCli
```

При первом запуске Gradle скачает дистрибутив (~130 МБ). Дождитесь `BUILD SUCCESSFUL`.

### 3.3. Проверка работоспособности

```cmd
sd-cli.bat --help
```

Должен отобразиться список команд.

---

## 4. Важная особенность Windows — используйте абсолютные пути

**Критический баг:** при указании относительного пути (`out`, `.\out`, `./out`) часть артефактов (`field_lineage`, `full_field_lineage`, `RESTORED_QUERIES`, `VERIFICATION`) создаётся **в текущей директории** (корне проекта) вместо целевой папки.

**Последствия:**
- Команда `restore-query` возвращает пустую строку.
- Файлы разбрасываются по корню проекта.

**Решение:** всегда передавайте `--output-dir` как **абсолютный путь**.

---

## 5. Пошаговый пример работы через cmd

### 5.1. Структура папок (разделение данных и проекта)

Рекомендуется хранить проект, запросы и результаты раздельно:

```
C:\Users\User\Desktop\sdbl-parser-cli\     ← проект (содержит sd-cli.bat)
C:\Users\User\Documents\sdql-queries\     ← SQL-файлы для анализа
C:\Users\User\Documents\sdql-results\     ← результаты анализа
```

### 5.2. Подготовка SQL-файла

Скопируйте пример из проекта или создайте свой файл:

```cmd
copy "C:\Users\%USERNAME%\Desktop\sdbl-parser-cli\examples\receipt_query.sql" "C:\Users\%USERNAME%\Documents\sdql-queries\"
```

**Содержимое `receipt_query.sql`:**
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

### 5.3. Запуск анализа (абсолютные пути)

```cmd
cd C:\Users\%USERNAME%\Desktop\sdbl-parser-cli

sd-cli.bat analyze ^
  --sql-file C:\Users\%USERNAME%\Documents\sdql-queries\receipt_query.sql ^
  --output-dir C:\Users\%USERNAME%\Documents\sdql-results ^
  --base-name receipt
```

> Символ `^` в `cmd` — это перенос строки. Можно писать и в одну строку.

### 5.4. Запуск анализа (относительные пути — только если папка рядом)

Если запросы и результаты лежат в соседних папках:

```cmd
cd C:\Users\%USERNAME%\Desktop\sdbl-parser-cli

sd-cli.bat analyze ^
  --sql-file ..\..\Documents\sdql-queries\receipt_query.sql ^
  --output-dir C:\Users\%USERNAME%\Documents\sdql-results ^
  --base-name receipt
```

> **Важно:** `--output-dir` должен быть абсолютным! `--sql-file` может быть относительным.

### 5.5. Проверка созданных файлов

```cmd
dir "C:\Users\%USERNAME%\Documents\sdql-results" /s /b
```

**Ожидаемый список:**
```
C:\Users\User\Documents\sdql-results\SDBL_PARS\sdbl_parse_model_receipt.json
C:\Users\User\Documents\sdql-results\LINE_PARS\LINE_PARS_model_receipt.json
C:\Users\User\Documents\sdql-results\LINE_PARS\LINE_PARS_hierarchy_receipt.json
C:\Users\User\Documents\sdql-results\FULL_PARS\FULL_PARS_model_receipt.json
C:\Users\User\Documents\sdql-results\field_lineage\receipt\...
C:\Users\User\Documents\sdql-results\full_field_lineage\receipt\...
C:\Users\User\Documents\sdql-results\RESTORED_QUERIES\receipt\...
C:\Users\User\Documents\sdql-results\VERIFICATION\receipt\...
```

### 5.6. Другие команды

**Список узлов:**
```cmd
sd-cli.bat list-nodes ^
  --artifacts-dir C:\Users\%USERNAME%\Documents\sdql-results ^
  --base-name receipt
```

**Иерархия:**
```cmd
sd-cli.bat hierarchy ^
  --artifacts-dir C:\Users\%USERNAME%\Documents\sdql-results ^
  --base-name receipt
```

**Lineage поля:**
```cmd
sd-cli.bat field-lineage ^
  --artifacts-dir C:\Users\%USERNAME%\Documents\sdql-results ^
  --base-name receipt --node-id 0 --alias "Номенклатура"
```

**Полный lineage:**
```cmd
sd-cli.bat full-field-lineage ^
  --artifacts-dir C:\Users\%USERNAME%\Documents\sdql-results ^
  --base-name receipt --node-id 0 --aliases "Документ,Номенклатура,Количество"
```

**Восстановление SQL:**
```cmd
sd-cli.bat restore-query ^
  --artifacts-dir C:\Users\%USERNAME%\Documents\sdql-results ^
  --base-name receipt --node-id 0 --aliases "Документ,Номенклатура,Количество"
```

---

## 6. Готовые файлы для запуска

В проекте уже есть всё необходимое:

| Файл | Назначение |
|---|---|
| `release\sd-cli.jar` | Собранный fat JAR (25 МБ) со всеми зависимостями |
| `sd-cli.bat` | Windows-запускатор. Ищет JAR сначала в `release\`, затем в `build\libs\` |

### Как использовать

**Вариант 1 — из папки проекта:**
```cmd
cd C:\Users\%USERNAME%\Desktop\sdbl-parser-cli
sd-cli.bat --help
```

**Вариант 2 — добавить в PATH:**
1. Откройте «Переменные среды» (`sysdm.cpl`)
2. В `PATH` добавьте: `C:\Users\%USERNAME%\Desktop\sdbl-parser-cli`
3. Теперь `sd-cli.bat` работает из любой папки:
```cmd
sd-cli.bat analyze --sql-file C:\Users\%USERNAME%\Documents\sdql-queries\query.sql --output-dir C:\Users\%USERNAME%\Documents\sdql-results --base-name myquery
```

**Вариант 3 — скопировать на рабочий стол:**
Скопируйте `sd-cli.bat` и `release\sd-cli.jar` в одну папку (например, рабочий стол) и запускайте оттуда.

---

## 7. Альтернатива — Git Bash

Если установлен Git for Windows, можно работать через `Git Bash`:

```bash
cd /c/Users/$USER/Desktop/sdbl-parser-cli
bash sd-cli analyze --sql-file /c/Users/$USER/Documents/sdql-queries/receipt_query.sql --output-dir /c/Users/$USER/Documents/sdql-results --base-name receipt
```

---

## 8. Справочник команд

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

---

## 9. Известные проблемы

Полный список багов и обходных решений: [bugs.md](../bugs.md)

Кратко:
- **Абсолютные пути обязательны** для `--output-dir`
- **Кракозябры в консоли** — JSON-файлы корректны, читайте их
- **`restore-query` пустой** — проверьте, что `analyze` запускался с абсолютным путём

---

## 10. Лицензия

LGPL-3.0
