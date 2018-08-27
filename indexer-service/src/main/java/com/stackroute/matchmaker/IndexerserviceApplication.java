package com.stackroute.matchmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IndexerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndexerserviceApplication.class, args);
	}
}
