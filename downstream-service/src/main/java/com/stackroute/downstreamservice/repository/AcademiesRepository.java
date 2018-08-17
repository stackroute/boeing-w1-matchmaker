package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Academics;

@Repository
public interface AcademiesRepository extends CassandraRepository<Academics, String> {

}
