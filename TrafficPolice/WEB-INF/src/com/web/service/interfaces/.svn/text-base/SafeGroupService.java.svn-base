/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service.interfaces;

import java.util.HashMap;
import java.util.List;

import com.web.pojo.SafeGroup;
import com.web.service.BaseService;

/**
 * 安全组
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:17:12
 */
public interface SafeGroupService extends BaseService<SafeGroup>
{
	/*
	 * 后台管理
	 */
	List<SafeGroup> selectUsernameById(String id);// 查询admin的username

	List<SafeGroup> queryAll();// 查询所有
	
	List<SafeGroup> queryByDwidGroupid(HashMap<String, String> query);//通过单位id，组id查找人员，车辆信息
	
	List<SafeGroup> queryAllByGroupId(long id);//通过安全组号级联查询安全分组表，以便于人员，车辆分配的修改
	List<SafeGroup> queryByGroupId(long id);//通过安全组号级联查询安全分组表，以便于人员，车辆分配的修改
	
	List<SafeGroup> queryComnameByDwid(String id);//通过单位id查找单位名

	int insertSafeGroup(SafeGroup safeGruop);// 插入新数据

	SafeGroup queryDataById(String id);// 查找单条数据

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updateSafeGroup(SafeGroup safeGruop);// 更新数据

	int newOrUpdate(SafeGroup safeGruop);// 查看新增或者修改是否重复
}
