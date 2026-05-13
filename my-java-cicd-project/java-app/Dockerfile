FROM eclipse-temurin:17-jre-alpine

WORKDIR /opt/app

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
