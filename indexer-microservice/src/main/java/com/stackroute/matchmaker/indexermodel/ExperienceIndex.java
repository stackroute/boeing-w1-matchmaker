package com.stackroute.matchmaker.indexermodel;
/**
 * 
 * @author syam
 *
 */
//this is the model class , that is listned from kafka consumer
public class ExperienceIndex {
	private String profileId;
	private String organizationName;
	private String role;
	private String startDate;
	private String endDate;
	private String message;

	public ExperienceIndex() {
		super();
	}

	public ExperienceIndex(String profileId, String organizationName, String role, String startDate, String endDate,
			String message) {
		super();
		this.profileId = profileId;
		this.organizationName = organizationName;
		this.role = role;
		this.startDate = startDate;
		this.endDate = endDate;
		this.message = message;
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
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExperienceIndex other = (ExperienceIndex) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExperienceListner [profileId=" + profileId + ", organizationName=" + organizationName + ", role="
				+ role + ", startDate=" + startDate + ", endDate=" + endDate  + ", message="
				+ message + "]";
	}

}
