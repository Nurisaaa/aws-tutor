FROM openjdk:21-jdk AS build
WORKDIR /app
COPY . ./
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build /app/target/aws-tutorial-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "aws-tutorial-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081