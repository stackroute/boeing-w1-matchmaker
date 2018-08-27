package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.Projects;


@CrossOrigin("*")
@RequestMapping("/api/v1/projects")
@RestController
public class ProjectsController {
	
	@Autowired
    private KafkaTemplate<String, Projects> kafkaTemplate;

	@Value("${app.project.name}")
    private String topic;

    @PostMapping("/publish")
    public String post(@RequestBody Projects project) {

        kafkaTemplate.send(topic , project);

        return "Published successfully";
    }

}
