package com.stackroute.matchmaker.indexermodel;

public class Indexer {

	// Change the variable names
	private String sourceNodeType;
	private SourceNodeProperty sourcenodeproperty;
	private String targetNodeType;
	private TargetNodeProperty targetnodeproperty;
	private String relationshipName;
	private String relationshipProperty;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSourceNodeType() {
		return sourceNodeType;
	}
	public void setSourceNodeType(String sourceNodeType) {
		this.sourceNodeType = sourceNodeType;
	}
	public SourceNodeProperty getSourcenodeproperty() {
		return sourcenodeproperty;
	}
	public void setSourcenodeproperty(SourceNodeProperty sourcenodeproperty) {
		this.sourcenodeproperty = sourcenodeproperty;
	}
	public String getTargetNodeType() {
		return targetNodeType;
	}
	public void setTargetNodeType(String targetNodeType) {
		this.targetNodeType = targetNodeType;
	}
	public TargetNodeProperty getTargetnodeproperty() {
		return targetnodeproperty;
	}
	public void setTargetnodeproperty(TargetNodeProperty targetnodeproperty) {
		this.targetnodeproperty = targetnodeproperty;
	}
	public String getRelationshipName() {
		return relationshipName;
	}
	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}
	public String getRelationshipProperty() {
		return relationshipProperty;
	}
	public void setRelationshipProperty(String relationshipProperty) {
		this.relationshipProperty = relationshipProperty;
	}
	public Indexer() {
		super();
	}
	public Indexer(String sourceNodeType, SourceNodeProperty sourcenodeproperty, String targetNodeType,
			TargetNodeProperty targetnodeproperty, String relationshipName, String relationshipProperty,
			String message) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourcenodeproperty = sourcenodeproperty;
		this.targetNodeType = targetNodeType;
		this.targetnodeproperty = targetnodeproperty;
		this.relationshipName = relationshipName;
		this.relationshipProperty = relationshipProperty;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Indexer [SourceNodeType=" + sourceNodeType + ", sourcenodeproperty=" + sourcenodeproperty
				+ ", TargetNodeType=" + targetNodeType + ", targetnodeproperty=" + targetnodeproperty
				+ ", RelationshipName=" + relationshipName + ", relationshipProperty=" + relationshipProperty
				+ ", Message=" + message + "]";
	}
}
