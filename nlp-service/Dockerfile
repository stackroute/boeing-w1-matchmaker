FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/nlp-microservice-1.2.0.jar /src/nlp.jar

EXPOSE 8999

RUN sh -c 'touch /src/nlp.jar'

ENTRYPOINT ["java","-jar","/src/nlp.jar"]
