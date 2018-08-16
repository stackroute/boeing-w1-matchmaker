package com.stackroute.projectmicroservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.model.Project;
import com.stackroute.projectmicroservice.modelling.DataIndex;

@Service
public class KafkaConsumer {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

	public DataIndex data;

	/*
	 * Properties for Kafka defined
	 * 
	 */
	@KafkaListener(topics = "${app.topic.name}", groupId = "${spring.kafka.consumer.group-id}", containerFactory = "projectKafkaListenerFactory")
	public void consumeJson(Project project) {
		data.sendData(project);
	}

}
