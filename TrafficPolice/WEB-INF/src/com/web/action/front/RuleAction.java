/**
 * Project Name:TrafficPolice
 * File Name:RuleAction.java
 * Package Name:com.web.action
 * Date:2013-7-19下午01:22:10
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.action.front;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Rule;
import com.web.service.interfaces.RuleService;

/**
 * ClassName:RuleAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-19 下午01:22:10 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class RuleAction extends BaseAction
{
    /**
     * 
     * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
     */

    private static final long serialVersionUID = 1L;

    private static final int PAGESIZE = 15;

    private ArrayList<Rule> rulelist; // 交通规则列表显示

    private int count;

    private Rule rule; // 交通规则详情

    public ArrayList<Rule> getRulelist()
    {
        return rulelist;
    }

    public void setRulelist(ArrayList<Rule> rulelist)
    {
        this.rulelist = rulelist;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public Rule getRule()
    {
        return rule;
    }

    public void setRule(Rule rule)
    {
        this.rule = rule;
    }

    // 交通法规
    @Autowired
    private RuleService ruleService;

    public String list()
    {
        log.info("do rule list page...");
        int count = ruleService.selectCount();

        setCount(count);
        setPage("rulelist.jsp");
        log
                .info("end rule list page... <return Data type: page;Data:> rulelist.jsp <Data:>"
                        + count);
        return "success";
    }

    public void info()
    {

        String id = getParameter("ruleid");

        log.info("do rule info...<param>ruleid=" + id);

        Rule rule = ruleService.selectRuleInfoById(Integer.valueOf(id));

        // setRule(rule);

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(rule.toJson());
        }
        catch(IOException e)
        {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }
        log.info("end rule info...<return Data type: json;Data:>"
                + rule.toJson());
    }

    public void ruleList()
    {
        String currentpage = getParameter("currentpage");
        log.info("do rule ruleList...<param>currentpage=" + currentpage);
        if (currentpage == null || currentpage.equals(""))
        {
            currentpage = "1";
        }
        int count = ruleService.selectCount();

        ArrayList<Rule> rulelist = ruleService.selectAllList((Integer
                .valueOf(currentpage) - 1)
                * PAGESIZE, PAGESIZE);

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(tojson(count, rulelist));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        log.info("end rule ruleList...<return Data type: json;Data:>"
                + tojson(count, rulelist));
    }

    /**
     * 
     * @author:ws
     * @Description: tojson 返回list组成json格式
     * @param @param count
     * @param @param rulelist
     * @param @return 参数类型
     * @return String 返回类型
     * @date 2013-7-19下午03:11:23
     * @throws
     */
    private String tojson(int count, ArrayList<Rule> rulelist)
    {
        // SimpleDateFormat simpleDateFormat = new
        // SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
        log.debug("enter into function  tojson:<pamams>count=" + count);
        StringBuffer newStr = new StringBuffer();
        newStr.append("{'count':'");
        newStr.append(count);
        newStr.append("'");
        int size = 0;
        if (rulelist != null && rulelist.size() > 0)
        {
            newStr.append(",'rules':[");
            for (Rule rule : rulelist)
            {
                newStr.append("{'title':'");
                newStr.append(rule.getRuleTitle());
                newStr.append("','id':'");
                newStr.append(rule.getId());
                newStr.append("'},");
            }
            newStr.deleteCharAt(newStr.length() - 1);
            newStr.append("]");
            size = rulelist.size();
        }

        newStr.append(",'size':'");
        newStr.append(size);
        newStr.append("'");
        newStr.append("}");
        log.debug("Data type: json;Data: " + newStr.toString());
        return newStr.toString();
    }
}
