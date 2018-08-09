package com.stackroute.experiencemicroservice.appli.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.experiencemicroservice.appli.model.Experience;



@RestController
@RequestMapping("kafka")
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Experience> kafkaTemplate;

    private static final String TOPIC = "Experience_Kafka_Producer";

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name) {

        kafkaTemplate.send(TOPIC, new Experience(name, "Technology", name, name, name, name));

        return "Published successfully";
    }
}