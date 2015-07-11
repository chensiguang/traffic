package com.web.service.interfaces;

import java.util.List;
import com.web.pojo.Area;
import com.web.service.BaseService;

/**
 * 地区
 * 
 * @author jjl date 2013/9/24
 */

public interface AreaService extends BaseService<Area> {

	/*
	 * 后台管理
	 */
	List<Area> queryAll(); // 查询所有地区

	List<Area> selectUsernameById(String id);// 查询admin的username

	Area queryDataById(int id); // 修改-编辑

	void dropDataByIds(String ids);// 批量删除

	int selectAreaByAreaName(Area area); //查看地域名称是否重复

	int updateArea(Area area); // 修改-提交

	int insertArea(Area area); // 新增-提交

	int dropDataById(String id);// 单个删除
}
