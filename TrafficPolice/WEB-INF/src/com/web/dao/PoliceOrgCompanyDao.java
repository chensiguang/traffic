package com.web.dao;

import java.util.List;
import com.web.pojo.PoliceOrgCompany;

/**
 * 交警部门与公司
 * 
 * @author jjl date 2013/9/23
 */
public interface PoliceOrgCompanyDao {

	/*
	 * 后台管理
	 */
	int insertPoliceOrgCompany(PoliceOrgCompany policeOrgCompany); // 新增-提交

	int updatePoliceOrgCompany(PoliceOrgCompany policeOrgCompany); // 修改-提交
	
	 List<PoliceOrgCompany> selectUsernameById(Integer id);// 查询admin的username
	 
	 List<PoliceOrgCompany> queryAllByDwid(long orgid);//根据交警的id查找管辖的企业id

}
