package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PersonalInfoStream {
	String INPUT = "PersonalInfo";
	
	@Input(INPUT)
	SubscribableChannel inboundPersonalInfo(); 

}
