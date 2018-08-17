package com.stackroute.projectmicroservice.relationshipmodel;

import org.springframework.beans.factory.annotation.Autowired;

public class SkillRelationshipProperties {

	private String weight;
	private String skills;

	@Autowired
	public SkillRelationshipProperties(String weight, String skills) {
		super();
		this.weight = weight;
		this.skills = skills;
	}

	public SkillRelationshipProperties() {
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "SkillRelationshipProperties [weight=" + weight + ", skills=" + skills + "]";
	}

}
