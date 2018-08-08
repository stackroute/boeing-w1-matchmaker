package com.stackroute.matchmaker.model;

public class Certificates {
     
	private String profileId;
	private String trainingName;
	private String trainingId;
    private String authority;
    private String duration;
    private String skillsTested;
	
	public Certificates() {
	}
    

	public Certificates(String profileId, String trainingName, String trainingId, String authority, String duration,
			String skillsTested) {
		super();
		this.profileId = profileId;
		this.trainingName = trainingName;
		this.trainingId = trainingId;
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

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
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
		return "Certificates [profileId=" + profileId + ", trainingName=" + trainingName + ", trainingId=" + trainingId
				+ ", authority=" + authority + ", duration=" + duration + ", skillsTested=" + skillsTested + "]";
	}


   

	
}
