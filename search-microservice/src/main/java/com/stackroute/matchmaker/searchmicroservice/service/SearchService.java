package com.stackroute.matchmaker.searchmicroservice.service;

import java.util.ArrayList;
import java.util.List;

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

	@Autowired
	public SearchService(ProfileIdRepository profileIdRepository) {
		this.profileIdRepository = profileIdRepository;
	}

	public List<Result> search(Search search) {
		List<ProfileId> list = new ArrayList<>();
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
				list.addAll(profileIdRepository.getByExperince(Integer.parseInt(string)));
			}
		}
		if(list.isEmpty()) {
			list.addAll(profileIdRepository.getByExperince(5));
		}
		return profileIdRepository.getResultSet(list);
	}

}
