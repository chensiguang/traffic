package com.web.dao;

import java.util.List;
import com.web.pojo.SafeGroupCarDriver;

/**
 * 安全组驾驶员和车的对应关系
 * 
 * @author jjl date 2013/9/23
 */
public interface SafeGroupCarDriverDao extends IBaseDao<SafeGroupCarDriver>
{

	/*
	 * 后台管理
	 */
	List<SafeGroupCarDriver> selectUsernameById(Integer id);// 查询admin的username

	List<SafeGroupCarDriver> queryAll();// 查询所有

	List<SafeGroupCarDriver> queryComnameByDwid(Integer id);// 通过单位id查找单位名

	int insertSafeGroupCarDriver(SafeGroupCarDriver safeGruop);// 插入新数据

	SafeGroupCarDriver queryDataById(Integer id);// 查找单条数据

	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除

	int updateSafeGroupCarDriver(SafeGroupCarDriver safeGruop);// 更新数据

	int newOrUpdate(SafeGroupCarDriver safeGruop);// 查看新增或者修改是否重复
	
}
