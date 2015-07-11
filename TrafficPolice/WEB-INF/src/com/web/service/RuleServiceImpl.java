package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.RuleDao;
import com.web.pojo.Rule;
import com.web.service.interfaces.RuleService;

// 使用Service注解 不需要再在配置文件中配置bean
/**
 * @author wqg
 * 
 *         2013-9-9上午11:09:58
 */
@Service
public class RuleServiceImpl implements RuleService
{
	@Autowired
	private RuleDao ruleDao;

	/* 前台显示 */

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public ArrayList<Rule> selectAllList(int start, int pagesize)
	{
		return ruleDao.selectAllList(start, pagesize);
	}

	@Override
	public int selectCount()
	{
		// TODO Auto-generated method stub

		return ruleDao.selectCount();
	}

	@Override
	public Rule selectRuleInfoById(int id)
	{
		// TODO Auto-generated method stub

		return ruleDao.selectRuleInfoById(id);
	}

	/* 后台管理 */

	// 分页
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return ruleDao.getCountByAll(query);
	}

	@Override
	public List<Rule> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return ruleDao.selectPage(query);
	}

	@Override
	public List<Rule> queryAll()// 查询所有
	{
		// TODO Auto-generated method stub
		return ruleDao.queryAll();
	}

	@Override
	public int insertRule(Rule rule)// 插入新数据
	{
		// TODO Auto-generated method stub
		return ruleDao.insertRule(rule);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleService#queryDataById(java.lang.String)
	 */
	@Override
	public Rule queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return ruleDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return ruleDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleService#updateRule(com.web.pojo.Rule)
	 */
	@Override
	public int updateRule(Rule rule)
	{
		// TODO Auto-generated method stub
		return ruleDao.updateRule(rule);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleService#deleteDataByIds(java.lang.String)
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
			ruleDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Rule> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return ruleDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.RuleService#newOrUpdate(com.web.pojo.Rule)
	 */
	@Override
	public int newOrUpdate(Rule rule)
	{
		// TODO Auto-generated method stub
		return ruleDao.newOrUpdate(rule);
	}

}