package com.stackroute.kafka.consumer.indexer;

public class RelationshipProperty {

	private String trainingWeight;

	public RelationshipProperty() {
	}

	/**
	 * @param trainingWeight
	 */
	public RelationshipProperty(String trainingWeight) {
		super();
		this.trainingWeight = trainingWeight;
	}

	/**
	 * @return the trainingWeight
	 */
	public String getTrainingWeight() {
		return trainingWeight;
	}

	/**
	 * @param trainingWeight
	 *            the trainingWeight to set
	 */
	public void setTrainingWeight(String trainingWeight) {
		this.trainingWeight = trainingWeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RelationshipProperty [trainingWeight=" + trainingWeight + "]";
	}

}
