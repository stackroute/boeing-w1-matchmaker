package com.stackroute.experiencemicroservice.indexermodel;

public class RelationshipProperties {
	/*
	 * Node field Attributes
	 */
	private String organizationName;
	private String role;
	private String startDate;
	private String endDate;

	public RelationshipProperties() {
	}

	public RelationshipProperties(String organizationName, String role, String startDate, String endDate) {
		super();
		this.organizationName = organizationName;
		this.role = role;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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

	@Override
	public String toString() {
		return "NodeProperties [organizationName=" + organizationName + ", role=" + role + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

}
