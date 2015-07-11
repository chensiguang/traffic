package com.web.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.dao.PoliceOrgCompanyDao;
import com.web.pojo.PoliceOrgCompany;
import com.web.service.interfaces.PoliceOrgCompanyService;

/**
 * 交警部门与公司
 * 
 * @author jjl date 2013/9/23
 */
public class PoliceOrgCompanyServiceImpl implements PoliceOrgCompanyService {

	@Autowired
	private PoliceOrgCompanyDao policeOrgCompanyDao;

	/*
	 * 后台管理
	 */

	@Override
	public int insertPoliceOrgCompany(PoliceOrgCompany policeOrgCompany) { // 新增-提交
		// TODO Auto-generated method stub
		return policeOrgCompanyDao.insertPoliceOrgCompany(policeOrgCompany);
	}

	@Override
	public int updatePoliceOrgCompany(PoliceOrgCompany policeOrgCompany) { // 修改-提交
		// TODO Auto-generated method stub
		return policeOrgCompanyDao.updatePoliceOrgCompany(policeOrgCompany);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.PoliceOrgCompanyService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<PoliceOrgCompany> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return policeOrgCompanyDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.PoliceOrgCompanyService#queryAllByDwid(long)
	 */
	@Override
	public List<PoliceOrgCompany> queryAllByDwid(long orgid)
	{
		// TODO Auto-generated method stub
		return policeOrgCompanyDao.queryAllByDwid(orgid);
	}

}
