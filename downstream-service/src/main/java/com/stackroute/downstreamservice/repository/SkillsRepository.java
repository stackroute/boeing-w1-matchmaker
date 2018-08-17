package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Skills;

@Repository
public interface SkillsRepository extends CassandraRepository<Skills, String> {

}
