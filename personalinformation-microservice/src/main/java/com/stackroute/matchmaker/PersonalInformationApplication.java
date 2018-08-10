package com.stackroute.matchmaker;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import com.stackroute.matchmaker.producer.Producer;

@SpringBootApplication
public class PersonalInformationApplication {
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(PersonalInformationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PersonalInformationApplication.class, args);
	}
}
