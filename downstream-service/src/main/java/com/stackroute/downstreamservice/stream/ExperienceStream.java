package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ExperienceStream {
	String INPUT = "Experience";
	
	@Input(INPUT)
	SubscribableChannel inboundExperience(); 

}
