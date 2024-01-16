# Starta från en base image som innehåller jdk 8
# FROM openjdk:8-jdk-alpine
FROM openjdk:21-jdk


# Skapa en mapp för applikationen där vi jobbar /app
WORKDIR /app

# Kopiera Maven Wrapper filerna till mappen vi jobbar i
COPY mvnw .
COPY .mvn .mvn

# Kopiera pom.xml och källkoden
COPY pom.xml .
COPY src src

# Bygg applikationen

RUN ./mvnw package -DskipTests -e

# Starta applikationen

CMD ["java","-jar", "target/2024_users_api-0.0.1-SNAPSHOT.jar"]