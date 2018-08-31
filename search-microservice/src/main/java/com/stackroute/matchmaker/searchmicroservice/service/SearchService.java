package com.stackroute.matchmaker.searchmicroservice.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;
import com.stackroute.matchmaker.searchmicroservice.model.Result;
import com.stackroute.matchmaker.searchmicroservice.model.Search;
import com.stackroute.matchmaker.searchmicroservice.repositories.ProfileIdRepository;

/**
 * 
 * @author Simran
 *
 */
@Service
public class SearchService {
	private ProfileIdRepository profileIdRepository;
	private final Logger logger = LoggerFactory.getLogger(SearchService.class);

	@Autowired
	public SearchService(ProfileIdRepository profileIdRepository) {
		this.profileIdRepository = profileIdRepository;
	}

	public List<Result> search(Search search) {
		Set<ProfileId> list = new HashSet<>();
		if (!search.getSkill().isEmpty()) {
			list.addAll(profileIdRepository.getBySkill(search.getSkill()));
		}
		if (!search.getLocation().isEmpty()) {
			list.addAll(profileIdRepository.getByLocation(search.getLocation()));
		}
		if (!search.getOrganisation().isEmpty()) {
			list.addAll(profileIdRepository.getByOrganisation(search.getOrganisation()));
		}

		if (!search.getYears().isEmpty()) {
			List<String> experince = search.getYears();
			for (String string : experince) {
				list.addAll(profileIdRepository.getByExperience(Integer.parseInt(string)));
			}
		}
		if (list.isEmpty()) {
			list.addAll(profileIdRepository.getByExperience(5));
		}
		List<Result> result = new ArrayList<>();
		for (ProfileId profile : list) {
			Result resultProfile = new Result();
			resultProfile.setProfileId(profile.getProfileId());
			resultProfile.setSkills(profileIdRepository.getSkill(profile.getProfileId()));
			resultProfile.setExperience(profileIdRepository.getDuration(profile.getProfileId()));
			resultProfile.setCity(profileIdRepository.getCity(profile.getProfileId()));
			result.add(resultProfile);
		}
		logger.info(result + "Result Set");
		return result;

	}

}
