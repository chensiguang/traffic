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

import com.web.dao.DriverDao;
import com.web.pojo.Driver;
import com.web.service.interfaces.DriverService;

/**
 * ClassName:DriverServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 上午10:25:10 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class DriverServiceImpl implements DriverService
{
    @Autowired
    private DriverDao driverDao;

    @Override
    public ArrayList<Driver> selectDriverList(int start, int pagesize)
    {
        // TODO Auto-generated method stub
        return driverDao.selectDriverList(start, pagesize);
    }

    @Override
    public int selectCount(HashMap map)
    {
        // TODO Auto-generated method stub

        return driverDao.selectCount(map);
    }

    @Override
    public Driver selectDetailById(int id)
    {
        // TODO Auto-generated method stub

        return driverDao.selectDetailById(id);
    }

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#queryAll()
	 */
	@Override
	public List<Driver> queryAll()
	{
		// TODO Auto-generated method stub
		return driverDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#insertDriver(com.web.pojo.Driver)
	 */
	@Override
	public int insertDriver(Driver driver)
	{
		// TODO Auto-generated method stub
		return driverDao.insertDriver(driver);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#queryDataById(java.lang.String)
	 */
	@Override
	public Driver queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return driverDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return driverDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#deleteDataByIds(java.lang.String)
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
			driverDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#updateDriver(com.web.pojo.Driver)
	 */
	@Override
	public int updateDriver(Driver driver)
	{
		// TODO Auto-generated method stub
		return driverDao.updateDriver(driver);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return driverDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Driver> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return driverDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Driver> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return driverDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#selectDriverListByDwid(int, int, int)
	 */
	@Override
	public ArrayList<Driver> selectDriverListByDwid(String dwid)
	{
		// TODO Auto-generated method stub
		return driverDao.selectDriverListByDwid(Integer.parseInt(dwid));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#queryDataByDriverid(int)
	 */
	@Override
	public Driver queryDataByDriverid(int Driverid)
	{
		// TODO Auto-generated method stub
		return driverDao.queryDataByDriverid(Driverid);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#selectDrivernameByDwid(long)
	 */
	@Override
	public List<Driver> selectDrivernameByDwid(long dwid)
	{
		// TODO Auto-generated method stub
		return driverDao.selectDrivernameByDwid(dwid);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#queryNameById(long)
	 */
	@Override
	public List<Driver> queryNameById(long id)
	{
		// TODO Auto-generated method stub
		return driverDao.queryNameById(id);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#selectComnameByDwid(java.lang.String)
	 */
	@Override
	public List<Driver> selectComnameByDwid(String dwid)
	{
		// TODO Auto-generated method stub
		return driverDao.selectComnameByDwid(Integer.parseInt(dwid));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#insertCar(com.web.pojo.Driver)
	 */
	@Override
	public int insertCar(Driver driver)
	{
		// TODO Auto-generated method stub
		return driverDao.insertCar(driver);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#updateCar(com.web.pojo.Driver)
	 */
	@Override
	public int updateCar(Driver driver)
	{
		// TODO Auto-generated method stub
		return driverDao.updateCar(driver);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#queryAllComnameByDwid(java.lang.Integer)
	 */
	@Override
	public List<Driver> queryAllComnameByDwid(String dwid)
	{
		// TODO Auto-generated method stub
		return driverDao.queryAllComnameByDwid(Integer.parseInt(dwid));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#queryLearntime(long)
	 */
	@Override
	public Driver queryLearntime(long driverid)
	{
		// TODO Auto-generated method stub
		return driverDao.queryLearntime(driverid);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#updateLearntime(long)
	 */
	@Override
	public int updateLearntime(HashMap map)
	{
		// TODO Auto-generated method stub
		return driverDao.updateLearntime(map);
	}
}
