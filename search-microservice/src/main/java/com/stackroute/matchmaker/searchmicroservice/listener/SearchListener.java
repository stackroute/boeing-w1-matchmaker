package com.stackroute.matchmaker.searchmicroservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

import com.stackroute.matchmaker.searchmicroservice.model.Search;
import com.stackroute.matchmaker.searchmicroservice.service.SearchService;
import com.stackroute.matchmaker.searchmicroservice.stream.SearchStream;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@EnableBinding({SearchStream.class})
public class SearchListener {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private SearchService searchService;
	
	@Autowired
	public SearchListener(SearchService searchService) {
		this.searchService = searchService; 
	}
	
	

	@StreamListener(SearchStream.INPUT)
	public void searchPost(@Payload Search search) {
		logger.info(search +"search");
		

	}




}
