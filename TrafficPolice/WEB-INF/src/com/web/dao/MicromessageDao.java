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
import com.web.pojo.Micromessage;

/**
 * ClassName:MicromessageDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-9 下午3:47 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public interface MicromessageDao
{
	/**
	 * @author:ln
	 * @Description: selectMicromessageList(微信互动信息列表)
	 * @param @param start
	 * @param @param pagesize
	 * @param @return 参数类型
	 * @return ArrayList<Micromessage> 返回类型
	 * @date 2013-09-05
	 * @throws
	 */
	ArrayList<Micromessage> selectMicromessageList(int start, int pagesize);

	/**
	 * @author:ln
	 * @Description: selectCount(微信互动总数)
	 * @param @param map
	 * @param @return 参数类型
	 * @return int 返回类型
	 * @date 2013-9-5上午9:04:13
	 * @throws
	 */
	int selectCount(HashMap map);

	List<Micromessage> selectUsernameById(Integer id);// 查询admin的username

}
