FROM java:8-jre-alpine

VOLUME /tmp

LABEL groupId = "com.epam.javacc.microservices"
LABEL description = "microservice architecture training"

COPY target/discovery.jar discovery.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/discovery.jar"]