package com.stackroute.matchmaker.model;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Skills;

public class SkillsTests {

	private Skills skill;
	@Before
	public void setUp() throws Exception {

		skill = new Skills();
		skill.setSkill("Angular");
		skill.setProfileId("1");
		skill.setFurtherUsage("Developement");
		skill.setLevel("2");
		skill.setNoOfMonths("20");

	}

	@Test
	public void test() {
		new BeanTester().testBean(Skills.class);
	}


}
