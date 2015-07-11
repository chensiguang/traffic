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
import com.web.dao.RoleDao;
import com.web.pojo.Role;
import com.web.service.interfaces.RoleService;

/**
 * @author wqg
 *
 * 2013-9-25下午1:58:47
 */
@Service
public class RoleServiceImpl implements RoleService
{
	@Autowired
	private RoleDao roleDao;
	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return roleDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Role> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return roleDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#queryAll()
	 */
	@Override
	public List<Role> queryAll()
	{
		// TODO Auto-generated method stub
		return roleDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#insertRole(com.web.pojo.Role)
	 */
	@Override
	public int insertRole(Role role)
	{
		// TODO Auto-generated method stub
		return roleDao.insertRole(role);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#queryDataById(java.lang.String)
	 */
	@Override
	public Role queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return roleDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return roleDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#deleteDataByIds(java.lang.String)
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
			roleDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#updateDriver(com.web.pojo.Role)
	 */
	@Override
	public int updateRole(Role role)
	{
		// TODO Auto-generated method stub
		return roleDao.updateRole(role);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Role> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return roleDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#newOrUpdate(com.web.pojo.Account)
	 */
	@Override
	public int newOrUpdate(Role role)
	{
		// TODO Auto-generated method stub
		return roleDao.newOrUpdate(role);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#queryAllByDwType(java.lang.String)
	 */
	@Override
	public List<Role> queryAllByDwType(long dwType)
	{
		// TODO Auto-generated method stub
		return roleDao.queryAllByDwType(dwType);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RoleService#selectDwtypeByRoleno(long)
	 */
	@Override
	public Role selectDwtypeByRoleno(long roleno)
	{
		// TODO Auto-generated method stub
		return roleDao.selectDwtypeByRoleno(roleno);
	}

}
