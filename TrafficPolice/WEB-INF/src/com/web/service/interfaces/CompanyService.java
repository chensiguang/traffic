package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.Company;
import com.web.service.BaseService;

/**
 * 企业管理
 * 
 * @author jjl date 2013/9/18
 */
public interface CompanyService extends BaseService<Company>
{
	/*
	 * 前台显示
	 */
	ArrayList<Company> selectCompanyList(int start, int pagesize);

	Company selectCompanyInfoById(Integer id);

	int selectCount();

	/*
	 * 后台管理
	 */
	List<Company> queryAll(); // 查询所有
	
	List<Company> queryComnameByDwid(String id);//通过单位id查找单位名
	
	List<Company> queryChildCompanyByDwid(long id);//通过单位id查找下属单位名
	
	int insertCompanyAndGetId(Company company); // 新增-提交，并且获取自增长Id号

	Company queryDataById(String id); // 修改-编辑

	int updateCompany(Company company);// 修改-提交

	int dropDataById(String id); // 单个删除

	void dropAllDataByIds(String ids); // 批量删除

	int selectCompanyByComName(Company company); // 查看企业名称是否重复

	List<Company> selectUsernameById(String id);// 查询admin的username
	
	int addSafenum(String id);//增加安全组数量
	
	int plusSafenum(String id);//减少安全组数量

}
