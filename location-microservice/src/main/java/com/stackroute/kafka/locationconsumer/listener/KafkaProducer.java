package com.stackroute.kafka.locationconsumer.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.stackroute.kafka.locationconsumer.indexermodel.Indexer;
import com.stackroute.kafka.locationconsumer.indexermodel.SourceNodeProperties;
import com.stackroute.kafka.locationconsumer.indexermodel.TargetNodeProperties;
import com.stackroute.kafka.locationconsumer.model.Location;

@Service
public class KafkaProducer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class);
    
    @Autowired
    private KafkaTemplate<String, Indexer> kafkaTemplate;
    private String topic = "outputToIndexer";
    
    public void post(Location location) {
      	SourceNodeProperties sourceNodeProperties = new SourceNodeProperties(location.getCity());
		TargetNodeProperties targetNodeProperties = new TargetNodeProperties(location.getProfileId());
		Indexer indexer = new Indexer("city", sourceNodeProperties, "profile", targetNodeProperties, location.getAddressType(), "create");
		kafkaTemplate.send(topic, indexer);
		LOG.info("Indexer message='{}'", indexer);	
    }
    
}
