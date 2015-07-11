package com.web.spring.service;

import org.junit.Test;

import com.web.spring.dao.UserDAO;
import com.web.spring.model.User;
import com.web.spring.spring.BeanFactory;
import com.web.spring.spring.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext();
		
		UserService service = (UserService) factory.getBean("userService");
//		UserDAO userDao = (UserDAO) factory.getBean("u");
//		service.setUserDAO(userDao);
		
		User user = new User();	
		service.add(user);
	}
}
