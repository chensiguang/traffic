/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.dao;

import java.util.HashMap;
import java.util.List;

import com.web.pojo.Reprimand;

/**通报批评
 * @author wqg
 *
 * 2013-10-28下午3:39:23
 */
public interface ReprimandDao extends IBaseDao<Reprimand>
{
	List<Reprimand> queryAll();//查看所有的通报批评信息
	
	Reprimand queryDataById(Integer id);// 查找单条数据
	
	int insertReprimand(Reprimand re);//插入新数据
	
	int updateReprimand(Reprimand re);//更新数据
	
	int updateFlag(Integer id);//设置flag
	
	int deleteDataById(Integer id);// 删除单条数据

	void deleteDataByIds(Integer ids);// 批量删除
	
	List<Reprimand> queryAllByDwidAndType(HashMap<String, Object> map);//通过单位id和类型查找详细的通报批评
	
	List<Reprimand> distinctQueryAllByDwid();//不重复查询被通报单位
	
	
}
