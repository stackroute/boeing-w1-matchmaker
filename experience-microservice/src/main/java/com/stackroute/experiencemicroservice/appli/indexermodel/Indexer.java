//package com.stackroute.experiencemicroservice.appli.indexermodel;
//
//import java.util.List;
//
//public class Indexer {
//	/* Indexer input field Attributes */
//	private String sourceNodeType;
//	private String methodType;
//	private String targetNodeType;
//	private String relationshipName;
//
//
//	public Indexer() {
//		super();
//	}
//
//	public Indexer(String sourceNodeType, String methodType, String targetNodeType,
//			List<RelationshipProperties> relationshipProperties, String relationshipName) {
//		super();
//		this.sourceNodeType = sourceNodeType;
//		this.methodType = methodType;
//		this.targetNodeType = targetNodeType;
//		this.relationshipProperties = relationshipProperties;
//		this.relationshipName = relationshipName;
//	}
//
//	public String getSourceNodeType() {
//		return sourceNodeType;
//	}
//
//	public void setSourceNodeType(String sourceNodeType) {
//		this.sourceNodeType = sourceNodeType;
//	}
//
//	public String getMethodType() {
//		return methodType;
//	}
//
//	public void setMethodType(String methodType) {
//		this.methodType = methodType;
//	}
//
//	public String getTargetNodeType() {
//		return targetNodeType;
//	}
//
//	public void setTargetNodeType(String targetNodeType) {
//		this.targetNodeType = targetNodeType;
//	}
//
//	public List<RelationshipProperties> getRelationshipProperties() {
//		return relationshipProperties;
//	}
//
//	public void setRelationshipProperties(List<RelationshipProperties> relationshipProperties) {
//		this.relationshipProperties = relationshipProperties;
//	}
//
//	public String getRelationshipName() {
//		return relationshipName;
//	}
//
//	public void setRelationshipName(String relationshipName) {
//		this.relationshipName = relationshipName;
//	}
//
//	private List<RelationshipProperties> relationshipProperties;
//	
//	@Override
//	public String toString() {
//		return "Indexer [sourceNodeType=" + sourceNodeType + ", methodType=" + methodType + ", targetNodeType="
//				+ targetNodeType + ", relationshipProperties=" + relationshipProperties + ", relationshipName="
//				+ relationshipName + "]";
//	}
//}
