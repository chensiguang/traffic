package com.web.dao;

import java.util.List;

import com.web.pojo.RolePermission;

/**角色权限关联
 * 
 * @author wqg
 * 
 *         2013-9-25下午1:55:48
 */
public interface RolePermissionDao 
{
	/* 后台管理 */

	List<RolePermission> queryAll(Integer id);//根据id查找所有
	
	int insertRolePermission(RolePermission rp);// 插入新数据

	RolePermission queryDataById(Integer id);// 查找单条数据

	int updateRolePermission(RolePermission rp);// 更新数据
	
	List<RolePermission> selectUsernameById(Integer id);//查询admin的username
	 
	List<RolePermission> findRolePermissionByRoleno(long roleno);//user和role_permission表关联查询权限id
	
	List<RolePermission> findPermissionByRoleno(long roleno);//user和role_permission表关联查找权限码
	
	void deletePermission(Integer roleno);//删除权限

}
