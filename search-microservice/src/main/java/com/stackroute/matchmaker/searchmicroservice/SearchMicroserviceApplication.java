package com.stackroute.matchmaker.searchmicroservice;

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
public class SearchMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchMicroserviceApplication.class, args);
	}
}
