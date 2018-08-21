package com.stackroute.kafka.consumer.listener;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.kafka.consumer.model.Training;

@RestController
@RequestMapping("kafka")
public class Producer {
	
	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@Autowired
	private KafkaTemplate<String,Training> kafkaTemplate;
	
	@Value("${listener.topic.name}")
	private String TOPIC ;
	
	//private String topic = "sathwik";
	
	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {
		kafkaTemplate.send(TOPIC, new Training(name,name,name,name,name,name,name));
		//kafkaTemplate.send(topic, new Training(name,name,name,name,name,name,name));
		//LOG.info("consumed message='{}'", new Training(name,name,name,name,name,name,name));

		return "published";
	}
}
