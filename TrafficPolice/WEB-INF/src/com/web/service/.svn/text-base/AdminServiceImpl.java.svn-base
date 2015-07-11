/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.AdminDao;
import com.web.pojo.Admin;
import com.web.service.interfaces.AdminService;

/**
 * @author wqg
 *
 * 2013-9-9上午9:03:44
 */
@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	private AdminDao adminDao;
	
	@Override
	public Admin findAdminsByName(String loginname)
	{
		// TODO Auto-generated method stub
		return adminDao.findUserByName(loginname);
	}

}
