package com.stackroute.experiencemicroservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.experiencemicroservice.controller.KafkaProducerController;
import com.stackroute.experiencemicroservice.model.Experience;

@Service
public class KafkaConsumer {
	
	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	
//	@Autowired
//	private GetObject obj;
	
	
	@Autowired
	private KafkaProducerController kafkaProducer;


	// Json message
	/*
	 * @KafkaListener Annotation that marks a method to be the target of a Kafka
	 * message listener on the specified topics
	 */
	
	@KafkaListener(topics = "${experienceproducer.producer.exp}", groupId = "${spring.kafka.consumer.group-id}",
			containerFactory = "experienceKafkaListenerFactory")
	public void consumeJson(Experience experience) {
		// System.out.println("Consumed JSON Message: " + experience);
		LOG.info("recieved JSON message='{}'", experience);
//		obj.index(experience);
		   kafkaProducer.produceJson(experience);
	}
}
