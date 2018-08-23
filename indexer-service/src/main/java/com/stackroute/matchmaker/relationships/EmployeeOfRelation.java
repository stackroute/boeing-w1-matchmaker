package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.Company;
import com.stackroute.matchmaker.nodes.ProfileId;

@RelationshipEntity(type = "employeeOf")
public class EmployeeOfRelation {
	@Id
	private String role;
	private String startDate;
	private String endDate;
	@StartNode
	private ProfileId profileId;
	@EndNode
	private Company company;

	public EmployeeOfRelation() {
		super();
	}

	public EmployeeOfRelation(String role, String startDate, String endDate, ProfileId profileId, Company company) {
		super();
		this.role = role;
		this.startDate = startDate;
		this.endDate = endDate;
		this.profileId = profileId;
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public ProfileId getProfileId() {
		return profileId;
	}

	public void setProfileId(ProfileId profileId) {
		this.profileId = profileId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "EmployeeOfRelation [role=" + role + ", startDate=" + startDate + ", endDate=" + endDate + ", profileId="
				+ profileId + ", company=" + company + "]";
	}

}
