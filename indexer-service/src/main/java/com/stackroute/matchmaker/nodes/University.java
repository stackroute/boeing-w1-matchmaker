package com.stackroute.matchmaker.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class University {
	@Id
	private String instituteName;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(String instituteName) {
		super();
		this.instituteName = instituteName;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	@Override
	public String toString() {
		return "University [instituteName=" + instituteName + "]";
	}

}
