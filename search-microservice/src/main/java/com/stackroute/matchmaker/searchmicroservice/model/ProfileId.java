package com.stackroute.matchmaker.searchmicroservice.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.Data;

/**
 * 
 * @author syam
 *
 */
// this is the pojo class based on which the nodes and their properties in the neo4j  are created upon
@Data
@NodeEntity
public class ProfileId {
	@Id
	private String profileId;
}
