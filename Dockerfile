FROM maven:3.8.6-openjdk-8-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=build /app/target/TemperatureConverter-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar", "temperatureConverter.TemperatureConverter"]
