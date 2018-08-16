package com.stackroute.projectmicroservice.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.indexermodel.Indexer;
import com.stackroute.projectmicroservice.indexermodel.SkillIndexer;
import com.stackroute.projectmicroservice.indexermodel.TargetNodeProperty;
import com.stackroute.projectmicroservice.indexermodel.WorkIndexer;
import com.stackroute.projectmicroservice.model.Project;
import com.stackroute.projectmicroservice.relationshipmodel.SkillRelationshipProperties;
import com.stackroute.projectmicroservice.relationshipmodel.WorkInRelationshipProperties;

@Service
public class Receiver {
	@Autowired
	private Producer producer;

	public Indexer indexer;
	public TargetNodeProperty targetNodeProperty;
	public SkillRelationshipProperties skillRelationshipProperties;
	public WorkInRelationshipProperties workInRelationshipProperties;
	public SkillIndexer skillIndexer;
	public WorkIndexer workIndexer;

	public void receiveObject(Project project) {

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

		producer.send(indexer);

	}

}
