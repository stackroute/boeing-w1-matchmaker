package com.stackroute.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location, String> {

}
