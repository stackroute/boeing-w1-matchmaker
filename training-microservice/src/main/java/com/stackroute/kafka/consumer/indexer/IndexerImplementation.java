//package com.stackroute.kafka.consumer.indexer;
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
//public class IndexerImplementation {
//
//	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
//
//	private String skills;
//	private String duration;
//	private String trainingName;
//	private String authority;
//	private String profileId;
//	private String topics = "IndexTraining";
//
//	@Autowired
//	private KafkaTemplate<String, Indexer> kafkaTemplate;
//
//	@KafkaListener(topics = "${listener.topic.name}", group = "group_json", containerFactory = "userKafkaListenerFactory")
//	public void receiveJson(Training training) {
//
//		this.skills = training.getSkillsTested();
//		this.duration = training.getDuration();
//		this.trainingName = training.getTrainingName();
//		this.authority = training.getAuthority();
//		this.profileId = training.getProfileId();
//		SourceNodeProperty sourceNodeProperty = new SourceNodeProperty(trainingName, authority, skills, duration);
//		TargetNodeProperty targetNodeProperty = new TargetNodeProperty(profileId);
//		Indexer index = new Indexer("training", sourceNodeProperty, "profile", targetNodeProperty, "undergone",
//				"create");
//		kafkaTemplate.send(topics, index);
//		LOG.info("consumed message in indexer='{}'", index);
//	}
//
//}
