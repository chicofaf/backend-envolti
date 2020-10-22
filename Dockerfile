FROM openjdk:8-jdk-alpine
ARG JAR_FILE=person-api.jar
COPY ${JAR_FILE} person-api.jar
ENTRYPOINT ["java","-jar","/person-api.jar"]