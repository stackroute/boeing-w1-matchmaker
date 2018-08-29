package com.stackroute.matchmaker.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
/**
 * 
 * @author syam
 *
 */
// this is the pojo class based on which the nodes and their properties in the neo4j  are created upon
@NodeEntity
public class Skill {
	@Id
	private String name;

	public Skill() {
		super();
	}

	public Skill(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill [name=" + name + "]";
	}

}
