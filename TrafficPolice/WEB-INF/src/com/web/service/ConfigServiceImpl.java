package com.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.ConfigMapper;
import com.web.pojo.Config;
import com.web.service.interfaces.IConfigService;

/**
 * 招聘岗位
 * 
 * @author yin 2013-3-28
 * 
 */
public class ConfigServiceImpl implements IConfigService
{

	@Autowired
	private ConfigMapper configMapper;

	@Override
	public List<Config> queryAll()
	{
		return configMapper.queryAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int insertConfig(Config c)
	{
		return configMapper.insert(c);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int updateConfig(Config c)
	{
		return configMapper.updateByPrimaryKeySelective(c);
	}

	@Override
	public Config queryDataById(String id)
	{
		return configMapper.selectByPrimaryKey(Integer.parseInt(id));
	}

	// 单个删除

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int deleteDataById(String id)
	{
		return configMapper.deleteByPrimaryKey(Integer.parseInt(id));
	}

	// 批量删除
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
			configMapper.deleteByPrimaryKey(Integer.parseInt(idsVal[i]));
		}
	}
	

	@Override
	public List<Config> queryIndexData()
	{
		return configMapper.selectIndex();
	}

	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		return configMapper.getCountByAll(query);
	}

	@Override
	public List<Config> selectPage(HashMap<String, Object> query)
	{
		return configMapper.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.IConfigService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Config> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return configMapper.selectUsernameById(Integer.parseInt(id));
	}

}
