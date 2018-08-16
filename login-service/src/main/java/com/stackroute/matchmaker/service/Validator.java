package com.stackroute.matchmaker.service;

import org.hibernate.SessionFactory;

import com.stackroute.matchmaker.model.Registration;

public class Validator {
	
	private SessionFactory sessionFactory;
	
	public boolean validateUser(String userId, String password) {
		Registration reg = (Registration)sessionFactory.getCurrentSession().createQuery("From User where userId=:id and userPassword=:pass").setParameter("id", userId).setParameter("pass", password).uniqueResult();
		if(reg!=null)
			return true;
		else 
			return false;
	}

}
