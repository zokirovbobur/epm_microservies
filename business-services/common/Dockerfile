FROM java:8-jre-alpine

VOLUME /tmp

LABEL groupId = "com.epam.javacc.microservices"
LABEL description = "microservice architecture training"

COPY target/common.jar common.jar

EXPOSE 7777

ENTRYPOINT ["java", "-jar", "/common.jar"]