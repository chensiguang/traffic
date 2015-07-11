/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.RolePermissionDao;
import com.web.pojo.RolePermission;
import com.web.service.interfaces.RolePermissionService;

/**
 * @author wqg
 * 
 *         2013-9-26下午2:57:59
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService
{
	@Autowired
	private RolePermissionDao rpDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.RolePermissionService#insertRolePermission
	 * (com.web.pojo.RolePermission)
	 */
	@Override
	public int insertRolePermission(RolePermission rp)
	{
		// TODO Auto-generated method stub
		return rpDao.insertRolePermission(rp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.RolePermissionService#queryDataById(java.lang
	 * .String)
	 */
	@Override
	public RolePermission queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return rpDao.queryDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.RolePermissionService#updateRolePermission
	 * (com.web.pojo.RolePermission)
	 */
	@Override
	public int updateRolePermission(RolePermission rp)
	{
		// TODO Auto-generated method stub
		return rpDao.updateRolePermission(rp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.RolePermissionService#selectUsernameById(java
	 * .lang.String)
	 */
	@Override
	public List<RolePermission> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return rpDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<RolePermission> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RolePermissionService#findRolePermissionByRoleno(long)
	 */
	@Override
	public List<RolePermission> findRolePermissionByRoleno(long roleno)
	{
		// TODO Auto-generated method stub
		return rpDao.findRolePermissionByRoleno(roleno);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RolePermissionService#findPermissionByRoleno(long)
	 */
	@Override
	public List<RolePermission> findPermissionByRoleno(long roleno)
	{
		// TODO Auto-generated method stub
		return rpDao.findPermissionByRoleno(roleno);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RolePermissionService#queryAll(java.lang.String)
	 */
	@Override
	public List<RolePermission> queryAll(String id)
	{
		// TODO Auto-generated method stub
		return rpDao.queryAll(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RolePermissionService#deletePermission()
	 */
	@Override
	public void deletePermission(String roleno)
	{
		// TODO Auto-generated method stub
		rpDao.deletePermission(Integer.parseInt(roleno));
		
	}


}
