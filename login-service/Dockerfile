FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/login-service-1.0.0.jar /src/user.jar

EXPOSE 8082

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
