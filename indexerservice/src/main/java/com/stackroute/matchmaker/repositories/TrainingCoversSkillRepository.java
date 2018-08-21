package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.TrainingCoversSkill;

public interface TrainingCoversSkillRepository extends Neo4jRepository<TrainingCoversSkill, String>{

}
