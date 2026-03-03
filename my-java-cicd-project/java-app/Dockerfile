# Use Java 21 lightweight runtime image
FROM eclipse-temurin:21-jre-alpine

# Artifact path (your JAR file)
ARG artifact=target/ci-cd-java-app.jar

# Set working directory inside container
WORKDIR /opt/app

# Copy JAR file into container and rename to app.jar
COPY ${artifact} app.jar

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
