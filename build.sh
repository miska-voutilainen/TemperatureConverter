#!/bin/bash

echo "=== Running Temperature Converter Build ==="

echo "1. Clean and compile..."
mvn clean compile

echo "2. Running tests..."
mvn test

echo "3. Packaging..."
mvn package -DskipTests

echo "4. Building Docker image..."
docker build -t temperatureconverter:latest .

echo "=== Build Complete! ==="
echo "JAR file: target/TemperatureConverter-1.0-SNAPSHOT.jar"
echo "Docker image: temperatureconverter:latest"
echo "JaCoCo report: target/site/jacoco/index.html"