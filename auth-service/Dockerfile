FROM openjdk:11-jre-slim
ARG JAR_FILE=build/libs/auth-service-1.0.jar
ADD ${JAR_FILE} auth-service.jar
ENTRYPOINT ["java","-jar","/auth-service.jar"]