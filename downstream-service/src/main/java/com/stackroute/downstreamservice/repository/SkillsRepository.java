package com.stackroute.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Skills;

@Repository
public interface SkillsRepository extends MongoRepository<Skills, String> {

}
