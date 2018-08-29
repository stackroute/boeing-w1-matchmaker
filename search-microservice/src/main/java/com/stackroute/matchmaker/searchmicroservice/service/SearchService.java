package com.stackroute.matchmaker.searchmicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;
import com.stackroute.matchmaker.searchmicroservice.repositories.ProfileIdRepository;

/**
 * 
 * @author syam
 *
 */
@Service
public class SearchService {
	private ProfileIdRepository profileIdRepository;

	@Autowired
	public SearchService(ProfileIdRepository profileIdRepository) {
		this.profileIdRepository = profileIdRepository;
	}

	public List<ProfileId> searchbasedOnSkill(String name) {

		return profileIdRepository.profilebasedOnSkill(name);

	}
	
	public List<ProfileId> searchbasedOnSkills(List<String> list) {

		return profileIdRepository.profilebasedOnSkills(list);

	}

}
