/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service.interfaces;

import java.util.List;
import com.web.pojo.SafeGroupCarDriver;
import com.web.service.BaseService;

/**
 * 安全组驾驶员和车辆的对应关系
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:17:12
 */
public interface SafeGroupCarDriverService extends BaseService<SafeGroupCarDriver>
{
	/*
	 * 后台管理
	 */
	List<SafeGroupCarDriver> selectUsernameById(String id);// 查询admin的username

	List<SafeGroupCarDriver> queryAll();// 查询所有

	List<SafeGroupCarDriver> queryComnameByDwid(String id);// 通过单位id查找单位名
	
	int insertSafeGroupCarDriver(SafeGroupCarDriver safeGruop);// 插入新数据

	SafeGroupCarDriver queryDataById(String id);// 查找单条数据

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updateSafeGroupCarDriver(SafeGroupCarDriver safeGruop);// 更新数据

	int newOrUpdate(SafeGroupCarDriver safeGruop);// 查看新增或者修改是否重复
}
