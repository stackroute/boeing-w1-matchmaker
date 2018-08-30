package com.stackroute.matchmaker.indexermodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.listener.KafkaConsumer;
import com.stackroute.matchmaker.model.Skills;

@RestController
//@RequestMapping("kafka")
public class IndexerOutput {

	// Use proper naming conventions
	@Autowired
	private KafkaTemplate<String, SkillIndex> kafkaTemplate;
	
	@Value("${producer.topic.name}")
	private String topic;
	
	RelationshipPropertyImplementation weightage;

//	private String profileId;
//	private String mySkill;
//	private String level;
//	private TargetNodeProperty targetNodeProperty;
//	private SourceNodeProperty sourceNodeProperty;
	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

//	@KafkaListener(topics = "${listener.topic.name}", group = "group_json", containerFactory = "skillKafkaListenerFactory")
//	public void consumeJson(Skill skill) {
//
//		LOG.info("Consumed JSON message='{}'", skill);
//		this.profileId = skill.getProfileId();
//		this.mySkill = skill.getSkill();
//		this.level = skill.getLevel();
//		sourceNodeProperty = new SourceNodeProperty(mySkill, level);
//		targetNodeProperty = new TargetNodeProperty(profileId);
//		kafkaTemplate.send(topic,
//				new Indexer("Skill", sourceNodeProperty, "Profile", targetNodeProperty, "has_skill", "8", "Create"));
//		LOG.info("Produced JSON message on indexer='{}'");
//
//	}
	
	@KafkaListener(topics = "${listener.topic.name}", groupId = "group_json", containerFactory = "skillKafkaListenerFactory")
	public void consumeJson(Skills skill) {
		String skills= skill.getSkill();
		LOG.info("Weightage is",weightage.weightageAssigner(skills),skill.getMessage());
		kafkaTemplate.send(topic,
				new SkillIndex(skill.getProfileId(),skill.getSkill(),weightage.weightageAssigner(skills),skill.getMessage()));
		LOG.info("Produced JSON message on indexer='{}'");

	}

//	@GetMapping("/publishIndexer/{id}")
//	public String post(@PathVariable("id") final String id) {
//
//		// publishing to kafka
//		sourcenodeproperty = new SourceNodeProperty(myskill,level);	
//		targetnodeproperty = new TargetNodeProperty(profileId);
//		kafkaTemplate.send(topic, new Indexer(id, sourcenodeproperty, "Profile", targetnodeproperty, "has_skill", "8", "Create"));
//
//		return "Published successfully";
//	}
}
