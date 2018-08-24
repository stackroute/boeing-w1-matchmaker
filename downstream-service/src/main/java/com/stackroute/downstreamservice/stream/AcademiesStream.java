package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * AcademiesStream for Academies topic
 */
public interface AcademiesStream {
	// INPUT for topic names
	String INPUT = "Academies";

	// inboundAcademies is to subscribe to the topic
	@Input(INPUT)
	SubscribableChannel inboundAcademies();

}
