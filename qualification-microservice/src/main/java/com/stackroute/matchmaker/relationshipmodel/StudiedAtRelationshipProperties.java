package com.stackroute.matchmaker.relationshipmodel;

public class StudiedAtRelationshipProperties {

	private String qualification;
	private String yearOfJoining;
	private String yearOfCompletion;
	private String stream;
	
	
	public StudiedAtRelationshipProperties() {
		
		// TODO Auto-generated constructor stub
	}
	public StudiedAtRelationshipProperties(String qualification, String yearOfJoining, String yearOfCompletion, String stream) {
		super();
		this.qualification = qualification;
		this.yearOfJoining = yearOfJoining;
		this.yearOfCompletion = yearOfCompletion;
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "StudiedAtProperties [qualification=" + qualification + ", yearOfJoining=" + yearOfJoining
				+ ", yearOfCompletion=" + yearOfCompletion + ", stream=" + stream + "]";
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
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
	
	
}
