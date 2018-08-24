package com.stackroute.matchmaker.indexermodel;

public class RelationshipName {

	/*
	 * RelationshipField Attributes
	 */
	private String wasEmployeeOf;
	private String employeeOf;

	public RelationshipName() {
		super();
	}

	public RelationshipName(String wasEmployeeOf, String employeeOf) {
		super();
		this.wasEmployeeOf = wasEmployeeOf;
		this.employeeOf = employeeOf;
	}

	public String getWasEmployeeOf() {
		return wasEmployeeOf;
	}

	public void setWasEmployeeOf(String wasEmployeeOf) {
		this.wasEmployeeOf = wasEmployeeOf;
	}

	public String getEmployeeOf() {
		return employeeOf;
	}

	public void setEmployeeOf(String employeeOf) {
		this.employeeOf = employeeOf;
	}

	@Override
	public String toString() {
		return "RelationshipName [wasEmployeeOf=" + wasEmployeeOf + ", employeeOf=" + employeeOf + "]";
	}

}
