package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.Project;
import com.stackroute.matchmaker.nodes.Skill;

/**
 * 
 * @author syam
 *
 */
// this is the pojo class based on which the relationships and their properties
// in the neo4j are created upon
@RelationshipEntity(type = "usesSkill")
public class ProjectUsesSkillRelation {
	@Id
	private String projectProfileId;
	private String weight;
	@StartNode
	private Project project;
	@EndNode
	private Skill skill;

	public ProjectUsesSkillRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectUsesSkillRelation(String projectProfileId, String weight, Project project, Skill skill) {
		super();
		this.projectProfileId = projectProfileId;
		this.weight = weight;
		this.project = project;
		this.skill = skill;
	}

	public String getProjectProfileId() {
		return projectProfileId;
	}

	public void setProjectProfileId(String projectProfileId) {
		this.projectProfileId = projectProfileId;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "ProjectUsesSkillRelation [projectProfileId=" + projectProfileId + ", weight=" + weight + ", project=" + project
				+ ", skill=" + skill + "]";
	}

}
