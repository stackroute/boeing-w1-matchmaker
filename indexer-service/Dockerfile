FROM java:8
MAINTAINER mani "mani@gmail.com"
RUN mkdir /src

WORKDIR /src

COPY target/indexerservice-1.1.0.jar /src/user.jar

EXPOSE 8081

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
