package com.stackroute.matchmaker.service;

<<<<<<< HEAD

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
=======
>>>>>>> cd3411b64db9831ab585a0091eb96e2a0f583336
import com.stackroute.matchmaker.model.Registration;


public interface RegisterUser {
	
	public Registration checkForUserName(String userName);
	public Registration checkForEmail(String email);
	public Registration addUser(Registration registrant);
	
}
