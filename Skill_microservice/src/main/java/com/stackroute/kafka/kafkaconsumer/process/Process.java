package com.stackroute.kafka.kafkaconsumer.process;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.kafka.kafkaconsumer.model.Skill;

@Service
public class Process {

	@KafkaListener(topics = "Skills", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Skill user) {
        System.out.println("Skills Id: " + user.getProfileId());
        System.out.println("Skills " + user.getSkill());
    }
}
