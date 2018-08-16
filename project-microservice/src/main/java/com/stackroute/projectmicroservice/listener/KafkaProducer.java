package com.stackroute.projectmicroservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.stackroute.projectmicroservice.indexermodel.WorkIndexer;

public class KafkaProducer {
	
	  private static final Logger LOGGER =
		      LoggerFactory.getLogger(KafkaProducer.class);

		  @Autowired
		  private KafkaTemplate<String, WorkIndexer> kafkaTemplate;

		  public void send(String topic, WorkIndexer payload) {
		    LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
		    kafkaTemplate.send(topic, payload);
		 }

}
