FROM java:8
MAINTAINER mani "pothugantimanikanta@yahoo.co.in"
RUN mkdir /src

WORKDIR /src

COPY target/indexer-service-1.1.0.jar /src/indexer.jar

EXPOSE 8091

RUN sh -c 'touch /src/indexer.jar'

ENTRYPOINT ["java","-jar","/src/indexer.jar"]
