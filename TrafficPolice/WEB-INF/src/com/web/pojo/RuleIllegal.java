/**
 * Project Name:TrafficPolice
 * File Name:RuleIllegal.java
 * Package Name:com.web.pojo
 * Date:2013-7-17上午11:51:14
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.pojo;

import java.util.Date;

import com.web.util.DateFormateUtil;

/**违法查询
 * ClassName:RuleIllegal <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-17 上午11:51:14 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class RuleIllegal extends BasePojo
{
	private String illegalTitle;// 违法查询标题

	private String illegalContent;// 违法查询内容

	private Date illegalInsertTime;// 违法上报时间

	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public String getIllegalTitle()
	{
		return illegalTitle;
	}

	public void setIllegalTitle(String illegalTitle)
	{
		this.illegalTitle = illegalTitle;
	}

	public String getIllegalContent()
	{
		return illegalContent;
	}

	public void setIllegalContent(String illegalContent)
	{
		this.illegalContent = illegalContent;
	}

	public Date getIllegalInsertTime()
	{
		return illegalInsertTime;
	}

	public void setIllegalInsertTime(Date illegalInsertTime)
	{
		this.illegalInsertTime = illegalInsertTime;
	}

	public String toJson()
	{
		StringBuffer strbBuffer = new StringBuffer();
		strbBuffer.append("{'id':'");
		strbBuffer.append(getId());
		strbBuffer.append("','illegalTitle':'");
		strbBuffer.append(illegalTitle);
		strbBuffer.append("','illegalContent':'");
		strbBuffer.append(illegalContent);
		strbBuffer.append("','illegalInsertTime':'");
		strbBuffer.append(DateFormateUtil.dateformate("yyyy-MM-dd hh:mm:ss",
				illegalInsertTime));
		strbBuffer.append("'}");
		return strbBuffer.toString();
	}
}
