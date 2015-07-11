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

import com.web.dao.InterchangeDao;
import com.web.pojo.Interchange;
import com.web.service.interfaces.InterchangeService;

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
public class InterchangeServiceImpl implements InterchangeService
{
    @Autowired
    private InterchangeDao interchangeDao;

    @Override
    public ArrayList<Interchange> selectInterchangeList(int start, int pagesize)
    {
        // TODO Auto-generated method stub
        return interchangeDao.selectInterchangeList(start, pagesize);
    }

    @Override
    public int selectCount(HashMap map)
    {
        // TODO Auto-generated method stub

        return interchangeDao.selectCount(map);
    }

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return interchangeDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Interchange> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return interchangeDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.InterchangeService#queryAll()
	 */
	@Override
	public List<Interchange> queryAll()
	{
		// TODO Auto-generated method stub
		return interchangeDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.InterchangeService#insertInterchange(com.web.pojo.Interchange)
	 */
	@Override
	public int insertInterchange(Interchange interchange)
	{
		// TODO Auto-generated method stub
		return interchangeDao.insertInterchange(interchange);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.InterchangeService#queryDataById(java.lang.String)
	 */
	@Override
	public List<Interchange> queryDataById(String id)
	//public Interchange queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return interchangeDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.InterchangeService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return interchangeDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.InterchangeService#deleteDataByIds(java.lang.String)
	 */
	@Override
	public void deleteDataByIds(String ids)
	{
		// TODO Auto-generated method stub
		
		if(ids.endsWith("#"))
		{
			ids = ids.substring(0,ids.length() - 1);//把ids最后一个#去掉
		}
		String[] idsVal = ids.split("#");//把ids以#分割
		for(int i = 0; i < idsVal.length; i++)
		{
			interchangeDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.InterchangeService#updateInterchange(com.web.pojo.Interchange)
	 */
	@Override
	public int updateInterchange(Interchange interchange)
	{
		// TODO Auto-generated method stub
		return interchangeDao.updateInterchange(interchange);
	}
	
	@Override
	public Interchange queryEditDataById(String id)
	{
		// TODO Auto-generated method stub
		return interchangeDao.queryEditDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.InterchangeService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Interchange> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return interchangeDao.selectUsernameById(Integer.parseInt(id));
	}

    
    

}
