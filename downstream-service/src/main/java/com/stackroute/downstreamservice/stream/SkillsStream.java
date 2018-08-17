package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SkillsStream {
	String INPUT = "Skills";
	
	@Input(INPUT)
	SubscribableChannel inboundSkills(); 

}
