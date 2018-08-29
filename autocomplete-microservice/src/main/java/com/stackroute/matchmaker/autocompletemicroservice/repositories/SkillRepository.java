package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.autocompletemicroservice.nodes.Skill;
/**
 * 
 * @author syam
 *
 */
public interface SkillRepository extends Neo4jRepository<Skill, String>{

}
