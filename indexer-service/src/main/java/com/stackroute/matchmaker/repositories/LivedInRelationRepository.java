package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.LivedInRelation;

public interface LivedInRelationRepository extends Neo4jRepository<LivedInRelation, String>{

}
