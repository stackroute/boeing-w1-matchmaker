package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import com.stackroute.matchmaker.autocompletemicroservice.nodes.City;
/**
 * 
 * @author syam
 *
 */
public interface CityRepository extends Neo4jRepository<City, String> {

}
