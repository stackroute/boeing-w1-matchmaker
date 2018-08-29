package com.stackroute.matchmaker.searchmicroservice.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.w3c.dom.stylesheets.LinkStyle;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;
/**
 * 
 * @author Mani, Sathwik and Simran
 *
 */
public interface ProfileIdRepository extends Neo4jRepository<ProfileId, String> {

	
	@Query("MATCH (p:ProfileId)-[:hasSkill]->(s:Skill), (p)-[:undergone]->(t:Training)-[:coversSkill]->(s) WHERE s.name IN {list} RETURN p")
	public List<ProfileId> profilebasedOnSkills(@Param("list") List<String> list);
	
	@Query("MATCH (p:ProfileId)-[:hasSkill]->(s:Skill) where  s.name IN {list} return p "
            + " UNION MATCH (p:ProfileId)-[:undergone]->()-[:coversSkill]->(s)where  s.name IN {list} RETURN p "
            + " UNION MATCH (p:ProfileId)-[:workedIn]->()-[:usesSkill]->(s) where s.name IN {list} RETURN p "
            + " UNION MATCH (s:Skill)<-[:partWholeOf]-()<-[:hasSkill]-(pl) WHERE s.name IN list return pl")
    public List<ProfileId> profilebasedOnSkill(@Param("list") List<String> list);


}
