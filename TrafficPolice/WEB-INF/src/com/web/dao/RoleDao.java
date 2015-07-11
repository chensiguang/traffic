package com.web.dao;

import java.util.List;
import com.web.pojo.Role;

/**角色管理
 * 
 * @author wqg
 * 
 *         2013-9-25下午1:55:48
 */
public interface RoleDao extends IBaseDao<Role>
{
	/* 后台管理 */

	List<Role> queryAll();// 查询所有
	
	List<Role> queryAllByDwType(long dwType);//通过单位的id查找角色

	int insertRole(Role role);// 插入新数据

	Role queryDataById(Integer id);// 查找单条数据

	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除

	int updateRole(Role role);// 更新数据
	
	 List<Role> selectUsernameById(Integer id);//查询admin的username
	 
	 int newOrUpdate(Role role);// 查看新增或者修改是否重复

	 Role selectDwtypeByRoleno(long roleno);//通过角色号查找角色所在的单位类型 0代表交警部门 1代表货运公司
}
