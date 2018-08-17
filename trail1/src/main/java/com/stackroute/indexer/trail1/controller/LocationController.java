package com.stackroute.indexer.trail1.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.indexer.trail1.nodes.City;
import com.stackroute.indexer.trail1.nodes.ProfileId;
import com.stackroute.indexer.trail1.repositories.ProfileIdRepository;

@RestController
public class LocationController {
	private ProfileIdRepository profileIdRepository;

	@Autowired
	public LocationController(ProfileIdRepository profileIdRepository) {
		super();
		this.profileIdRepository = profileIdRepository;
	}

	@PostConstruct
	public void livesInCity() {
		ProfileId profileId = new ProfileId();
		City city = new City();
		profileId.setProfileId("yoyobuddy_2017");
		city.setName("pune");
		profileId.setCity(city);
		profileIdRepository.save(profileId);

	}

}
