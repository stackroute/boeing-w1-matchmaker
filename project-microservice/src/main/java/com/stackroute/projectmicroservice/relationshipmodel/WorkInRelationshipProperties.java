package com.stackroute.projectmicroservice.relationshipmodel;

import org.springframework.beans.factory.annotation.Autowired;

public class WorkInRelationshipProperties {

	private String to;
	private String from;
	private String role;
	private String projectName;
	private String department;

	public WorkInRelationshipProperties() {

	}

	@Autowired
	public WorkInRelationshipProperties(String to, String from, String role, String projectName, String department) {
		super();
		this.to = to;
		this.from = from;
		this.role = role;
		this.projectName = projectName;
		this.department = department;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "RelationshipProperties [to=" + to + ", from=" + from + ", role=" + role + ", projectName=" + projectName
				+ ", department=" + department + "]";
	}

}
