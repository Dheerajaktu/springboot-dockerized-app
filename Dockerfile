FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

COPY /target/dockerized-app-0.0.1-SNAPSHOT.jar dockerized-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "dockerized-app.jar"]