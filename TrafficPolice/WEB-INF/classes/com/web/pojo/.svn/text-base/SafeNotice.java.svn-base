/**
 * Project Name:TrafficPolice
 * File Name:Notice.java
 * Package Name:com.web.pojo
 * Date:2013-7-17下午05:26:18
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.pojo;

import java.util.Date;

import com.web.util.DateFormateUtil;

/**
 * 安全提醒
 * 
 * @author wqg
 * 
 *         2013-9-3下午5:11:04
 */
public class SafeNotice extends BasePojo
{
	private Integer noticeType;

	private String noticeTitle;

	private Date noticeTime;

	private String noticeContent;

	private String noticeContentUrl;

	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Integer getNoticeType()
	{
		return noticeType;
	}

	public void setNoticeType(Integer noticeType)
	{
		this.noticeType = noticeType;
	}

	public String getNoticeTitle()
	{
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle)
	{
		this.noticeTitle = noticeTitle;
	}

	public Date getNoticeTime()
	{
		return noticeTime;
	}

	public void setNoticeTime(Date noticeTime)
	{
		this.noticeTime = noticeTime;
	}

	public String getNoticeContentUrl()
	{
		return noticeContentUrl;
	}

	public void setNoticeContentUrl(String noticeContentUrl)
	{
		this.noticeContentUrl = noticeContentUrl;
	}

	public String getNoticeContent()
	{
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent)
	{
		this.noticeContent = noticeContent;
	}

	public String toJson()
	{
		StringBuffer strbBuffer = new StringBuffer();
		strbBuffer.append("{'id':'");
		strbBuffer.append(getId());
		strbBuffer.append("','noticeTitle':'");
		strbBuffer.append(noticeTitle);
		strbBuffer.append("','noticeContent':'");
		strbBuffer.append(BasePojo.replace(noticeContent));
		strbBuffer.append("','noticeTime':'");
		strbBuffer.append(DateFormateUtil.dateformate("yyyy-MM-dd hh:mm:ss",
				noticeTime));
		strbBuffer.append("'}");
		return strbBuffer.toString();
	}

}
