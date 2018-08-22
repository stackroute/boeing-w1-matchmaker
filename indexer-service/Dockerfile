FROM java:8
MAINTAINER mani "pothugantimanikanta@yahoo.co.in"
RUN mkdir /src

WORKDIR /src

COPY target/indexer-service-1.1.0.jar /src/indexer-service.jar

EXPOSE 8091

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
