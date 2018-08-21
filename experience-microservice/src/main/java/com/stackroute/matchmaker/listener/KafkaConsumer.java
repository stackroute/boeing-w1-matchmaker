package com.stackroute.matchmaker.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.controller.KafkaProducerController;
import com.stackroute.matchmaker.model.Experience;

@Service
public class KafkaConsumer {

	/*
	 * A CountDownLatch initialized with a count of one serves as a simple on/off
	 * latch, or gate: all threads invoking await wait at the gate until it is
	 * opened by a thread invoking countDown() .
	 */
//	private CountDownLatch latch = new CountDownLatch(1);
//
//	public CountDownLatch getLatch() {
//		return latch;
//	}

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

	// @Autowired
	// private GetObject obj;

	@Autowired
	private KafkaProducerController kafkaProducer;

	/*
	 * @KafkaListener Annotation that marks a method to be the target of a Kafka
	 * message listener on the specified topics
	 */

	@KafkaListener(topics = "${experienceproducer.producer.exp}", groupId = "${spring.kafka.consumer.group-id}", containerFactory = "experienceKafkaListenerFactory")
	public void consumeJson(Experience experience) {
		LOG.info("recieved JSON message='{}'", experience);

		// obj.index(experience);
		kafkaProducer.produceJson(experience);
//		latch.countDown();
	}
}
