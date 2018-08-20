package com.stackroute.qualificationmicroservice.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.qualificationmicroservice.indexermodel.Indexer;
import com.stackroute.qualificationmicroservice.indexermodel.Relationship;
import com.stackroute.qualificationmicroservice.indexermodel.TargetNodeProperty;
import com.stackroute.qualificationmicroservice.listener.KafkaConsumer;
import com.stackroute.qualificationmicroservice.model.Qualification;
import com.stackroute.qualificationmicroservice.relationshipmodel.StudiedAtRelationshipProperties;
import com.stackroute.qualificationmicroservice.config.KafkaConsumerConfiguration;


	@Service
	public class Receiver {

		private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);
		@Autowired
		private Producer producer;

		public Indexer studiedAtIndexer = new Indexer();
		public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
		 public StudiedAtRelationshipProperties studiedAtRelationshipProperties = new StudiedAtRelationshipProperties();

		 public void consumeJson(Qualification qualification) {
			 LOG.info("received message1='{}'", qualification);
			 
		    	//Target Node Type
		    	studiedAtIndexer.setTargetNodeType("Profile");
		    	
		    	//Source Node Type
		    	studiedAtIndexer.setSourceNodeType("Project");
		    	
		    	
		    	studiedAtIndexer.setSourceNodeProperty(qualification.getQualification());
		    	
		    	targetNodeProperty.setProfileId(qualification.getProfileId());
		    	
		    	studiedAtIndexer.setTargetNodeProperty(targetNodeProperty);
		    	
		    	
		    
		    	studiedAtRelationshipProperties.setQualification(qualification.getQualification());
		    	studiedAtRelationshipProperties.setStream(qualification.getStream());
		    	studiedAtRelationshipProperties.setYearOfCompletion(qualification.getYearOfCompletion());
		    	studiedAtRelationshipProperties.setYearOfJoining(qualification.getYearOfJoining());
		    	
		    	LOG.info("relship receiver='{}'", studiedAtRelationshipProperties);
		    
		    	
		    	Relationship studyRelationship = new Relationship(studiedAtRelationshipProperties);
		    	studiedAtIndexer.setRelationship(studyRelationship);
		    	
		    	
		    	
		    	//Operations
		    	
		    	studiedAtIndexer.setWeightage("5");
		    	studiedAtIndexer.setOperation(qualification.getMessage());
		    	
		    	//Printing
		    	
		        LOG.info("received messagein receiver='{}'", studiedAtIndexer);
		        
		        LOG.info("received message1='{}'", qualification);
		        
		        
		    //    producer.sender(studiedAtIndexer);
		       producer.send(qualification);
		        
		    }
}
