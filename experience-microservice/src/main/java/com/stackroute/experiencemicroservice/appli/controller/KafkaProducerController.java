package com.stackroute.experiencemicroservice.appli.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.experiencemicroservice.appli.indexermodel.Indexer;
import com.stackroute.experiencemicroservice.appli.indexermodel.RelationshipName;
import com.stackroute.experiencemicroservice.appli.indexermodel.RelationshipProperties;
import com.stackroute.experiencemicroservice.appli.indexermodel.TargetNodeProperty;
import com.stackroute.experiencemicroservice.appli.model.Experience;

@Service
public class KafkaProducerController {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaProducerController.class);


	@Autowired
	private KafkaTemplate<String, Indexer> kafkaTemplate;
	
	public  Indexer wasRelationIndexer = new Indexer();
	public  Indexer isRelationIndexer = new Indexer();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();

	public RelationshipName relationshipName = new RelationshipName();
	public RelationshipProperties relationshipProperties = new RelationshipProperties();
	
	
	
	
	@Value("${experienceproducer1.producer1.exp1}")
	private String TOPIC;

	public void produceJson(Experience experience) {
		TargetNodeProperty targetNodeProperty = new TargetNodeProperty(experience.getProfileId());
		RelationshipProperties relationshipProperties = new RelationshipProperties(experience.getRole(),experience.getStartDate(),experience.getEndDate(),experience.getOrganizationName());
		
		
		// Indexer(sourceNodeType,sourceNodeProperty,targetNodeType,targetNodeProperty,relationshipProperties,relationshipName);
		Indexer indexer = new Indexer("Experience", "sourceNodeProperty", "jsbdcvb", targetNodeProperty,
				relationshipProperties, relationshipName, "Created");
		kafkaTemplate.send(TOPIC, indexer);
		LOG.info("sending JSON message='{}'", indexer, TOPIC);

	}
}
