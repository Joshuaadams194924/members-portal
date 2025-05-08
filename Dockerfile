# Start from an official Java 17 runtime
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR from your machine into the container
COPY app.jar app.jar



# Expose port 8080 (same as your Spring Boot app)
EXPOSE 8080

# Run the JAR when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
