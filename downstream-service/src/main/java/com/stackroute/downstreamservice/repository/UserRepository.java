package com.stackroute.downstreamservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.stackroute.downstreamservice.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	public Optional<User> getByUsername(String username);

}
