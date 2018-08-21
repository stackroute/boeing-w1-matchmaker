package com.stackroute.matchmaker.producer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.indexermodel.Indexer;
import com.stackroute.matchmaker.indexermodel.QualificationIndex;
import com.stackroute.matchmaker.model.AcademicQualification;



@Service
public class Producer {

	private static final Logger LOG = LoggerFactory.getLogger(Producer.class);

  /*  @Autowired
	private KafkaTemplate<String, Indexer> kafkaTemplate;

	public void sender(Indexer indexer) {
  	LOG.info("sending JSON message='{}'", indexer);
		kafkaTemplate.send("QualificationIndexer", indexer);
	}*/

	/*@Autowired
	private KafkaTemplate<String,AcademicQualification> kafkaTemplate;

	public void send(AcademicQualification qualification) {
		LOG.info("sending JSON message='{}'",qualification );
		kafkaTemplate.send("Indexer",qualification);
	}*/
	
	@Autowired
	private KafkaTemplate<String,QualificationIndex> kafkaTemplate;

	public void sendtoindexer(QualificationIndex qualificationIndexer) {
		LOG.info("sending JSON with weight message='{}'",qualificationIndexer );
		kafkaTemplate.send("QualificationIndexer",qualificationIndexer);
	}

}