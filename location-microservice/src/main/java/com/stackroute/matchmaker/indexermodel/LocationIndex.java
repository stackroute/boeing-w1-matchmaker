package com.stackroute.matchmaker.indexermodel;

public class LocationIndex {
   
   private String profileId;
   private String city;
   private String addressType; 
   private String message;
   
	public LocationIndex() {
		super();
	}

	public LocationIndex(String profileId, String city, String addressType, String message) {
		super();
		this.profileId = profileId;
		this.city = city;
		this.addressType = addressType;
		this.message = message;
	}

	@Override
	public String toString() {
		return "LocationIndex [profileId=" + profileId + ", city=" + city + ", addressType=" + addressType + ", message="
				+ message + "]";
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
   
	
   
}
