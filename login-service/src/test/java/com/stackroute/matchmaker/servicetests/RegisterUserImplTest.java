package com.stackroute.matchmaker.servicetests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.stackroute.matchmaker.exception.EmailAlreadyExistsException;
import com.stackroute.matchmaker.exception.UserNameAlreadyExistsException;
import com.stackroute.matchmaker.model.Registration;
import com.stackroute.matchmaker.repository.RegistrationRepo;
import com.stackroute.matchmaker.service.RegisterUserImpl;

public class RegisterUserImplTest {
	
	@Mock 
	private RegistrationRepo registerRepo;
	@InjectMocks
	private RegisterUserImpl register;
	
	private Registration registrant, registrant2;
	private Registration actualRegistrant;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		registrant = new Registration("max.freak989@gmail.com","password123","Maximillian78");
		registrant2 = new Registration("410DMon@gmail.com","password123","Dmitri34");

	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addUserTest() throws Exception{
		when(registerRepo.save(registrant)).thenReturn(registrant);
		actualRegistrant = register.addUser(registrant);
		assertEquals(actualRegistrant,registrant);
	}
	
	@Test
	public void checkForUserNameSuccessTest() throws UserNameAlreadyExistsException{
		when(registerRepo.getUserByUsername("Maximillian78")).thenReturn(registrant);
		actualRegistrant = register.checkForUserName(registrant2.getUsername());
		assertEquals(actualRegistrant,null);
	}
	
	@Test(expected = UserNameAlreadyExistsException.class)
	public void checkForUserNameFailure() throws UserNameAlreadyExistsException{
		when(registerRepo.getUserByUsername("Dmitri34")).thenReturn(registrant);
		actualRegistrant = register.checkForUserName(registrant2.getUsername());
		assertEquals(actualRegistrant,null);
	}
	
	@Test
	public void checkForEmailSuccessTest() throws EmailAlreadyExistsException{
		when(registerRepo.getUserByEmail("max.freak989@gmail.com")).thenReturn(registrant);
		actualRegistrant = register.checkForEmail(registrant2.getEmail());
		assertEquals(actualRegistrant,null);
	}
	
	@Test(expected = EmailAlreadyExistsException.class)
	public void checkForEmailFailureTest() throws EmailAlreadyExistsException{
		when(registerRepo.getUserByEmail("410DMon@gmail.com")).thenReturn(registrant);
		actualRegistrant = register.checkForEmail(registrant2.getEmail());
		assertEquals(actualRegistrant,null);
	}

}
