package com.stackroute.experiencemicroservice.appli.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
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

	public Indexer wasRelationIndexer = new Indexer();
	public Indexer isRelationIndexer = new Indexer();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	public RelationshipName relationshipName = new RelationshipName();
	public RelationshipProperties relationshipProperties = new RelationshipProperties();

	// @Autowired
	// public Indexer wasRelationIndexer;
	// @Autowired
	// public Indexer isRelationIndexer;
	// @Autowired
	// public TargetNodeProperty targetNodeProperty;
	// @Autowired
	// public RelationshipName relationshipName;
	// @Autowired
	// public RelationshipProperties relationshipProperties;
	//

	@Value("${experienceproducer1.producer1.exp1}")
	private String TOPIC;

	public void produceJson(Experience experience) {
		TargetNodeProperty targetNodeProperty = new TargetNodeProperty(experience.getProfileId());
		LOG.info("sending JSON message='{}'", targetNodeProperty, TOPIC);
		RelationshipProperties relationshipProperties = new RelationshipProperties(experience.getOrganizationName(),experience.getRole(),
				experience.getStartDate(), experience.getEndDate());
		LOG.info("sending JSON message='{}'", relationshipProperties, TOPIC);

		relationshipName.setEmployeeOf("employeeOf");
		relationshipName.setWasEmployeeOf("wasEmployeeOf");
		
		// Indexer(sourceNodeType,sourceNodeProperty,targetNodeType,targetNodeProperty,relationshipProperties,relationshipName);
		Indexer indexer = new Indexer("Experience", "sourceNodeProperty", "jsbdcvb", targetNodeProperty,
				 relationshipProperties,relationshipName, "Created");
		kafkaTemplate.send(TOPIC, indexer);
		LOG.info("sending JSON message='{}'", indexer, TOPIC);

	}
}
