package com.stackroute.kafka.locationconsumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.stackroute.kafka.locationconsumer.model.Location;

@Service
public class KafkaConsumer {
	
	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@Autowired
	private KafkaProducer kafkaProducer;
	/*
	 * @KafkaListener- Annotation that marks a method to be the target of a Kafka
	 * message listener on the specified topics
	 */

	/*]
	 * kafka json listener, specifying the listener container factory group =
	 * "group_json"
	 */
	@KafkaListener(topics = "Location12", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(Location location) {
		LOG.info("Consumed JSON message='{}'", location);
		kafkaProducer.post(location);
	}
}
