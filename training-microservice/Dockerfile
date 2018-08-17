FROM java:8

MAINTAINER sathwik10.pancheti@gmail.com

RUN mkdir /src

WORKDIR /src

COPY target/training-microservice-1.0.0.jar /src/training.jar

EXPOSE 8084

RUN sh -c 'touch /src/training.jar'

ENTRYPOINT ["java","-jar","/src/training.jar"]
