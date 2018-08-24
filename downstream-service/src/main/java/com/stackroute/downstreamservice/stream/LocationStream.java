package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * LocationStream is to subscribe Location
 */
public interface LocationStream {
	// INPUT is the topic
	String INPUT = "Location";

	// method inboundLocation is to subscribe the topic
	@Input(INPUT)
	SubscribableChannel inboundLocation();

}
