FROM java:8
MAINTAINER sharoon "sharoon8105@gmail.com"
RUN mkdir /src

WORKDIR /src

COPY target/eureka-server-1.2.0.jar /src/eureka.jar

EXPOSE 9090

RUN sh -c 'touch /src/eureka.jar'

ENTRYPOINT ["java","-jar","/src/eureka.jar"]
