package com.stackroute.matchmaker.indexerdata;

public class RelationshipProperty {

	private String weight;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public RelationshipProperty() {
		super();
	}

	public RelationshipProperty(String weight) {
		super();
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "RelationshipProperty [weight=" + weight + "]";
	}
}
