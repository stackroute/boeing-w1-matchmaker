package com.stackroute.matchmaker.autocompletemicroservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.autocompletemicroservice.nodes.City;
import com.stackroute.matchmaker.autocompletemicroservice.nodes.Company;
import com.stackroute.matchmaker.autocompletemicroservice.nodes.Skill;
import com.stackroute.matchmaker.autocompletemicroservice.nodes.University;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.CityRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.CompanyRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.SkillRepository;
import com.stackroute.matchmaker.autocompletemicroservice.repositories.UniversityRepository;
/**
 * 
 * @author syam
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class AutoController {
	private CityRepository cityRepository;
	private SkillRepository skillRepository;
	private CompanyRepository companyRepository;
	private UniversityRepository universityRepository;

	@Autowired
	public AutoController(CityRepository cityRepository, SkillRepository skillRepository,
			CompanyRepository companyRepository, UniversityRepository universityRepository) {
		super();
		this.cityRepository = cityRepository;
		this.skillRepository = skillRepository;
		this.companyRepository = companyRepository;
		this.universityRepository = universityRepository;
	}

	@GetMapping("/location/{term}")
	public List<City> cityAutoComplete(@PathVariable("term") String term) {
		List<City> allCities = new ArrayList<City>();
		List<City> autoCities = new ArrayList<City>();
		Pattern regex = Pattern.compile("(" + term.toLowerCase() + ")");
		allCities = (List<City>) cityRepository.findAll();
		for (int i = 0; i < allCities.size(); i++) {
			Matcher m = regex.matcher(allCities.get(i).toString().toLowerCase());
			if (m.find()) {
				autoCities.add(allCities.get(i));
			}
		}
		System.out.println(autoCities);
		return autoCities;

	}

	@GetMapping("/skill/{term}")
	public List<Skill> skillAutoComplete(@PathVariable("term") String term) {
		List<Skill> allSkills = new ArrayList<Skill>();
		List<Skill> autoSkills = new ArrayList<Skill>();
		Pattern regex = Pattern.compile("(" + term.toLowerCase() + ")");
		allSkills = (List<Skill>) skillRepository.findAll();
		for (int i = 0; i < allSkills.size(); i++) {
			Matcher m = regex.matcher(allSkills.get(i).toString().toLowerCase());
			if (m.find()) {
				autoSkills.add(allSkills.get(i));
			}
		}
		System.out.println(autoSkills);
		return autoSkills;

	}

	@GetMapping("/university/{term}")
	public List<University> universityAutoComplete(@PathVariable("term") String term) {
		List<University> allUniversities = new ArrayList<University>();
		List<University> autoUniversities = new ArrayList<University>();
		Pattern regex = Pattern.compile("(" + term.toLowerCase() + ")");
		allUniversities = (List<University>) universityRepository.findAll();
		for (int i = 0; i < allUniversities.size(); i++) {
			Matcher m = regex.matcher(allUniversities.get(i).toString().toLowerCase());
			if (m.find()) {
				autoUniversities.add(allUniversities.get(i));
			}
		}
		System.out.println(autoUniversities);
		return autoUniversities;

	}

	@GetMapping("/company/{term}")
	public List<Company> companyAutoComplete(@PathVariable("term") String term) {
		List<Company> allCompanies = new ArrayList<Company>();
		List<Company> autoCompanies = new ArrayList<Company>();
		Pattern regex = Pattern.compile("(" + term.toLowerCase() + ")");
		allCompanies = (List<Company>) companyRepository.findAll();
		for (int i = 0; i < allCompanies.size(); i++) {
			Matcher m = regex.matcher(allCompanies.get(i).toString().toLowerCase());
			if (m.find()) {
				autoCompanies.add(allCompanies.get(i));
			}
		}
		System.out.println(autoCompanies);
		return autoCompanies;

	}

}
