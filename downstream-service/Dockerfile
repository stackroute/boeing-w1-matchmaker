FROM java:8
MAINTAINER simran "narang.simran30@gmail.com"
RUN mkdir /src
WORKDIR /src
COPY target/downstream-service-1.2.0.jar /src/downstream.jar
EXPOSE 8090
RUN sh -c 'touch /src/downstream.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://127.0.0.1:27017/test", "-Djava.security.egd=file:/dev/./urandom","-jar","/src/downstream.jar"]

