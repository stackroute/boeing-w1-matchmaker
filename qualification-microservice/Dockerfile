FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/qualification-microservice-1.1.0.jar /src/qualification.jar

EXPOSE 8085

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
