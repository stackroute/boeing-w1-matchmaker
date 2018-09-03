FROM java:8
MAINTAINER sharoon "sharoon8105@gmail.com"
RUN mkdir /src

WORKDIR /src

COPY target/zuul-apigateway-1.3.0.jar /src/zuul.jar

EXPOSE 8092

RUN sh -c 'touch /src/zuul.jar'

ENTRYPOINT ["java", "-jar","/src/zuul.jar"]
