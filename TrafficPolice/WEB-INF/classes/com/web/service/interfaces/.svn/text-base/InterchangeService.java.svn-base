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
import com.web.pojo.Interchange;
import com.web.service.BaseService;

/**
 * ClassName:InterchangeService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-5 上午9:46:18 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public interface InterchangeService extends BaseService<Interchange>
{
    /**
     * @author:ln
     * @Description: selectInterchangeList(问题互动列表)
     * @param @param start
     * @param @param pagesize
     * @param @return 参数类型
     * @return ArrayList<Driver> 返回类型
     * @date 2013-9-5上午09:46:49
     * @throws
     */
    ArrayList<Interchange> selectInterchangeList(int start, int pagesize);

    /**
     * @author:ln
     * @Description: selectCount(问题互动总数)
     * @param @param map
     * @param @return 参数类型
     * @return int 返回类型
     * @date 2013-9-5上午9:52:13
     * @throws
     */
    int selectCount(HashMap map);
    
    /*后台管理*/
    
   List<Interchange> queryAll();//查询所有
   
   int insertInterchange(Interchange interchange);//插入新数据
   
   List<Interchange> queryDataById(String id);//查找单条数据
   //Interchange queryDataById(String id);
  
   Interchange queryEditDataById(String id);
   
   int deleteDataById(String id);//删除单条数据
   
   void deleteDataByIds(String ids);//批量删除
   
   int updateInterchange(Interchange interchange);//更新数据
   
   List<Interchange> selectUsernameById(String id);// 查询admin的username
}
