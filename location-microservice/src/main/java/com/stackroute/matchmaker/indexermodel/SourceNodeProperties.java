package com.stackroute.matchmaker.indexermodel;

public class SourceNodeProperties {

	// model class attributes
	private String city;

	public SourceNodeProperties() {
		super();
	}

	public SourceNodeProperties(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "{ city : " + city + " }";
	}
}
