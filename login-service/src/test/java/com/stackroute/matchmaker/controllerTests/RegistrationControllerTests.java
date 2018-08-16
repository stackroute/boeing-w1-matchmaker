//package com.stackroute.matchmaker.controllerTests;
//
//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.stackroute.matchmaker.controller.RegistrationController;
//import com.stackroute.matchmaker.model.Registration;
//import com.stackroute.matchmaker.service.RegisterUser;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(RegistrationController.class)
//@WebAppConfiguration
//public class RegistrationControllerTests {
//	
//	@Autowired
//	private MockMvc mockMvc;
//	private Registration registrant;
//	
//	@MockBean
//	private RegisterUser registerUser;
//	
//	@InjectMocks
//	private RegistrationController registrationController;
//	
//	@Before
//	public void setup() throws Exception{
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
//
//}
