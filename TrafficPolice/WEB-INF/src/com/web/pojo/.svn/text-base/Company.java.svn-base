package com.web.pojo;

import com.web.util.DateFormateUtil;

/**
 * 企业管理
 * 
 * @author jjl date 2013/9/17
 */
public class Company extends BasePojo
{
	private Long comid;// 企业id
	private String comname;// 单位名称
	private Integer typeid;// 对象类型id
	private String phone;// 固定电话
	private String mobile;// 手机
	private String linkname;// 联系人
	private String linkmobile;// 手机
	private String addres;// 联系地址
	private Integer pid;// 所在父类公司id
	private long safenum;// 安全组个数
	private String loginname;//登录账号名
	private String password;//登录密码
	private String companyname;// 查找父级企业
	private PoliceOrg policeOrg; // 交警部门
	private Admin admin;// 指向admin的引用
	
	

	public String getLoginname()
	{
		return loginname;
	}

	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getCompanyname()
	{
		return companyname;
	}

	public void setCompanyname(String companyname)
	{
		this.companyname = companyname;
	}

	public long getSafenum()
	{
		return safenum;
	}

	public void setSafenum(long safenum)
	{
		this.safenum = safenum;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Long getComid()
	{
		return comid;
	}

	public void setComid(Long comid)
	{
		this.comid = comid;
	}

	public String getComname()
	{
		return comname;
	}

	public void setComname(String comname)
	{
		this.comname = comname;
	}

	public Integer getTypeid()
	{
		return typeid;
	}

	public void setTypeid(Integer typeid)
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

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getLinkname()
	{
		return linkname;
	}

	public void setLinkname(String linkname)
	{
		this.linkname = linkname;
	}

	public String getLinkmobile()
	{
		return linkmobile;
	}

	public void setLinkmobile(String linkmobile)
	{
		this.linkmobile = linkmobile;
	}

	public String getAddres()
	{
		return addres;
	}

	public void setAddres(String addres)
	{
		this.addres = addres;
	}

	public Integer getPid()
	{
		return pid;
	}

	public void setPid(Integer pid)
	{
		this.pid = pid;
	}

	public PoliceOrg getPoliceOrg()
	{
		return policeOrg;
	}

	public void setPoliceOrg(PoliceOrg policeOrg)
	{
		this.policeOrg = policeOrg;
	}

	public String toJson()
	{
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("{'comid':'");
		strBuffer.append(this.getComid());
		strBuffer.append("','comname':'");
		strBuffer.append(this.getComname());
		strBuffer.append("','linkname':'");
		strBuffer.append(this.getLinkname());
		strBuffer.append("','linkmobile':'");
		strBuffer.append(this.getLinkmobile());
		strBuffer.append("','phone':'");
		strBuffer.append(this.getPhone());
		strBuffer.append("','mobile':'");
		strBuffer.append(this.getMobile());
		strBuffer.append("','regtime':'");
		strBuffer.append(DateFormateUtil.dateformate("yyyy-MM-dd hh:mm:ss",
				this.getRegtime()));
		strBuffer.append("','addres':'");
		strBuffer.append(this.getAddres());
		strBuffer.append("'}");
		return strBuffer.toString();
	}
}
