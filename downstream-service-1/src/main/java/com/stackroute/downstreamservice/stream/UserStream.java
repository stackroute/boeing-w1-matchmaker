package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * UserStream is for User service
 */
public interface UserStream {
	// INPUT is for the topic name
	String INPUT = "CassandraRegistration";

	// inboundUser is to subscribe the topic
	@Input(INPUT)
	SubscribableChannel inboundUser();

}
