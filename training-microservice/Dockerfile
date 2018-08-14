FROM java:8

MAINTAINER sathwik10.pancheti@gmail.com

RUN mkdir /src

WORKDIR /src

COPY target/training-microservice-v1.0.0-SNAPSHOT.jar /src/user.jar

EXPOSE 8080

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
