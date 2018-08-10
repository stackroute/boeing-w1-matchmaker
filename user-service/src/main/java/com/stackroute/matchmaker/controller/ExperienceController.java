package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.Experience;

@CrossOrigin("*")
@RequestMapping("/api/v1/experience")
@RestController
public class ExperienceController {
	
	@Autowired
    private KafkaTemplate<String, Experience> kafkaTemplate;

    private static final String TOPIC = "Experience";

    @PostMapping("/publish")
    public String post(@RequestBody Experience exp) {

        kafkaTemplate.send(TOPIC , exp);

        return "Published successfully";
    }

}
