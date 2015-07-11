/**
 * Project Name:TrafficPolice
 * File Name:RuleIllegalService.java
 * Package Name:com.web.service.interfaces
 * Date:2013-7-17下午01:16:11
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.RuleIllegal;
import com.web.service.BaseService;

/**
 * ClassName:RuleIllegalService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 下午01:16:11 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public interface RuleIllegalService extends BaseService<RuleIllegal>
{
    /**
     * @author:ws
     * @Description: selectIllegalList(违法列表)
     * @param @param start
     * @param @param pagesize
     * @param @return 参数类型
     * @return ArrayList<RuleIllegal> 返回类型
     * @date 2013-7-23下午03:10:38
     * @throws
     */
    ArrayList<RuleIllegal> selectIllegalList(int start, int pagesize);

    /**
     * @author:ws
     * @Description: selectIllegalInfoById(违法详情)
     * @param @param id
     * @param @return 参数类型
     * @return RuleIllegal 返回类型
     * @date 2013-7-23下午03:10:53
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
    
    RuleIllegal queryDataById(String id);//查找单条数据
    
    int deleteDataById(String id);//删除单条数据
    
    void deleteDataByIds(String ids);//批量删除
    
    int updateRuleIllegal(RuleIllegal illegal);//更新数据
    
    List<RuleIllegal> selectUsernameById(String id);//查询admin的username
    
    int newOrUpdate(RuleIllegal illegal);// 查看新增或者修改是否重复
}
