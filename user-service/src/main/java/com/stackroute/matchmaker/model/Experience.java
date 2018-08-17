package com.stackroute.matchmaker.model;

public class Experience {
	private String profileId;
	private String organizationName;
	private String role;
	private String message;
	private String startDate;
	private String endDate;
	
	public Experience() {
	}

	public Experience(String profileId, String organizationName, String role, String message,
			String startDate, String endDate) {
		super();
		this.profileId = profileId;
		this.organizationName = organizationName;
		this.role = role;
		this.message = message;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Experience [profileId=" + profileId + ", organizationName=" + organizationName + ", role=" + role
				+ ", message=" + message + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	
	
}
