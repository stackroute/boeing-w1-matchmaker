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
public class PiApplication {
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(PiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PiApplication.class, args);
	}
//	@Autowired
//	private Producer producer;
//	
//	private final CountDownLatch latch = new CountDownLatch(3);
//	
//	@Override
//	public void run(String... args) throws Exception {
//		producer.sendMessage("hello buoy");
//		latch.await(60, TimeUnit.SECONDS);
//		logger.info("All received");
//	}
	
}
