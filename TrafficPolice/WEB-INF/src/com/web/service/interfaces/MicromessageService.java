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
import com.web.pojo.Micromessage;

/**
 * ClassName:MicromessageService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-5 上午9:46:18 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public interface MicromessageService
{
	/**
	 * @author:ln
	 * @Description: selectMicromessageList(微信互动列表)
	 * @param @param start
	 * @param @param pagesize
	 * @param @return 参数类型
	 * @return ArrayList<Driver> 返回类型
	 * @date 2013-9-5上午09:46:49
	 * @throws
	 */
	ArrayList<Micromessage> selectMicromessageList(int start, int pagesize);

	/**
	 * @author:ln
	 * @Description: selectCount(微信互动总数)
	 * @param @param map
	 * @param @return 参数类型
	 * @return int 返回类型
	 * @date 2013-9-9
	 * @throws
	 */
	int selectCount(HashMap map);

	List<Micromessage> selectUsernameById(String id);// 查询admin的username
}
