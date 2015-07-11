/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service.interfaces;

import java.util.List;

import com.web.pojo.SafeGroupList;
import com.web.service.BaseService;

/**
 * 安全组组别分类
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:17:12
 */
public interface SafeGroupListService extends BaseService<SafeGroupList>
{
	/*
	 * 后台管理
	 */
	List<SafeGroupList> selectUsernameById(String id);// 查询admin的username

	List<SafeGroupList> queryAll();// 查询所有
	
	List<SafeGroupList> queryAllByDwid(String dwid);//通过单位id查组名
	
	List<SafeGroupList> queryByGroupid(String groupid);//通过组id查组名
	
	List<SafeGroupList> queryGroupnameByDwid(long dwid);//通过单位id查组名
	
	List<SafeGroupList> queryGroupnameByGroupid(long groupid);//通过组id查组名

	int insertSafeGroupList(SafeGroupList safeGroupList);// 插入新数据

	SafeGroupList queryDataById(String id);// 查找单条数据

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updateSafeGroupList(SafeGroupList safeGroupList);// 更新数据

	int newOrUpdate(SafeGroupList safeGroupLIst);// 查看新增或者修改是否重复
	
	void updateFlag(Integer id);//修改人员，车辆分配标示符
}
