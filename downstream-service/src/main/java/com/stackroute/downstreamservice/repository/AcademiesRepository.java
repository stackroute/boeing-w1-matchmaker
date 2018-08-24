package com.stackroute.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.AcademicQualification;

@Repository
public interface AcademiesRepository extends MongoRepository<AcademicQualification,String> {

}
