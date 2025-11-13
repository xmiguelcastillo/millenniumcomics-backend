# Use Java 17 runtime
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy everything into the container
COPY . .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Build the Spring Boot app
RUN ./mvnw -Dmaven.test.skip=true package

# Run the actual JAR file
CMD ["java", "-jar", "target/MillenniumComics-0.0.1-SNAPSHOT.jar"]
