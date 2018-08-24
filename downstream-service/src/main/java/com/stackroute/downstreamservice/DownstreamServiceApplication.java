package com.stackroute.downstreamservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @author Simran and Aakash
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DownstreamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DownstreamServiceApplication.class, args);
	}
}
