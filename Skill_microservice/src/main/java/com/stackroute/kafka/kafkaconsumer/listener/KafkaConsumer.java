package com.stackroute.kafka.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.kafka.kafkaconsumer.model.Skill;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Skills", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Skill user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
