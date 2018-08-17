package com.stackroute.projectmicroservice.listener;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.model.Project;
import com.stackroute.projectmicroservice.producer.Receiver;

@Service
public class KafkaConsumer {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

	private CountDownLatch latch = new CountDownLatch(1);

	public CountDownLatch getLatch() {
		return latch;
	}

	@Autowired
	private Receiver receiver;

	/*
	 * Properties for Kafka defined
	 * 
	 */
	@KafkaListener(topics = "${app.topic.name}", groupId = "${spring.kafka.consumer.group-id}", containerFactory = "projectKafkaListenerFactory")
	public void consumeJson(Project project) {
		LOG.info("recieved JSON message='{}'", project);
		receiver.receiveObject(project);
	}

}
