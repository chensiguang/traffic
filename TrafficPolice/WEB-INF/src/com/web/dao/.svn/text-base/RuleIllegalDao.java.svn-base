/**
 * Project Name:TrafficPolice
 * File Name:RuleIllegalDao.java
 * Package Name:com.web.dao
 * Date:2013-7-17下午01:14:06
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.dao;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.RuleIllegal;

/**
 * ClassName:RuleIllegalDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 下午01:14:06 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public interface RuleIllegalDao extends IBaseDao<RuleIllegal>
{
    /**
     * 
     * @author:ws
     * @Description: selectIllegalList(违法查询列表
     * @param @param start
     * @param @param pagesize
     * @param @return 参数类型
     * @return ArrayList<RuleIllegal> 返回类型
     * @date 2013-9-3上午09:09:34
     * @throws
     */
    ArrayList<RuleIllegal> selectIllegalList(int start, int pagesize);

    /**
     * 
     * @author:ws
     * @Description: selectIllegalInfoById(根据ID查询违法详情)
     * @param @param id
     * @param @return 参数类型
     * @return RuleIllegal 返回类型
     * @date 2013-9-3上午09:09:49
     * @throws
     */
    RuleIllegal selectIllegalInfoById(int id);

    /**
     * @author:ws
     * @Description: selectCount(违法查询列表总数)
     * @param @return 参数类型
     * @return int 返回类型
     * @date 2013-9-3上午09:10:21
     * @throws
     */
    int selectCount();
    
    
  /*后台管理*/
    
    List<RuleIllegal> queryAll();//查询所有
    
    int insertRuleIllegal(RuleIllegal illegal);//插入新数据
    
    RuleIllegal queryDataById(Integer id);//查找单条数据
    
    int deleteDataById(Integer id);//删除单条数据
    
    void deleteDataByIds(Integer ids);//批量删除
    
    int updateRuleIllegal(RuleIllegal illegal);//更新数据
    
    List<RuleIllegal> selectUsernameById(Integer id);//查询admin的username
    
    int newOrUpdate(RuleIllegal illegal);// 查看新增或者修改是否重复
}
