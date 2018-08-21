package com.stackroute.matchmaker.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Login;
import com.stackroute.matchmaker.model.Registration;
import com.stackroute.matchmaker.model.Token;
import com.stackroute.matchmaker.service.RegisterUserImpl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin("*")
@RequestMapping("/api/v1")
@RestController
public class LoginController {


	private RegisterUserImpl registerUser;

	@Autowired
	public LoginController(RegisterUserImpl registerUser) {
		super();
		this.registerUser = registerUser;
	}

	@PostMapping("/login")
	public ResponseEntity<?>  loginUser(@RequestBody Login login) throws ServletException, UserNameAlreadyExistsException {

		String token = "";

		if (login.getUsername() == null || login.getPassword() == null) {
			throw new ServletException("Please fill in username and password");
		}

		String username = login.getUsername();
		String password = login.getPassword();

		Registration user = registerUser.findByUserName(username);

		if (user == null) {
			throw new ServletException("User email not found.");
		}

		String pwd = user.getPassword();

		if (!password.equals(pwd)) {
			throw new ServletException("Invalid login. Please check your name and password.");
		}

		token = Jwts.builder().setSubject(username).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "nogamenolife").compact();
        
		Token t = new Token();
		t.setUsername(username);
		t.setToken(token);
		
		return new ResponseEntity<Token>(t, HttpStatus.CREATED);
	}

}
