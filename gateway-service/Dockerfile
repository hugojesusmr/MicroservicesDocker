FROM openjdk:11-jre-slim
ARG JAR_FILE=build/libs/gateway-service-1.0.jar
ADD ${JAR_FILE} gateway-service.jar
ENTRYPOINT ["java","-jar","/gateway-service.jar"]