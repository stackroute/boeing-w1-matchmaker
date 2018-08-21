package com.stackroute.matchmaker.indexermodel;

public class TargetNodeProperty {
	private String profileId;

	public TargetNodeProperty() {
		super();
	}

	public TargetNodeProperty(String profileId) {
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
		return "TargetNodeProperty [profileId=" + profileId + "]";
	}

}
