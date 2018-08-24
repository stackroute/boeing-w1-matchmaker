package com.stackroute.matchmaker.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Certificates;

public class Model {

	private static Certificates certificates;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		certificates = new Certificates();
		certificates.setProfileId("1");
		certificates.setAuthority("stackroute");
		certificates.setDuration("3 months");
		certificates.setTrainingId("SR_101");
		certificates.setTrainingName("Immersive Java Programming");
		certificates.setSkillsTested("Java,HTML");
		certificates.setMessage("create");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Certificates.class);

	}

}
