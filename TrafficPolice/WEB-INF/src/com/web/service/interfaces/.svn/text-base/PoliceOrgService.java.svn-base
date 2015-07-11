package com.web.service.interfaces;

import java.util.List;

import com.web.pojo.PoliceOrg;
import com.web.service.BaseService;

/**
 * 交警部门
 * 
 * @author jjl date 2013/9/23
 */
public interface PoliceOrgService extends BaseService<PoliceOrg>
{

	/*
	 * 后台管理
	 */
	List<PoliceOrg> selectUsernameById(String id);// 查询admin的username

	List<PoliceOrg> queryAll();// 查询所有
	
	List<PoliceOrg> selectAll();//查询所有
	
	List<PoliceOrg> queryAllByDwid(long dwid);//通过单位id查找它的子类单位

	int insertPoliceOrg(PoliceOrg org);// 插入新数据

	PoliceOrg queryDataById(String id);// 查找单条数据

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updatePoliceOrg(PoliceOrg org);// 更新数据
	
	int newOrUpdate(PoliceOrg org);// 查看新增或者修改是否重复

}
