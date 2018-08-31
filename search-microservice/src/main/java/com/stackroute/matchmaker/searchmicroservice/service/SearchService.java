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
		String check;
		List<Result> result = new ArrayList<>();
		for (ProfileId profile : list) {
			Result resultProfile = new Result();
			resultProfile.setProfileId(profile.getProfileId());
			List<String> listOfSkills = profileIdRepository.getSkill(profile.getProfileId());
			if (listOfSkills.isEmpty()) {
				listOfSkills.add(" ");
			}
			resultProfile.setSkills(listOfSkills);
			check = profileIdRepository.getDuration(profile.getProfileId());
			resultProfile.setExperience(checkNull(check));
			check = profileIdRepository.getCity(profile.getProfileId());
			resultProfile.setCity(checkNull(check));
			result.add(resultProfile);
		}
		logger.info(result + "Result Set");
		return result;

	}

	private String checkNull(String check) {
		if (check == null)
			return "";
		return check;
	}

}
