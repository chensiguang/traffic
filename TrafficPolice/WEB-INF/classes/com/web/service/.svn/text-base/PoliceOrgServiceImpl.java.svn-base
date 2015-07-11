package com.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.PoliceOrgDao;
import com.web.pojo.PoliceOrg;
import com.web.service.interfaces.PoliceOrgService;

/**
 * 交警部门
 * 
 * @author jjl date 2013/9/23
 */
public class PoliceOrgServiceImpl implements PoliceOrgService
{

	@Autowired
	private PoliceOrgDao policeOrgDao;

	/*
	 * 后台管理
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceOrgService#selectUsernameById(java.lang
	 * .String)
	 */
	@Override
	public List<PoliceOrg> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.selectUsernameById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.PoliceOrgService#queryAll()
	 */
	@Override
	public List<PoliceOrg> queryAll()
	{
		// TODO Auto-generated method stub
		return policeOrgDao.queryAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceOrgService#insertPoliceOrg(com.web.pojo
	 * .PoliceOrg)
	 */
	@Override
	public int insertPoliceOrg(PoliceOrg org)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.insertPoliceOrg(org);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceOrgService#queryDataById(java.lang.String
	 * )
	 */
	@Override
	public PoliceOrg queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.queryDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceOrgService#deleteDataById(java.lang.
	 * String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.deleteDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceOrgService#deleteDataByIds(java.lang
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
			policeOrgDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceOrgService#updatePoliceOrg(com.web.pojo
	 * .PoliceOrg)
	 */
	@Override
	public int updatePoliceOrg(PoliceOrg org)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.updatePoliceOrg(org);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.getCountByAll(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<PoliceOrg> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.selectPage(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceOrgService#newOrUpdate(com.web.pojo.
	 * PoliceOrg)
	 */
	@Override
	public int newOrUpdate(PoliceOrg org)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.newOrUpdate(org);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.PoliceOrgService#queryAllByDwid(long)
	 */
	@Override
	public List<PoliceOrg> queryAllByDwid(long dwid)
	{
		// TODO Auto-generated method stub
		return policeOrgDao.queryAllByDwid(dwid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.PoliceOrgService#selectAll()
	 */
	@Override
	public List<PoliceOrg> selectAll()
	{
		// TODO Auto-generated method stub
		return policeOrgDao.selectAll();
	}

}
