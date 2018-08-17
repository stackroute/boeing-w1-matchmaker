package com.stackroute.kafka.locationconsumer.indexermodel;

public class Indexer {

	/* fields to be sent to kafka that are used by indexer */
	private String sourceNodeType;
	private SourceNodeProperties sourceNodeProperties;
	private String targetNodeType;
	private TargetNodeProperties targetNodeProperties;
	private String relationshipName;
    private String message;
    
	public Indexer() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Indexer(String sourceNodeType, SourceNodeProperties sourceNodeProperties, String targetNodeType,
			TargetNodeProperties targetNodeProperties, String relationshipName, String message) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperties = sourceNodeProperties;
		this.targetNodeType = targetNodeType;
		this.targetNodeProperties = targetNodeProperties;
		this.relationshipName = relationshipName;
		this.message = message;
	}



	public String getSourceNodeType() {
		return sourceNodeType;
	}

	public void setSourceNodeType(String sourceNodeType) {
		this.sourceNodeType = sourceNodeType;
	}

	public SourceNodeProperties getSourceNodeProperties() {
		return sourceNodeProperties;
	}

	public void setSourceNodeProperties(SourceNodeProperties sourceNodeProperties) {
		this.sourceNodeProperties = sourceNodeProperties;
	}

	public String getTargetNodeType() {
		return targetNodeType;
	}

	public void setTargetNodeType(String targetNodeType) {
		this.targetNodeType = targetNodeType;
	}

	public TargetNodeProperties getTargetNodeProperties() {
		return targetNodeProperties;
	}

	public void setTargetNodeProperties(TargetNodeProperties targetNodeProperties) {
		this.targetNodeProperties = targetNodeProperties;
	}

	public String getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

	@Override
	public String toString() {
		return "{ sourceNodeType : " + sourceNodeType + ", sourceNodeProperties : " + sourceNodeProperties
				+ ", targetNodeType : " + targetNodeType + ", targetNodeProperties : " + targetNodeProperties
				+ ", relationshipName : " + relationshipName + " }";

	}

}
