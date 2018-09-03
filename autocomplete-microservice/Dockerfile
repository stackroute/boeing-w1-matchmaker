FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/autocomplete-microservice-1.3.0.jar /src/autocomplete.jar

EXPOSE 6969

RUN sh -c 'touch /src/experience.jar'

ENTRYPOINT ["java","-jar","/src/autocomplete.jar"]
