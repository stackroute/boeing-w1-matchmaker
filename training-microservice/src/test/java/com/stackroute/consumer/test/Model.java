package com.stackroute.consumer.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.meanbean.test.BeanTester;
import com.stackroute.kafka.consumer.model.Training;

public class Model {

	private static Training training;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		training = new Training();
		training.setProfileId("1");
		training.setAuthority("stackroute");
		training.setDuration("3 months");
		training.setTrainingId("SR_101");
		training.setTrainingName("Immersive Java Programming");
		training.setSkillsTested("Java,HTML");


	}

	@Test
	public void test() {
		new BeanTester().testBean(Training.class);
		
	}

}
