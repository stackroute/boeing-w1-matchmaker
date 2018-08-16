package com.stackroute.projectmicroservice.indexermodel;

import org.springframework.beans.factory.annotation.Autowired;

import com.stackroute.projectmicroservice.relationshipmodel.SkillRelationshipProperties;

public class SkillIndexer {
	private String sourceNodeType;
	private String sourceNodeProperty;
	private String targetNodeType;
	private TargetNodeProperty targetNodeProperty;
	private String relationshipName;
	private SkillRelationshipProperties skillRelationshipProperties;
	private String operation;

	public SkillIndexer() {

	}

	@Autowired
	public SkillIndexer(String sourceNodeType, String sourceNodeProperty, String targetNodeType,
			TargetNodeProperty targetNodeProperty, String relationshipName,
			SkillRelationshipProperties skillRelationshipProperties, String operation) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperty = sourceNodeProperty;
		this.targetNodeType = targetNodeType;
		this.targetNodeProperty = targetNodeProperty;
		this.relationshipName = relationshipName;
		this.skillRelationshipProperties = skillRelationshipProperties;
		this.operation = operation;
	}

	public String getSourceNodeType() {
		return sourceNodeType;
	}

	public void setSourceNodeType(String sourceNodeType) {
		this.sourceNodeType = sourceNodeType;
	}

	public String getSourceNodeProperty() {
		return sourceNodeProperty;
	}

	public void setSourceNodeProperty(String sourceNodeProperty) {
		this.sourceNodeProperty = sourceNodeProperty;
	}

	public String getTargetNodeType() {
		return targetNodeType;
	}

	public void setTargetNodeType(String targetNodeType) {
		this.targetNodeType = targetNodeType;
	}

	public TargetNodeProperty getTargetNodeProperty() {
		return targetNodeProperty;
	}

	public void setTargetNodeProperty(TargetNodeProperty targetNodeProperty) {
		this.targetNodeProperty = targetNodeProperty;
	}

	public String getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

	public SkillRelationshipProperties getSkillRelationshipProperties() {
		return skillRelationshipProperties;
	}

	public void setSkillRelationshipProperties(SkillRelationshipProperties skillRelationshipProperties) {
		this.skillRelationshipProperties = skillRelationshipProperties;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Indexer2 [sourceNodeType=" + sourceNodeType + ", sourceNodeProperty=" + sourceNodeProperty
				+ ", TargetNodeType=" + targetNodeType + ", targetNodeProperty=" + targetNodeProperty
				+ ", relationshipName=" + relationshipName + ", skillRelationshipProperties="
				+ skillRelationshipProperties + ", operation=" + operation + "]";
	}

}
