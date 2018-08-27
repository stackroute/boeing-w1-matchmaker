package com.stackroute.matchmaker.indexermodel;
/**
 * 
 * @author syam
 *
 */
//this is the model class , that is listned from kafka consumer
public class SkillIndex {
	private String profileId;
	private String skill;
	private String weightage;
	private String message;

	public SkillIndex() {
		super();
	}

	public SkillIndex(String profileId, String skill, String weightage, String message) {
		super();
		this.profileId = profileId;
		this.skill = skill;
		this.weightage = weightage;
		this.message = message;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getWeightage() {
		return weightage;
	}

	public void setWeightage(String weightage) {
		this.weightage = weightage;
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
		SkillIndex other = (SkillIndex) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SkillIndex [profileId=" + profileId + ", skill=" + skill + ", weightage=" + weightage + ", message="
				+ message + "]";
	}

}
