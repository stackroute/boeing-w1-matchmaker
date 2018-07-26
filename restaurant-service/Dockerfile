FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/restaurant-service-1.0.0.jar /src/restaurant.jar

EXPOSE 8080

RUN sh -c 'touch /src/restaurant.jar'

ENTRYPOINT ["java","-jar","/src/restaurant.jar"]
