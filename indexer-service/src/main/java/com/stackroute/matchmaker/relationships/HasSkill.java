package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.ProfileId;
import com.stackroute.matchmaker.nodes.Skill;

@RelationshipEntity(type = "hasSkill")
public class HasSkill {
	@Id
	private String weight;
	@StartNode
	private ProfileId profileId;
	@EndNode
	private Skill skill;

	public HasSkill() {
		super();
	}

	public HasSkill(String weight, ProfileId profileId, Skill skill) {
		super();
		this.weight = weight;
		this.profileId = profileId;
		this.skill = skill;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public ProfileId getProfileId() {
		return profileId;
	}

	public void setProfileId(ProfileId profileId) {
		this.profileId = profileId;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}
