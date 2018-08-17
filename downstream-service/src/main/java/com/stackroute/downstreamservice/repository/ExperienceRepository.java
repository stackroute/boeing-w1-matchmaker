package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Experience;

@Repository
public interface ExperienceRepository extends CassandraRepository<Experience,String> {

}
