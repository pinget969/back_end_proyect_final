FROM amazoncorretto:11-alpine-jdk
#MAINTAINER emaaristimunos

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'

COPY target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080