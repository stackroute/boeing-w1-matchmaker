package com.stackroute.matchmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/*@SpringBootApplication encapsulates @Configuration,
@EnableAutoConfiguration, and @ComponentScan annotations with
their default attributes.*/
@SpringBootApplication
@EnableDiscoveryClient
public class ExperienceMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperienceMicroserviceApplication.class, args);
	}
}
