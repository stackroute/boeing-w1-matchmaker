package com.stackroute.matchmaker.autocompletemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @author syam
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AutocompleteMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutocompleteMicroserviceApplication.class, args);
	}
}
