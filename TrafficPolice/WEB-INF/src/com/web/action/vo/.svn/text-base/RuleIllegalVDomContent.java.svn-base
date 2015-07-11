/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.RuleIllegal;

/**
 * @author wqg
 * 
 *         2013-9-10下午1:04:55
 */
public class RuleIllegalVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private String illegalTitle;// 违法查询标题

	private String illegalContent;// 违法查询内容

	private String illegalInsertTime;// 违法上报时间

	private Long id;// 主键

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private String updatetime;// 更新时间

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

	public String getIllegalInsertTime()
	{
		return illegalInsertTime;
	}

	public void setIllegalInsertTime(String illegalInsertTime)
	{
		this.illegalInsertTime = illegalInsertTime;
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

	public RuleIllegalVDomContent()
	{

	}

	public RuleIllegalVDomContent(RuleIllegal illegal)
	{
		if (null != illegal)
		{
			this.id = illegal.getId();

			this.illegalContent = illegal.getIllegalContent();

			this.illegalInsertTime = sdf.format(illegal.getIllegalInsertTime());

			this.updatetime = sdf.format(illegal.getUpdatetime());

			this.illegalTitle = illegal.getIllegalTitle();

			this.operid = illegal.getOperid();

			this.opertime = sdf.format(illegal.getOpertime());

			this.state = illegal.getState();

			this.remark = illegal.getRemark();
		}
	}
}
