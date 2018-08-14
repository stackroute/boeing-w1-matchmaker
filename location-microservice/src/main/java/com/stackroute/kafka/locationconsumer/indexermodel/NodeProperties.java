package com.stackroute.kafka.locationconsumer.indexermodel;

public class NodeProperties {
	
	//model class attributes
	private String address;
    private String city;
    private String pin;
    private String state;
    private String country;
    
	public NodeProperties() {
		super();
	}

	public NodeProperties(String address, String city, String pin, String state, String country) {
		super();
		this.address = address;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
}
