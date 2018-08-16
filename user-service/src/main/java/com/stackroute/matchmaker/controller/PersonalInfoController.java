package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.PersonalInfo;

@CrossOrigin("*")
@RequestMapping("/api/v1/personalInfo")
@RestController
public class PersonalInfoController {
	
	@Autowired
    private KafkaTemplate<String, PersonalInfo> kafkaTemplate;

    private static final String TOPIC = "PersonalInfo";

    @PostMapping("/publish")
    public String post(@RequestBody PersonalInfo perInfo) {

        kafkaTemplate.send(TOPIC , perInfo);

        return "Published successfully";
    }

}
