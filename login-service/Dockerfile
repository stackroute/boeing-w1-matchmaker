FROM java:8
MAINTAINER sharoon "sharoon8105@gmail.com"
RUN mkdir /src

WORKDIR /src

COPY target/login-service-1.1.0.jar /src/login.jar

EXPOSE 8082

RUN sh -c 'touch /src/login.jar'

ENTRYPOINT ["java","-jar","/src/login.jar"]
