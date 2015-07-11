package com.web.pojo;

import com.web.util.DateFormateUtil;

/**
 * 交警部门
 * 
 * @author jjl date 2013/9/23
 */
public class PoliceOrg extends BasePojo
{

	private Integer areaid;// 所属区域

	private String orgname;// 单位名称

	private long typeid;// 对象类型id

	private String phone;// 单位电话

	private String address;// 单位地址

	private String pid;// 所在父类机构id

	private PoliceOrg policeOrg;// 指向自身的引用

	private Admin admin;// 指向admin的引用
	
	private String name;
	
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public PoliceOrg getPoliceOrg()
	{
		return policeOrg;
	}

	public void setPoliceOrg(PoliceOrg policeOrg)
	{
		this.policeOrg = policeOrg;
	}

	public Integer getAreaid()
	{
		return areaid;
	}

	public void setAreaid(Integer areaid)
	{
		this.areaid = areaid;
	}

	public String getOrgname()
	{
		return orgname;
	}

	public void setOrgname(String orgname)
	{
		this.orgname = orgname;
	}

	public long getTypeid()
	{
		return typeid;
	}

	public void setTypeid(long typeid)
	{
		this.typeid = typeid;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPid()
	{
		return pid;
	}

	public void setPid(String pid)
	{
		this.pid = pid;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public String toJson()
	{
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("{'orgname':'");
		strBuffer.append(this.getOrgname());
		strBuffer.append("','phone':'");
		strBuffer.append(this.getPhone());
		strBuffer.append("','addres':'");
		strBuffer.append(this.getAddress());
		strBuffer.append("','regtime':'");
		strBuffer.append(DateFormateUtil.dateformate("yyyy-MM-dd hh:mm:ss",
				this.getRegtime()));
		strBuffer.append("','opertime':'");
		strBuffer.append(DateFormateUtil.dateformate("yyyy-MM-dd hh:mm:ss",
				this.getOpertime()));
		strBuffer.append("'}");
		return strBuffer.toString();
	}
}
