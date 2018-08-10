package com.stackroute.matchmaker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.model.PersonalInfo;

@Service
public class Consumer {
	
	private static Logger LOG = LoggerFactory.getLogger(Consumer.class);
	
	@Autowired
	KafkaTemplate<String, String>  kafkaTemplate;
	
			
	@KafkaListener(topics = "${app.topic.name}", groupId = "${spring.kafka.consumer.group-id}",
	           containerFactory = "personalInfoKafkaContainerFactory")
	   public void consumeJson(PersonalInfo personalInfo) {
	         LOG.info("received message='{}'",personalInfo);
	         
	   }
	
	/*@KafkaListener(topics = "PersonalInfo", containerFactory = "personalInfoKafkaContainerFactory")
	public void consumerPersonalInfo(PersonalInfo personalInfo) {
		PersonalInfo pr = new PersonalInfo("oo","oo","oo","oo","oo","oo","oo","oo","oo","oo","oo","oo");
		kafkaTemplate.send("PersonalInfo", pr.toString());
		
		System.out.println(personalInfo.toString());
	}*/
	

}
