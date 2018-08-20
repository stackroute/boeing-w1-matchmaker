package com.stackroute.qualificationmicroservice.indexermodel;

import com.stackroute.qualificationmicroservice.relationshipmodel.StudiedAtRelationshipProperties;

public class Relationship {
	
	private StudiedAtRelationshipProperties studiedAt;

	public Relationship(StudiedAtRelationshipProperties studiedAt) {
		super();
		this.studiedAt = studiedAt;
	}

	public StudiedAtRelationshipProperties getStudiedAt() {
		return studiedAt;
	}

	public void setStudiedAt(StudiedAtRelationshipProperties studiedAt) {
		this.studiedAt = studiedAt;
	}

	@Override
	public String toString() {
		return "Relationship [studiedAt=" + studiedAt + "]";
	}

	
	

}