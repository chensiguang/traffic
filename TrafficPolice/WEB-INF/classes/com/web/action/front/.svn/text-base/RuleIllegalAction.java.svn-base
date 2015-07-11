/**
 * Project Name:TrafficPolice
 * File Name:RuleIllegalAction.java
 * Package Name:com.web.action
 * Date:2013-9-3上午09:04:20
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.action.front;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.RuleIllegal;
import com.web.service.interfaces.RuleIllegalService;

/**
 * ClassName:RuleIllegalAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-3 上午09:04:20 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class RuleIllegalAction extends BaseAction
{
	/**
	 * 
	 * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
	 */

	private static final long serialVersionUID = 1L;

	private static final int PAGESIZE = 15;

	// 交通违法列表显示
	private ArrayList<RuleIllegal> ruleIllegallist;

	private int count;

	// 交通规则详情
	private RuleIllegal ruleIllegal;

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public ArrayList<RuleIllegal> getRuleIllegallist()
	{
		return ruleIllegallist;
	}

	public void setRuleIllegallist(ArrayList<RuleIllegal> ruleIllegallist)
	{
		this.ruleIllegallist = ruleIllegallist;
	}

	public RuleIllegal getRuleIllegal()
	{
		return ruleIllegal;
	}

	public void setRuleIllegal(RuleIllegal ruleIllegal)
	{
		this.ruleIllegal = ruleIllegal;
	}

	// 交通违法查询所有数据
	@Autowired
	private RuleIllegalService ruleIllegalService;

	public String list()
	{
		log.info("do ruleIllegal list page...");
		int count = ruleIllegalService.selectCount();

		setCount(count);
		setPage("ruleIllegallist.jsp");
		log.info("end ruleIllegal list page... <return Data type: page;Data:> ruleIllegallist.jsp <Data:>"
				+ count);
		return "success";
	}

	public void info()
	{

		String id = getParameter("ruleIllegalid");

		log.info("do ruleIllegal info...<param>ruleIllegalid=" + id);

		RuleIllegal ruleIllegal = ruleIllegalService
				.selectIllegalInfoById(Integer.valueOf(id));



        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(ruleIllegal.toJson());
        }
        catch(IOException e)
        {

			e.printStackTrace();
		}
		log.info("end rule info...<return Data type: json;Data:>"
				+ ruleIllegal.toJson());
	}

	public void detailList()
	{
		String currentpage = getParameter("currentpage");
		log.info("do rule ruleList...<param>currentpage=" + currentpage);
		if (currentpage == null || currentpage.equals(""))
		{
			currentpage = "1";
		}
		int count = ruleIllegalService.selectCount();

		ArrayList<RuleIllegal> ruleIllegallist = ruleIllegalService
				.selectIllegalList((Integer.valueOf(currentpage) - 1)
						* PAGESIZE, PAGESIZE);

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(tojson(count, ruleIllegallist));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		log.info("end rule ruleList...<return Data type: json;Data:>"
				+ tojson(count, ruleIllegallist));
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
	private String tojson(int count, ArrayList<RuleIllegal> ruleIllegallist)
	{
		// SimpleDateFormat simpleDateFormat = new
		// SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
		log.debug("enter into function  tojson:<pamams>count=" + count);
		StringBuffer newStr = new StringBuffer();
		newStr.append("{'count':'");
		newStr.append(count);
		newStr.append("'");
		int size = 0;
		if (ruleIllegallist != null && ruleIllegallist.size() > 0)
		{
			newStr.append(",'ruleIllegals':[");
			for (RuleIllegal ruleIllegal : ruleIllegallist)
			{
				newStr.append(ruleIllegal.toJson());
				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);
			newStr.append("]");
			size = ruleIllegallist.size();
		}

		newStr.append(",'size':'");
		newStr.append(size);
		newStr.append("'");
		newStr.append("}");
		log.debug("Data type: json;Data: " + newStr.toString());
		return newStr.toString();
	}
}
