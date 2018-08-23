package com.stackroute.downstreamservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@SuppressWarnings("unused")
@Document
@Data
@JsonIgnoreProperties
public class Skills {
	private String profileId;
	private String skill;
	private String level;
	private String noOfMonths;
	private String furtherUsage;
	private String message;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
