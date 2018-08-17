package com.stackroute.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface AcademiesStream {
	String INPUT = "Academies";

	@Input(INPUT)
	SubscribableChannel inboundAcademies();

}
