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

import com.web.dao.SafeGroupListDao;
import com.web.pojo.SafeGroupList;
import com.web.service.interfaces.SafeGroupListService;

/**安全组组别分类
 * @author wqg
 * 
 *         2013-10-15上午10:46:55
 */
@Service
public class SafeGroupListServiceImpl implements SafeGroupListService
{
	@Autowired
	private SafeGroupListDao listDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return listDao.getCountByAll(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<SafeGroupList> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return listDao.selectPage(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupListService#selectUsernameById(java
	 * .lang.String)
	 */
	@Override
	public List<SafeGroupList> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return listDao.selectUsernameById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.SafeGroupListService#queryAll()
	 */
	@Override
	public List<SafeGroupList> queryAll()
	{
		// TODO Auto-generated method stub
		return listDao.queryAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupListService#insertSafeGroupList(com
	 * .web.pojo.SafeGroupList)
	 */
	@Override
	public int insertSafeGroupList(SafeGroupList safeGroupList)
	{
		// TODO Auto-generated method stub
		return listDao.insertSafeGroupList(safeGroupList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupListService#queryDataById(java.lang
	 * .String)
	 */
	@Override
	public SafeGroupList queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return listDao.queryDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupListService#deleteDataById(java.lang
	 * .String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return listDao.deleteDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupListService#deleteDataByIds(java.
	 * lang.String)
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
			listDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupListService#updateSafeGroupList(com
	 * .web.pojo.SafeGroupList)
	 */
	@Override
	public int updateSafeGroupList(SafeGroupList safeGruopList)
	{
		// TODO Auto-generated method stub
		return listDao.updateSafeGroupList(safeGruopList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.SafeGroupListService#newOrUpdate(com.web.pojo
	 * .SafeGroupList)
	 */
	@Override
	public int newOrUpdate(SafeGroupList safeGruopList)
	{
		// TODO Auto-generated method stub
		return listDao.newOrUpdate(safeGruopList);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupListService#queryGroupnameByDwid(long)
	 */
	@Override
	public List<SafeGroupList> queryGroupnameByDwid(long groupid)
	{
		// TODO Auto-generated method stub
		return listDao.queryGroupnameByDwid(groupid);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupListService#queryGroupnameByGroupid(long)
	 */
	@Override
	public List<SafeGroupList> queryGroupnameByGroupid(long groupid)
	{
		// TODO Auto-generated method stub
		return listDao.queryGroupnameByGroupid(groupid);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupListService#updateFlag()
	 */
	@Override
	public void updateFlag(Integer id)
	{
		// TODO Auto-generated method stub
		listDao.updateFlag(id);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupListService#queryByGroupid(java.lang.String)
	 */
	@Override
	public List<SafeGroupList> queryByGroupid(String groupid)
	{
		// TODO Auto-generated method stub
		return listDao.queryByGroupid(Integer.parseInt(groupid));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupListService#queryAllByDwid(java.lang.String)
	 */
	@Override
	public List<SafeGroupList> queryAllByDwid(String dwid)
	{
		// TODO Auto-generated method stub
		return listDao.queryAllByDwid(Integer.parseInt(dwid));
	}

}
