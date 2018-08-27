FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/personalinformation-microservice-1.2.0.jar /src/personal.jar

EXPOSE 8087

RUN sh -c 'touch /src/personal.jar'

ENTRYPOINT ["java","-jar","/src/personal.jar"]
