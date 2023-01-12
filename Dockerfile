FROM amazoncorretto:19-alpine-jdk
MAINTAINER emaaristimuno
COPY /api/target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]