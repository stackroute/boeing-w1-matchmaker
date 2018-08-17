package com.stackroute.indexer.trail1.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.indexer.trail1.nodes.City;

public interface CityRepository extends Neo4jRepository<City, String>{

	String findByName(String cityName);

}
