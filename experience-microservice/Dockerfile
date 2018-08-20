FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/experience-microservice-1.1.0.jar /src/user.jar

EXPOSE 8083

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
