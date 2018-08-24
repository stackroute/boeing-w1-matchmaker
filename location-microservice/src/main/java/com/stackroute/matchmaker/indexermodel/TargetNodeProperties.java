package com.stackroute.matchmaker.indexermodel;

public class TargetNodeProperties {

	private String id;

	public TargetNodeProperties(String id) {
		super();
		this.id = id;
	}

	public TargetNodeProperties() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "{ id : " + id + " }";
	}

}
