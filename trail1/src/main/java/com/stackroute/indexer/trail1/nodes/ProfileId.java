package com.stackroute.indexer.trail1.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class ProfileId {
	@Id
	private String profileId;
	@Relationship(type = "LIVES_IN", direction = Relationship.OUTGOING)
	private City city;

	public ProfileId() {
		super();
	}

	public ProfileId(String profileId, City city) {
		super();
		this.profileId = profileId;
		this.city = city;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
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
		return "ProfileId [profileId=" + profileId + ", city=" + city + "]";
	}

}
