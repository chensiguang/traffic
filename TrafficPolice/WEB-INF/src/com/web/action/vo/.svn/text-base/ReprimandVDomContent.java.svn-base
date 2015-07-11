/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Reprimand;

/**
 * 通报批评
 * 
 * @author wqg
 * 
 *         2013-10-28下午3:30:59
 */
public class ReprimandVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long id;// 主键id

	private String loginname;// 通报批评人

	private long dwid;// 批评的单位

	private String content;// 批评的内容

	private String time;// 通报批评时间

	private long flag;// 标注批评的类型

	private long type;// 标注批评的类型

	private long driverid;// 驾驶员id

	private Integer state;//

	private long pid;

	public long getPid()
	{
		return pid;
	}

	public void setPid(long pid)
	{
		this.pid = pid;
	}

	public long getType()
	{
		return type;
	}

	public void setType(long type)
	{
		this.type = type;
	}

	public long getDriverid()
	{
		return driverid;
	}

	public void setDriverid(long driverid)
	{
		this.driverid = driverid;
	}

	public Integer getState()
	{
		return state;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	public String getLoginname()
	{
		return loginname;
	}

	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public long getDwid()
	{
		return dwid;
	}

	public void setDwid(long dwid)
	{
		this.dwid = dwid;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}

	public long getFlag()
	{
		return flag;
	}

	public void setFlag(long flag)
	{
		this.flag = flag;
	}

	public ReprimandVDomContent()
	{

	}

	public ReprimandVDomContent(Reprimand re)
	{
		if (re != null)
		{
			this.content = re.getContent();

			this.dwid = re.getDwid();

			this.flag = re.getFlag();

			this.loginname = re.getLoginname();

			this.time = sdf.format(re.getTime());

			this.state = re.getState();

			this.driverid = re.getDriverid();

			this.type = re.getType();
			
			this.pid = re.getPid();
			
			this.id = re.getId();
		}
	}
}
