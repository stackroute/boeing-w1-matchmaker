package com.stackroute.matchmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*main application class*/
@SpringBootApplication
@EnableDiscoveryClient
public class PersonalInformationApplication { 
	
	/*main function*/
	public static void main(String[] args) {  
		SpringApplication.run(PersonalInformationApplication.class, args);
	}
}