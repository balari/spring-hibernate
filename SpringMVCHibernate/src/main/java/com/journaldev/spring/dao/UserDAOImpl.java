package com.journaldev.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.User;

@Repository
public class UserDAOImpl implements  UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
//	public void setSessionFactory(SessionFactory sf){
//		this.sessionFactory = sf;
//	}

	@Override
	public void saveUser(User u) {

		Session session =this.sessionFactory.getCurrentSession();
		session.persist(u);
	}

	
}
