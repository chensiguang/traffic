package com.web.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: 交通法规
 * 
 * @Description: TODO
 * 
 * @author ws
 * 
 * @date 2013-7-17 上午10:00:08
 * 
 * 
 */
public class Rule extends BasePojo
{
	private Integer ruleType;

	private String ruleTitle = "";

	private Date ruleInsertTime;

	private String ruleContent = "";

	private String ruleUrl = "";
	
	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Integer getRuleType()
	{
		return ruleType;
	}

	public String getRuleTitle()
	{
		return ruleTitle;
	}

	public void setRuleType(Integer ruleType)
	{
		this.ruleType = ruleType;
	}

	public void setRuleTitle(String ruleTitle)
	{
		this.ruleTitle = ruleTitle;
	}

	public Date getRuleInsertTime()
	{
		return ruleInsertTime;
	}

	public void setRuleInsertTime(Date ruleInsertTime)
	{
		this.ruleInsertTime = ruleInsertTime;
	}

	public String getRuleContent()
	{
		return ruleContent;
	}

	public void setRuleContent(String ruleContent)
	{
		this.ruleContent = ruleContent;
	}

	public String getRuleUrl()
	{
		return ruleUrl;
	}

	public void setRuleUrl(String ruleUrl)
	{
		this.ruleUrl = ruleUrl;
	}

	public String toJson()
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd hh:mm:ss");
		StringBuffer strbBuffer = new StringBuffer();
		strbBuffer.append("{'ruleType':'");
		strbBuffer.append(ruleType);
		strbBuffer.append("','id':'");
		strbBuffer.append(getId());
		strbBuffer.append("','ruleTitle':'");
		strbBuffer.append(ruleTitle);
		strbBuffer.append("','ruleInsertTime':'");
		if (ruleInsertTime != null)
		{
			strbBuffer.append(simpleDateFormat.format(ruleInsertTime));
		}

		strbBuffer.append("','ruleContent':'");
		strbBuffer.append(BasePojo.replace(ruleContent));
		strbBuffer.append("'}");
		return strbBuffer.toString();
	}

}
