package com.stackroute.matchmaker.searchmicroservice.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * 
 * @author syam
 *
 */
// this is the pojo class based on which the nodes and their properties in the neo4j  are created upon
@NodeEntity
public class ProfileId {
	@Id
	private String profileId;

	public ProfileId() {
		super();
	}

	public ProfileId(String profileId) {
		super();
		this.profileId = profileId;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "ProfileId [profileId=" + profileId + "]";
	}

}
