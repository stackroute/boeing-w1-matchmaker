package com.stackroute.matchmaker.nlpservice.model;

import java.util.List;

public class Search {

	private List<String> skill;
	private List<String> location;
	private List<String> organisation;
	private List<String> years;

	public Search() {

	}

	public Search(List<String> skill, List<String> location, List<String> organisation, List<String> years) {
		super();
		this.skill = skill;
		this.location = location;
		this.organisation = organisation;
		this.years = years;
	}

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> skill) {
		this.skill = skill;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	public List<String> getOrganisation() {
		return organisation;
	}

	public void setOrganisation(List<String> organisation) {
		this.organisation = organisation;
	}

	public List<String> getYears() {
		return years;
	}

	public void setYears(List<String> years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Search [skill=" + skill + ", location=" + location + ", organisation=" + organisation + ", years="
				+ years + "]";
	}

}
