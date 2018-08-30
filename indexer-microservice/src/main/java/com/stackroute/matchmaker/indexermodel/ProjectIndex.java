package com.stackroute.matchmaker.indexermodel;

/**
 * 
 * @author syam
 *
 */
// this is the model class , that is listned from kafka consumer
public class ProjectIndex {
	private String profileId;
	private String projectId;
	private String projectAt;
	private String role;
	private String department;
	private String projectLocation;
	private String projectTitle;
	private String from;
	private String to;
	private String synopsis;
	private String url;
	private String demoURL;
	private String skills;
	private String weight;
	private String message;

	public ProjectIndex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectIndex(String profileId, String projectId, String projectAt, String role, String department,
			String projectLocation, String projectTitle, String from, String to, String synopsis, String url,
			String demoURL, String skills, String weight, String message) {
		super();
		this.profileId = profileId;
		this.projectId = projectId;
		this.projectAt = projectAt;
		this.role = role;
		this.department = department;
		this.projectLocation = projectLocation;
		this.projectTitle = projectTitle;
		this.from = from;
		this.to = to;
		this.synopsis = synopsis;
		this.url = url;
		this.demoURL = demoURL;
		this.skills = skills;
		this.weight = weight;
		this.message = message;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectAt() {
		return projectAt;
	}

	public void setProjectAt(String projectAt) {
		this.projectAt = projectAt;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDemoURL() {
		return demoURL;
	}

	public void setDemoURL(String demoURL) {
		this.demoURL = demoURL;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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
		result = prime * result + ((demoURL == null) ? 0 : demoURL.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((profileId == null) ? 0 : profileId.hashCode());
		result = prime * result + ((projectAt == null) ? 0 : projectAt.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((projectLocation == null) ? 0 : projectLocation.hashCode());
		result = prime * result + ((projectTitle == null) ? 0 : projectTitle.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((synopsis == null) ? 0 : synopsis.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		ProjectIndex other = (ProjectIndex) obj;
		if (demoURL == null) {
			if (other.demoURL != null)
				return false;
		} else if (!demoURL.equals(other.demoURL))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (profileId == null) {
			if (other.profileId != null)
				return false;
		} else if (!profileId.equals(other.profileId))
			return false;
		if (projectAt == null) {
			if (other.projectAt != null)
				return false;
		} else if (!projectAt.equals(other.projectAt))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (projectLocation == null) {
			if (other.projectLocation != null)
				return false;
		} else if (!projectLocation.equals(other.projectLocation))
			return false;
		if (projectTitle == null) {
			if (other.projectTitle != null)
				return false;
		} else if (!projectTitle.equals(other.projectTitle))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (synopsis == null) {
			if (other.synopsis != null)
				return false;
		} else if (!synopsis.equals(other.synopsis))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectIndex [profileId=" + profileId + ", projectId=" + projectId + ", projectAt=" + projectAt
				+ ", role=" + role + ", department=" + department + ", projectLocation=" + projectLocation
				+ ", projectTitle=" + projectTitle + ", from=" + from + ", to=" + to + ", synopsis=" + synopsis
				+ ", url=" + url + ", demoURL=" + demoURL + ", skills=" + skills + ", weight=" + weight + ", message="
				+ message + "]";
	}

}
