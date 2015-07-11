/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.pojo;

/**
 * 权限管理
 * 
 * @author wqg
 * 
 *         2013-9-25下午3:13:51
 */
public class Permission extends BasePojo
{
	private long perno;// 权限id

	private String pername;// 权限名称

	private String functions;// 权限码

	private long parentid;// 权限父类id

	private RolePermission roleper;// 指向RolePermission的引用

	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public RolePermission getRoleper()
	{
		return roleper;
	}

	public void setRoleper(RolePermission roleper)
	{
		this.roleper = roleper;
	}

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

}
