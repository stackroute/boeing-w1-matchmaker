package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.City;
import com.stackroute.matchmaker.nodes.ProfileId;

@RelationshipEntity(type = "livedIn")
public class LivedInRelation {
	@Id
	@StartNode
	private ProfileId profileId;
	@EndNode
	private City city;

	public LivedInRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivedInRelation(ProfileId profileId, City city) {
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
		return "LivedInRelation [profileId=" + profileId + ", city=" + city + "]";
	}

}
