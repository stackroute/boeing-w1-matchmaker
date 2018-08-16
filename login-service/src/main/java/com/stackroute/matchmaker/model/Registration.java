package com.stackroute.matchmaker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String email;
	private String password;
	private String username;
	
	public Registration() {
		
	}
	
	public Registration(String email, String password, String username) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String name) {
		this.username = name;
	}
	@Override
	public String toString() {
		return "Registration [email=" + email + ", password=" + password + ", userName=" + username + "]";
	}
	
	
}
