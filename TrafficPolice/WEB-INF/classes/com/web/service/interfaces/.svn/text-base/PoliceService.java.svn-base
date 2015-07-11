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
import com.web.pojo.Police;
import com.web.pojo.PoliceOrg;
import com.web.service.BaseService;

/**
 * ClassName:PoliceService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-23<br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public interface PoliceService extends BaseService<Police>
{
	/**
	 * @author:ln
	 * @Description: selectPoliceList(交警基本信息列表)
	 * @param @param start
	 * @param @param pagesize
	 * @param @return 参数类型
	 * @return ArrayList<Driver> 返回类型
	 * @date 2013-9-23下午
	 * @throws
	 */
	ArrayList<Police> selectPoliceList(int start, int pagesize);

	/**
	 * @author:ln
	 * @Description: selectCount(交警总数)
	 * @param @param map
	 * @param @return 参数类型
	 * @return int 返回类型
	 * @date 2013-9-23
	 * @throws
	 */
	int selectCount(@SuppressWarnings("rawtypes") HashMap map);

	/**
	 * @author:ln
	 * @Description: selectDetailById(交警详情)
	 * @param @return 参数类型
	 * @return Police 返回类型
	 * @date 2013-9-23
	 * @throws
	 */
	Police selectDetailById(int id);

	/**
	 * 后台管理 /
	 * 
	 * /**
	 * 
	 * @author ln
	 * @Description:queryAll(查询所有交警总数)
	 * @param @return
	 * @return police
	 * @date 2013-09-23
	 */
	List<Police> queryAll();

	/**
	 * @author ln
	 * @Description:insertPolice(插入交警总数)
	 * @parma police
	 * @date 2013-09-23
	 * */
	int insertPolice(Police police);

	/**
	 * @author ln
	 * @Description: QueryDataByID(交警详情)
	 * @param： id
	 * @return police
	 * */
	Police queryDataById(String id);

	/**
	 * @author ln
	 * @Description deleteDataById(删除一条交警信息)
	 * @param id
	 * */
	int deleteDataById(String id);

	/**
	 * @author ln
	 * @Description deleteDataByIds(批量删除多条记录)
	 * @param ids
	 *            (传递多个id的值)
	 * */
	void deleteDataByIds(String ids);

	/**
	 * @author ln
	 * @Description updateDriver(更新基本信息操作)
	 * @param polcie
	 *            (传递多个id的值)
	 * */
	int updatePolice(Police police);

	/**
	 * @author ln
	 * @Description queryPoliceByIdcard()
	 * @param polcie
	 *            (传递多个id的值)
	 * */
	int queryPoliceByIdcard(String idcard);

	List<Police> selectUsernameById(String id);// 查询admin的username
	
	ArrayList<Police> selectPoliceListByDwid(long dwid);//通过单位id查找交警

}
