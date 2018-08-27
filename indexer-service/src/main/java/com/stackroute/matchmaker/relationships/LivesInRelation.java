package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.City;
import com.stackroute.matchmaker.nodes.ProfileId;
/**
 * 
 * @author syam
 *
 */
// this is the pojo class based on which the relationships and their properties in the neo4j  are created upon
@RelationshipEntity(type = "livesIn")
public class LivesInRelation {
	@Id
	private String locationProfileId;
	@StartNode
	private ProfileId profileId;
	@EndNode
	private City city;

	public LivesInRelation() {
		super();
	}

	public LivesInRelation(String locationProfileId, ProfileId profileId, City city) {
		super();
		this.locationProfileId = locationProfileId;
		this.profileId = profileId;
		this.city = city;
	}

	public String getLocationProfileId() {
		return locationProfileId;
	}

	public void setLocationProfileId(String locationProfileId) {
		this.locationProfileId = locationProfileId;
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
		return "LivesInRelation [locationProfileId=" + locationProfileId + ", profileId=" + profileId + ", city=" + city
				+ "]";
	}

}
