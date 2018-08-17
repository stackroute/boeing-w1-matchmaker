FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/location-microservice-1.0.0.jar /src/location.jar

EXPOSE 8086

RUN sh -c 'touch /src/location.jar'

ENTRYPOINT ["java","-jar","/src/location.jar"]
