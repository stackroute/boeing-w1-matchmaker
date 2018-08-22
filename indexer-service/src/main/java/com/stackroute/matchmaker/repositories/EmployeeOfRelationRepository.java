package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.EmployeeOfRelation;

public interface EmployeeOfRelationRepository extends Neo4jRepository<EmployeeOfRelation, String>{

}
