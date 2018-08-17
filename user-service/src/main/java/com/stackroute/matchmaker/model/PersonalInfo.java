package com.stackroute.matchmaker.model;

public class PersonalInfo {

	private String profileId;
	private String picture;
	private String name;
	private String dob;
	private String age;
	private String gender;
	private String mobile;
	private String email;
	private String facebook;
	private String linkedin;
	private String github;
	private String bloodGroup;

	
	// private String certificates;

	public PersonalInfo() {

	}


	public PersonalInfo(String profileId, String picture, String name, String dob, String age, 
			String gender, String mobile, String email, String facebook, String linkedin, 
			String github, String bloodGroup) {
		super();
		this.profileId = profileId;
		this.picture = picture;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.facebook = facebook;
		this.linkedin = linkedin;
		this.github = github;
		this.bloodGroup = bloodGroup;
	}


	public String getProfileId() {
		return profileId;
	}


	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFacebook() {
		return facebook;
	}


	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}


	public String getLinkedin() {
		return linkedin;
	}


	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}


	public String getGithub() {
		return github;
	}


	public void setGithub(String github) {
		this.github = github;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	@Override
	public String toString() {
		return "PersonalInfo [profileId=" + profileId + ", picture=" + picture + ", name=" + name + ", dob=" + dob
				+ ", age=" + age + ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + ", facebook="
				+ facebook + ", linkedin=" + linkedin + ", github=" + github + ", bloodGroup=" + bloodGroup + "]";
	}
  
	
	
}
