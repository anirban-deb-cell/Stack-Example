FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/stack-1.0.0.jar
COPY ${JAR_FILE} stack-1.0.0.jar
ENTRYPOINT ["java","-jar","/stack-1.0.0.jar"]