package com.stackroute.matchmaker.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.indexermodel.Indexer;
import com.stackroute.matchmaker.indexermodel.SkillIndexer;
import com.stackroute.matchmaker.indexermodel.TargetNodeProperty;
import com.stackroute.matchmaker.indexermodel.WorkIndexer;
import com.stackroute.matchmaker.listener.KafkaConsumer;
import com.stackroute.matchmaker.model.Project;
import com.stackroute.matchmaker.relationshipmodel.SkillRelationshipProperties;
import com.stackroute.matchmaker.relationshipmodel.WorkInRelationshipProperties;

@Service
public class Receiver {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	@Autowired
	private Producer producer;

	public Indexer indexer = new Indexer();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	public SkillRelationshipProperties skillRelationshipProperties = new SkillRelationshipProperties();
	public WorkInRelationshipProperties workInRelationshipProperties = new WorkInRelationshipProperties();
	public SkillIndexer skillIndexer = new SkillIndexer();
	public WorkIndexer workIndexer = new WorkIndexer();

	public void receiveObject(Project project) {
		LOG.info("Parsed JSON message='{}'", project);
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

		LOG.info("Parsed JSON message='{}'", indexer);
		
		LOG.info("Parsed JSON message='{}'", project);

		producer.send(project);

	}

}
