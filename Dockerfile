FROM openjdk:17-jdk-slim
MAINTAINER vishal.com
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]