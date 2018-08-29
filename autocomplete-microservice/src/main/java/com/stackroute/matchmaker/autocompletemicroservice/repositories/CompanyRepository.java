package com.stackroute.matchmaker.autocompletemicroservice.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchmaker.autocompletemicroservice.nodes.Company;
/**
 * 
 * @author syam
 *
 */
public interface CompanyRepository extends Neo4jRepository<Company, String> {

}
