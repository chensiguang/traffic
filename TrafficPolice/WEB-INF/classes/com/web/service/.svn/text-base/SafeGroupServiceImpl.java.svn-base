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

import com.web.dao.SafeGroupDao;
import com.web.pojo.SafeGroup;
import com.web.service.interfaces.SafeGroupService;

/**
 * @author wqg
 * 
 *         2013-10-12下午1:18:11
 */
@Service
public class SafeGroupServiceImpl implements SafeGroupService
{

	@Autowired
	private SafeGroupDao safeGropDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return safeGropDao.getCountByAll(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<SafeGroup> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return safeGropDao.selectPage(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupService#selectUsernameById(java.lang
	 * .String)
	 */
	@Override
	public List<SafeGroup> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return safeGropDao.selectUsernameById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.SafeGroupService#queryAll()
	 */
	@Override
	public List<SafeGroup> queryAll()
	{
		// TODO Auto-generated method stub
		return safeGropDao.queryAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupService#insertSafeGroup(com.web.pojo
	 * .SafeGroup)
	 */
	@Override
	public int insertSafeGroup(SafeGroup safeGruop)
	{
		// TODO Auto-generated method stub
		return safeGropDao.insertSafeGroup(safeGruop);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupService#queryDataById(java.lang.String
	 * )
	 */
	@Override
	public SafeGroup queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return safeGropDao.queryDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupService#deleteDataById(java.lang.
	 * String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return safeGropDao.deleteDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupService#deleteDataByIds(java.lang
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
			safeGropDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupService#updateSafeGroup(com.web.pojo
	 * .SafeGroup)
	 */
	@Override
	public int updateSafeGroup(SafeGroup safeGruop)
	{
		// TODO Auto-generated method stub
		return safeGropDao.updateSafeGroup(safeGruop);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupService#newOrUpdate(com.web.pojo.
	 * SafeGroup)
	 */
	@Override
	public int newOrUpdate(SafeGroup safeGruop)
	{
		// TODO Auto-generated method stub
		return safeGropDao.newOrUpdate(safeGruop);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupService#queryComnameByDwid(java.lang.String)
	 */
	@Override
	public List<SafeGroup> queryComnameByDwid(String id)
	{
		// TODO Auto-generated method stub
		return safeGropDao.queryComnameByDwid(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupService#queryByDwidGroupid(java.util.HashMap)
	 */
	@Override
	public List<SafeGroup> queryByDwidGroupid(HashMap<String, String> query)
	{
		// TODO Auto-generated method stub
		return safeGropDao.queryByDwidGroupid(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupService#queryAllById(java.lang.String)
	 */
	@Override
	public List<SafeGroup> queryAllByGroupId(long id)
	{
		// TODO Auto-generated method stub
		return safeGropDao.queryAllByGroupId(id);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupService#queryByGroupId(long)
	 */
	@Override
	public List<SafeGroup> queryByGroupId(long id)
	{
		// TODO Auto-generated method stub
		return safeGropDao.queryByGroupId(id);
	}


}
