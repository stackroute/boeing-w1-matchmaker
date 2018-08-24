package com.stackroute.matchmaker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
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
	public Registration checkForUserName(String userName) throws UserNameAlreadyExistsException{
		Registration registrant = registrationRepo.getUserByUsername(userName);
		if(registrant==null)
		return registrant;			
		else 
		throw new UserNameAlreadyExistsException("User name already present");	
	}

	@Override
	public Registration checkForEmail(String email) throws EmailAlreadyExistsException {
		Registration registrant = registrationRepo.getUserByEmail(email);
		if(registrant==null)
		return registrant;
		else	
		throw new EmailAlreadyExistsException("Email already present");
		
	}
	
	@Override
	public Registration findByUserName(String userName) {
		Registration registrant = registrationRepo.getUserByUsername(userName);
		if(registrant==null)
	    return null;			
		else 
	    return registrant;
	}

}
