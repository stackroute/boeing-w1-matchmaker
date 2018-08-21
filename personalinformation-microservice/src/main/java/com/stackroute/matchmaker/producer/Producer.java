package com.stackroute.matchmaker.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.stackroute.matchmaker.model.PersonalInfo;

/*We use the KafkaTemplate class which wraps a Producer 
and provides high-level operations to send data to Kafka topics.*/

@Service
public class Producer {
	
	@Value("${app.topic.producer}")
	 private String topic;

	@Autowired
	private KafkaTemplate<String, PersonalInfo> kafkaTemplate;

	public void sendObject(PersonalInfo personalInfo) {
		kafkaTemplate.send(topic, personalInfo);
	}
}