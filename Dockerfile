FROM openjdk:11 AS builder

WORKDIR /app
COPY . ./
RUN ./mvnw package

FROM openjdk:11

WORKDIR /app
COPY --from=builder /app/target/*.jar ./dependancies.jar
ENTRYPOINT [ "java", "-jar", "dependancies.jar" ]