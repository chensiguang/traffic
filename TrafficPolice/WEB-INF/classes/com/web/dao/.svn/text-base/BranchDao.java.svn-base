/**
 * Project Name:TrafficPolice
 * File Name:BranchDao.java
 * Package Name:com.web.dao
 * Date:2013-7-17下午05:07:09
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.dao;

import java.util.ArrayList;
import java.util.List;

import com.web.pojo.Branch;

/**
 * ClassName:BranchDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 下午05:07:09 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public interface BranchDao extends IBaseDao<Branch>
{
    /**
     * @author:ws
     * 
     * @Description: selectBranchList(快速处理点)
     * @param start
     * @param pagesize
     * @return ArrayList<Branch> 返回类型
     * @date 2013-7-17下午05:07:49
     * @throws
     */
    ArrayList<Branch> selectBranchList(int start, int pagesize);

    /**
     * @author:ws
     * @Description: selectCount(快速处理点总数)
     * @param @return 参数类型
     * @return int 返回类型
     * @date 2013-9-3下午01:30:16
     * @throws
     */
    int selectCount();

    /**
     * @author:ws
     * @Description: selectBranchInfoById(根据id查询处理点详情)
     * @param @param id
     * @param @return 参数类型
     * @return Branch 返回类型
     * @date 2013-9-3下午01:31:16
     * @throws
     */
    Branch selectBranchInfoById(int id);
    
    
    /*后台管理*/
    
   List<Branch> queryAll();//查询所有
   
   int insertBranch(Branch branch);//插入新数据
   
   Branch queryDataById(Integer id);//查找单条数据
   
   int deleteDataById(Integer id);//删除单条数据
   
   void deleteDataByIds(Integer ids);//批量删除
   
   int updateBranch(Branch branch);//更新数据
   
   List<Branch> selectUsernameById(Integer id);////查询admin的username
}
