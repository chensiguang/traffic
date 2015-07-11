/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service.interfaces;

import java.util.List;

import com.web.pojo.RolePermission;
import com.web.service.BaseService;

/**
 * @author wqg
 * 
 *         2013-9-26下午2:56:53
 */
public interface RolePermissionService extends BaseService<RolePermission>
{
	/* 后台管理 */
	
	List<RolePermission> queryAll(String id);//根据id查找所有

	int insertRolePermission(RolePermission rp);// 插入新数据

	RolePermission queryDataById(String id);// 查找单条数据

	int updateRolePermission(RolePermission rp);// 更新数据

	List<RolePermission> selectUsernameById(String id);// 查询admin的username
	
	List<RolePermission> findRolePermissionByRoleno(long roleno);//user和role_permission表关联
	
	List<RolePermission> findPermissionByRoleno(long roleno);//user和role_permission表关联查找权限码
	
	void deletePermission(String roleno);//删除权限
}
