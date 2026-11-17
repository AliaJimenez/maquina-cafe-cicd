# Máquina de Café (TDD) con CI en GitHub Actions

Proyecto Java/Maven desarrollado con TDD (JUnit 4) y un pipeline de integración continua.

## Pipeline

El workflow [`.github/workflows/ci-pipeline.yml`](.github/workflows/ci-pipeline.yml) se ejecuta en cada `push` y `pull_request`:

1. Clona el repositorio.
2. Configura Java 17 (Temurin) con caché de Maven.
3. Compila el proyecto (`mvn compile`).
4. Ejecuta las pruebas (`mvn test`).

## Ramas

- `main`: versión estable.
- `develop`: integración del desarrollo.
- `feature/*`: nuevas funcionalidades, se integran a `develop` mediante pull request.
