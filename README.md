# java-application

A simple Java application using Spring Boot framework that displays a random number each time it's accessed in the browser.

## Overview

This application demonstrates a minimal Spring Boot REST API that generates and returns a random number (0-999) on every HTTP request to the root endpoint.

## Prerequisites

- Java 17 or higher
- Maven 3.6+

## Project Structure

```
java-application/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           ├── Application.java
│       │           └── RandomController.java
│       └── resources/
├── pom.xml
└── README.md
```

## Components

### Application.java
The main entry point for the Spring Boot application. Contains the `@SpringBootApplication` annotation which enables auto-configuration and component scanning.

### RandomController.java
A REST controller that handles HTTP GET requests to the root path (`/`). Uses Java's `Random` class to generate a random integer between 0 and 999 on each request.

### pom.xml
Maven configuration file that defines:
- Project metadata (groupId, artifactId, version)
- Spring Boot parent dependency (version 3.2.0)
- Spring Boot Web Starter dependency
- Spring Boot Maven plugin for running the application

## How to Run

1. Navigate to the project directory:
   ```bash
   cd java-application
   ```

2. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```

3. Open your browser and navigate to:
   ```
   http://localhost:8080/
   ```

4. Refresh the page to see a new random number each time.

## How to Build

To create a JAR file:
```bash
mvn clean package
```

To run the JAR:
```bash
java -jar target/java-application-1.0.0.jar
```

## Technologies Used

- **Spring Boot 3.2.0** - Application framework
- **Spring Web** - REST API support
- **Maven** - Build and dependency management
- **Java 17** - Programming language

## API Endpoint

- **GET /** - Returns a random number as plain text
  - Response: A string containing a random integer (0-999)
  - Example: `742`
