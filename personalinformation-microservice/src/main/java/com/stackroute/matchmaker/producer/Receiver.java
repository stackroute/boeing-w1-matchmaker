package com.stackroute.matchmaker.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.matchmaker.model.PersonalInfo;

@Service
public class Receiver {

	@Autowired
	private Producer producer;

	public void receiveObject(PersonalInfo personalInfo) {

		// dummy object to be produced
		//PersonalInfo per = new PersonalInfo("hello", "hello", "hello", "hello", "hello", "hello", "hello", "hello",
		//		"hello", "hello", "hello", "hello","hai");
		producer.sendObject(personalInfo);

	}

}
