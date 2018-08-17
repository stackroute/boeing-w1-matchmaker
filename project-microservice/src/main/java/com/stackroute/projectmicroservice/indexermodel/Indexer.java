package com.stackroute.projectmicroservice.indexermodel;

import org.springframework.beans.factory.annotation.Autowired;

public class Indexer {

	private WorkIndexer workIndexer;
	private SkillIndexer skillIndexer;
	
	public Indexer() {
		
	}

	@Autowired
	public Indexer(WorkIndexer workIndexer, SkillIndexer skillIndexer) {
		super();
		this.workIndexer = workIndexer;
		this.skillIndexer = skillIndexer;
	}

	public WorkIndexer getWorkIndexer() {
		return workIndexer;
	}

	public void setWorkIndexer(WorkIndexer workIndexer) {
		this.workIndexer = workIndexer;
	}

	public SkillIndexer getSkillIndexer() {
		return skillIndexer;
	}

	public void setSkillIndexer(SkillIndexer skillIndexer) {
		this.skillIndexer = skillIndexer;
	}

	@Override
	public String toString() {
		return "Indexer [workIndexer=" + workIndexer + ", skillIndexer=" + skillIndexer + "]";
	}

}
