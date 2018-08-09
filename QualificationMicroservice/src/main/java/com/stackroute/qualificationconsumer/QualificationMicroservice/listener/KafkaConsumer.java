package com.stackroute.qualificationconsumer.QualificationMicroservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.qualificationconsumer.QualificationMicroservice.model.Qualification;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "Academies", group = "group_json",
            containerFactory = "qualificationKafkaListenerFactory")
    public void consumeJson(Qualification qualification) {
        System.out.println("Consumed JSON Message: " + qualification);
        System.out.println("sgfsdg");
    }
}