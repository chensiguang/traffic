/**
 * Project Name:TrafficPolice
 * File Name:EduVideoService.java
 * Package Name:com.web.service.interfaces
 * Date:2013-7-17下午01:59:21
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.EduVideo;
import com.web.service.BaseService;

/**
 * ClassName:EduVideoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 下午01:59:21 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public interface EduVideoService extends BaseService<EduVideo>
{
    /***
     * @author:ws
     * @Description: selectVideoList(这里用一句话描述这个方法的作用)
     * @param start
     * @param pagesize
     * @return ArrayList<EduVideo> 返回类型
     * @date 2013-7-17下午01:59:34
     * @throws
     */
    ArrayList<EduVideo> selectVideoList(int start, int pagesize);

    /**
     * @author:ws
     * @Description: selectVideoDeatalById(这里用一句话描述这个方法的作用)
     * @param @param id
     * @param @return 参数类型
     * @return EduVideo 返回类型
     * @date 2013-7-29下午01:51:08
     * @throws
     */
    EduVideo selectVideoDetailById(int id);

    /**
     * @author:ws
     * @Description: selectCount(这里用一句话描述这个方法的作用)
     * @param @return 参数类型
     * @return int 返回类型
     * @date 2013-7-29下午03:15:03
     * @throws
     */
    int selectCount();
    
   /*后台管理*/
    
    List<EduVideo> queryAll();//查询所有
    
    int insertEduVideo(EduVideo edu);//插入新数据
    
    EduVideo queryDataById(String id);//查找单条数据
    
    int deleteDataById(String id);//删除单条数据
    
    void deleteDataByIds(String ids);//批量删除
    
    int updateEduVideo(EduVideo edu);//更新数据
    
    List<EduVideo> selectUsernameById(String id);//查询admin的username
    
    int newOrUpdate(EduVideo edu);// 查看新增或者修改是否重复
}
