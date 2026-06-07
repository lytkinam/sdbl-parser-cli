# Обновление собранного JAR в репозитории

В папке `release/` лежит предсобранный fat JAR (`sd-cli.jar`).
Этот файл обновляется через **squash** (`git rebase -i`), чтобы не накапливать бессмысленную бинарную историю в git.

## Правило

Каждый раз при обновлении JAR создавать новый коммит **нельзя**.
Вместо этого все изменения, связанные с JAR, должны быть squashed в один коммит.

## Как обновить JAR (вариант 2 — squash через rebase)

### Шаг 1. Пересобрать JAR

```bash
./gradlew shadowJarCli
cp build/libs/bsl-parser-*-cli.jar release/sd-cli.jar
```

### Шаг 2. Сделать временный коммит

```bash
git add release/sd-cli.jar
git commit -m "chore: update release/sd-cli.jar"
```

### Шаг 3. Найти коммиты, которые нужно объединить

```bash
git log --oneline
```

Пример вывода:
```
abc1234 chore: update release/sd-cli.jar
efg5678 docs: some changes
hij9012 feat: add pre-built JAR and update launcher
```

### Шаг 4. Интерактивный rebase

Объединить все коммиты с JAR в один. Если нужно объединить последние 3:

```bash
git rebase -i HEAD~3
```

В открывшемся редакторе измените второй и последующие коммиты с JAR:

```
pick hij9012 feat: add pre-built JAR and update launcher
pick efg5678 docs: some changes
squash abc1234 chore: update release/sd-cli.jar
```

Сохраните и закройте редактор.

### Шаг 5. Отредактировать сообщение коммита

Git откроет редактор для итогового сообщения. Оставьте одно сообщение, например:

```
feat: add pre-built JAR and update launcher

- release/sd-cli.jar: fat JAR with all dependencies
- sd-cli.bat: launcher script
```

### Шаг 6. Форс-пуш

```bash
git push --force
```

> **Внимание:** `--force` перезаписывает историю. Используйте только если вы единственный contributor в ветке.

---

## Альтернатива — GitHub Releases

Если обновления JAR происходят часто, рекомендуется удалить JAR из git и прикреплять его к **GitHub Release** как asset. Это позволяет избежать раздувания репозитория полностью.
