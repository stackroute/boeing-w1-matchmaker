FROM java:8

MAINTAINER sathwik10.pancheti@gmail.com

RUN mkdir /src

WORKDIR /src

COPY target/training-microservice-1.1.0.jar /src/user.jar

EXPOSE 8084

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
