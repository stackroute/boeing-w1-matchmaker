package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.Skills;

@CrossOrigin("*")
@RequestMapping("/api/v1/skills")
@RestController
public class SkillsController {
	
	@Autowired
    private KafkaTemplate<String, Skills> kafkaTemplate;

	@Value("${app.skill.name}")
    private String topic;

    @PostMapping("/publish")
    public String post(@RequestBody Skills skill) {

        kafkaTemplate.send(topic , skill);

        return "Published successfully";
    }

}
