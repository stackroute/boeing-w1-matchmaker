package com.stackroute.matchmaker.listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import com.stackroute.matchmaker.indexermodel.LocationIndex;
import com.stackroute.matchmaker.model.Location;

@Service
public class KafkaProducer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class);
    
    @Autowired
    private KafkaTemplate<String, LocationIndex> kafkaTemplate;
    
    @Value("${producer.location.topic}")
    private String topic;
    
    public void post(Location location) {
    	
      	/*SourceNodeProperties sourceNodeProperties = new SourceNodeProperties(location.getCity());
		TargetNodeProperties targetNodeProperties = new TargetNodeProperties(location.getProfileId());
	    Indexer indexer = new Indexer("city", sourceNodeProperties, "profile", targetNodeProperties, location.getAddressType(), "create");
		kafkaTemplate.send(topic, indexer);
		LOG.info("Indexer message='{}'", indexer);*/
    	
    	LocationIndex locationIndex = new LocationIndex(location.getProfileId(), location.getCity(), location.getAddressType(), location.getMessage());
		kafkaTemplate.send(topic, locationIndex);
		LOG.info("LocationIndex message='{}'", locationIndex);
    }
     
}
