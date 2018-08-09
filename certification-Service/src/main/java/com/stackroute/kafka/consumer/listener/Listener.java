package com.stackroute.kafka.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.kafka.consumer.model.User;

@Service
public class Listener {
	
	KafkaTemplate<String, String> kt;
	
	@KafkaListener(topics = "Certificates", group = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
	}
	
	@KafkaListener(topics="testing", group= "group_id")
	public void consume(ConsumerRecord<?, ?> cr) {
		System.out.println(cr.toString());
		kt.send("testing1","hello");	
	}
	
}
