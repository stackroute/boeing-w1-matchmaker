package com.stackroute.matchmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Registration;
import com.stackroute.matchmaker.service.RegisterUserImpl;

@CrossOrigin("*")
@RequestMapping("/api/v1")
@RestController
public class RegistrationController {
	
	private RegisterUserImpl registerUser;
	
	@Autowired
    private KafkaTemplate<String, Registration> kafkaTemplate;

    private static final String TOPIC = "CassandraRegistration";
	
	@Autowired
    public RegistrationController(RegisterUserImpl registerUser) {
		this.registerUser = registerUser;
	}

	@PostMapping("/register")
    public ResponseEntity<?> addUser(@RequestBody Registration registrant) {
    	registerUser.addUser(registrant);
    	kafkaTemplate.send(TOPIC , registrant);
		return new ResponseEntity<String>("New User Added",HttpStatus.CREATED);   	
    }
	
	@GetMapping("/register/check/userName/{userName}")
	public boolean checkUserName(@PathVariable("userName") String userName) {
		try
		{
			registerUser.checkForUserName(userName);
			return false;
		}
		catch(UserNameAlreadyExistsException e)
		{
			return true;
		}
	}
	
	@GetMapping("/register/check/email/{email}")
	public boolean checkEmail(@PathVariable("email") String email) {
		try
		{
			 registerUser.checkForEmail(email);
			 return false;
		}
		catch(EmailAlreadyExistsException e)
		{
			return true;
		}	
	}
    
}   
