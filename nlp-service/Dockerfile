FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/nlp-microservice-1.3.0.jar /src/nlp.jar

COPY stopword.txt /src/stopword.txt

COPY extra.txt /src/extra.txt

COPY location.txt /src/location.txt

COPY skill.txt /src/skill.txt

COPY organisation.txt /src/organisation.txt

EXPOSE 8999

RUN sh -c 'touch /src/nlp.jar'

ENTRYPOINT ["java","-jar","/src/nlp.jar"]
