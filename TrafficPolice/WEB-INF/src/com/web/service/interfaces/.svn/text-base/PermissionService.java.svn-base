package com.web.service.interfaces;

import java.util.List;
import com.web.pojo.Permission;
import com.web.service.BaseService;

/**权限管理
 * 
 * @author wqg
 * 
 *         2013-9-25下午3:24:25
 */
public interface PermissionService extends BaseService<Permission>
{
	/* 后台管理 */

	List<Permission> queryAll();// 查询所有

	int insertPermission(Permission per);// 插入新数据

	Permission queryDataById(String id);// 查找单条数据

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updatePermission(Permission per);// 更新数据
	
	public Permission findPermissionByPerno(long perno);//user和role_permission表关联查找权限码
	
	 List<Permission> selectUsernameById(String id);// 查询admin的username
	 
		int newOrUpdate(Permission per);// 查看新增或者修改是否重复

}
