package com.stackroute.kafka.locationconsumer.test.indexermodel;

import org.junit.Test;
import org.junit.Before;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.indexermodel.SourceNodeProperties;

public class SourceNodePropertiesTest {

	private SourceNodeProperties sourceNodeProperties;

	@Before
	public void setUp() throws Exception {
		sourceNodeProperties = new SourceNodeProperties();
	    sourceNodeProperties.setCity("Bengaluru");
	}

	@Test
	public void Beantest() {
		new BeanTester().testBean(SourceNodeProperties.class);
	}

}
