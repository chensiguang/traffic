/**
 * Project Name:TrafficPolice
 * File Name:EduVideoServiceImpl.java
 * Package Name:com.web.service
 * Date:2013-7-17下午02:00:43
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.EduVideoDao;
import com.web.pojo.EduVideo;
import com.web.service.interfaces.EduVideoService;

/**
 * ClassName:EduVideoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 下午02:00:43 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class EduVideoServiceImpl implements EduVideoService
{
    @Autowired
    private EduVideoDao eduVideoDao;

    @Override
    public ArrayList<EduVideo> selectVideoList(int start, int pagesize)
    {
        // TODO Auto-generated method stub

        return eduVideoDao.selectVideoList(start, pagesize);
    }

    @Override
    public EduVideo selectVideoDetailById(int id)
    {
        // TODO Auto-generated method stub

        return eduVideoDao.selectVideoDetailById(id);
    }

    @Override
    public int selectCount()
    {
        // TODO Auto-generated method stub

        return eduVideoDao.selectCount();
    }

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#queryAll()
	 */
	@Override
	public List<EduVideo> queryAll()
	{
		// TODO Auto-generated method stub
		return eduVideoDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<EduVideo> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#insertEduVideo(com.web.pojo.EduVideo)
	 */
	@Override
	public int insertEduVideo(EduVideo edu)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.insertEduVideo(edu);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#queryDataById(java.lang.String)
	 */
	@Override
	public EduVideo queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#deleteDataByIds(java.lang.String)
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
			eduVideoDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#updateEduVideo(com.web.pojo.EduVideo)
	 */
	@Override
	public int updateEduVideo(EduVideo edu)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.updateEduVideo(edu);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<EduVideo> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.EduVideoService#newOrUpdate(com.web.pojo.EduVideo)
	 */
	@Override
	public int newOrUpdate(EduVideo edu)
	{
		// TODO Auto-generated method stub
		return eduVideoDao.newOrUpdate(edu);
	}

}
