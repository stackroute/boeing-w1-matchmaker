package com.stackroute.matchmaker.listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.indexermodel.Index;
import com.stackroute.matchmaker.model.Location;

@Service
public class KafkaProducer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class);
    
    @Autowired
    private KafkaTemplate<String, Index> kafkaTemplate;
    private String topic = "LocationOutput";
    
    public void post(Location location) {
    	
      	/*SourceNodeProperties sourceNodeProperties = new SourceNodeProperties(location.getCity());
		TargetNodeProperties targetNodeProperties = new TargetNodeProperties(location.getProfileId());
	    Indexer indexer = new Indexer("city", sourceNodeProperties, "profile", targetNodeProperties, location.getAddressType(), "create");
		kafkaTemplate.send(topic, indexer);
		LOG.info("Indexer message='{}'", indexer);*/
    	
    	Index index = new Index(location.getProfileId(), location.getCity(), location.getAddressType(), location.getMessage());
		kafkaTemplate.send(topic, index);
		LOG.info("Index message='{}'", index);
    }
     
}
