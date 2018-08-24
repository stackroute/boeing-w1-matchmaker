package com.stackroute.matchmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LocationConsumerApplication {

	//main class to run spring boot application
	public static void main(String[] args) {
		SpringApplication.run(LocationConsumerApplication.class, args);
	}
}
