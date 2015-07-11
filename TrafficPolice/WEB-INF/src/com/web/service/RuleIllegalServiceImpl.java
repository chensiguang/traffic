/**
 * Project Name:TrafficPolice
 * File Name:RuleIllegalServiceImpl.java
 * Package Name:com.web.service
 * Date:2013-7-17下午01:17:25
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.dao.RuleIllegalDao;
import com.web.pojo.RuleIllegal;
import com.web.service.interfaces.RuleIllegalService;

/**
 * ClassName:RuleIllegalServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 下午01:17:25 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class RuleIllegalServiceImpl implements RuleIllegalService
{
    @Autowired
    private RuleIllegalDao ruleIllegalDao;

    @Override
    public ArrayList<RuleIllegal> selectIllegalList(int start, int pagesize)
    {
        // TODO Auto-generated method stub

        return ruleIllegalDao.selectIllegalList(start, pagesize);
    }

    @Override
    public RuleIllegal selectIllegalInfoById(int id)
    {
        // TODO Auto-generated method stub

        return ruleIllegalDao.selectIllegalInfoById(id);
    }

    @Override
    public int selectCount()
    {
        // TODO Auto-generated method stub

        return ruleIllegalDao.selectCount();
    }

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<RuleIllegal> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#queryAll()
	 */
	@Override
	public List<RuleIllegal> queryAll()
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#insertRuleIllegal(com.web.pojo.RuleIllegal)
	 */
	@Override
	public int insertRuleIllegal(RuleIllegal illegal)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.insertRuleIllegal(illegal);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#queryDataById(java.lang.String)
	 */
	@Override
	public RuleIllegal queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#deleteDataByIds(java.lang.String)
	 */
	@Override
	public void deleteDataByIds(String ids)
	{
		if (ids.endsWith("#"))
		{
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++)
		{
			ruleIllegalDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#updateRuleIllegal(com.web.pojo.RuleIllegal)
	 */
	@Override
	public int updateRuleIllegal(RuleIllegal illegal)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.updateRuleIllegal(illegal);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<RuleIllegal> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleIllegalService#newOrUpdate(com.web.pojo.Rule)
	 */
	@Override
	public int newOrUpdate(RuleIllegal illegal)
	{
		// TODO Auto-generated method stub
		return ruleIllegalDao.newOrUpdate(illegal);
	}

}
