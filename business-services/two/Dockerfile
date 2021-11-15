FROM java:8-jre-alpine

VOLUME /tmp

LABEL groupId = "com.epam.javacc.microservices"
LABEL description = "microservice architecture training"

COPY target/two.jar two.jar

EXPOSE 22222

ENTRYPOINT ["java", "-jar", "/two.jar"]