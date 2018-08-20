package com.stackroute.kafka.kafkaconsumer.indexerdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.kafka.kafkaconsumer.listener.KafkaConsumer;
import com.stackroute.kafka.kafkaconsumer.model.Skill;

@RestController
//@RequestMapping("kafka")
public class IndexerOutput {

	// Use proper naming conventions
	@Autowired
	private KafkaTemplate<String, Index> kafkaTemplate;

	private String topic = "IndexSkill";
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
	public void consumeJson(Skill skill) {

		kafkaTemplate.send(topic,
				new Index(skill.getProfileId(),skill.getSkill(),"50", "Create"));
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
