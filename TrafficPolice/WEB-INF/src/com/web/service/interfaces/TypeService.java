/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service.interfaces;

import java.util.List;
import com.web.pojo.Type;
import com.web.service.BaseService;

/**
 * @author wqg
 * 
 *         2013-9-25下午2:44:16
 * 
 */
public interface TypeService extends BaseService<Type>
{
	/* 后台管理 */

	List<Type> queryAll();// 查询所有

	int insertType(Type type);// 插入新数据

	Type queryDataById(String id);// 查找单条数据

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updateType(Type type);// 更新数据
	
	List<Type> selectUsernameById(String id);// 查询admin的username
	
	int newOrUpdate(Type type);// 查看新增或者修改是否重复
}
