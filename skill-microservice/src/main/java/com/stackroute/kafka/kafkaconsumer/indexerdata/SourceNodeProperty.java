package com.stackroute.kafka.kafkaconsumer.indexerdata;

public class SourceNodeProperty {

	private String skill;
	private String level;
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public SourceNodeProperty() {
		super();
	}
	public SourceNodeProperty(String skill, String level) {
		super();
		this.skill = skill;
		this.level = level;
	}
	@Override
	public String toString() {
		return "SourceNodeProperty [skill=" + skill + ", level=" + level + "]";
	}
	
}
