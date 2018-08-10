package com.stackroute.projectmicroservice.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.model.Project;

@Service
public class KafkaConsumer {

   


    @KafkaListener(topics = "Projects", group = "group_json",
            containerFactory = "projectKafkaListenerFactory")
    public void consumeJson(Project project) {
        System.out.println("Consumed JSON Message: " + project);
    }
}
;