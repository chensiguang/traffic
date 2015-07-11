package com.web.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.Rule;
import com.web.service.BaseService;

/**
 * 用户s接口
 * 
 * @author zhanghq 2012-11-11
 */
public interface RuleService extends BaseService<Rule>
{

	/* 前台显示 */
	/**
	 * @Description: selectAllList 查找所有交通法规
	 * @return ArrayList<Rule> 返回类型
	 * @date 2013-7-16下午04:31:08
	 * @throws
	 */
	public ArrayList<Rule> selectAllList(int start, int pagesize);

	/**
	 * @Description: selectCount 交通法规总条数
	 * @param @return 参数类型
	 * @return int 返回类型
	 * @date 2013-7-19下午01:48:21
	 */
	int selectCount();

	/**
	 * @Description: selectRuleInfoById根据id查找交通法规
	 * @param @param id
	 * @param @return 参数类型
	 * @return Rule 返回类型
	 * @date 2013-7-23下午01:17:11
	 */
	Rule selectRuleInfoById(int id);

	/* 后台管理 */

	List<Rule> queryAll();// 查询所有

	int insertRule(Rule rule);// 插入新数据

	Rule queryDataById(String id);// 查找单条数据

	int deleteDataById(String id);// 删除单条数据

	void deleteDataByIds(String ids);// 批量删除

	int updateRule(Rule rule);// 更新数据
	
	 List<Rule> selectUsernameById(String id);//查询admin的username
	 
	 int newOrUpdate(Rule rule);// 查看新增或者修改是否重复
}
