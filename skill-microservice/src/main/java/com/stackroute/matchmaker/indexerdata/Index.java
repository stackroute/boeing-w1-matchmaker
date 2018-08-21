package com.stackroute.matchmaker.indexerdata;

public class Index {

	private String profileId;
	private String skill;
	private String weightage;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getWeightage() {
		return weightage;
	}
	public void setWeightage(String weightage) {
		this.weightage = weightage;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public Index() {
		super();
	}
	public Index(String profileId, String skill, String weightage, String message) {
		super();
		this.profileId = profileId;
		this.skill = skill;
		this.weightage = weightage;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Index [profileId=" + profileId + ", skill=" + skill + ", weightage=" + weightage + ", message="
				+ message + "]";
	}
		
}
