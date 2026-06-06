# SDQL CLI — Руководство администратора

**Версия:** 1.0  
**Дата:** 2026-06-06  
**Задача:** Redmine #646

---

## 1. Установка

### 1.1 Требования

| Компонент | Версия |
|-----------|--------|
| Java | 17+ |
| Gradle | 8.5+ (только для сборки) |
| ANTLR4 Runtime | 4.13.1 (через Gradle) |
| Jackson | 2.17.2 (через Gradle) |
| ОС | Linux (Ubuntu 22.04+) |

### 1.2 Структура установки

```
/home/user/sdql-cli/          # Приложение
├── src/                      # Исходный код
├── build/                    # Скомпилированные классы
├── gradlew                   # Gradle wrapper
├── build.gradle.kts          # Сборка
├── sdql-cli                  # Скрипт запуска
└── docs/                     # Документация

/home/user/sdql-data/         # Рабочие данные (создаётся при работе)
```

### 1.3 Компиляция

```bash
cd /home/user/sdql-cli
./gradlew classes
```

**Важно:** Не запускать `./gradlew clean` без необходимости — ANTLR4 генерация занимает время.

### 1.4 Глобальный доступ

Скрипт `sdql-cli` доступен через symlink:

```
~/.local/bin/sdql-cli → /home/user/sdql-cli/sdql-cli
```

`~/.local/bin` должен быть в PATH.

---

## 2. Управление

### 2.1 Проверка работоспособности

```bash
sdql-cli --help
sdql-cli analyze --sql-text "ВЫБРАТЬ 1" --online
```

### 2.2 Пересборка после обновления кода

```bash
cd /home/user/sdql-cli
./gradlew classes
```

### 2.3 Очистка данных

```bash
# Очистить все артефакты
rm -rf /home/user/sdql-data/*

# Очистить конкретный проект
rm -rf /home/user/sdql-data/project_name
```

---

## 3. Мониторинг

### 3.1 Логи

- **stdout** — JSON результат
- **stderr** — логи и ошибки

```bash
# Записать результат в файл, логи в консоль
sdql-cli analyze --sql-file query.sql --output-dir ./out > result.json

# Полностью подавить debug-логи
sdql-cli analyze --sql-file query.sql --output-dir ./out 2>/dev/null
```

### 3.2 Debug-режим

```bash
sdql-cli --debug analyze --sql-file query.sql --output-dir ./out
```

---

## 4. Резервное копирование

### 4.1 Что бэкапить

```bash
# Артефакты разбора
tar czf sdql-data-backup.tar.gz /home/user/sdql-data/

# Исходный код (если были изменения)
tar czf sdql-cli-backup.tar.gz /home/user/sdql-cli/
```

### 4.2 Автоматический бэкап через cron

```bash
# Добавить в crontab
crontab -e

# Ежедневный бэкап в 3:00
0 3 * * * tar czf /backup/sdql-data-$(date +\%Y\%m\%d).tar.gz /home/user/sdql-data/
```

---

## 5. Интеграция с MCP_QUERY_1C

### 5.1 Архитектура

```
MCP_QUERY_1C (порт 15372)
    │
    ▼ Process spawn (stdin/stdout)
SDQL CLI
    │
    ▼ Direct Java call
SdqlPipeline
    │
    ▼ File system
/home/user/sdql-data/
```

### 5.2 Пример вызова из Java

```java
ProcessBuilder pb = new ProcessBuilder(
    "sdql-cli"
);
Process process = pb.start();

// stdin
String json = "{\"command\":\"analyze\",\"args\":{\"sqlText\":\"...\",\"outputDir\":\"/home/user/sdql-data/result\"}}";
process.getOutputStream().write(json.getBytes());
process.getOutputStream().close();

// stdout
String response = new String(process.getInputStream().readAllBytes());
int exitCode = process.waitFor();
```

### 5.3 Требования к интеграции

- CLI и MCP-сервер должны работать в одной файловой системе
- Общий доступ к `/home/user/sdql-data/`
- Параллельные вызовы безопасны при разных `--output-dir`

---

## 6. Устранение неполадок

### 6.1 "Project not compiled"

```bash
cd /home/user/sdql-cli
./gradlew classes
```

### 6.2 "SDBL model not found"

Проверить путь к артефактам:

```bash
ls /home/user/sdql-data/<project>/SDBL_PARS/
```

### 6.3 Долгий разбор (middle_example > 60 сек)

Нормально для сложных запросов. Увеличить таймаут вызывающего процесса.

### 6.4 OutOfMemory

```bash
# Увеличить heap
export JAVA_OPTS="-Xmx2g"
```

---

## 7. Безопасность

- CLI не выполняет SQL, только парсит
- Нет сетевых вызовов
- Проверка путей на выход за пределы `--output-dir`
- Работает от пользователя `user`, не требует root

---

*Refs Redmine #646*
