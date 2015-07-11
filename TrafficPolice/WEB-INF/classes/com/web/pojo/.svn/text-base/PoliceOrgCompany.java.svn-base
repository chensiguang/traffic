package com.web.pojo;

import com.web.util.DateFormateUtil;

/**
 * 交警部门与公司
 * 
 * @author jjl date 2013/9/23
 */
public class PoliceOrgCompany extends BasePojo
{

	private Integer pcid; // 交警部门与公司id
	private Long orgid; // 交警部门id
	private Long comid;// 货运公司id
	private Admin admin;// 指向admin的引用

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Integer getPcid()
	{
		return pcid;
	}

	public void setPcid(Integer pcid)
	{
		this.pcid = pcid;
	}

	public Long getOrgid()
	{
		return orgid;
	}

	public void setOrgid(Long orgid)
	{
		this.orgid = orgid;
	}

	public Long getComid()
	{
		return comid;
	}

	public void setComid(Long comid)
	{
		this.comid = comid;
	}

	public String toJson()
	{
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("{'pcid':'");
		strBuffer.append(this.getPcid());
		strBuffer.append("','orgid':'");
		strBuffer.append(this.getOrgid());
		strBuffer.append("','comid':'");
		strBuffer.append(this.getComid());
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
