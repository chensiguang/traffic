/**
 * Project Name:TrafficPolice
 * File Name:BranchServiceImpl.java
 * Package Name:com.web.service
 * Date:2013-7-17下午05:09:12
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.dao.BranchDao;
import com.web.pojo.Branch;
import com.web.service.interfaces.BranchService;
/**
 * 快速处理点
 * 
 * @author wqg
 *
 * 2013-9-15上午10:01:13
 */
public class BranchServiceImpl implements BranchService
{
    @Autowired
    private BranchDao branchDao;

    @Override
    public ArrayList<Branch> selectBranchList(int start, int pagesize)
    {
        // TODO Auto-generated method stub

        return branchDao.selectBranchList(start, pagesize);
    }

    @Override
    public Branch selectBranchInfoById(int id)
    {
        // TODO Auto-generated method stub

        return branchDao.selectBranchInfoById(id);
    }

    @Override
    public int selectCount()
    {
        // TODO Auto-generated method stub

        return branchDao.selectCount();
    }

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.BranchService#queryAll()
	 */
	@Override
	public List<Branch> queryAll()
	{
		// TODO Auto-generated method stub
		return branchDao.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.BranchService#insertBranch(com.web.pojo.Branch)
	 */
	@Override
	public int insertBranch(Branch branch)
	{
		// TODO Auto-generated method stub
		return branchDao.insertBranch(branch);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.BranchService#queryDataById(java.lang.String)
	 */
	@Override
	public Branch queryDataById(String id)
	{
		// TODO Auto-generated method stub
		return branchDao.queryDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.BranchService#deleteDataById(java.lang.String)
	 */
	@Override
	public int deleteDataById(String id)
	{
		// TODO Auto-generated method stub
		return branchDao.deleteDataById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.BranchService#deleteDataByIds(java.lang.String)
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
			branchDao.deleteDataById(Integer.parseInt(idsVal[i]));
		}
		
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.BranchService#updateBranch(com.web.pojo.Branch)
	 */
	@Override
	public int updateBranch(Branch branch)
	{
		// TODO Auto-generated method stub
		return branchDao.updateBranch(branch);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#getCountByAll(java.util.HashMap)
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return branchDao.getCountByAll(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.BaseService#selectPage(java.util.HashMap)
	 */
	@Override
	public List<Branch> selectPage(HashMap<String, Object> query)
	{
		// TODO Auto-generated method stub
		return branchDao.selectPage(query);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.BranchService#selectUsernameById()
	 */
	@Override
	public List<Branch> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return branchDao.selectUsernameById(Integer.parseInt(id));
	}

}
