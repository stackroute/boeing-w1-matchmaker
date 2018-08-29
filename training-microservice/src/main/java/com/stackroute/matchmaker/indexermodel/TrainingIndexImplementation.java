package com.stackroute.matchmaker.indexermodel;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.model.Certificates;

@RestController
public class TrainingIndexImplementation {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	//
	//	private String skills;
	//	private String duration;
	//	private String profileId;
	//	private String topics = "IndexTraining";
	//	private String topics1 = "Index";

	@Value("${indexer.topic.name}")
	private String topics2;

	@Autowired
	private KafkaTemplate<String, TrainingIndex> kafkaTemplate;

	//	@Autowired
	//	private KafkaTemplate<String, Indexer> kafkaTemplate1;

	@KafkaListener(topics = "${app.topic.training}", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(Certificates certificates) {

		TrainingIndex index2 = new TrainingIndex(certificates.getProfileId(),certificates.getTrainingId(),certificates.getTrainingName(),certificates.getAuthority(),certificates.getDuration(),certificates.getSkillsTested(),certificates.getMessage(),"3");
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

	//	@KafkaListener(topics = "sathwik", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
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
