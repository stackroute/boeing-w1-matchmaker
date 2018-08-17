package com.stackroute.matchmaker.controllertests;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.matchmaker.controller.RegistrationController;
import com.stackroute.matchmaker.model.Registration;
import com.stackroute.matchmaker.service.RegisterUserImpl;

@RunWith(SpringRunner.class)
@WebAppConfiguration
public class RegistrationControllerTests {
	
	private MockMvc mockMvc;
	private Registration registrant;
	@Autowired
	private MockHttpSession session1, session2;
	
	@Mock
    private KafkaTemplate<String, Registration> kafkaTemplate;
	
	@Mock
	private RegisterUserImpl registerUser; 
	
	@InjectMocks
	private RegistrationController registrationController = new RegistrationController(registerUser); 
	
	@Before
	public void setup() throws Exception{
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(registrationController).build();
		registrant = new Registration("max.freak989@gmail.com","password123","Maximillian78");
		session1.setAttribute("loggedInUsername", registrant.getUsername());
		session2.setAttribute("loggedInEmail", registrant.getEmail());
	}
	@Test
	public void addUserTest() throws Exception {
		when(registerUser.addUser(registrant)).thenReturn(registrant);
		when(kafkaTemplate.send("CassandraRegistration",registrant)).thenReturn(null);
		mockMvc.perform(post("/api/v1/register").contentType(MediaType.APPLICATION_JSON).content(asJsonString(registrant)))
				.andExpect(status().isCreated()).andDo(print());
	}
	
	@Test
	public void checkUserNameTest() throws Exception {
	   when(registerUser.checkForUserName("Maximillian78")).thenReturn(registrant);
	   mockMvc.perform(get("/api/v1/register/check/userName/{userName}", registrant.getUsername()).session(session1)).andExpect(status().isOk()).andDo(print());
	}
	
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
