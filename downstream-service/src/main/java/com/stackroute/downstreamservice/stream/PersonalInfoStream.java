package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * PersonalInfoStream is to subscribe Location
 */
public interface PersonalInfoStream {
	// INPUT is the topic
	String INPUT = "PersonalInfoIndexer";

	// method inboundPersonalInfo is to subscribe the topic
	@Input(INPUT)
	SubscribableChannel inboundPersonalInfo();

}
