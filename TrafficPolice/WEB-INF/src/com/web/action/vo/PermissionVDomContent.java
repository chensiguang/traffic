/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Permission;

/**
 * @author wqg
 * 
 *         2013-9-25下午3:17:39
 */
public class PermissionVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private long perno;// 权限id

	private String pername;// 权限名称

	private String functions;// 权限码

	private long parentid;// 权限父类id

	private long operid;// 操作人id

	private String opertime;// 操作时间

	private Integer state;// 状态

	private String remark;// 备注

	private long regid;// 注册人id

	private String regtime;// 注册时间

	public long getPerno()
	{
		return perno;
	}

	public void setPerno(long perno)
	{
		this.perno = perno;
	}

	public String getPername()
	{
		return pername;
	}

	public void setPername(String pername)
	{
		this.pername = pername;
	}

	public String getFunctions()
	{
		return functions;
	}

	public void setFunctions(String functions)
	{
		this.functions = functions;
	}

	public long getParentid()
	{
		return parentid;
	}

	public void setParentid(long parentid)
	{
		this.parentid = parentid;
	}

	public long getOperid()
	{
		return operid;
	}

	public void setOperid(long operid)
	{
		this.operid = operid;
	}

	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
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

	public long getRegid()
	{
		return regid;
	}

	public void setRegid(long regid)
	{
		this.regid = regid;
	}

	public String getRegtime()
	{
		return regtime;
	}

	public void setRegtime(String regtime)
	{
		this.regtime = regtime;
	}
	
	public PermissionVDomContent()
	{
		
	}
	
	public PermissionVDomContent(Permission per)
	{
		if(null != per)
		{
			this.functions = per.getFunctions();
			
			this.operid = per.getOperid();
			
			this.opertime = sdf.format(per.getOpertime());
			
			this.pername = per.getPername();
			
			this.regtime = sdf.format(per.getRegtime());
			
			this.remark = per.getRemark();
			
			this.state = per.getState();
		}
	}

}
