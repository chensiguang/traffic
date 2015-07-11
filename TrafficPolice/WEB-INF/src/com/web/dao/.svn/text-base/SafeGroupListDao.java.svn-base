package com.web.dao;

import java.util.List;
import com.web.pojo.SafeGroupList;

/**
 * 安全组组别分类
 * 
 * @author jjl date 2013/9/23
 */
public interface SafeGroupListDao extends IBaseDao<SafeGroupList>
{

	/*
	 * 后台管理
	 */
	List<SafeGroupList> selectUsernameById(Integer id);// 查询admin的username

	List<SafeGroupList> queryAll();// 查询所有
	
	List<SafeGroupList> queryGroupnameByDwid(long dwid);//通过单位id查组名
	
	List<SafeGroupList> queryAllByDwid(long dwid);//通过单位id查组名
	
	List<SafeGroupList> queryGroupnameByGroupid(long groupid);//通过组id查组名
	
	List<SafeGroupList> queryByGroupid(long groupid);//通过组id查组名

	int insertSafeGroupList(SafeGroupList safeGroupList);// 插入新数据

	SafeGroupList queryDataById(Integer id);// 查找单条数据

	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除
	
	void updateFlag(Integer id);//修改人员，车辆分配标示符

	int updateSafeGroupList(SafeGroupList safeGroupList);// 更新数据

	int newOrUpdate(SafeGroupList safeGroupList);// 查看新增或者修改是否重复

}
