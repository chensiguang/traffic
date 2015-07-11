package com.web.pojo;

/**
 * 
 * @ClassName: Police
 * 
 * @Description: TODO
 * 
 * @author ln
 * 
 * @date 2013-9-23
 * 
 * 
 */
public class Police extends BasePojo
{
	// 驾驶员id
	private Long id;

	// 对象类型id
	private Integer typeid;

	// 所属机构id
	private Long orgid;

	// 所属机构名称
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

	// 性别
	private String sex;

	// 交警内部编码
	private String pno;

	// 身份证号码
	private String identitycard;

	// 交警的useid值
	private Long userno;
	private Admin admin;// 指向admin的引用

	private String policename;

	public String getPolicename()
	{
		return policename;
	}

	public void setPolicename(String policename)
	{
		this.policename = policename;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Long getUserno()
	{
		return userno;
	}

	public void setUserno(Long userno)
	{
		this.userno = userno;
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

	public String toJson()
	{
		StringBuffer strbuffBuffer = new StringBuffer();

		strbuffBuffer.append("{'id':'");
		strbuffBuffer.append(id);
		strbuffBuffer.append("','userno':'");
		strbuffBuffer.append(userno);
		// strbuffBuffer.append(id);
		strbuffBuffer.append("','typeid':'");
		strbuffBuffer.append(typeid);
		strbuffBuffer.append("','orgid':'");
		strbuffBuffer.append(orgid);
		strbuffBuffer.append("','orgname':'");
		strbuffBuffer.append(orgname);
		strbuffBuffer.append("','telephone':'");
		strbuffBuffer.append(telephone);
		strbuffBuffer.append("','name':'");
		strbuffBuffer.append(name);
		strbuffBuffer.append("','addres':'");
		strbuffBuffer.append(addres);
		strbuffBuffer.append("','areaid':'");
		strbuffBuffer.append(areaid);
		strbuffBuffer.append("','areaname':'");
		strbuffBuffer.append(areaname);
		strbuffBuffer.append("','sex':'");
		strbuffBuffer.append(sex);
		strbuffBuffer.append("','pno':'");
		strbuffBuffer.append(pno);
		strbuffBuffer.append("','identitycard':'");
		strbuffBuffer.append(identitycard);
		strbuffBuffer.append("'}");
		return strbuffBuffer.toString();
	}
}
