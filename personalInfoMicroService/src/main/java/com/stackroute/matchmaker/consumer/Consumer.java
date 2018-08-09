package com.stackroute.matchmaker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.model.PersonalInfo;

/* This class consumes the messages that comes to the 
 * kafka bus from the upstream service and displays it on the console
 * 
 */

@Service
public class Consumer {
	
	private static Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@Autowired
	KafkaTemplate<String, String>  kafkaTemplate;
		
	@KafkaListener(topics="testing")
	public void consumer(@Payload String string)  {
		logger.warn(string);
	}
	
	//listens to the topic "PersonalInfo" of upstream 
	@KafkaListener(topics = "PersonalInfo", containerFactory = "personalInfoKafkaContainerFactory")
	public void consumerPersonalInfo(PersonalInfo personalInfo) {
		System.out.println(personalInfo.toString());
	}

}
