package com.stackroute.qualificationmicroservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.qualificationmicroservice.model.Qualification;

@Service
public class KafkaConsumer {
	
	 private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	/* Annotating a method with @KafkaListener makes it listen to the topic , group mentioned .
	 Then it consumes messages and executes the consumeJson function*/
	 
	
     
    @KafkaListener(topics = "${app.topic.name}", group = "${spring.kafka.consumer.group-id}",
            containerFactory = "qualificationKafkaListenerFactory")
    public void consumeJson(Qualification qualification) {
    	  LOG.info("received message='{}'", qualification);
    	  
    }
}