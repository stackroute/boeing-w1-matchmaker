FROM java:8
MAINTAINER sharoon "sharoon8105@gmail.com"
RUN mkdir /src

WORKDIR /src

COPY target/configuration-service-1.3.0.jar /src/centralizedconfig.jar

EXPOSE 8891

RUN sh -c 'touch /src/centralizedconfig.jar'

ENTRYPOINT ["java", "-jar","/src/centralizedconfig.jar"]
