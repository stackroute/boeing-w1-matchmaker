package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Project;

@Repository
public interface ProjectRepository extends CassandraRepository<Project, String> {

}
