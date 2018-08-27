package com.stackroute.matchmaker.indexermodel;
/**
 * 
 * @author syam
 *
 */
//this is the model class , that is listned from kafka consumer
public class TrainingIndex {
	private String profileId;
	private String trainingId;
	private String trainingName;
	private String authority;
	private String duration;
	private String skills;
	private String message;
	private String weight;

	public TrainingIndex() {
		super();
	}

	public TrainingIndex(String profileId, String trainingId, String trainingName, String authority, String duration,
			String skills, String message, String weight) {
		super();
		this.profileId = profileId;
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.authority = authority;
		this.duration = duration;
		this.skills = skills;
		this.message = message;
		this.weight = weight;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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
		TrainingIndex other = (TrainingIndex) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrainingIndex [profileId=" + profileId + ", trainingId=" + trainingId + ", trainingName=" + trainingName
				+ ", authority=" + authority + ", duration=" + duration + ", skills=" + skills + ", message=" + message
				+ ", weight=" + weight + "]";
	}

}
