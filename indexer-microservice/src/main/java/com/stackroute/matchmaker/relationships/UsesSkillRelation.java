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
// this is the pojo class based on which the relationships and their properties in the neo4j  are created upon
@RelationshipEntity(type = "usesSkill")
public class UsesSkillRelation {
	@Id
	private String projectProfileId;
	@StartNode
	private Project project;
	@EndNode
	private Skill skill;

	public UsesSkillRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsesSkillRelation(String projectProfileId, Project project, Skill skill) {
		super();
		this.projectProfileId = projectProfileId;
		this.project = project;
		this.skill = skill;
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

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "UsesSkillRelation [projectProfileId=" + projectProfileId + ", project=" + project + ", skill=" + skill
				+ "]";
	}

}
