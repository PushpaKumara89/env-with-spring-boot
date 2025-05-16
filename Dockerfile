FROM maven:3.9.6-eclipse-temurin-21 AS dev
WORKDIR /app
COPY pom.xml .
COPY src ./src
ENV JAVA_OPTS="-Dspring.devtools.restart.enabled=true -Dspring.devtools.livereload.enabled=true"
CMD ["mvn", "spring-boot:run"]

FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package 


FROM openjdk:17-alpine AS prod
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]