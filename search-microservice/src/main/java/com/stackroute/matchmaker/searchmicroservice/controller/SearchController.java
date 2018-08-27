package com.stackroute.matchmaker.searchmicroservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;
import com.stackroute.matchmaker.searchmicroservice.service.SearchService;
/**
 * 
 * @author syam
 *
 */
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
		return profilesWithSkills;

	}

	/*
	 * @PostConstruct public List<City> getAllCityNodes() { List<City> allCities =
	 * new ArrayList<City>(); allCities = (List<City>) cityRepository.findAll(); for
	 * (int i = 0; i < allCities.size(); i++) {
	 * System.out.println(allCities.get(i)); } return (List<City>)
	 * cityRepository.findAll();
	 * 
	 * }
	 * 
	 * @PostConstruct public List<University> getAllUniversityNodes() {
	 * List<University> allUniversities = new ArrayList<University>();
	 * allUniversities = (List<University>) universityRepository.findAll(); for (int
	 * i = 0; i < allUniversities.size(); i++) {
	 * System.out.println(allUniversities.get(i)); } return (List<University>)
	 * universityRepository.findAll();
	 * 
	 * }
	 * 
	 * @PostConstruct public List<Company> getAllCompanyNodes() { List<Company>
	 * allCompanies = new ArrayList<Company>(); allCompanies = (List<Company>)
	 * companyRepository.findAll(); for (int i = 0; i < allCompanies.size(); i++) {
	 * System.out.println(allCompanies.get(i)); } return (List<Company>)
	 * companyRepository.findAll();
	 * 
	 * }
	 */
}
