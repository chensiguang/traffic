package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.Company;

/**
 * 后台管理－企业管理
 * 
 * @author jjl date 2013/9/18
 */
public class CompanyVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private Long comid;// 企业id
	private String comname;// 单位名称
	private Integer typeid;// 对象类型id
	private String phone;// 固定电话
	private String mobile;// 手机
	private String linkname;// 联系人
	private String linkmobile;// 手机
	private String addres;// 联系地址
	private Integer pid;// 所在父类公司id
	private long safenum;// 安全组数量
	private Long orgid; // 单位id
	private String orgname; // 所属单位
	private String loginname;// 登录账号名
	private String password;// 登录密码
	private Integer state; // 状态
	private String remark; // 备注
	private Long operid; // 操作人id
	private String opertime; // 操作时间
	private Long regid; // 注册id
	private String regtime; // 注册时间
	private String str;

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

	public long getSafenum()
	{
		return safenum;
	}

	public void setSafenum(long safenum)
	{
		this.safenum = safenum;
	}

	private Company company = new Company();

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

	public Long getRegid()
	{
		return regid;
	}

	public void setRegid(Long regid)
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

	public String getStr()
	{
		return str;
	}

	public void setStr(String str)
	{
		this.str = str;
	}

	public Company getCompany()
	{
		return company;
	}

	public void setCompany(Company company)
	{
		this.company = company;
	}

	public Long getOrgid()
	{
		return orgid;
	}

	public void setOrgid(Long orgid)
	{
		this.orgid = orgid;
	}

	public String getOrgname()
	{
		return orgname;
	}

	public void setOrgname(String orgname)
	{
		this.orgname = orgname;
	}

	public CompanyVDomContent()
	{

	}

	public CompanyVDomContent(Company company)
	{

		if (company != null)
		{
			this.comname = company.getComname();
			this.linkname = company.getLinkname();
			this.phone = company.getPhone();
			this.mobile = company.getMobile();
			this.addres = company.getAddres();
			this.orgid = company.getPoliceOrg().getId();
			this.orgname = company.getPoliceOrg().getOrgname();
			this.safenum = company.getSafenum();
			// 公用字段
			this.operid = company.getOperid();
			this.opertime = sdf.format(company.getOpertime());
			this.regid = company.getRegid();
			this.regtime = sdf.format(company.getRegtime());
			this.remark = company.getRemark();
			this.state = company.getState();
			this.str = company.getStr();
			this.pid = company.getPid();
			this.loginname = company.getLoginname();
			this.password = company.getPassword();
		}
	}
}
