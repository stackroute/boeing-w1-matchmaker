package com.stackroute.matchmaker.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.matchmaker.model.PersonalInfo;

//Receiver service receives the personal information object from kafka consumer
@Service
public class Receiver {

	@Autowired
	private Producer producer;

	public void receiveObject(PersonalInfo personalInfo) {
		
		//sends the object to kafka producer
		producer.sendObject(personalInfo);

	}

}
