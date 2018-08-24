FROM java:8
RUN mkdir /src
WORKDIR /src
COPY target/project-microservice-1.1.0.jar /src/project.jar
EXPOSE 8088
RUN sh -c 'touch /src/project.jar'
ENTRYPOINT ["java","-jar","/src/project.jar"]
