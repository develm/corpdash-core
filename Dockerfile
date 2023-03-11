FROM openjdk:17-jdk-slim
EXPOSE 8000

WORKDIR /app
COPY ./build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
