package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.autocompletemicroservice.nodes.University;
/**
 * 
 * @author syam
 *
 */
public interface UniversityRepository extends Neo4jRepository<University, String> {

}
