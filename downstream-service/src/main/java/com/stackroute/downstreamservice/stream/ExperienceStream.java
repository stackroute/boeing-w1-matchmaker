package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * ExperienceStream is setting up Experince Topic!
 */
public interface ExperienceStream {
	// INPUT to define the topic
	String INPUT = "Experience";

	// inboundExperience to subscribe the specific topic
	@Input(INPUT)
	public SubscribableChannel inboundExperience();

}
