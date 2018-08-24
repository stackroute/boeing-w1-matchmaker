package com.stackroute.matchmaker.exception;

public class UserNameAlreadyExistsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UserNameAlreadyExistsException(String message) {
		super(message);
	}

}
