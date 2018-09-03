package com.stackroute.matchmaker.indexermodel;

public class ExperienceIndex {
	/* Indexer input field Attributes */
	// private String sourceNodeType;
	// // private String sourceNodeProperty;
	// // private String targetNodeType;
	// private TargetNodeProperty targetNodeProperty;
	// private RelationshipProperties relationshipProperties;
	// private RelationshipName relationshipName;
	// private String message;

	private String profileId;
	private String organizationName;
	private String role;
	private String duration;
	private String message;

	public ExperienceIndex() {
		super();
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return "ExperienceIndex [profileId=" + profileId + ", organizationName=" + organizationName + ", role=" + role
				+ ", duration=" + duration + ", message=" + message + "]";
	}

}
