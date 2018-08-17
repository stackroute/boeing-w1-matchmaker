package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ProjectStream {

	String INPUT = "Projects";

	@Input(INPUT)
	SubscribableChannel inboundProject();
}
