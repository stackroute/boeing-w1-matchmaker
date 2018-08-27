package com.stackroute.downstreamservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties
@Document
public class User {
	@Id
	private String username;
	private List<AcademicQualification> academics;
	private List<Experience> experience;
	private List<Location> location;
	private PersonalInfo personalInfo;
	private List<Projects> project;
	private List<Skills> skills;
	private List<Certificates> certificates;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<AcademicQualification> getAcademics() {
		return academics;
	}

	public void setAcademics(List<AcademicQualification> academics) {
		this.academics = academics;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public List<Projects> getProject() {
		return project;
	}

	public void setProject(List<Projects> project) {
		this.project = project;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public List<Certificates> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificates> certificates) {
		this.certificates = certificates;
	}

}
