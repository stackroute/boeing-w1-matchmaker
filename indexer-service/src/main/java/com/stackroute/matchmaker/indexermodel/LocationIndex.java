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

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
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
		LocationIndex other = (LocationIndex) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LocationIndex [profileId=" + profileId + ", city=" + city + ", addressType=" + addressType
				+ ", message=" + message + "]";
	}

}
