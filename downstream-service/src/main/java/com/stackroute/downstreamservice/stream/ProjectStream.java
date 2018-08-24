package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * ProjectStream for Academies topic
 */
public interface ProjectStream {

	// INPUT for topic names
	String INPUT = "Projects";

	// inboundProject is to subscribe to the topic
	@Input(INPUT)
	SubscribableChannel inboundProject();
}
