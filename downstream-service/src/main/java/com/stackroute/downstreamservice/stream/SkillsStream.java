package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * SkillsStream is For Skills  
 */
public interface SkillsStream {
	// INPUT is topic name
	String INPUT = "Skills";

	// inboundSkills is for subscribing
	@Input(INPUT)
	SubscribableChannel inboundSkills();

}
