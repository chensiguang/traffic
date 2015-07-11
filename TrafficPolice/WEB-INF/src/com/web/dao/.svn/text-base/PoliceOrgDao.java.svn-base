package com.web.dao;

import java.util.List;
import com.web.pojo.PoliceOrg;

/**
 * 交警部门
 * 
 * @author jjl date 2013/9/23
 */
public interface PoliceOrgDao extends IBaseDao<PoliceOrg>
{

	/*
	 * 后台管理
	 */
	List<PoliceOrg> selectUsernameById(Integer id);// 查询admin的username
	
    List<PoliceOrg> queryAll();//查询所有
    
    List<PoliceOrg> selectAll();//查询所有
    
    List<PoliceOrg> queryAllByDwid(long dwid);//通过单位id查找它的子类单位
    
    int insertPoliceOrg(PoliceOrg org);//插入新数据
    
    PoliceOrg queryDataById(Integer id);//查找单条数据
    
    int deleteDataById(Integer id);//删除单条数据
    
    void deleteDataByIds(Integer ids);//批量删除
    
    int updatePoliceOrg(PoliceOrg org);//更新数据
    
    int newOrUpdate(PoliceOrg org);// 查看新增或者修改是否重复
    
	

}
