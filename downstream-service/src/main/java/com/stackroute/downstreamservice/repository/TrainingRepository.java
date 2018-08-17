package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Training;

@Repository
public interface TrainingRepository extends CassandraRepository<Training, String> {

}
