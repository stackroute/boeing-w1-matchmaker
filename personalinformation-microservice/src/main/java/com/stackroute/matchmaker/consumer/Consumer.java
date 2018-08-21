package com.stackroute.matchmaker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.stackroute.matchmaker.model.PersonalInfo;
import com.stackroute.matchmaker.producer.Receiver;

/* This class consumes the messages that comes to the 
 * kafka bus from the upstream service and displays it on the console
 * 
 */

@Service
public class Consumer {

	private static Logger log = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	private Receiver receiver;
	
	/*
	 * This function listens to the topic and sends the object to receiver
	 */
	@KafkaListener(topics = "${app.topic.consumer}", groupId = "${spring.kafka.consumer.group-id}", containerFactory = "personalInfoKafkaContainerFactory")
	public void consumeJson(PersonalInfo personalInfo) {

		log.info("received message='{}'", personalInfo);
		receiver.receiveObject(personalInfo);
	}

}