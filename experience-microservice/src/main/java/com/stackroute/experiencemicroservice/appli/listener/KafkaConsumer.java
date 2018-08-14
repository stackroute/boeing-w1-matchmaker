package com.stackroute.experiencemicroservice.appli.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.experiencemicroservice.appli.model.Experience;

@Service
public class KafkaConsumer {
	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	//
	// // String message
	// @KafkaListener(topics =
	// "${experienceproducer.producer.exp}",group="${spring.kafka.consumer.group-id}")
	// public void consume(String message) {
	// // System.out.println("Consumed message: " + message);
	// LOG.info("received message='{}'", message);
	// }

	// Json message
	/*
	 * @KafkaListener Annotation that marks a method to be the target of a Kafka
	 * message listener on the specified topics
	 */
	@KafkaListener(topics = "${experienceproducer.producer.exp}", groupId = "${spring.kafka.consumer.group-id}", containerFactory = "experienceKafkaListenerFactory")
	public void consumeJson(Experience experience) {
		// System.out.println("Consumed JSON Message: " + experience);
		LOG.info("recieved JSON message='{}'", experience);
	}
}
