/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Role;

/**
 * 角色管理
 * 
 * @author wqg
 * 
 *         2013-9-25下午1:48:17
 */
public class RoleVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long roleno;// 角色id

	private String rolename;// 角色名称

	private long dwtype;// 单位类型id

	private String description;// 角色描述

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private long regid;// 注册人id

	private String regtime;// 注册时间

	public long getRoleno()
	{
		return roleno;
	}

	public void setRoleno(long roleno)
	{
		this.roleno = roleno;
	}

	public String getRolename()
	{
		return rolename;
	}

	public void setRolename(String rolename)
	{
		this.rolename = rolename;
	}

	public long getDwtype()
	{
		return dwtype;
	}

	public void setDwtype(long dwtype)
	{
		this.dwtype = dwtype;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
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

	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
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

	public RoleVDomContent()
	{

	}

	public RoleVDomContent(Role role)
	{
		if (null != role)
		{
			this.description = role.getDescription();

			this.opertime = sdf.format(role.getOpertime());

			this.regtime = sdf.format(role.getRegtime());

			this.state = role.getState();

			this.rolename = role.getRolename();

			this.roleno = role.getRoleno();

			this.remark = role.getRemark();
			
			this.dwtype = role.getDwtype();
		}
	}
}
