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

import com.web.dao.TypeDao;
import com.web.pojo.Type;
import com.web.service.interfaces.TypeService;

/**类型
 * @author wqg
 *
 * 2013-9-25下午2:45:42
 */
@Service
public class TypeServiceImpl implements TypeService
{

	@Autowired
	private TypeDao typeDao;
	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return typeDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Type> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return typeDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#queryAll()
	 */
	@Override
	public List<Type> queryAll()
	{
		// TODO Auto-generated method stub
		return typeDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#insertType(com.web.pojo.Type)
	 */
	@Override
	public int insertType(Type type)
	{
		// TODO Auto-generated method stub
		return typeDao.insertType(type);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#queryDataById(java.lang.String)
	 */
	@Override
	public Type queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return typeDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return typeDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#deleteDataByIds(java.lang.String)
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
			typeDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#updateType(com.web.pojo.Type)
	 */
	@Override
	public int updateType(Type type)
	{
		// TODO Auto-generated method stub
		return typeDao.updateType(type);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Type> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return typeDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.TypeService#newOrUpdate(com.web.pojo.Type)
	 */
	@Override
	public int newOrUpdate(Type type)
	{
		// TODO Auto-generated method stub
		return typeDao.newOrUpdate(type);
	}

}
