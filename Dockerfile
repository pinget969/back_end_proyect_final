FROM amazoncorretto:11-alpine-jdk
#MAINTAINER emaaristimunos
COPY target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]