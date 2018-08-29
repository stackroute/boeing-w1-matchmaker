package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.HasSkill;
/**
 * 
 * @author syam
 *
 */
public interface HasSkillRepository extends Neo4jRepository<HasSkill, String>{

}
