package com.stackroute.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Experience;

@Repository
public interface ExperienceRepository extends MongoRepository<Experience,String> {

}
