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

import com.web.dao.PcarDao;
import com.web.pojo.Pcar;
import com.web.service.interfaces.PcarService;

/**
 * ClassName:PcarServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-24 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public class PcarServiceImpl implements PcarService
{
    @Autowired
    private PcarDao pcarDao;

    @Override
    public ArrayList<Pcar> selectPcarList(int id,int start, int pagesize)
    {
        // TODO Auto-generated method stub
        return pcarDao.selectPcarList(id,start, pagesize);
    }

    @Override
    public int selectCount(HashMap map,int id)
    {
        // TODO Auto-generated method stub

        return pcarDao.selectCount(map,id);
    }


	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#queryAll()
	 */
	@Override
	public List<Pcar> queryAll(int id)
	{
		// TODO Auto-generated method stub
		return pcarDao.queryAll(id);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#insertDriver(com.web.pojo.Driver)
	 */
	@Override
	public int insertPcar(Pcar pcar)
	{
		// TODO Auto-generated method stub
		return pcarDao.insertPcar(pcar);
	}
	


	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return pcarDao.deleteDataById(Integer.parseInt(id));
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
			pcarDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return pcarDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Pcar> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return pcarDao.selectPage(query);
	}
	
	/* (non-Javadoc)
	 * @see com.web.service.interfaces.DriverService#insertDriver(com.web.pojo.Driver)
	 */
	@Override
	public int querypcardata(String param1,String param2)
	{
		// TODO Auto-generated method stub
		return pcarDao.querypcardata(param1,param2);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.PcarService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Pcar> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return pcarDao.selectUsernameById(Integer.parseInt(id));
	}
	
}
