package com.stackroute.qualificationmicroservice.producer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.qualificationmicroservice.indexermodel.Indexer;
import com.stackroute.qualificationmicroservice.model.Qualification;



@Service
public class Producer {

	private static final Logger LOG = LoggerFactory.getLogger(Producer.class);

  /*  @Autowired
	private KafkaTemplate<String, Indexer> kafkaTemplate;

	public void sender(Indexer indexer) {
  	LOG.info("sending JSON message='{}'", indexer);
		kafkaTemplate.send("QualificationIndexer", indexer);
	}*/

	@Autowired
	private KafkaTemplate<String,Qualification> kafkaTemplate;

	public void send(Qualification qualification) {
		LOG.info("sending JSON message='{}'",qualification );
		kafkaTemplate.send("Indexer",qualification);
	}

}