package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.ProjectUsesSkillRelation;

/**
 * 
 * @author syam
 *
 */
public interface UsesSkillRelationRepository extends Neo4jRepository<ProjectUsesSkillRelation, String> {

}
