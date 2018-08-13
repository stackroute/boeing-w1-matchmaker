package com.stackroute.kafka.kafkaconsumer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.kafka.kafkaconsumer.model.Skill;

@RestController
@RequestMapping("kafka")
public class KafkaProducer {

	// using template defined in configuration class
	@Autowired
	private KafkaTemplate<String, Skill> kafkaTemplate;

	@Value("${listener.topic.name}")
	private String TOPIC;

	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {

		// publishing to kafka
		kafkaTemplate.send(TOPIC, new Skill(name, "Technology", name, name, name));

		return "Published successfully";
	}
}