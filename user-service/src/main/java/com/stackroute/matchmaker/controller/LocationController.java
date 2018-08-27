package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.Location;

@CrossOrigin("*")
@RequestMapping("/api/v1/location")
@RestController
public class LocationController {
	
	@Autowired
    private KafkaTemplate<String, Location> kafkaTemplate;

	@Value("${app.location.name}")
    private String topic;

    @PostMapping("/publish")
    public String post(@RequestBody Location location) {

        kafkaTemplate.send(topic , location);

        return "Published successfully";
    }

}
