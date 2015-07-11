
package com.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.SafeGroupCarDriverDao;
import com.web.pojo.SafeGroupCarDriver;
import com.web.pojo.SafeGroupList;
import com.web.service.interfaces.SafeGroupCarDriverService;

/**
 * @author wqg
 *
 * 2013-10-18下午2:28:53
 */
@Service
public class SafeGroupCarDriverServiceImpl implements SafeGroupCarDriverService
{
	@Autowired
	private SafeGroupCarDriverDao cardriverDao;
	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return cardriverDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<SafeGroupCarDriver> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return cardriverDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<SafeGroupCarDriver> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return cardriverDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#queryAll()
	 */
	@Override
	public List<SafeGroupCarDriver> queryAll()
	{
		// TODO Auto-generated method stub
		return cardriverDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#queryComnameByDwid(java.lang.String)
	 */
	@Override
	public List<SafeGroupCarDriver> queryComnameByDwid(String id)
	{
		// TODO Auto-generated method stub
		return cardriverDao.queryComnameByDwid(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#insertSafeGroupCarDriver(com.web.pojo.SafeGroupCarDriver)
	 */
	@Override
	public int insertSafeGroupCarDriver(SafeGroupCarDriver safeGruop)
	{
		// TODO Auto-generated method stub
		return cardriverDao.insertSafeGroupCarDriver(safeGruop);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#queryDataById(java.lang.String)
	 */
	@Override
	public SafeGroupCarDriver queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return cardriverDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return cardriverDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#deleteDataByIds(java.lang.String)
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
			cardriverDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}

	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#updateSafeGroupCarDriver(com.web.pojo.SafeGroupCarDriver)
	 */
	@Override
	public int updateSafeGroupCarDriver(SafeGroupCarDriver safeGruop)
	{
		// TODO Auto-generated method stub
		return cardriverDao.updateSafeGroupCarDriver(safeGruop);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.SafeGroupCarDriverService#newOrUpdate(com.web.pojo.SafeGroupCarDriver)
	 */
	@Override
	public int newOrUpdate(SafeGroupCarDriver safeGruop)
	{
		// TODO Auto-generated method stub
		return cardriverDao.newOrUpdate(safeGruop);
	}

}
