package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TrainingStream {
String INPUT = "Certificates";
	
	@Input(INPUT)
	SubscribableChannel inboundTraining();

}
