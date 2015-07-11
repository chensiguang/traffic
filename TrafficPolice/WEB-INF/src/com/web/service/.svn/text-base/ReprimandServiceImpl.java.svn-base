package com.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.ReprimandDao;
import com.web.pojo.Reprimand;
import com.web.service.interfaces.ReprimandService;

/**通报批评
 * @author wqg
 *
 * 2013-10-28下午3:42:39
 */
@Service
public class ReprimandServiceImpl implements ReprimandService
{

	@Autowired
	private ReprimandDao reDao;
	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return reDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Reprimand> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return reDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#queryAll()
	 */
	@Override
	public List<Reprimand> queryAll()
	{
		// TODO Auto-generated method stub
		return reDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#queryDataById(java.lang.String)
	 */
	@Override
	public Reprimand queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return reDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#insertReprimand(com.web.pojo.Reprimand)
	 */
	@Override
	public int insertReprimand(Reprimand re)
	{
		// TODO Auto-generated method stub
		return reDao.insertReprimand(re);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#updateReprimand(com.web.pojo.Reprimand)
	 */
	@Override
	public int updateReprimand(Reprimand re)
	{
		// TODO Auto-generated method stub
		return reDao.updateReprimand(re);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return reDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#deleteDataByIds(java.lang.String)
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
			reDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#updateFlag(java.lang.String)
	 */
	@Override
	public int updateFlag(String id)
	{
		// TODO Auto-generated method stub
		return reDao.updateFlag(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#queryAllByDwidAndType(java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Reprimand> queryAllByDwidAndType(HashMap<String, Object> map)
	{
		// TODO Auto-generated method stub
		return reDao.queryAllByDwidAndType(map);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.ReprimandService#distinctQueryAllByDwid(java.lang.String)
	 */
	@Override
	public List<Reprimand> distinctQueryAllByDwid()
	{
		// TODO Auto-generated method stub
		return reDao.distinctQueryAllByDwid();
	}

}
