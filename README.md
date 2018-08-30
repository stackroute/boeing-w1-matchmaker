[![CircleCI](https://circleci.com/gh/stackroute/boeing-w1-matchmaker.svg?style=svg)](https://circleci.com/gh/stackroute/boeing-w1-matchmaker)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d63cf4c677164a1b96bf6a146a6c1573)](https://www.codacy.com/app/abdulrahemansyed/boeing-w1-matchmaker?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=stackroute/boeing-w1-matchmaker&amp;utm_campaign=Badge_Grade)

**Spring Boot Cloud Native Microservices Architecture**
[![N|Solid](https://spring.io/img/homepage/icon-spring-cloud-data-flow.svg)](https://spring.io/img/homepage/icon-spring-cloud-data-flow.svg)
***Modules***

- Centralised spring cloud config-server
- Zuul api-gateway 
- Eureka server for service discovery ***

****Running the System****

Run ```mvn clean compile package``` on all the services

 Start eureka-server 
	--hit localhost:port in the browser to confirm server is up 
     Ex: http://localhost:9090/

-Start config-service 
	--hit localhost:post/.propertiesFileName/default to confirm the server is able to fetch from repo
		--ex: https://localhost:8091/application/default
			--here application is  the name in which the .properties/.yml contents are stored
			-- default is the profile 

-Start restuarant-springboot-service

-Start user-springboot-service

-Start zuul-gatewayproxy
	-- hit localhost:port/applicationName/followed by endpoint mentioned in the controller
		--ex: http://localhost:8092/application/home
		-- applicationName is mentioned in the application.properties

-check the eureka server dashboard to find all the services running.
