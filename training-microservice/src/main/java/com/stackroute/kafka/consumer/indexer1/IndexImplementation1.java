//package com.stackroute.kafka.consumer.indexer1;
//
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.stackroute.kafka.consumer.model.Training;
//
//@RestController
//public class IndexImplementation1 {
//
//	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
//
//	private String skills;
//	private String duration;
//	private String topics = "Index";
//	
//	@Autowired
//	private KafkaTemplate<String, Indexer1> kafkaTemplate;
//	
//	@KafkaListener(topics = "${listener.topic.name}", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
//	public void pickUpJson(Training training) {
//		
//		this.skills = training.getSkillsTested();
//		this.duration = training.getDuration();
//		SourceNodeProperty1 source = new SourceNodeProperty1(skills,duration);
//		TargetNodeProperty1 targetNodeProperty = new TargetNodeProperty1(skills);
//		RelationshipProperty relation = new RelationshipProperty("3");
//		Indexer1 index1 = new Indexer1("training",source,"skillsOnto",targetNodeProperty,"coversSkill",relation,"create");
//		kafkaTemplate.send(topics, index1);
//		LOG.info("consumed message in indexer='{}'", index1);
//		}
//}
