package com.stackroute.matchmaker.model;

public class AcademicQualification {

	private String profileId;
	private String qualification;
	private String instituteName;
	private String yearOfJoining;
	private String yearOfCompletion;
	private String instituteType;
	private String streams;
	private String marks;

	public AcademicQualification() {
	}

	public AcademicQualification(String profileId, String qualification, String instituteName, 
			String yearOfJoining, String yearOfCompletion, String instituteType, String streams,
			String marks) {
		super();
		this.profileId = profileId;
		this.qualification = qualification;
		this.instituteName = instituteName;
		this.yearOfJoining = yearOfJoining;
		this.yearOfCompletion = yearOfCompletion;
		this.instituteType = instituteType;
		this.streams = streams;
		this.marks = marks;
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

	public String getInstituteType() {
		return instituteType;
	}

	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
	}

	public String getStreams() {
		return streams;
	}

	public void setStreams(String streams) {
		this.streams = streams;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "AcademicQualification [profileId=" + profileId + ", qualification=" + qualification + ", instituteName="
				+ instituteName + ", yearOfJoining=" + yearOfJoining + ", yearOfCompletion=" + yearOfCompletion
				+ ", instituteType=" + instituteType + ", streams=" + streams + ", marks=" + marks + "]";
	}

}
