package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Skills;

public class SkillsTest {

	private Skills skills;

	@Before
	public void setup() throws Exception {
		
		 skills= new Skills();
		skills.setProfileId("1");
		skills.setSkill("Angular");
		skills.setLevel("Intermediate");
		skills.setNoOfMonths("6 months");
		skills.setFurtherUsage("With fundamental knowledge of Angular, learning other front end software will be easier when the need arises");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Skills.class);
	}

}
