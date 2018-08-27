FROM java:8
MAINTAINER sharoon "sharoon8105@gmail.com"
RUN mkdir /src

WORKDIR /src

COPY target/user-service-1.2.0.jar /src/user.jar

EXPOSE 8081

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
