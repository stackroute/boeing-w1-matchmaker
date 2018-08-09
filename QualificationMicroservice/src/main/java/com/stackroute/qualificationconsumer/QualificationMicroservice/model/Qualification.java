package com.stackroute.qualificationconsumer.QualificationMicroservice.model;

import java.util.Date;

public class Qualification {
	
	String profileId;
	String qualification;
	String instituteName;
	String yearOfJoining;
	String yearOfCompletion;
	String stream;
	String marks;	
	String message;
	
   @Override
	public String toString() {
		return "Qualification [profileId=" + profileId + ", qualification=" + qualification + ", instituteName="
				+ instituteName + ", yearOfJoining=" + yearOfJoining + ", yearOfCompletion=" + yearOfCompletion
				+ ", stream=" + stream + ", marks=" + marks + ", message=" + message + "]";
	}
	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getYearOfCompletion() {
		return yearOfCompletion;
	}
	public void setYearOfCompletion(String yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
