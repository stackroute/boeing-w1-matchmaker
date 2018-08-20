package com.stackroute.experiencemicroservice.appli.indexermodel;

public class Indexer {
	/* Indexer input field Attributes */
	private String sourceNodeType;
	// private String sourceNodeProperty;
	// private String targetNodeType;
	private TargetNodeProperty targetNodeProperty;
	private RelationshipProperties relationshipProperties;
	private RelationshipName relationshipName;
	private String message;

	public Indexer(String sourceNodeType, TargetNodeProperty targetNodeProperty,
			RelationshipProperties relationshipProperties, RelationshipName relationshipName, String message) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.targetNodeProperty = targetNodeProperty;
		this.relationshipProperties = relationshipProperties;
		this.relationshipName = relationshipName;
		this.message = message;
	}

	public Indexer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSourceNodeType() {
		return sourceNodeType;
	}

	public void setSourceNodeType(String sourceNodeType) {
		this.sourceNodeType = sourceNodeType;
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
		return "Indexer [sourceNodeType=" + sourceNodeType + ", targetNodeProperty=" + targetNodeProperty
				+ ", relationshipProperties=" + relationshipProperties + ", relationshipName=" + relationshipName
				+ ", message=" + message + "]";
	}

}
