package com.stackroute.matchmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @author Ansh
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProjectMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMicroserviceApplication.class, args);
	}
}
