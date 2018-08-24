FROM java:8
MAINTAINER simran "narang.simran30@gmail.com"
RUN mkdir /src
<<<<<<< HEAD
WORKDIR /src
COPY target/downstream-service-1.1.0.jar /src/downstream.jar
EXPOSE 8090
RUN sh -c 'touch /src/downstream.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/test", "-Djava.security.egd=file:/dev/./urandom","-jar","/downstream.jar"]

=======

WORKDIR /src

COPY target/downstream-service-1.1.0.jar /src/downstream.jar

EXPOSE 8090

RUN sh -c 'touch /src/downstream.jar'

ENTRYPOINT ["java","-jar","/src/downstream.jar"]
>>>>>>> 147c2c941d4ce01eded412513e1d6c9ede2c05c6
