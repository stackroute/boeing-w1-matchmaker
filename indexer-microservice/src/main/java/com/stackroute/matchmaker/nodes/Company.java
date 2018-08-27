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
public class Company {
	@Id
	private String organizationName;

	public Company() {
		super();
	}

	public Company(String organizationName) {
		super();
		this.organizationName = organizationName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Override
	public String toString() {
		return "Company [organizationName=" + organizationName + "]";
	}

}
