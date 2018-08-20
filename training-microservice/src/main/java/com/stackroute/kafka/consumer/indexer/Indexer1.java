package com.stackroute.kafka.consumer.indexer;

public class Indexer1 {
	
	private String profileId;
    private String trainingId;
    private String trainingName;
    private String authority;
    private String duration;
    private String skills;
	private String message;
	private String weight;
	/**
	 * @param profileId
	 * @param trainingId
	 * @param trainingName
	 * @param authority
	 * @param duration
	 * @param skillsTested
	 * @param message
	 * @param weight
	 */
	public Indexer1(String profileId, String trainingId, String trainingName, String authority, String duration,
			String skillsTested, String message, String weight) {
		super();
		this.profileId = profileId;
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.authority = authority;
		this.duration = duration;
		this.skills = skillsTested;
		this.message = message;
		this.weight = weight;
	}
	
	public Indexer1() {}

	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	/**
	 * @return the trainingId
	 */
	public String getTrainingId() {
		return trainingId;
	}

	/**
	 * @param trainingId the trainingId to set
	 */
	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}

	/**
	 * @return the trainingName
	 */
	public String getTrainingName() {
		return trainingName;
	}

	/**
	 * @param trainingName the trainingName to set
	 */
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return the skillsTested
	 */
	public String getSkillsTested() {
		return skills;
	}

	/**
	 * @param skillsTested the skillsTested to set
	 */
	public void setSkillsTested(String skillsTested) {
		this.skills = skillsTested;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Indexer1 [profileId=" + profileId + ", trainingId=" + trainingId + ", trainingName=" + trainingName
				+ ", authority=" + authority + ", duration=" + duration + ", skillsTested=" + skills
				+ ", message=" + message + ", weight=" + weight + "]";
	}
	
	

}
