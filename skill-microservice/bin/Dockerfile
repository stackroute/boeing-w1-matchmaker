FROM java:8

RUN mkdir /src

WORKDIR /src

COPY target/skill-microservice-1.0.0.jar /src/skill.jar

EXPOSE 8089

RUN sh -c 'touch /src/skill.jar'

ENTRYPOINT ["java","-jar","/src/user.jar"]
