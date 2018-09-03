package com.stackroute.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.stackroute.downstreamservice.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	@Query("{_id: '?0'}")
	public User getByUsername(String username);

}
