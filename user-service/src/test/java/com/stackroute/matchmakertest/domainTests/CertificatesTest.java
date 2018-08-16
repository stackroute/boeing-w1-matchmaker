package com.stackroute.matchmakertest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Certificates;

public class CertificatesTest {

	private Certificates certificates;

	@Before
	public void setup() throws Exception {
		
		certificates= new Certificates();
		certificates.setAuthority("Det Norsk Veritas");
		certificates.setDuration("6 months");
		certificates.setProfileId("1");
		certificates.setSkillsTested("Java, Angular, Team Management");
		certificates.setTrainingId("B12OG45");
		certificates.setTrainingName("Fullstack development Intermediate course");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Certificates.class);
	}

}
