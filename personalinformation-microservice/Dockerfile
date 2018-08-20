FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/personalinformation-microservice-1.1.0.jar /src/personalinformation.jar

EXPOSE 8087

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
