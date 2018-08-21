package com.stackroute.matchmaker.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.config.KafkaConsumerConfiguration;
import com.stackroute.matchmaker.indexermodel.Indexer;
import com.stackroute.matchmaker.indexermodel.QualificationIndex;
import com.stackroute.matchmaker.indexermodel.Relationship;
import com.stackroute.matchmaker.indexermodel.TargetNodeProperty;
import com.stackroute.matchmaker.listener.KafkaConsumer;
import com.stackroute.matchmaker.model.AcademicQualification;
import com.stackroute.matchmaker.relationshipmodel.StudiedAtRelationshipProperties;


	@Service
	public class Receiver {

		private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);
		@Autowired
		private Producer producer;

		public Indexer studiedAtIndexer = new Indexer();
		public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
		 public StudiedAtRelationshipProperties studiedAtRelationshipProperties = new StudiedAtRelationshipProperties();
        public QualificationIndex qualificationIndexer=new QualificationIndex();
        
		 public void consumeJson(AcademicQualification qualification) {
			/* LOG.info("received message1='{}'", qualification);
			 
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
		        */
			 
			 
			 
		        LOG.info("received message1='{}'", qualification);
		
		qualificationIndexer.setInstituteName(qualification.getInstituteName());
		qualificationIndexer.setMessage(qualification.getMessage());
		qualificationIndexer.setProfileId(qualification.getProfileId());
		qualificationIndexer.setQualification(qualification.getQualification());   
		qualificationIndexer.setStream(qualification.getStream());
		qualificationIndexer.setYearOfCompletion(qualification.getYearOfCompletion());
		qualificationIndexer.setYearOfJoining(qualification.getYearOfJoining());        
		//qualificationIndexer.setWeightage("50");      
		    //    producer.sender(studiedAtIndexer);
		     //  producer.send(qualification);
		       producer.sendtoindexer(qualificationIndexer);
		        
		    }
}
