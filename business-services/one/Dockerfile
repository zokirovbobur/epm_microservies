FROM java:8-jre-alpine

VOLUME /tmp

LABEL groupId = "com.epam.javacc.microservices"
LABEL description = "microservice architecture training"

COPY target/one.jar one.jar

EXPOSE 11111

ENTRYPOINT ["java", "-jar", "/one.jar"]