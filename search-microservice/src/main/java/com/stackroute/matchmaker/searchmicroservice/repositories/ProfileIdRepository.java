package com.stackroute.matchmaker.searchmicroservice.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.matchmaker.searchmicroservice.model.ProfileId;
/**
 * 
 * @author simran
 *
 */
public interface ProfileIdRepository extends Neo4jRepository<ProfileId, String> {

	@Query("MATCH (p:ProfileId)-[:hasSkill]->(s:Skill) where s.name IN {list} RETURN p "
			+ " UNION MATCH (p:ProfileId)-[:undergone]->()-[:coversSkill]->(s)where  s.name IN {list} RETURN p "
			+ " UNION MATCH (p:ProfileId)-[:workedIn]->()-[:usesSkill]->(s) where s.name IN {list} RETURN p "
			+ " UNION MATCH (s:Skill)<-[:partWholeOf]-()<-[:hasSkill]-(p) WHERE s.name IN {list} return p ")
	public List<ProfileId> getBySkill(@Param("list") List<String> list);

	@Query("MATCH (s:Skill)-[:sameAs]-()<-[:hasSkill]-(p) WHERE s.name IN {list} RETURN p ")
	public List<ProfileId> getBySameSkill(@Param("list") List<String> list);

	@Query("MATCH (p:ProfileId)-[r:livedIn]->(c:City) WHERE c.city IN {list} RETURN p "
			+ "UNION MATCH (p:ProfileId)-[s:livesIn]->(c:City) WHERE c.city IN {list} RETURN p ")
	public List<ProfileId> getByLocation(@Param("list") List<String> list);

	@Query("MATCH (p:ProfileId)-[r:employeeOf]->(c:Company) WHERE c.organizationName IN {list} RETURN p ")
	public List<ProfileId> getByOrganisation(@Param("list") List<String> list);

	@Query("MATCH (p:ProfileId)-[r:employeeOf]->(c:Company) WITH p,SUM(toInteger(r.duration)) AS sum  WHERE sum >= {year} RETURN p ")
	public List<ProfileId> getByExperience(@Param("year") int year);

/*	@Query("MATCH (p:ProfileId)-[:hasSkill]->(s:Skill),(p)-[r:employeeOf]->(),(p)-[:livesIn]->(c:City) WHERE p.profileId = {profileId} RETURN p.profileId as profileId,collect(s.name) as skills,r.duration as experience,c.city as city")
	public Result getResultSet(@Param("profileId") String profileId);
*/
	@Query("MATCH (p:ProfileId)-[:hasSkill]->(s:Skill) WHERE p.profileId = {profileId} RETURN collect(s.name) ")
	public List<String> getSkill(@Param("profileId") String profileId);

	@Query("MATCH (p:ProfileId)-[r:employeeOf]->() WITH p,SUM(toInteger(r.duration)) as sum WHERE p.profileId = {profileId} RETURN toString(sum)")
	public String getDuration(@Param("profileId") String profileId);

	@Query("MATCH (p:ProfileId)-[:livesIn]->(c:City) WHERE p.profileId = {profileId} RETURN c.city")
	public String getCity(@Param("profileId") String profileId);

}
