package com.stackroute.matchmaker.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*We use the KafkaTemplate class which wraps a Producer 
and provides high-level operations to send data to Kafka topics.*/ 

@Service
public class Producer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	

    Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
	
	
	public void sendMessage() {
		this.kafkaTemplate.send("check","joe");
		kafkaTemplate.send("check","hello machu");
	}

}
