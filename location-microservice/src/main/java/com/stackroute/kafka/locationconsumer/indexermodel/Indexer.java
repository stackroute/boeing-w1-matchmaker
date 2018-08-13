package com.stackroute.kafka.locationconsumer.indexermodel;

import java.util.List;

public class Indexer {
	
	/*fields to be sent to kafka that are used by indexer*/
	private String sourceNodeType ;
	private String methodType;
	private String targetNodeType;
	private List<NodeProperties> nodeProperties;
	private String relationshipName;
	
}
