package com.stackroute.matchmaker.nlpservice.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.nlpservice.model.Search;

@Service
public class Producer {

	private static final Logger LOG = LoggerFactory.getLogger(Producer.class);

	@Autowired
	private KafkaTemplate<String, Search> kafkaTemplate;

	/*
	 * public void sender(Search search) { LOG.info("sending JSON message='{}'",
	 * search);
	 * 
	 * kafkaTemplate.send("NLP", search); LOG.info("sfds"); }
	 */
	String topic = "NLP";

	public void sender(Search search) {
		// TODO Auto-generated method stub
		LOG.info("sending JSON message='{}'", search);

		kafkaTemplate.send(topic, search);

		LOG.info("sent", search);

	}

}
