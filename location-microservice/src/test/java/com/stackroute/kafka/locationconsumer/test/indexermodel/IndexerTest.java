package com.stackroute.kafka.locationconsumer.test.indexermodel;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.indexermodel.Indexer;
import com.stackroute.matchmaker.indexermodel.SourceNodeProperties;
import com.stackroute.matchmaker.indexermodel.TargetNodeProperties;

public class IndexerTest {

	private Indexer indexer;

	@Before
	public void setUp() throws Exception {
		indexer = new Indexer();
		indexer.setMessage("");
		indexer.setRelationshipName("");
		indexer.setTargetNodeType("");
		indexer.setTargetNodeProperties(new TargetNodeProperties("abc123"));
		indexer.setSourceNodeType("");
		indexer.setSourceNodeProperties(new SourceNodeProperties("Bengaluru"));		
	}

	@Test
	public void Beantest() {
		new BeanTester().testBean(Indexer.class);
	}

}
