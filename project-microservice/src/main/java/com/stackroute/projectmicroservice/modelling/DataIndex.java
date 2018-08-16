package com.stackroute.projectmicroservice.modelling;

import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.indexermodel.SkillIndexer;
import com.stackroute.projectmicroservice.indexermodel.TargetNodeProperty;
import com.stackroute.projectmicroservice.indexermodel.WorkIndexer;
import com.stackroute.projectmicroservice.listener.KafkaProducer;
import com.stackroute.projectmicroservice.model.Project;
import com.stackroute.projectmicroservice.relationshipmodel.SkillRelationshipProperties;
import com.stackroute.projectmicroservice.relationshipmodel.WorkInRelationshipProperties;

@Service
public class DataIndex {

	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	public SkillRelationshipProperties skillRelationshipProperties = new SkillRelationshipProperties();
	public WorkInRelationshipProperties workInRelationshipProperties = new WorkInRelationshipProperties();
	public SkillIndexer indexer2 = new SkillIndexer();
	public WorkIndexer indexer1 = new WorkIndexer();
	public KafkaProducer sendData;

	public void sendData(Project project) {
		// Target Node Type
		indexer1.setTargetNodeType("Profile");
		indexer2.setTargetNodeType("Project");

		// Source Node Type
		indexer1.setSourceNodeType("Project");
		indexer2.setSourceNodeType("Skill");

		// Source Node Property

		indexer1.setSourceNodeProperty(project.getProjectId());
		indexer2.setSourceNodeProperty(project.getProjectId());

		// Target Node Property
		targetNodeProperty.setId(project.getProfileId());

		indexer1.setTargetNodeProperty(targetNodeProperty);
		indexer2.setTargetNodeProperty(targetNodeProperty);

		// Work in Defined
		workInRelationshipProperties.setDepartment(project.getDepartment());
		workInRelationshipProperties.setFrom(project.getFrom());
		workInRelationshipProperties.setProjectName(project.getProjectTitle());
		workInRelationshipProperties.setRole(project.getRole());
		workInRelationshipProperties.setTo(project.getTo());

		indexer1.setWorkInRelationshipProperties(workInRelationshipProperties);

		// Skill Defined
		skillRelationshipProperties.setExperience("0");

		indexer2.setSkillRelationshipProperties(skillRelationshipProperties);

		// Operations
		indexer1.setOperation(project.getMessage());
		indexer2.setOperation(project.getMessage());

		sendData.send("Index", indexer1);

	}
}
