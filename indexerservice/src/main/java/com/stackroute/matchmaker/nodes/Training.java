package com.stackroute.matchmaker.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Training {
	@Id
	private String trainingId;
	private String trainingName;
	private String authority;

	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", trainingName=" + trainingName + ", authority=" + authority
				+ "]";
	}

	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Training(String trainingId, String trainingName, String authority) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.authority = authority;
	}

	public Training() {
		super();
	}

}
