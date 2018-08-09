 package com.stackroute.experiencemicroservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.experiencemicroservice.model.Experience;


@Service
public class KafkaConsumer {

//	//String message
//    @KafkaListener(topics = "Experience", groupId = "group_id")
//    public void consume(String message) {
//        System.out.println("Consumed message: " + message);
//    }

//Json message
    @KafkaListener(topics = "Experience", group = "group_json",
            containerFactory = "experienceKafkaListenerFactory")
    public void consumeJson(Experience experience) {
        System.out.println("Consumed JSON Message: " + experience);
    }
}
