package com.web.dao;

import java.util.List;
import com.web.pojo.Type;

/**
 * 类型
 * 
 * @author wqg
 * 
 *         2013-9-25下午1:55:48
 */
public interface TypeDao extends IBaseDao<Type>
{
	/* 后台管理 */

	List<Type> queryAll();// 查询所有

	int insertType(Type type);// 插入新数据

	Type queryDataById(Integer id);// 查找单条数据

	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除

	int updateType(Type type);// 更新数据

	List<Type> selectUsernameById(Integer id);// 查询admin的username
	
	int newOrUpdate(Type type);// 查看新增或者修改是否重复

}
