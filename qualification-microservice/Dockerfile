FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/QualificationMicroservice-0.0.1-SNAPSHOT.jar /src/user.jar

EXPOSE 8085

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
