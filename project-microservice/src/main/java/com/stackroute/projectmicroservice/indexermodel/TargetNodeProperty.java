package com.stackroute.projectmicroservice.indexermodel;

import org.springframework.beans.factory.annotation.Autowired;

public class TargetNodeProperty {

	private String id;

	public TargetNodeProperty() {
	};

	@Autowired
	public TargetNodeProperty(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TargetNodeProperty [id=" + id + "]";
	}

}
