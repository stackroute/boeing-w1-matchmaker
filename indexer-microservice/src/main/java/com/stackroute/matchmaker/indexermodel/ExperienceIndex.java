package com.stackroute.matchmaker.indexermodel;

/**
 * 
 * @author syam
 *
 */
// this is the model class , that is listned from kafka consumer
public class ExperienceIndex {
	private String profileId;
	private String organizationName;
	private String role;
	private String duration;
	private String message;

	public ExperienceIndex() {
		super();
	}

	public ExperienceIndex(String profileId, String organizationName, String role, String duration, String message) {
		super();
		this.profileId = profileId;
		this.organizationName = organizationName;
		this.role = role;
		this.duration = duration;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((organizationName == null) ? 0 : organizationName.hashCode());
		result = prime * result + ((profileId == null) ? 0 : profileId.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (organizationName == null) {
			if (other.organizationName != null)
				return false;
		} else if (!organizationName.equals(other.organizationName))
			return false;
		if (profileId == null) {
			if (other.profileId != null)
				return false;
		} else if (!profileId.equals(other.profileId))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExperienceIndex [profileId=" + profileId + ", organizationName=" + organizationName + ", role=" + role
				+ ", duration=" + duration + ", message=" + message + "]";
	}

}
