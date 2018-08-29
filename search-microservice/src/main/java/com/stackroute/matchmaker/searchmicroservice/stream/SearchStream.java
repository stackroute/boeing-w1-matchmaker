package com.stackroute.matchmaker.searchmicroservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SearchStream {
	// INPUT for topic names
		String INPUT = "NLP";

		// inboundSearch is to subscribe to the topic
		@Input(INPUT)
		SubscribableChannel inboundSearch();


}
