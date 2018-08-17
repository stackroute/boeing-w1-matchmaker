package com.stackroute.indexer.trail1.nodes;

public class LocationListner {
	private String profileId;
	private String cityName;

	public LocationListner() {
		super();
	}

	public LocationListner(String profileId, String cityName) {
		super();
		this.profileId = profileId;
		this.cityName = cityName;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "LocationListner [profileId=" + profileId + ", cityName=" + cityName + "]";
	}

}
