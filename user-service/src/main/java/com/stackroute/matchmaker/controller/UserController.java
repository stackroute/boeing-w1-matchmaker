//package com.stackroute.matchmaker.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RequestMapping("/api/v1")
//@RestController
//public class UserController {
//
//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
//	 
//	@GetMapping("/user")
//	public void send(String topic, String payload) {
//	    kafkaTemplate.send(topic, payload);
//	    System.out.println("Message: "+payload+" sent to topic: "+topic);
//	}
//	
////	@KafkaListener(topics = "topic1")
////	public void receiveTopic1(ConsumerRecord<?, ?> consumerRecord) {
////	    System.out.println("Receiver on topic1: "+consumerRecord.toString());
////	}
//	
////	@PostMapping("/user")
////	public void adduser(@RequestBody User user){
////		
////	}
//}
