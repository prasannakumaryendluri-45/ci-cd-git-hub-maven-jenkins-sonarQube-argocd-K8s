FROM eclipse-temurin:17-jre-alpine

WORKDIR /opt/app

COPY target/ci-cd-java-app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
