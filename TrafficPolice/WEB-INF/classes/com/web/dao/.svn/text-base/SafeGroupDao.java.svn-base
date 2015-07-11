package com.web.dao;

import java.util.HashMap;
import java.util.List;

import com.web.pojo.SafeGroup;

/**
 * 安全组
 * 
 * @author jjl date 2013/9/23
 */
public interface SafeGroupDao extends IBaseDao<SafeGroup>
{

	/*
	 * 后台管理
	 */
	List<SafeGroup> selectUsernameById(Integer id);// 查询admin的username
	
	List<SafeGroup> queryAllByGroupId(long id);//通过安全组号级联查询安全分组表，以便于人员，车辆分配的修改
	List<SafeGroup> queryByGroupId(long id);//通过安全组号级联查询安全分组表，以便于人员，车辆分配的修改

	List<SafeGroup> queryAll();// 查询所有
	
	List<SafeGroup> queryByDwidGroupid(HashMap<String, String> query);//通过单位id，组id查找人员，车辆信息
	
	List<SafeGroup> queryComnameByDwid(Integer id);//通过单位id查找单位名

	int insertSafeGroup(SafeGroup safeGruop);// 插入新数据

	SafeGroup queryDataById(Integer id);// 查找单条数据

	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除

	int updateSafeGroup(SafeGroup safeGruop);// 更新数据

	int newOrUpdate(SafeGroup safeGruop);// 查看新增或者修改是否重复

}
