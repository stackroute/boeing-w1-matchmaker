package com.stackroute.projectmicroservice.indexermodel;

import com.stackroute.projectmicroservice.relationshipmodel.WorkInRelationshipProperties;

public class WorkIndexer {

	private String sourceNodeType;
	private String sourceNodeProperty;
	private String targetNodeType;
	private TargetNodeProperty targetNodeProperty;
	private String relationshipName;
	private WorkInRelationshipProperties workInRelationshipProperties;
	private String operation;
	
	public WorkIndexer() {
		
	}

	public WorkIndexer(String sourceNodeType, String sourceNodeProperty, String targetNodeType,
			TargetNodeProperty targetNodeProperty, String relationshipName,
			WorkInRelationshipProperties workInRelationshipProperties, String operation) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperty = sourceNodeProperty;
		this.targetNodeType = targetNodeType;
		this.targetNodeProperty = targetNodeProperty;
		this.relationshipName = relationshipName;
		this.workInRelationshipProperties = workInRelationshipProperties;
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

	public WorkInRelationshipProperties getWorkInRelationshipProperties() {
		return workInRelationshipProperties;
	}

	public void setWorkInRelationshipProperties(WorkInRelationshipProperties workInRelationshipProperties) {
		this.workInRelationshipProperties = workInRelationshipProperties;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Indexer1 [sourceNodeType=" + sourceNodeType + ", sourceNodeProperty=" + sourceNodeProperty
				+ ", TargetNodeType=" + targetNodeType + ", targetNodeProperty=" + targetNodeProperty
				+ ", relationshipName=" + relationshipName + ", workInRelationshipProperties="
				+ workInRelationshipProperties + ", operation=" + operation + "]";
	}
	
	
}
