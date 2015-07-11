package com.web.spring.service;

import com.web.spring.dao.UserDAO;
import com.web.spring.model.User;

public class UserService {

	private UserDAO userDAO;
	
	public void add(User user) {
		userDAO.save(user);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
	
}
