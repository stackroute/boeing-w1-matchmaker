package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.relationships.TrainingUndergone;
/**
 * 
 * @author syam
 *
 */
public interface TrainingUndergoneRepository extends Neo4jRepository<TrainingUndergone, String>{

}
