package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.stackroute.downstreamservice.model.User;

public interface UserRepository extends CassandraRepository<User, String> {

}
