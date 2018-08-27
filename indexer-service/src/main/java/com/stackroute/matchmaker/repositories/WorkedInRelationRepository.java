package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.WorkedInRelation;

/**
 * 
 * @author syam
 *
 */
public interface WorkedInRelationRepository extends Neo4jRepository<WorkedInRelation, String> {

}
