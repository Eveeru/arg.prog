
FROM amazoncorretto:8-alpine-jdk
MAINTAINER evelynrusso
COPY target/arg.prog-0.0.1-SNAPSHOT.jar arg.prog-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java","-jar","/arg.prog-0.0.1-SNAPSHOT.jar"]