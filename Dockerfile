# Use Java 21 runtime (matches your pom.xml)
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy everything
COPY . .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Build jar
RUN ./mvnw -Dmaven.test.skip=true package

# Run jar
CMD ["java", "-jar", "target/MillenniumComics-0.0.1-SNAPSHOT.jar"]
