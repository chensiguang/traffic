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

import com.web.dao.SafeLearnDao;
import com.web.pojo.SafeLearn;
import com.web.service.interfaces.SafeLearnService;

/**
 * @author wqg
 *
 * 2013-11-4上午8:55:35
 */
@Service
public class SafeLearnServiceImpl implements SafeLearnService
{

	@Autowired
	private SafeLearnDao slDao;
	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<SafeLearn> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeLearnService#insertime(com.web.pojo.SafeLearn)
	 */
	@Override
	public int insertime(SafeLearn sl)
	{
		// TODO Auto-generated method stub
		return slDao.insertime(sl);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeLearnService#queryDataByid(java.lang.Integer)
	 */
	@Override
	public SafeLearn queryDataByid(String id)
	{
		// TODO Auto-generated method stub
		return slDao.queryDataByid(Integer.parseInt(id));
	}

}
