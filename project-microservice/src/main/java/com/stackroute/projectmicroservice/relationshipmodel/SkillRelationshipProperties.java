package com.stackroute.projectmicroservice.relationshipmodel;

public class SkillRelationshipProperties {

	private String weight;

	public SkillRelationshipProperties() {

	}

	public SkillRelationshipProperties(String experience) {
		super();
		this.weight = experience;
	}

	public String getExperience() {
		return weight;
	}

	public void setExperience(String experience) {
		this.weight = experience;
	}

	@Override
	public String toString() {
		return "SkillRelationshipProperties [experience=" + weight + "]";
	}

}
