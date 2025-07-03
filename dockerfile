# Use official OpenJDK image
FROM openjdk:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy Maven build output (make sure you've built your app)
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
