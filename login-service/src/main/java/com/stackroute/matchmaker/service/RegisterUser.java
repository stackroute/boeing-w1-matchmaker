package com.stackroute.matchmaker.service;


import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Registration;


public interface RegisterUser {
	
	public Registration checkForUserName(String userName) throws UserNameAlreadyExistsException;
	public Registration checkForEmail(String email) throws EmailAlreadyExistsException;
	public Registration addUser(Registration registrant);
	
}
