package com.stackroute.matchmaker.searchmicroservice.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.searchmicroservice.repositories.ProfileIdRepository;

@RestController
public class SearchController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private ProfileIdRepository searchService;

	@Autowired
	public SearchController(ProfileIdRepository searchService) {
		this.searchService = searchService;
	}

	@PostConstruct
	public void basedOnSkill() {
	}

}
