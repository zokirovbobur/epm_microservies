FROM java:8-jre-alpine

VOLUME /tmp

LABEL groupId = "com.epam.javacc.microservices"
LABEL description = "microservice architecture training"

COPY target/gateway.jar gateway.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/gateway.jar"]