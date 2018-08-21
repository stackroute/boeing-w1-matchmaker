package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.Project;
import com.stackroute.matchmaker.nodes.Skill;

@RelationshipEntity(type = "usesSkill")
public class UsesSkillRelation {
	@Id
	@StartNode
	private Project project;
	@EndNode
	private Skill skill;

	public UsesSkillRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsesSkillRelation(Project project, Skill skill) {
		super();
		this.project = project;
		this.skill = skill;
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
		return "UsesSkillRelation [project=" + project + ", skill=" + skill + "]";
	}

}
