package com.stackroute.kafka.kafkaconsumer.model;

import org.junit.Before;
import com.stackroute.kafka.kafkaconsumer.model.Skill;
import org.junit.Test;
import org.meanbean.test.BeanTester;

public class SkillsTests {

	private Skill skill;
	@Before
	public void setUp() throws Exception {

		skill = new Skill();
		skill.setSkill("Angular");
		skill.setProfileId("1");
		skill.setFurtherUsage("Developement");
		skill.setLevel("2");
		skill.setNoOfMonths("20");

	}

	@Test
	public void test() {
		new BeanTester().testBean(Skill.class);
	}


}
