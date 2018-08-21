package com.stackroute.matchmaker.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.indexermodel.Indexer;
import com.stackroute.matchmaker.model.Project;

@Service
public class Producer {

	private static final Logger LOG = LoggerFactory.getLogger(Producer.class);

//	@Autowired
//	private KafkaTemplate<String, Indexer> kafkaTemplate;
//
//	public void send(Indexer indexer) {
//		LOG.info("sending JSON message='{}'", indexer);
//		kafkaTemplate.send("ProjectIndexer", indexer);
//	}
	
	@Autowired
	private KafkaTemplate<String, Project> kafkaTemplate;

	public void send(Project project) {
		LOG.info("sending JSON message='{}'", project);
		kafkaTemplate.send("ProjectIndexer", project);
	}

}
