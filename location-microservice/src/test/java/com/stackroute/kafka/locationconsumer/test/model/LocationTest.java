package com.stackroute.kafka.locationconsumer.test.model;

import org.junit.Test;
import org.junit.Before;
import org.meanbean.test.BeanTester;

import com.stackroute.kafka.locationconsumer.indexermodel.TargetNodeProperties;
import com.stackroute.kafka.locationconsumer.model.Location;

public class LocationTest {

	private Location location;

	@Before
	public void setUp() throws Exception {
		location = new Location();
		location.setAddress("");
		location.setCity("");
		location.setPin("");
		location.setState("");
		location.setCountry("");
		location.setAddressType("");
	}

	@Test
	public void Beantest() {
		new BeanTester().testBean(TargetNodeProperties.class);
	}

}