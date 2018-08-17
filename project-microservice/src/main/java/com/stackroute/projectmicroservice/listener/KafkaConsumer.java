package com.stackroute.projectmicroservice.listener;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.indexermodel.Indexer;
import com.stackroute.projectmicroservice.indexermodel.SkillIndexer;
import com.stackroute.projectmicroservice.indexermodel.TargetNodeProperty;
import com.stackroute.projectmicroservice.indexermodel.WorkIndexer;
import com.stackroute.projectmicroservice.model.Project;
import com.stackroute.projectmicroservice.producer.Receiver;
import com.stackroute.projectmicroservice.relationshipmodel.SkillRelationshipProperties;
import com.stackroute.projectmicroservice.relationshipmodel.WorkInRelationshipProperties;

@Service
public class KafkaConsumer {

	public Indexer indexer = new Indexer();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	public SkillRelationshipProperties skillRelationshipProperties = new SkillRelationshipProperties();
	public WorkInRelationshipProperties workInRelationshipProperties = new WorkInRelationshipProperties();
	public SkillIndexer skillIndexer = new SkillIndexer();
	public WorkIndexer workIndexer = new WorkIndexer();

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

	private CountDownLatch latch = new CountDownLatch(1);

	public CountDownLatch getLatch() {
		return latch;
	}

	@Autowired
	private Receiver receiver;

	/*
	 * Properties for Kafka defined
	 * 
	 */
	@KafkaListener(topics = "${app.topic.name}", groupId = "${spring.kafka.consumer.group-id}", containerFactory = "projectKafkaListenerFactory")
	public void consumeJson(Project project) {
		LOG.info("recieved JSON message='{}'", project);

		// Target Node Type
		workIndexer.setTargetNodeType("Profile");
		skillIndexer.setTargetNodeType("Project");

		// Source Node Type
		workIndexer.setSourceNodeType("Project");
		skillIndexer.setSourceNodeType("Skill");

		// Source Node Property

		workIndexer.setSourceNodeProperty(project.getProjectId());
		skillIndexer.setSourceNodeProperty(project.getProjectId());

		// Target Node Property
		targetNodeProperty.setId(project.getProfileId());

		workIndexer.setTargetNodeProperty(targetNodeProperty);
		skillIndexer.setTargetNodeProperty(targetNodeProperty);

		// Work in Defined
		workInRelationshipProperties.setDepartment(project.getDepartment());
		workInRelationshipProperties.setFrom(project.getFrom());
		workInRelationshipProperties.setProjectName(project.getProjectTitle());
		workInRelationshipProperties.setRole(project.getRole());
		workInRelationshipProperties.setTo(project.getTo());

		workIndexer.setWorkInRelationshipProperties(workInRelationshipProperties);

		// Skill Defined
		skillRelationshipProperties.setWeight("3");
		skillRelationshipProperties.setSkills(project.getSkills());

		skillIndexer.setSkillRelationshipProperties(skillRelationshipProperties);

		// Operations
		workIndexer.setOperation(project.getMessage());
		skillIndexer.setOperation(project.getMessage());

		// Converging

		indexer.setWorkIndexer(workIndexer);
		indexer.setSkillIndexer(skillIndexer);

		LOG.info("recieved JSON message='{}'", indexer);

		receiver.receiveObject(project);
	}

}
