package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.City;
import com.stackroute.matchmaker.nodes.ProfileId;

@RelationshipEntity(type = "livesIn")
public class LivesInRelation {
	@Id
	@StartNode
	private ProfileId profileId;
	@EndNode
	private City city;

	public LivesInRelation() {
		super();
	}

	public LivesInRelation(ProfileId profileId, City city) {
		super();
		this.profileId = profileId;
		this.city = city;
	}

	public ProfileId getProfileId() {
		return profileId;
	}

	public void setProfileId(ProfileId profileId) {
		this.profileId = profileId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "LivesInRelation [profileId=" + profileId + ", city=" + city + "]";
	}

}
