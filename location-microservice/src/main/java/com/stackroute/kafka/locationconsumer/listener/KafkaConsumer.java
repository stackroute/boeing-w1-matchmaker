package com.stackroute.kafka.locationconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.kafka.locationconsumer.model.Location;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Location", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Location user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
