FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/skill-microservice-1.1.0.jar /src/skill.jar

EXPOSE 8089

RUN sh -c 'touch /src/user.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
