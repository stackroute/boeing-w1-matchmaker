/*package com.stackroute.matchmaker.searchmicroservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;
import com.stackroute.matchmaker.searchmicroservice.model.Search;
import com.stackroute.matchmaker.searchmicroservice.service.SearchService;
*//**
 * 
 * @author syam
 *
 *//*
@RestController
public class SearchController {
	private SearchService searchService;

	@Autowired
	public SearchController(SearchService searchService) {
		super();
		this.searchService = searchService;
	}

	@PostConstruct
	public List<ProfileId> basedOnSkill() {
		String name = "java";
		searchService.searchbasedOnSkill(name);
		List<ProfileId> profilesWithSkills = new ArrayList<ProfileId>();
		
		profilesWithSkills = searchService.searchbasedOnSkill(name);
		
		for (int i = 0; i < profilesWithSkills.size(); i++) {
			System.out.println(profilesWithSkills.get(i));
		}
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("csharp");
		list.add("c");
		System.out.println(searchService.searchbasedOnSkills(list));
		return profilesWithSkills;
		}

	
	 
	
	@GetMapping
	public ResponseEntity<?> basedOnSkill(@RequestBody Search search){
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
*/