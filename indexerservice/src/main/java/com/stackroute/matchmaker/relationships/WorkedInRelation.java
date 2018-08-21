package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.ProfileId;
import com.stackroute.matchmaker.nodes.Project;

@RelationshipEntity(type = "workedIn")
public class WorkedInRelation {
	@Id
	private String projectId;
	private String role;
	private String from;
	private String to;
	@StartNode
	private ProfileId profileId;
	@EndNode
	private Project project;

	public WorkedInRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkedInRelation(String projectId, String role, String from, String to, ProfileId profileId,
			Project project) {
		super();
		this.projectId = projectId;
		this.role = role;
		this.from = from;
		this.to = to;
		this.profileId = profileId;
		this.project = project;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public ProfileId getProfileId() {
		return profileId;
	}

	public void setProfileId(ProfileId profileId) {
		this.profileId = profileId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "WorkedInRelation [projectId=" + projectId + ", role=" + role + ", from=" + from + ", to=" + to
				+ ", profileId=" + profileId + ", project=" + project + "]";
	}

}
