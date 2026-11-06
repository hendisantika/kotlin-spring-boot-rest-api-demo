# Kotlin, Spring Boot, MySQL, JPA, Hibernate Rest API

[![Java CI with Maven](https://github.com/hendisantika/kotlin-spring-boot-rest-api-demo/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/kotlin-spring-boot-rest-api-demo/actions/workflows/maven.yml)
[![Dependabot](https://img.shields.io/badge/dependabot-enabled-025E8C?logo=dependabot)](.github/dependabot.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Kotlin](https://img.shields.io/badge/Kotlin-2.4-7F52FF?logo=kotlin)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1-6DB33F?logo=springboot)

Build a Restful CRUD API using Kotlin, Spring Boot, MySQL, JPA and Hibernate.

## Tech Stack

| Component   | Version                          |
|-------------|----------------------------------|
| Java (JDK)  | 25                               |
| Kotlin      | 2.4.x (JVM target 25)            |
| Spring Boot | 4.1.x                            |
| Maven       | 3.9.x (Maven Wrapper included)   |
| Database    | MySQL 8.x (H2 in-memory for tests) |

## Requirements

1. Java - 25
2. Maven - 3.9.x (or use the bundled `./mvnw`)
3. MySQL - 8.x

## Steps to Setup

**1. Clone the application**

```bash
git clone git@github.com:hendisantika/kotlin-spring-boot-rest-api-demo.git
cd kotlin-spring-boot-rest-api-demo
```

**2. Change MySQL username and password as per your installation**

Open `src/main/resources/application.yml` and change `spring.datasource.username` and
`spring.datasource.password` as per your MySQL installation. The database `kotlin_demo_app` is created
automatically (`createDatabaseIfNotExist=true`).

**3. Build & run the tests**

```bash
./mvnw clean package
```

Tests run against an in-memory H2 database, so no MySQL instance is needed to build.

**4. Running the App**

```bash
./mvnw spring-boot:run
```

The app will start running at http://localhost:8080.

## Explore Rest APIs

The app defines following CRUD APIs.

| Method | Endpoint             | Description          |
|--------|----------------------|----------------------|
| GET    | `/api/articles`      | Get all articles     |
| POST   | `/api/articles`      | Create a new article |
| GET    | `/api/articles/{id}` | Get article by id    |
| PUT    | `/api/articles/{id}` | Update article by id |
| DELETE | `/api/articles/{id}` | Delete article by id |

Example request:

```bash
curl -X POST http://localhost:8080/api/articles \
  -H "Content-Type: application/json" \
  -d '{"title": "Hello Kotlin", "content": "Spring Boot 4 on JDK 25"}'
```

You can test them using Postman or any other REST client.

## CI/CD & Dependency Updates

- **GitHub Actions** — [`.github/workflows/maven.yml`](.github/workflows/maven.yml) builds and tests the project
  on JDK 25 (Temurin) for every push and pull request to `master`, and submits the dependency graph on `master`.
- **Dependabot** — [`.github/dependabot.yml`](.github/dependabot.yml) checks Maven dependencies and GitHub Actions
  weekly (Monday 05:00 Asia/Jakarta), grouping related updates (Spring Boot, Kotlin, test dependencies, Maven plugins,
  minor/patch, GitHub Actions) into fewer pull requests.
