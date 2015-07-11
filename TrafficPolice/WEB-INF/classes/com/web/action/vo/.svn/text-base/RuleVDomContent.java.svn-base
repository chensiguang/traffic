/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.Rule;

/**
 * @author wqg
 * 
 *         2013-9-9上午11:17:38
 */
public class RuleVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private Integer ruleType = 0;// 法规类型

	private String ruleTitle = "";// 法规标题

	private String ruleInsertTime;// 法规入库时间

	private String ruleContent = "";// 法规内容

	private String ruleUrl = "";

	private Long id;// 主键

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private String updatetime;// 操作时间

	public Integer getRuleType()
	{
		return ruleType;
	}

	public void setRuleType(Integer ruleType)
	{
		this.ruleType = ruleType;
	}

	public String getRuleTitle()
	{
		return ruleTitle;
	}

	public void setRuleTitle(String ruleTitle)
	{
		this.ruleTitle = ruleTitle;
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

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Integer getState()
	{
		return state;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Long getOperid()
	{
		return operid;
	}

	public void setOperid(Long operid)
	{
		this.operid = operid;
	}

	public Rule getRule()
	{
		return rule;
	}

	public void setRule(Rule rule)
	{
		this.rule = rule;
	}

	public String getRuleInsertTime()
	{
		return ruleInsertTime;
	}

	public void setRuleInsertTime(String ruleInsertTime)
	{
		this.ruleInsertTime = ruleInsertTime;
	}

	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
	}

	public String getUpdatetime()
	{
		return updatetime;
	}

	public void setUpdatetime(String updatetime)
	{
		this.updatetime = updatetime;
	}

	Rule rule = new Rule();

	public RuleVDomContent()
	{

	}

	public RuleVDomContent(Rule rule)
	{
		if (null != rule)
		{
			this.ruleType = rule.getRuleType();

			this.ruleTitle = rule.getRuleTitle();

			this.ruleInsertTime = sdf.format(rule.getRuleInsertTime());

			this.ruleContent = rule.getRuleContent();

			this.ruleUrl = rule.getRuleUrl();

			this.id = rule.getId();

			this.operid = rule.getOperid();

			this.opertime = sdf.format(rule.getOpertime());

			this.remark = rule.getRemark();

			this.state = rule.getState();

			this.updatetime = sdf.format(rule.getUpdatetime());
			
		}
	}
}
