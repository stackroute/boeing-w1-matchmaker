package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface LocationStream {
	String INPUT = "Location";
	
	@Input(INPUT)
	SubscribableChannel inboundLocation(); 

}
