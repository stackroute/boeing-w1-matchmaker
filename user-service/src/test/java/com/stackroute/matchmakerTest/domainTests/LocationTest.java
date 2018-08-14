package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Location;

public class LocationTest {
	
	private Location location;

	@Before
	public void setup() throws Exception {
		
		location= new Location();
		location.setProfileId("1");
		location.setAddress("231,3rd cross,Avanti Marg,5th block Chamannagar");
		location.setCity("Mumbai");
		location.setState("Maharastra");
		location.setCountry("India");
		location.setPin("543289");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Location.class);
	}

}
