package com.stackroute.matchmaker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.model.Registration;
import com.stackroute.matchmaker.repository.RegistrationRepo;


@Service
public class RegisterUserImpl implements RegisterUser{
	
	private RegistrationRepo registrationRepo; 
	
	@Autowired
	public RegisterUserImpl(RegistrationRepo registrationRepo) {
		this.registrationRepo = registrationRepo;
	}

	@Override
	public Registration addUser(Registration registrant) {
		return registrationRepo.save(registrant);		
	}

	@Override
	public Registration checkForUserName(String userName) {
		return registrationRepo.getUserByUsername(userName);
			
	}

	@Override
	public Registration checkForEmail(String email) {
		return registrationRepo.getUserByEmail(email);
	}	

}
