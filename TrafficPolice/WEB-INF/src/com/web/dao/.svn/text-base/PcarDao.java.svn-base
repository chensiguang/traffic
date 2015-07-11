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
import com.web.pojo.Pcar;

/**
 * ClassName:PcarDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-23 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public interface PcarDao extends IBaseDao<Pcar>
{
	/**
	 * @author:ln
	 * @Description: selectPoliceList(某个用户管辖车辆信息列表)
	 * @param @param id(交警信息id)
	 * @param @param start
	 * @param @param pagesize
	 * @param @return 参数类型
	 * @return ArrayList<Police> 返回类型
	 * @date 2013-9-23
	 * @throws
	 */
	ArrayList<Pcar> selectPcarList(int id, int start, int pagesize);

	/**
	 * @author:ln
	 * @Description: selectCount(交警管辖车辆总数)
	 * @param @param int
	 * @param @param map
	 * @param @return 参数类型
	 * @return int 返回类型
	 * @date 2013-9-23
	 * @throws
	 */
	int selectCount(HashMap map, int id);

	/**
	 * 后台管理
	 * 
	 * */
	/**
	 * @author ln
	 * @Description:queryAll(查看一个交警管辖车辆的总数)
	 * @param @return
	 * @return police
	 * @date 2013-09-23
	 */
	List<Pcar> queryAll(int id);

	/**
	 * @author ln
	 * @Description:insertPolice(插入交警管辖车辆)
	 * @parma police
	 * @date 2013-09-23
	 * */
	int insertPcar(Pcar pcar);

	// 批量插入
	int insertPcars(Pcar pcar);

	/**
	 * @author ln
	 * @Description deleteDataById(移除一条管辖车辆)
	 * @param id
	 * */
	int deleteDataById(Integer id);

	/**
	 * @author ln
	 * @Description deleteDataByIds(批量删除多条记录)
	 * @param ids
	 *            (传递多个id的值)
	 * */
	void deleteDataByIds(Integer ids);

	/**
	 * @author ln
	 * @Description:querypcardata(插入管辖车辆之前查看是否有相同的数据已经插入系统中了)
	 * @param carid
	 * @param userid
	 * @return int类型的数据
	 * @date 2013-09-26
	 * */
	int querypcardata(String param1, String param2);

	List<Pcar> selectUsernameById(Integer id);// 查询admin的username

}
