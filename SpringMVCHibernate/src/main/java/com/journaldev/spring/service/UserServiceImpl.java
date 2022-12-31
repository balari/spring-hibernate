package com.journaldev.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.UserDAO;
import com.journaldev.spring.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	
	  public void setUserDAO(UserDAO userDAO) { this.userDAO = userDAO; }
	 
	@Override
	@Transactional
	public void saveUser(User u) {
		this.userDAO.saveUser(u);
	}

}
