FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/user-service-1.0.0.jar /src/user.jar

EXPOSE 8081

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
