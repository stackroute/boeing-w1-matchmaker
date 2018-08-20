package com.stackroute.experiencemicroservice.appli.indexermodel;

public class Indexer {
	/* Indexer input field Attributes */
	private String sourceNodeType;
	private String sourceNodeProperty;
	private String targetNodeType;
	private TargetNodeProperty targetNodeProperty;
	private RelationshipProperties relationshipProperties;
	private RelationshipName relationshipName;
	private String message;

	public Indexer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Indexer(String sourceNodeType, String sourceNodeProperty, String targetNodeType,
			TargetNodeProperty targetNodeProperty, RelationshipProperties relationshipProperties,
			RelationshipName relationshipName, String message) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperty = sourceNodeProperty;
		this.targetNodeType = targetNodeType;
		this.targetNodeProperty = targetNodeProperty;
		this.relationshipProperties = relationshipProperties;
		this.relationshipName = relationshipName;
		this.message = message;
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

	public RelationshipProperties getRelationshipProperties() {
		return relationshipProperties;
	}

	public void setRelationshipProperties(RelationshipProperties relationshipProperties) {
		this.relationshipProperties = relationshipProperties;
	}

	public RelationshipName getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(RelationshipName relationshipName) {
		this.relationshipName = relationshipName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;

	}

	@Override
	public String toString() {
		return "Indexer [sourceNodeType=" + sourceNodeType + ", sourceNodeProperty=" + sourceNodeProperty
				+ ", targetNodeType=" + targetNodeType + ", targetNodeProperty=" + targetNodeProperty
				+ ", relationshipProperties=" + relationshipProperties + ", relationshipName=" + relationshipName
				+ ", message=" + message + "]";
	}

}
