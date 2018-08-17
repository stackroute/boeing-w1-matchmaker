FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/personalinformation-microservice-1.0.0.jar /src/personal.jar

EXPOSE 8087

RUN sh -c 'touch /src/personal.jar'

ENTRYPOINT ["java","-jar","/src/personal.jar"]
