package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.ProjectOfRelation;

public interface ProjectOfRelationRepository extends Neo4jRepository<ProjectOfRelation, String> {

}
