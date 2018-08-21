package com.stackroute.matchmaker.model;

public class Token {
	private String token;
	private String username;
	
	public Token() {
		
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Token(String token, String username) {
		super();
		this.token = token;
		this.username = username;
	}

	
}
