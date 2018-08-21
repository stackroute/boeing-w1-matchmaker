package com.stackroute.matchmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class LocationConsumerApplication {

	//main class to run spring boot application
	public static void main(String[] args) {
		SpringApplication.run(LocationConsumerApplication.class, args);
	}
}
