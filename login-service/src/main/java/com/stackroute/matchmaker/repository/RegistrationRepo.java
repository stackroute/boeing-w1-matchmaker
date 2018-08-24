package com.stackroute.matchmaker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchmaker.model.Registration;

@Repository
public interface RegistrationRepo extends CrudRepository<Registration, Integer>{
	public Registration getUserByUsername(String username);
	public Registration getUserByEmail(String email);
}
