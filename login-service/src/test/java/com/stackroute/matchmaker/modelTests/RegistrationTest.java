package com.stackroute.matchmaker.modelTests;


import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Registration;

public class RegistrationTest {
	
	private Registration registration;
	
	@Before
	public void setup() throws Exception {
		registration = new Registration();
		registration.setEmail("max.payne_234@gmail.com");
		registration.setPassword("password123");
		registration.setUsername("Max234");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Registration.class);
	}

}
