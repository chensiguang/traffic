/**
 * Project Name:TrafficPolice
 * File Name:DriverDao.java
 * Package Name:com.web.dao
 * Date:2013-7-17上午10:18:18
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.web.pojo.Interchange;

/**
 * ClassName:InerchangeDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-5 上午9:02:18 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public interface InterchangeDao extends IBaseDao<Interchange>
{
	/**
	 * @author:ln
	 * @Description: selectInterchangeList(问题互动信息列表)
	 * @param @param start
	 * @param @param pagesize
	 * @param @return 参数类型
	 * @return ArrayList<Driver> 返回类型
	 * @date 2013-09-05
	 * @throws
	 */
	ArrayList<Interchange> selectInterchangeList(int start, int pagesize);

	/**
	 * @author:ln
	 * @Description: selectCount(问题互动总数)
	 * @param @param map
	 * @param @return 参数类型
	 * @return int 返回类型
	 * @date 2013-9-5上午9:04:13
	 * @throws
	 */
	int selectCount(HashMap map);

	/* 后台管理 */

	List<Interchange> queryAll();// 查询所有

	int insertInterchange(Interchange interchange);// 插入新数据

	List<Interchange> queryDataById(Integer id);// 查找单条数据
	// Interchange queryDataById(Integer id);

	Interchange queryEditDataById(Integer id);

	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除

	int updateInterchange(Interchange interchange);// 更新数据

	List<Interchange> selectUsernameById(Integer id);// 查询admin的username

}
