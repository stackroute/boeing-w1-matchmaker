package com.stackroute.matchmaker.nlpservice.model;

import java.util.List;

public class Result {
	private String profileId;
	private List<String> skills;
	private String experience;
	private String city;

	public Result(String profileId, List<String> skills, String experience, String city) {
		super();
		this.profileId = profileId;
		this.skills = skills;
		this.experience = experience;
		this.city = city;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Result [profileId=" + profileId + ", skills=" + skills + ", experience=" + experience + ", city=" + city
				+ "]";
	}

}
