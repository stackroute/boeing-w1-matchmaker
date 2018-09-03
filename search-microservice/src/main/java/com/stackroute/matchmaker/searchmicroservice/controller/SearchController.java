package com.stackroute.matchmaker.searchmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.stackroute.matchmaker.searchmicroservice.model.Search;
import com.stackroute.matchmaker.searchmicroservice.service.SearchService;
/**
 * 
 * @author simran
 *
 */
@RestController
@CrossOrigin("*")
public class SearchController {
	private SearchService searchService;

	@Autowired
	public SearchController(SearchService searchService) {
		this.searchService = searchService;
	}

	@PostMapping("/searchengine")
	public ResponseEntity<?> searchEngine(@RequestBody Search search) {
		Gson gson = new Gson();
		String string =gson.toJson(searchService.search(search));
		return new ResponseEntity<String>(string, HttpStatus.OK);
	}

}
