/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.pojo;

/**
 * 角色管理
 * 
 * @author wqg
 * 
 *         2013-9-25下午1:40:15
 */
public class Role extends BasePojo
{
	private long roleno;// 角色id

	private String rolename;// 角色名称

	private long dwtype;// 单位类型id

	private String description;// 角色描述

	private Admin admin;// 指向admin的引用

	public long getDwtype()
	{
		return dwtype;
	}

	public void setDwtype(long dwtype)
	{
		this.dwtype = dwtype;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

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

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
