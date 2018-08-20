package com.stackroute.kafka.consumer.indexer;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.kafka.consumer.model.Training;

@RestController
public class IndexerImplementation {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

	private String skills;
	private String duration;
	private String profileId;
	private String topics = "IndexTraining";
	private String topics1 = "Index";
	private String topics2 = "Train";

	@Autowired
	private KafkaTemplate<String, Indexer1> kafkaTemplate;

//	@Autowired
//	private KafkaTemplate<String, Indexer> kafkaTemplate1;

	

		@KafkaListener(topics = "${listener.topic.name}", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
		public void receiveJson(Training training) {
			
			Indexer1 index2 = new Indexer1(training.getProfileId(),training.getTrainingId(),training.getTrainingName(),training.getAuthority(),training.getDuration(),training.getSkillsTested(),"create","3");
			kafkaTemplate.send(topics2, index2);
			LOG.info("consumed message in index1='{}'", index2);
	
//			this.skills = training.getSkillsTested();
//			this.duration = training.getDuration();
//			this.profileId = training.getProfileId();
//			SourceNodeProperty sourceNodeProperty = new SourceNodeProperty(skills, duration);
//			TargetNodeProperty targetNodeProperty = new TargetNodeProperty(profileId);
//			Indexer index = new Indexer("training", sourceNodeProperty, "profile", targetNodeProperty, "undergone",
//					"create");
//			kafkaTemplate.send(topics, index);
//			LOG.info("consumed message in indexer='{}'", index);
		}

//	@KafkaListener(topics = "Rajat", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
//	public void pickUpJson(Training training) {
//
//		this.skills = training.getSkillsTested();
//		this.duration = training.getDuration();
//		SourceNodeProperty source = new SourceNodeProperty(skills,duration);
//		TargetNodeProperty targetNodeProperty = new TargetNodeProperty(skills);
//		RelationshipProperty relation = new RelationshipProperty("3");
//		Indexer1 index1 = new Indexer("training",source,"skillsOnto",targetNodeProperty,"coversSkill",relation,"create");
//		kafkaTemplate1.send(topics1, index1);
//		LOG.info("consumed message in index1='{}'", index1);
//	}

//	@KafkaListener(topics = "${listener.topic.name}", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
//	public void consumeJson(Training training) {
//
//		Indexer1 index2 = new Indexer1(training.getProfileId(),training.getTrainingId(),training.getTrainingName(),training.getAuthority(),training.getDuration(),training.getSkillsTested(),"create","3");
//		kafkaTemplate.send(topics2, index2);
//		LOG.info("consumed message in index1='{}'", index2);
//	}

}
