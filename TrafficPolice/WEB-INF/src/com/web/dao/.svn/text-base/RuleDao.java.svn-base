package com.web.dao;

import java.util.ArrayList;
import java.util.List;
import com.web.pojo.Rule;
public interface RuleDao extends IBaseDao<Rule>
{
	/*前台显示*/
    ArrayList<Rule> selectAllList(int start, int pagesize);

    int selectCount();

    Rule selectRuleInfoById(int id);
    
    
    /*后台管理*/
    
    List<Rule> queryAll();//查询所有
    
    int insertRule(Rule rule);//插入新数据
    
    Rule queryDataById(Integer id);//查找单条数据
    
    int deleteDataById(Integer id);//删除单条数据
    
    void deleteDataByIds(Integer ids);//批量删除
    
    int updateRule(Rule rule);//更新数据
    
    List<Rule> selectUsernameById(Integer id);//查询admin的username
    
    int newOrUpdate(Rule rule);// 查看新增或者修改是否重复
    

}