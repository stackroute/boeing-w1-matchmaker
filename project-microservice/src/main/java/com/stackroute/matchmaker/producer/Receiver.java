package com.stackroute.matchmaker.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.indexermodel.Indexer;
import com.stackroute.matchmaker.indexermodel.ProjectIndex;
import com.stackroute.matchmaker.indexermodel.SkillIndexer;
import com.stackroute.matchmaker.indexermodel.TargetNodeProperty;
import com.stackroute.matchmaker.indexermodel.WorkIndexer;
import com.stackroute.matchmaker.listener.KafkaConsumer;
import com.stackroute.matchmaker.model.Projects;
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
	public ProjectIndex projectIndex = new ProjectIndex();

	public void receiveObject(Projects projects) {

		// Populating Project Index
		projectIndex.setDemoURL(projects.getDemoURL());
		projectIndex.setDepartment(projects.getDepartment());
		projectIndex.setFrom(projects.getFrom());
		projectIndex.setMessage(projects.getMessage());
		projectIndex.setProfileId(projects.getProfileId());
		projectIndex.setProjectAt(projects.getProjectAt());
		projectIndex.setProjectId(projects.getProjectId());
		projectIndex.setProjectLocation(projects.getProjectLocation());
		projectIndex.setProjectTitle(projects.getProjectTitle());
		projectIndex.setRole(projects.getRole());
		projectIndex.setSkills(projects.getSkills());
		projectIndex.setSynopsis(projects.getSynopsis());
		projectIndex.setTo(projects.getTo());
		projectIndex.setUrl(projects.getUrl());
		projectIndex.setWeight("10");

		LOG.info("Parsed JSON message='{}'", projects);
		// Target Node Type
		workIndexer.setTargetNodeType("Profile");
		skillIndexer.setTargetNodeType("Project");

		// Source Node Type
		workIndexer.setSourceNodeType("Project");
		skillIndexer.setSourceNodeType("Skill");

		// Source Node Property

		workIndexer.setSourceNodeProperty(projects.getProjectId());
		skillIndexer.setSourceNodeProperty(projects.getProjectId());

		// Target Node Property
		targetNodeProperty.setId(projects.getProfileId());

		workIndexer.setTargetNodeProperty(targetNodeProperty);
		skillIndexer.setTargetNodeProperty(targetNodeProperty);

		// Work in Defined
		workInRelationshipProperties.setDepartment(projects.getDepartment());
		workInRelationshipProperties.setFrom(projects.getFrom());
		workInRelationshipProperties.setProjectName(projects.getProjectTitle());
		workInRelationshipProperties.setRole(projects.getRole());
		workInRelationshipProperties.setTo(projects.getTo());

		workIndexer.setWorkInRelationshipProperties(workInRelationshipProperties);

		// Skill Defined
		skillRelationshipProperties.setWeight("3");
		skillRelationshipProperties.setSkills(projects.getSkills());

		skillIndexer.setSkillRelationshipProperties(skillRelationshipProperties);

		// Operations
		workIndexer.setOperation(projects.getMessage());
		skillIndexer.setOperation(projects.getMessage());

		// Converging
		indexer.setWorkIndexer(workIndexer);
		indexer.setSkillIndexer(skillIndexer);

		LOG.info("Parsed JSON message='{}'", indexer);

		LOG.info("Parsed JSON message='{}'", projectIndex);

		producer.send(projectIndex);

	}

}
