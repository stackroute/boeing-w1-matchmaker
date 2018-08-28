package com.stackroute.matchmaker.nlpservice.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.stackroute.matchmaker.nlpservice.model.Search;

public class Producer {
	
	private static final Logger LOG = LoggerFactory.getLogger(Producer.class);
	
	@Autowired
	private KafkaTemplate<String, Search> kafkaTemplate;

	public void send(Search search) {
		LOG.info("sending JSON message='{}'", search);
		kafkaTemplate.send("NLP", search);
	}

}
