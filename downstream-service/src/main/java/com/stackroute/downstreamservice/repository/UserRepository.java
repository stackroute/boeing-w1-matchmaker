package com.stackroute.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.stackroute.downstreamservice.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
