
FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8090

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} devops.jar

RUN echo "I am creating an docker image for my spring boot application"

MAINTAINER "shahbazikram"

ENTRYPOINT ["java", "-jar", "devops.jar"]
