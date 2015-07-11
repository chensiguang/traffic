/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.service.interfaces;

import java.util.HashMap;
import java.util.List;

import com.web.pojo.Reprimand;
import com.web.service.BaseService;

/**通报批评
 * @author wqg
 *
 * 2013-10-28下午3:41:19
 */
public interface ReprimandService extends BaseService<Reprimand>
{
  List<Reprimand> queryAll();//查找所有通报批评信息
  
	Reprimand queryDataById(String id);// 查找单条数据
	
	int insertReprimand(Reprimand re);//插入新数据
	
	int updateReprimand(Reprimand re);//更新数据
	
	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除
	
	int updateFlag(String id);//设置flag
	
	List<Reprimand> queryAllByDwidAndType(HashMap<String, Object> map);//通过单位id和类型查找详细的通报批评
	
	List<Reprimand> distinctQueryAllByDwid();//不重复查询被通报单位
}
