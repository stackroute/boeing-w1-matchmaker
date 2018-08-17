package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Location;

@Repository
public interface LocationRepository extends CassandraRepository<Location, String> {

}
