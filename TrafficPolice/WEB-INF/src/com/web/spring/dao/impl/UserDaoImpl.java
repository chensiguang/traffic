package com.web.spring.dao.impl;

import com.web.spring.dao.UserDAO;
import com.web.spring.model.User;

public class UserDaoImpl implements UserDAO {

	@Override
	public void save(User user) {

		System.out.println("user seved!");
	}

}
