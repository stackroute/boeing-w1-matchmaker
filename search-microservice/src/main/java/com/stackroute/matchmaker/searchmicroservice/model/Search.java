package com.stackroute.matchmaker.searchmicroservice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties
public class Search {
	private List<String> skill;
	private List<String> location;
	private List<String> organisation;
	private List<String> years;

}
