package com.stackroute.downstreamservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.downstreamservice.model.User;
import com.stackroute.downstreamservice.repository.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	private UserRepository userRepo;
	
	@Autowired
	public UserController(UserRepository userRepo) {
		
		this.userRepo = userRepo;
	}
	
	@GetMapping("/test")
	public ResponseEntity<?> test(){
		System.out.println("working fine.");
		return null;
	}
	
	@GetMapping("/user/{username}")
	public ResponseEntity<?> getUser(@PathVariable("username") String username){
				
		System.out.println("sdf");
		return new ResponseEntity<Optional<User>>(userRepo.findById(username),HttpStatus.OK);
		
	}
	
}
