FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/search-microservice-1.3.0.jar /src/search.jar

EXPOSE 8998

RUN sh -c 'touch /src/search.jar'

ENTRYPOINT ["java","-jar","/src/search.jar"]
