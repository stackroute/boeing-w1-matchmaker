package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Projects;

public class ProjectsTest {

	private Projects projects;

	@Before
	public void setup() throws Exception {
		
		 projects= new Projects();
		projects.setProfileId("1");
		projects.setProjectId("PRJ4093");
		projects.setProjectTitle("Efficiency Optimisation of Cash Disposal in ATMs");
		projects.setProjectLocation("Bellandur,Bengaluru");
		projects.setProjectAt("Myrtle Technologies");
		projects.setDepartment("Technical QA");
		projects.setFrom("3rd May,2017");
		projects.setTo("17th September, 2017");
		projects.setRole("Backend Developer in C#");
		projects.setTeamSize("3 BE devs + 2 FE devs + 1 Manager");
		projects.setSynopsis("Developed a system that ensures that any sort of time delay that may be occuring during money transactions at an ATM are reduced considerably by using deep learning and ML concepts");
		projects.setSkills("C#,Machine learning concepts");
		projects.setUrl("www.AtomicATM.com/OurDevOpsTeam/Max");
		projects.setDemoUrl("www.AtomicATM.com/test");
		projects.setMessage("A very good learning opportunity with a lot of challenges to tackle. Succeeded in cultivating more in depth knowledge of the topics involved");
		
	}

	@Test
	public void test() {
		new BeanTester().testBean(Projects.class);
	}
}
