package com.web.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: Driver
 * 
 * @Description: TODO
 * 
 * @author ws
 * 
 * @date 2013-7-17 上午09:56:56
 * 
 * 
 */
public class Driver extends BasePojo
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	// 所在单位id
	private long dwid;

	// 对象类型id
	private Long typeid;

	// 电话
	private String phone;

	// 姓名
	private String name;

	// 地址
	private String address;

	// 身份证号
	private String identitycard;

	// 性别
	private String sex;

	// 准驾车型
	private String cartype;

	// 有效日期
	private Date validtime;

	// 年审日期
	private Date certificationtime;

	private Integer age;

	// 驾驶证号码
	private String licenseno;

	private String loginname;// 登录账号

	private String password;// 登录密码

	private String learntime;// 安全教育学习时长

	private String cars;// 管理的车辆

	private Admin admin;// 指向admin的引用

	private Company company;// 指向company的引用

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

	public String getLearntime()
	{
		return learntime;
	}

	public void setLearntime(String learntime)
	{
		this.learntime = learntime;
	}

	public String getCars()
	{
		return cars;
	}

	public void setCars(String cars)
	{
		this.cars = cars;
	}

	public Company getCompany()
	{
		return company;
	}

	public void setCompany(Company company)
	{
		this.company = company;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public long getDwid()
	{
		return dwid;
	}

	public void setDwid(long dwid)
	{
		this.dwid = dwid;
	}

	public static SimpleDateFormat getSdf()
	{
		return sdf;
	}

	public Long getTypeid()
	{
		return typeid;
	}

	public void setTypeid(Long typeid)
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

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getIdentitycard()
	{
		return identitycard;
	}

	public void setIdentitycard(String identitycard)
	{
		this.identitycard = identitycard;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getCartype()
	{
		return cartype;
	}

	public void setCartype(String cartype)
	{
		this.cartype = cartype;
	}

	public Date getValidtime()
	{
		return validtime;
	}

	public void setValidtime(Date validtime)
	{
		this.validtime = validtime;
	}

	public Date getCertificationtime()
	{
		return certificationtime;
	}

	public void setCertificationtime(Date certificationtime)
	{
		this.certificationtime = certificationtime;
	}

	public String getLicenseno()
	{
		return licenseno;
	}

	public void setLicenseno(String licenseno)
	{

		this.licenseno = licenseno;
	}

	public String toJson()
	{
		StringBuffer strbuffBuffer = new StringBuffer();

		strbuffBuffer.append("{'id':'");
		strbuffBuffer.append(getId());
		strbuffBuffer.append("','dwid':'");
		strbuffBuffer.append(this.company.getComname());
		strbuffBuffer.append("','typeid':'");
		strbuffBuffer.append(typeid);
		strbuffBuffer.append("','phone':'");
		strbuffBuffer.append(phone);
		strbuffBuffer.append("','name':'");
		strbuffBuffer.append(name);
		strbuffBuffer.append("','address':'");
		strbuffBuffer.append(address);
		strbuffBuffer.append("','identitycard':'");
		strbuffBuffer.append(identitycard);
		strbuffBuffer.append("','sex':'");
		strbuffBuffer.append(sex);
		strbuffBuffer.append("','cartype':'");
		strbuffBuffer.append(cartype);
		strbuffBuffer.append("','validtime':'");
		strbuffBuffer.append(sdf.format(validtime));
		strbuffBuffer.append("','certificationtime':'");
		strbuffBuffer.append(sdf.format(certificationtime));
		strbuffBuffer.append("','age':'");
		strbuffBuffer.append(age);
		strbuffBuffer.append("','licenseno':'");
		strbuffBuffer.append(licenseno);
		strbuffBuffer.append("'}");
		// System.out.println(strbuffBuffer.toString());
		return strbuffBuffer.toString();
	}
}
