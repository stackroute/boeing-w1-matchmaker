package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.AcademicQualification;

public class AcademicQualificationTest {

private AcademicQualification academies;
	
	@Before
	public void setup() throws Exception {
		
		academies = new AcademicQualification();
		academies.setProfileId("1");
		academies.setInstituteName("Indian Institute of Technology");
		academies.setInstituteType("Engineering college");
		academies.setQualification("Engineer");
		academies.setStreams("Computer Science");
		academies.setYearOfJoining("28th July, 2012");
		academies.setYearOfCompletion("4th May,2016");
		academies.setMarks("8.9 GPA");
	}

	@Test
	public void test() {
		new BeanTester().testBean(AcademicQualification.class);
	}

}
