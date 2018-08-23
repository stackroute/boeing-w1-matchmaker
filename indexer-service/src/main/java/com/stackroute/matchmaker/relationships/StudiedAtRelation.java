package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.ProfileId;
import com.stackroute.matchmaker.nodes.University;

@RelationshipEntity(type = "studiedAt")
public class StudiedAtRelation {
	@Id
	private String qualification;
	private String yearOfJoining;
	private String yearOfCompletion;
	private String stream;
	private String marks;
	@StartNode
	private ProfileId profileId;
	@EndNode
	private University university;

	public StudiedAtRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudiedAtRelation(String qualification, String yearOfJoining, String yearOfCompletion, String stream,
			String marks, ProfileId profileId, University university) {
		super();
		this.qualification = qualification;
		this.yearOfJoining = yearOfJoining;
		this.yearOfCompletion = yearOfCompletion;
		this.stream = stream;
		this.marks = marks;
		this.profileId = profileId;
		this.university = university;
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

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public ProfileId getProfileId() {
		return profileId;
	}

	public void setProfileId(ProfileId profileId) {
		this.profileId = profileId;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "StudiedAtRelation [qualification=" + qualification + ", yearOfJoining=" + yearOfJoining
				+ ", yearOfCompletion=" + yearOfCompletion + ", stream=" + stream + ", marks=" + marks + ", profileId="
				+ profileId + ", university=" + university + "]";
	}

}
