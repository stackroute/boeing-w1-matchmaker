package com.stackroute.kafka.locationconsumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.kafka.locationconsumer.model.Location;


@RestController
@RequestMapping("kafka")
public class KafkaProducer {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class); 
	
	//using template defined in configuration class 
    @Autowired
    private KafkaTemplate<String, Location> kafkaTemplate;

    @Value("${producer.location.topic}")
    private String TOPIC;

    @GetMapping("/publish/{id}")
    public String post(@PathVariable("id") final String id) {

    	//publishing to kafka 
    	LOG.info("Sending JSON message (id='{}') to topic='{}'",id, TOPIC);
        kafkaTemplate.send(TOPIC, new Location(  id, 
        		                                "No.123, 7th block, Kormangala", 
        		                                "Bangalore", 
        		                                "560012", 
        		                                "Karnataka", 
        		                                "India" ));

        return "Published Json message successfully";
    }
}
