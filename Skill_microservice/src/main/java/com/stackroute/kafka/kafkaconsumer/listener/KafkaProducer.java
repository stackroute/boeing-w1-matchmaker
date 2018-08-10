package com.stackroute.kafka.kafkaconsumer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.kafka.kafkaconsumer.model.Skill;


@RestController
@RequestMapping("kafka")
public class KafkaProducer {

   @Autowired
   private KafkaTemplate<String, Skill> kafkaTemplate;

   private static final String TOPIC = "Kafka_Producer";

   @GetMapping("/publish/{name}")
   public String post(@PathVariable("name") final String name) {

       kafkaTemplate.send(TOPIC, new Skill(name, "Technology", name, name, name));

       return "Published successfully";
   }
}