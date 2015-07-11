/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.Police;

/**
 * @author ln
 * 
 * @Date 2013-9-23
 */
public class PoliceVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");
	// 交警
	private Long id;
	
	//用户的userid
	private Long userno;

	// 对象类型id
	private Integer typeid;

	// 所属机构id
	private Long orgid;
	
	// 所属机构单位名称
	private String orgname;

	// 电话
	private String telephone;

	// 姓名
	private String name;

	// 所在单位地址
	private String addres;

	// 所在地区id
	private Integer areaid;
	
	// 所在地区名称
	private String areaname;
	
	//性别
	private String sex;
	
	//交警内部编码
	private String pno;

	//身份证号码
	private String identitycard;

	private Integer state;

	private String remark;

	private Long operid;

	private String opertime;
	
	public Long getUserno()
	{
		return userno;
	}

	public void setUserno(Long userno)
	{
		this.userno = userno;
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

	public Integer getState()
	{
		return state;
	}

	public void setState(Integer state)
	{
		this.state = state;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Integer getTypeid()
	{
		return typeid;
	}

	public void setTypeid(Integer typeid)
	{
		this.typeid = typeid;
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
	
	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddres()
	{
		return addres;
	}

	public void setAddres(String addres)
	{
		this.addres = addres;
	}

	public Integer getAreaid()
	{
		return areaid;
	}

	public void setAreaid(Integer areaid)
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
	
	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	public String getPno()
	{
		return pno;
	}

	public void setPno(String pno)
	{
		this.pno = pno;
	}
	
	public String getIdentitycard()
	{
		return identitycard;
	}

	public void setIdentitycard(String identitycard)
	{
		this.identitycard = identitycard;
	}
	
	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
	}

	public PoliceVDomContent()
	{

	}

	public PoliceVDomContent(Police police)
	{
		if (null != police)
		{
			this.id = police.getId();
			this.userno = police.getUserno();
			this.typeid = police.getTypeid();
			this.orgid = police.getOrgid();
			this.orgname = police.getOrgname();
			this.telephone = police.getTelephone();
			this.name = police.getName();
			this.addres = police.getAddres();
			this.areaid = police.getAreaid();
			this.areaname = police.getAreaname();
			this.operid = police.getOperid();
			this.opertime = sdf.format(police.getOpertime());
			this.state = police.getState();
			this.remark = police.getRemark();
			this.sex = police.getSex();
			this.pno = police.getPno();
			this.identitycard = police.getIdentitycard();
		}
	}
}
