/**
 * Project Name:TrafficPolice
 * File Name:DriverService.java
 * Package Name:com.web.service.interfaces
 * Date:2013-7-17上午10:24:18
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.web.pojo.Driver;
import com.web.service.BaseService;

/**
 * ClassName:DriverService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 上午10:24:18 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public interface DriverService extends BaseService<Driver>
{
	/**
	 * @author:ws
	 * @Description: selectDriverList(驾驶员列表)
	 * @param @param start
	 * @param @param pagesize
	 * @param @return 参数类型
	 * @return ArrayList<Driver> 返回类型
	 * @date 2013-7-23下午03:33:49
	 * @throws
	 */
	ArrayList<Driver> selectDriverList(int start, int pagesize);

	/**
	 * @author:ws
	 * @Description: selectCount(驾驶员总数)
	 * @param @param map
	 * @param @return 参数类型
	 * @return int 返回类型
	 * @date 2013-9-2上午11:16:13
	 * @throws
	 */
	int selectCount(@SuppressWarnings("rawtypes") HashMap map);

	/**
	 * @author:ws
	 * @Description: selectDetailById(驾驶员详情)
	 * @param @return 参数类型
	 * @return Driver 返回类型
	 * @date 2013-9-2上午11:16:59
	 * @throws
	 */
	Driver selectDetailById(int id);

	/* 后台管理 */

	List<Driver> queryAll();// 查询所有

	List<Driver> selectDrivernameByDwid(long dwid);// 通过单位id查找驾驶员

	List<Driver> selectComnameByDwid(String dwid);// 通过单位id查找单位名

	int insertDriver(Driver driver);// 插入新数据

	Driver queryDataById(String id);// 查找单条数据

	Driver queryDataByDriverid(int Driverid); // 通过Driverid查找人员信息

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updateDriver(Driver driver);// 更新数据

	List<Driver> selectUsernameById(String id);// 查询admin的username

	ArrayList<Driver> selectDriverListByDwid(String dwid);// 根据单位id查找本单位的人员

	List<Driver> queryNameById(long id);// 通过id查找姓名

	int insertCar(Driver driver);// 插入车辆分配新数据

	int updateCar(Driver driver);// 更新车辆分配
	
	List<Driver> queryAllComnameByDwid(String dwid);// 查询所有
	
	Driver queryLearntime(long driverid);//通过驾驶员id来增加驾驶员的安全教育学习时间 
	
	int updateLearntime(HashMap map);//通过驾驶员id来增加驾驶员的安全教育学习时间 

}
