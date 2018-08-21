package com.stackroute.experiencemicroservice.appli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*@SpringBootApplication encapsulates @Configuration,
@EnableAutoConfiguration, and @ComponentScan annotations with
their default attributes.*/
@SpringBootApplication
public class ExperienceMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperienceMicroserviceApplication.class, args);
	}
}
