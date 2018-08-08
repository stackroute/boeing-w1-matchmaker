package com.stackroute.matchmaker.model;

public class Skills {
	private String profileId;
	private String skill;
	private String level;
	private String noOfMonths;
	private String furtherUsage;

	public Skills() {
	}

	public Skills(String profileId, String skill, String level, String noOfMonths, String furtherUsage) {
		super();
		this.profileId = profileId;
		this.skill = skill;
		this.level = level;
		this.noOfMonths = noOfMonths;
		this.furtherUsage = furtherUsage;
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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(String noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public String getFurtherUsage() {
		return furtherUsage;
	}

	public void setFurtherUsage(String furtherUsage) {
		this.furtherUsage = furtherUsage;
	}

	@Override
	public String toString() {
		return "Skills [profileId=" + profileId + ", skill=" + skill + ", level=" + level + ", noOfMonths=" + noOfMonths
				+ ", furtherUsage=" + furtherUsage + "]";
	}

	

}
