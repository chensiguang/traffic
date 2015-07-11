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
import com.web.pojo.Pcar;
import com.web.service.BaseService;

/**
 * ClassName:PcarService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-24<br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public interface PcarService extends BaseService<Pcar>
{
    /**
     * @author:ln
     * @Description: selectPcarList(某个用户管辖车辆信息列表)
     * @param @param id(交警id)
     * @param @param start
     * @param @param pagesize
     * @param @return 参数类型
     * @return ArrayList<Driver> 返回类型
     * @date 2013-9-24下午
     * @throws
     */
    ArrayList<Pcar> selectPcarList(int id,int start, int pagesize);

    /**
     * @author:ln
     * @Description: selectCount(交警管辖车辆总数)
     * @param @param id(交警id)
     * @param @param map
     * @param @return 参数类型
     * @return int 返回类型
     * @date 2013-9-23
     * @throws
     */
    int selectCount(@SuppressWarnings("rawtypes") HashMap map,int id);

    
    /**
     * 后台管理
     * /
    
   /**
   * @author ln
   * @Description:queryAll(查看一个交警管辖车辆的总数)
   * @param @return 
   * @return pcar
   * @date 2013-09-24
   */
    List<Pcar> queryAll(int id);
    
    /**
     * @author ln
     * @Description:insertPolice(插入交警管辖车辆)
     * @parma police
     * @date 2013-09-23
     * */ 
    int insertPcar(Pcar pcar);
    
    
    
    /**
     * @author ln
     * @Description deleteDataById(删除一条交警信息)
     * @param id
     * */
    int deleteDataById(String id);
    
    /**
     * @author ln
     * @Description deleteDataByIds(批量删除多条记录)
     * @param ids(传递多个id的值)
     * */
    void deleteDataByIds(String ids);
   
    /**
     * @author ln
     * @Description querycardata(在插入新的数据之前，查看数据库中是否有数据)
     * @param carid和userid(传递多个id的值)
     * */

    int querypcardata(String param1,String param2);
    
    List<Pcar> selectUsernameById(String id);// 查询admin的username
}
