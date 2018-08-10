package com.stackroute.kafka.consumer.model;

public class User {
	
	private String profileId;
    private String trainingId;
    private String trainingName;
    private String authority;
    private String duration;
    private String skillsTested;
	
	public User() {
		
	}

	public User(String profileId, String trainingId, String trainingName, String authority, String duration,
			String skillsTested) {
		super();
		this.profileId = profileId;
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.authority = authority;
		this.duration = duration;
		this.skillsTested = skillsTested;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSkillsTested() {
		return skillsTested;
	}

	public void setSkillsTested(String skillsTested) {
		this.skillsTested = skillsTested;
	}

	@Override
	public String toString() {
		return "User [profileId=" + profileId + ", trainingId=" + trainingId + ", trainingName=" + trainingName
				+ ", authority=" + authority + ", duration=" + duration + ", skillsTested=" + skillsTested + "]";
	}

	
}