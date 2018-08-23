package com.stackroute.matchmaker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.nodes.City;

public interface CityRepository extends Neo4jRepository<City, String>{

}
