/**
 * Project Name:TrafficPolice
 * File Name:DriverServiceImpl.java
 * Package Name:com.web.service
 * Date:2013-7-17上午10:25:10
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.PoliceDao;
import com.web.pojo.Police;
import com.web.pojo.PoliceOrg;
import com.web.service.interfaces.PoliceService;

/**
 * ClassName:DriverServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-23 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public class PoliceServiceImpl implements PoliceService
{
	@Autowired
	private PoliceDao policeDao;

	@Override
	public ArrayList<Police> selectPoliceList(int start, int pagesize)
	{
		// TODO Auto-generated method stub
		return policeDao.selectPoliceList(start, pagesize);
	}

	@Override
	public int selectCount(HashMap map)
	{
		// TODO Auto-generated method stub

		return policeDao.selectCount(map);
	}

	@Override
	public Police selectDetailById(int id)
	{
		// TODO Auto-generated method stub

		return policeDao.selectDetailById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.interfaces.DriverService#queryAll()
	 */
	@Override
	public List<Police> queryAll()
	{
		// TODO Auto-generated method stub
		return policeDao.queryAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.DriverService#insertDriver(com.web.pojo.Driver
	 * )
	 */
	@Override
	public int insertPolice(Police police)
	{
		// TODO Auto-generated method stub
		return policeDao.insertPolice(police);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.DriverService#queryDataById(java.lang.String)
	 */
	@Override
	public Police queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return policeDao.queryDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.DriverService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return policeDao.deleteDataById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.DriverService#deleteDataByIds(java.lang.String
	 * )
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
			policeDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.DriverService#updateDriver(com.web.pojo.Driver
	 * )
	 */
	@Override
	public int updatePolice(Police police)
	{
		// TODO Auto-generated method stub
		return policeDao.updatePolice(police);
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
		return policeDao.getCountByAll(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Police> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return policeDao.selectPage(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.DriverService#deleteDataById(java.lang.String)
	 */
	@Override
	public int queryPoliceByIdcard(String idcard)
	{
		// TODO Auto-generated method stub
		return policeDao.queryPoliceByIdcard(idcard);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceService#selectUsernameById(java.lang
	 * .String)
	 */
	@Override
	public List<Police> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return policeDao.selectUsernameById(Integer.parseInt(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.web.service.interfaces.PoliceService#selectPoliceListByDwid(long)
	 */
	@Override
	public ArrayList<Police> selectPoliceListByDwid(long dwid)
	{
		// TODO Auto-generated method stub
		return policeDao.selectPoliceListByDwid(dwid);
	}

}
