//package com.stackroute.experiencemicroservice.appli.listener;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.stackroute.experiencemicroservice.appli.model.Experience;
//
//@RestController
//@RequestMapping("kafka")
//public class KafkaProducer {
//	private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class);
//
//	@Autowired
//	private KafkaTemplate<String, Experience> kafkaTemplate;
//	@Value("${experienceproducer.producer.exp}")
//	private String TOPIC;
//
//	@GetMapping("/publish/{profileId}")
//	public String post(@PathVariable("profileId") final String profileId) {
//		LOG.info("sending JSON message='{}' to topic='{}'",profileId, TOPIC);
//
//		kafkaTemplate.send(TOPIC, new Experience(profileId, "Morgan-Stanley", "Software-Developer", "04/09/2012",
//				"03/08/2017", "Successful"));
//
//		return "Sent JSON message successfully";
//	}
//}