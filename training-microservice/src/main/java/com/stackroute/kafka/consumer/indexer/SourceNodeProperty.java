package com.stackroute.kafka.consumer.indexer;

public class SourceNodeProperty {

	
	private String skills;
	private String duration;

	/**
	 * @param trainingName
	 * @param authority
	 * @param skills
	 * @param duration
	 */
	public SourceNodeProperty(String skills, String duration) {
		super();
		
		this.skills = skills;
		this.duration = duration;
	}

	public SourceNodeProperty() {
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SourceNodeProperty [ skills=" + skills
				+ ", duration=" + duration + "]";
	}

}
