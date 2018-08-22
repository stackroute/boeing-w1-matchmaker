package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.LivesInRelation;

public interface LivesInRelationRepository extends Neo4jRepository<LivesInRelation, String> {

}
