package com.stackroute.matchmaker.searchmicroservice.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;
/**
 * 
 * @author syam
 *
 */
public interface ProfileIdRepository extends Neo4jRepository<ProfileId, String> {

	@Query("MATCH (p:ProfileId)-[:hasSkill]->(s:Skill), (p)-[:undergone]->(t:Training)-[:coversSkill]->(s)where  s.name={name} RETURN p")
	public List<ProfileId> profilebasedOnSkill(@Param("name") String name);

}
