package com.web.dao;

import java.util.List;

import com.web.pojo.Permission;

/**
 * 权限管理
 * 
 * @author wqg
 * 
 *         2013-9-25下午3:22:45
 */
public interface PermissionDao extends IBaseDao<Permission>
{
	/* 后台管理 */

	List<Permission> queryAll();// 查询所有

	int insertPermission(Permission per);// 插入新数据

	Permission queryDataById(Integer id);// 查找单条数据

	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除

	int updatePermission(Permission per);// 更新数据

	public Permission findPermissionByPerno(long perno);// user和role_permission表关联查找权限码

	List<Permission> selectUsernameById(Integer id);// 查询admin的username
	
	int newOrUpdate(Permission per);// 查看新增或者修改是否重复

}
