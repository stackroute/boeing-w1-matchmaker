package com.stackroute.projectmicroservice.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.indexermodel.Indexer;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, Indexer> kafkaTemplate;

	 public void send(Indexer indexer) {
	 kafkaTemplate.send("ProjectIndexer", indexer);
	 }

}
