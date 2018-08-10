package com.stackroute.matchmaker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.model.PersonalInfo;



/* This class consumes the messages that comes to the 
 * kafka bus from the upstream service and displays it on the console
 * 
 */

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
=======
		
	@KafkaListener(topics="testing")
	public void consumer(@Payload String string)  {
		logger.warn(string);
	}
	
	//listens to the topic "PersonalInfo" of upstream 
	@KafkaListener(topics = "PersonalInfo", containerFactory = "personalInfoKafkaContainerFactory")
>>>>>>> cc29b4a1b1515bce089d7d95508d939ff8d916e0:personalInfoMicroService/src/main/java/com/stackroute/matchmaker/consumer/Consumer.java
	public void consumerPersonalInfo(PersonalInfo personalInfo) {
		System.out.println(personalInfo.toString());
	}*/
	

}
