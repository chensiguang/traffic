package com.web.dao;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.Company;

/**
 * 企业管理
 * 
 * @author jjl date 2013/9/17
 */
public interface CompanyDao extends IBaseDao<Company> {

	/*
	 * 前台显示
	 */
	Company selectCompanyInfoById(Integer id);

	ArrayList<Company> selectCompanyList(int start, int pagesize);

	int selectCount();

	/*
	 * 后台管理
	 */
	List<Company> queryAll(); // 查询所有
	
	List<Company> queryComnameByDwid(Integer id);//通过单位id查找单位名
	
	List<Company> queryChildCompanyByDwid(long id);//通过单位id查找下属单位名
	
	int insertCompanyAndGetId(Company company); // 新增-提交，并且获取自增长Id号

	Company queryDataById(int id); // 修改-编辑

	int updateCompany(Company company); // 修改-提交

	int dropDataById(int id); // 单个删除

	int selectCompanyByComName(Company company); //查看企业名称是否重复
	
	List<Company> selectUsernameById(Integer id);//查询admin的username
	
	int addSafenum(int id);//增加安全组数量
	
	int plusSafenum(int id);//减少安全组数量
}
