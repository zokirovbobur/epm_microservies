FROM java:8-jre-alpine

VOLUME /tmp

LABEL groupId = "com.epam.javacc.microservices"
LABEL description = "microservice architecture training"

COPY target/two-api.jar two-api.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "/two-api.jar"]