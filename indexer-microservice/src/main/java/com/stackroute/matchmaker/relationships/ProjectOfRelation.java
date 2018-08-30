package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.Company;
import com.stackroute.matchmaker.nodes.Project;

@RelationshipEntity(type = "projectOf")
public class ProjectOfRelation {
	@Id
	private String projectProfileId;
	@StartNode
	private Project project;
	@EndNode
	private Company company;

	public ProjectOfRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectOfRelation(String projectProfileId, Project project, Company company) {
		super();
		this.projectProfileId = projectProfileId;
		this.project = project;
		this.company = company;
	}

	public String getProjectProfileId() {
		return projectProfileId;
	}

	public void setProjectProfileId(String projectProfileId) {
		this.projectProfileId = projectProfileId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "ProjectOfRelation [projectProfileId=" + projectProfileId + ", project=" + project + ", company="
				+ company + "]";
	}

}
