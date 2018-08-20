package com.stackroute.kafka.kafkaconsumer.indexerdata;

public class TargetNodeProperty {

	private String profileId;

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public TargetNodeProperty() {
		super();
	}

	public TargetNodeProperty(String profileId) {
		super();
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "TargetNodeProperty [profileId=" + profileId + "]";
	}
}
