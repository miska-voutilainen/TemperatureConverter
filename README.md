# Temperature Converter

A Java application for converting temperatures between different units.

## Features

- **Kelvin to Celsius conversion**: Converts Kelvin temperature to Celsius using the formula: °C = K - 273.15

## Project Structure

```
TemperatureConverter/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── temperatureConverter/
│   │           └── TemperatureConverter.java
│   └── test/
│       └── java/
│           └── temperatureConverter/
│               └── TemperatureConverterTest.java
├── pom.xml
└── README.md
```

## Requirements

- Java 8 or higher
- Maven 3.x

## Building the Project

```bash
mvn clean install
```

## Running Tests

```bash
mvn test
```

## Generating Code Coverage Report

To generate a JaCoCo code coverage report:

```bash
mvn clean test
```

The coverage report will be generated in `target/site/jacoco/index.html`

## Usage Example

```java
double celsius = TemperatureConverter.kelvinToCelsius(300);
System.out.println(celsius); // Output: 26.85
```

## Test Coverage

The project includes JUnit 5 test cases that verify:
- Standard conversion (300K = 26.85°C)
- Absolute zero conversion (273.15K = 0°C)
- Zero Kelvin conversion (0K = -273.15°C)

## Tools & Technologies

- **Java 8**
- **Maven** - Build and dependency management
- **JUnit 5** - Unit testing framework
- **JaCoCo** - Code coverage analysis
- **Jenkins** - CI/CD integration (optional)
