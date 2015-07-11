package com.web.dao;

import java.util.List;
import com.web.pojo.Area;

/**
 * 地区
 * 
 * @author jjl date 2013/9/24
 */
public interface AreaDao extends IBaseDao<Area> {

	/*
	 * 后台管理
	 */
	List<Area> queryAll(); //查询所有地区
	
	List<Area> selectUsernameById(Integer id);//查询admin的username

	Area queryDataById(int id); //修改-编辑

	int dropDataById(int id); //批量删除、单个删除

	int selectAreaByAreaName(Area area); //查看地域名称是否重复

	int updateArea(Area area); //修改-提交

	int insertArea(Area area); //新增-提交
}
