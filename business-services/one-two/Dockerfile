FROM java:8-jre-alpine

VOLUME /tmp

LABEL groupId = "com.epam.javacc.microservices"
LABEL description = "microservice architecture training"

COPY target/one-two.jar one-two.jar

EXPOSE 11111

ENTRYPOINT ["java", "-jar", "/one-two.jar"]