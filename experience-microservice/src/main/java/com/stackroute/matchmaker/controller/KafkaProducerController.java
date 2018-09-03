package com.stackroute.matchmaker.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.indexermodel.ExperienceIndex;
import com.stackroute.matchmaker.indexermodel.RelationshipName;
import com.stackroute.matchmaker.indexermodel.RelationshipProperties;
import com.stackroute.matchmaker.indexermodel.TargetNodeProperty;
import com.stackroute.matchmaker.model.Experience;

@Service
public class KafkaProducerController {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaProducerController.class);

	@Autowired
	private KafkaTemplate<String, ExperienceIndex> kafkaTemplate;

	public ExperienceIndex wasRelationIndexer = new ExperienceIndex();
	public ExperienceIndex isRelationIndexer = new ExperienceIndex();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	public RelationshipName relationshipName = new RelationshipName();
	// public RelationshipProperties relationshipProperties = new
	// RelationshipProperties();

	// @Autowired
	// public Indexer wasRelationIndexer;
	// @Autowired
	// public Indexer isRelationIndexer;
	// @Autowired
	// public TargetNodeProperty targetNodeProperty;
	// @Autowired
	// public RelationshipName relationshipName;
	// @Autowired
	// public RelationshipProperties relationshipProperties;
	//

	@Value("${experienceproducer1.producer1.exp1}")
	private String TOPIC;

	public void produceJson(Experience experience) {

		TargetNodeProperty targetNodeProperty = new TargetNodeProperty(experience.getProfileId());
		RelationshipProperties relationshipProperties = new RelationshipProperties(experience.getOrganizationName(),
				experience.getRole(), experience.getStartDate(), experience.getEndDate());
		/* at present setting the relationship names */
		relationshipName.setEmployeeOf("employeeOf");
		relationshipName.setWasEmployeeOf("wasEmployeeOf");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate startDate = LocalDate.parse(experience.getStartDate(), formatter);

		LocalDate endDate = LocalDate.parse(experience.getEndDate(), formatter);
		Period p = Period.between(startDate, endDate);
		int noy = p.getYears();
		String duration = String.valueOf(noy);
		// Indexer(sourceNodeType,sourceNodeProperty,targetNodeType,targetNodeProperty,relationshipProperties,relationshipName);
		// Indexer indexer = new Indexer("Experience", targetNodeProperty,
		// relationshipProperties,relationshipName, "Created");
		ExperienceIndex experienceIndex = new ExperienceIndex(experience.getProfileId(),
				experience.getOrganizationName(), experience.getRole(), duration, experience.getMessage());
		kafkaTemplate.send(TOPIC, experienceIndex);
		LOG.info("sending JSON message='{}'", experienceIndex, TOPIC);

	}
}
