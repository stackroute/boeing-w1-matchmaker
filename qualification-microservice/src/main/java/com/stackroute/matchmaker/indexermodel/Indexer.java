package com.stackroute.matchmaker.indexermodel;

public class Indexer {
	 
	
	private String sourceNodeType;
	private String sourceNodeProperty;
	private String targetNodeType;
	private TargetNodeProperty targetNodeProperty;
	private Relationship relationship;
	private String weightage;
	private String operation;
	
	
	public Indexer () {
		
	}
	
	
	public Indexer(String sourceNodeType, String sourceNodeProperty, String targetNodeType,
			TargetNodeProperty targetNodeProperty, Relationship relationship, String weightage, String operation) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperty = sourceNodeProperty;
		this.targetNodeType = targetNodeType;
		this.targetNodeProperty = targetNodeProperty;
		this.relationship = relationship;
		this.weightage = weightage;
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
	public Relationship getRelationship() {
		return relationship;
	}
	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	

	public String getWeightage() {
		return weightage;
	}


	public void setWeightage(String weightage) {
		this.weightage = weightage;
	}


	@Override
	public String toString() {
		return "Indexer [sourceNodeType=" + sourceNodeType + ", sourceNodeProperty=" + sourceNodeProperty
				+ ", targetNodeType=" + targetNodeType + ", targetNodeProperty=" + targetNodeProperty
				+ ", relationship=" + relationship + ", weightage=" + weightage + ", operation=" + operation + "]";
	}

	
	
	
	


}