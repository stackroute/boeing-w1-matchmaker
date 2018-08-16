package com.stackroute.matchmakertest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Experience;

public class ExperienceTest {

	private Experience experience;

	@Before
	public void setup() throws Exception {
		
		experience= new Experience();
		experience.setProfileId("1");
		experience.setOrganizationName("TATA Consultancy Services");
		experience.setRole("Technical Lead");
		experience.setStartDate("3rd March, 2007");
		experience.setEndDate("21st August, 2013");
		experience.setMessage("Hardworking Individual who does well in teams");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Experience.class);
	}

}
