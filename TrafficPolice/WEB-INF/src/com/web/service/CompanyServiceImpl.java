package com.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.dao.CompanyDao;
import com.web.pojo.Company;
import com.web.service.interfaces.CompanyService;

/**
 * 企业管理
 * 
 * @author jjl date 2013/9/18
 */
public class CompanyServiceImpl implements CompanyService {

	/*
	 * 前台显示
	 */
	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public Company selectCompanyInfoById(Integer id) {
		// TODO Auto-generated method stub
		return companyDao.selectCompanyInfoById(id);
	}

	@Override
	public ArrayList<Company> selectCompanyList(int start, int pagesize) {
		// TODO Auto-generated method stub
		return companyDao.selectCompanyList(start,pagesize);
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return companyDao.selectCount();
	}

	/*
	 * 后台管理
	 */
	@Override
	public int getCountByAll(HashMap<String, Object> query) { // 查询总记录数
		// TODO Auto-generated method stub
		return companyDao.getCountByAll(query);
	}

	@Override
	public List<Company> selectPage(HashMap<String, Object> query) { // 分页查询
		// TODO Auto-generated method stub
		return companyDao.selectPage(query);
	}

	@Override
	public List<Company> queryAll() { // 查询所有
		// TODO Auto-generated method stub
		return companyDao.queryAll();
	}

	@Override
	public int insertCompanyAndGetId(Company company) { // 新增-提交，并且获取自增长Id号
		// TODO Auto-generated method stub
		return companyDao.insertCompanyAndGetId(company);
	}

	@Override
	public Company queryDataById(String id) { // 修改-编辑
		// TODO Auto-generated method stub
		return companyDao.queryDataById(Integer.parseInt(id));
	}

	@Override
	public int updateCompany(Company company) { // 修改-提交
		// TODO Auto-generated method stub
		return companyDao.updateCompany(company);
	}

	@Override
	public int dropDataById(String id) { // 单个删除
		// TODO Auto-generated method stub
		return companyDao.dropDataById(Integer.parseInt(id));
	}

	@Override
	public void dropAllDataByIds(String ids) { // 批量删除
		// TODO Auto-generated method stub
		if (ids.endsWith("#")) {
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++) {
			companyDao.dropDataById(Integer.parseInt(idsVal[i]));
		}
	}

	@Override
	public int selectCompanyByComName(Company company) { //查看企业名称是否重复
		// TODO Auto-generated method stub
		return companyDao.selectCompanyByComName(company);
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CompanyService#selectUsernameById(java.lang.String)
	 */
	@Override
	public List<Company> selectUsernameById(String id)
	{
		// TODO Auto-generated method stub
		return companyDao.selectUsernameById(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CompanyService#queryComnameByDwid(java.lang.String)
	 */
	@Override
	public List<Company> queryComnameByDwid(String id)
	{
		// TODO Auto-generated method stub
		return companyDao.queryComnameByDwid(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CompanyService#addSafenum()
	 */
	@Override
	public int addSafenum(String id)
	{
		// TODO Auto-generated method stub
		return companyDao.addSafenum(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CompanyService#plusSafenum()
	 */
	@Override
	public int plusSafenum(String id)
	{
		// TODO Auto-generated method stub
		return companyDao.plusSafenum(Integer.parseInt(id));
	}

	/* (non-Javadoc)
	 * @see com.web.service.interfaces.CompanyService#queryqueryChildCompanyByDwidByDwid(long)
	 */
	@Override
	public List<Company> queryChildCompanyByDwid(long id)
	{
		// TODO Auto-generated method stub
		return companyDao.queryChildCompanyByDwid(id);
	}

}
