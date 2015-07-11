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

import com.web.dao.PermissionDao;
import com.web.pojo.Permission;
import com.web.service.interfaces.PermissionService;

/**
 * 权限管理
 * 
 * @author wqg
 * 
 *         2013-9-25下午3:30:12
 */
@Service
public class PermissionServiceImpl implements PermissionService
{
	@Autowired
	private PermissionDao perssionDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return perssionDao.getCountByAll(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Permission> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return perssionDao.selectPage(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.PermissionService#queryAll()
	 */
	@Override
	public List<Permission> queryAll()
	{
		// TODO Auto-generated method stub
		return perssionDao.queryAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PermissionService#insertPermission(com.web
	 * .pojo.Permission)
	 */
	@Override
	public int insertPermission(Permission per)
	{
		// TODO Auto-generated method stub
		return perssionDao.insertPermission(per);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PermissionService#queryDataById(java.lang.
	 * String)
	 */
	@Override
	public Permission queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return perssionDao.queryDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PermissionService#deleteDataById(java.lang
	 * .String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return perssionDao.deleteDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PermissionService#deleteDataByIds(java.lang
	 * .String)
	 */
	@Override
	public void deleteDataByIds(String ids)
	{
		// TODO Auto-generated method stub
		if (ids.endsWith("#"))
		{
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++)
		{
			perssionDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PermissionService#updatePermission(com.web
	 * .pojo.Permission)
	 */
	@Override
	public int updatePermission(Permission per)
	{
		// TODO Auto-generated method stub
		return perssionDao.updatePermission(per);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.PermissionService#findPermissionByRoleno(long)
	 */
	@Override
	public Permission findPermissionByPerno(long perno)
	{
		// TODO Auto-generated method stub
		return perssionDao.findPermissionByPerno(perno);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.PermissionService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Permission> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return perssionDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.PermissionService#newOrUpdate(com.web.pojo.Permission)
	 */
	@Override
	public int newOrUpdate(Permission per)
	{
		// TODO Auto-generated method stub
		return perssionDao.newOrUpdate(per);
	}


}
