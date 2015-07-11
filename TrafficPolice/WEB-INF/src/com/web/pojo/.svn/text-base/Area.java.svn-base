package com.web.pojo;

import com.web.util.DateFormateUtil;

public class Area extends BasePojo
{
	private Long areaid;// 序列
	private String areaname;// 地区
	private Integer parentid;// 父类地区id
	private String description;// 描述
	private Integer orderno;// 顺序
	private String mailcode;// 邮政编码
	private String callcode;// 电话区号
	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Long getAreaid()
	{
		return areaid;
	}

	public void setAreaid(Long areaid)
	{
		this.areaid = areaid;
	}

	public String getAreaname()
	{
		return areaname;
	}

	public void setAreaname(String areaname)
	{
		this.areaname = areaname;
	}

	public Integer getParentid()
	{
		return parentid;
	}

	public void setParentid(Integer parentid)
	{
		this.parentid = parentid;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public Integer getOrderno()
	{
		return orderno;
	}

	public void setOrderno(Integer orderno)
	{
		this.orderno = orderno;
	}

	public String getMailcode()
	{
		return mailcode;
	}

	public void setMailcode(String mailcode)
	{
		this.mailcode = mailcode;
	}

	public String getCallcode()
	{
		return callcode;
	}

	public void setCallcode(String callcode)
	{
		this.callcode = callcode;
	}

	public String toJson()
	{
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("{'areaid':'");
		strBuffer.append(this.getAreaid());
		strBuffer.append("','areaname':'");
		strBuffer.append(this.getAreaname());
		strBuffer.append("','description':'");
		strBuffer.append(this.getDescription());
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
