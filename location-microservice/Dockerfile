FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/location-microservice-1.1.0.jar /src/location.jar

EXPOSE 8080

RUN sh -c 'touch /src/location.jar'

ENTRYPOINT ["java","-jar","/src/location.jar"]
