/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.pojo;

/**
 * 类型
 * 
 * 
 * @author wqg
 * 
 *         2013-9-25下午2:34:44
 */
public class Type extends BasePojo
{
	private long typeid;// 类型id

	private String typename;// 类型名称

	private long groupid;// 分组id
	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public long getTypeid()
	{
		return typeid;
	}

	public void setTypeid(long typeid)
	{
		this.typeid = typeid;
	}

	public String getTypename()
	{
		return typename;
	}

	public void setTypename(String typename)
	{
		this.typename = typename;
	}

	public long getGroupid()
	{
		return groupid;
	}

	public void setGroupid(long groupid)
	{
		this.groupid = groupid;
	}

}
