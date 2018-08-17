FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/qualification-microservice-1.0.0.jar /src/qualification.jar

EXPOSE 8085

RUN sh -c 'touch /src/qualification.jar'

ENTRYPOINT ["java","-jar","/src/qualification.jar"]
