package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/*
 * TrainingStream is for Training
 */
public interface TrainingStream {
	// Topic name
	String INPUT = "Certificates";

	// To subscribe to the topic
	@Input(INPUT)
	SubscribableChannel inboundTraining();

}
