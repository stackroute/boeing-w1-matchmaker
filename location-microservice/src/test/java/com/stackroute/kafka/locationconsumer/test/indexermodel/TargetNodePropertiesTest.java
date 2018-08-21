package com.stackroute.kafka.locationconsumer.test.indexermodel;

import org.junit.Test;
import org.junit.Before;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.indexermodel.TargetNodeProperties;

public class TargetNodePropertiesTest {

	private TargetNodeProperties targetNodeProperties;

	@Before
	public void setUp() throws Exception {
		targetNodeProperties = new TargetNodeProperties();
	    targetNodeProperties.setId("abc123");
	}

	@Test
	public void Beantest() {
		new BeanTester().testBean(TargetNodeProperties.class);
	}

}