package com.stackroute.matchmaker.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchmaker.nodes.Skill;
import com.stackroute.matchmaker.nodes.Training;
/**
 * 
 * @author syam
 *
 */
// this is the pojo class based on which the relationships and their properties in the neo4j  are created upon
@RelationshipEntity(type = "coversSkill")
public class TrainingCoversSkill {
	@Id
	private String weight;
	@StartNode
	private Training training;
	@EndNode
	private Skill skill;

	

	public TrainingCoversSkill(String weight, Training training, Skill skill) {
		super();
		this.weight = weight;
		this.training = training;
		this.skill = skill;
	}

	public TrainingCoversSkill() {
		super();
	}

	@Override
	public String toString() {
		return "TrainingCoversSkill [weight=" + weight + "]";
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
