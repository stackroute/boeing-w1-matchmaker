package com.stackroute.downstreamservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.PersonalInfo;

@Repository
public interface PersonalInfoRepository extends CassandraRepository<PersonalInfo, String>{

}
