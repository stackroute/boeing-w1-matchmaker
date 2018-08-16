package com.stackroute.matchmakertest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.PersonalInfo;

public class PersonalInfoTest {

private PersonalInfo personalInfo;
	
	@Before
	public void setup() throws Exception {
		
		personalInfo = new PersonalInfo();
		personalInfo.setProfileId("1");
		personalInfo.setName("Max");
		personalInfo.setAge("20");
		personalInfo.setDob("12th June, 1998");
		personalInfo.setMobile("9868944431");
		personalInfo.setEmail("max.payne78@gmail.com");
		personalInfo.setGender("Male");
		personalInfo.setBloodGroup("B +ve");
		personalInfo.setFacebook("facebook.com/#86749/Maxpayne");
		personalInfo.setGithub("github.com/MaxPayne78");
		personalInfo.setLinkedin("linkedin.com/768ituy/MaxPayne");
		personalInfo.setPicture("Max_psprt.jpg");
		
	}

	@Test
	public void test() {
		new BeanTester().testBean(PersonalInfo.class);
	}

}
