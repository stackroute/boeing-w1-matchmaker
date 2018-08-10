FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/Certification-Service-0.0.1-SNAPSHOT.jar /src/user.jar

EXPOSE 8081

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
