package com.stackroute.experiencemicroservice.appli.model;

public class Experience {
	/*
	 * Attributes needed for fetching data from Upstream service
	 */
	private String profileId;
	private String organizationName;
	private String role;
	private String startDate;
	private String endDate;
	private String message;

	// Default Constructor
	public Experience() {

	}

	// Parameterized Constructor
	public Experience(String profileId, String organizationName, String role, String startDate, String endDate,
			String message) {
		super();
		this.profileId = profileId;
		this.organizationName = organizationName;
		this.role = role;
		this.startDate = startDate;
		this.endDate = endDate;
		this.message = message;
	}
	// Getters and setters

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// ToString
	@Override
	public String toString() {
		return "Experience [profileId=" + profileId + ", organizationName=" + organizationName + ", role=" + role
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", message=" + message + "]";
	}

}
