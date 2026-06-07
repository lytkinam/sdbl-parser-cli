@echo off
setlocal enabledelayedexpansion

set "JAR=release\sd-cli.jar"

if not exist "%JAR%" (
    set "JAR=build\libs\bsl-parser-0.1.0-SNAPSHOT-cli.jar"
)

if not exist "%JAR%" (
    echo [ERROR] JAR not found.
    echo Run: gradlew shadowJarCli
    exit /b 1
)

java -jar "%JAR%" %*
