/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.Driver;

/**
 * @author wqg
 * 
 *         2013-9-10上午9:43:18
 */
public class DriverVDomContent
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
	private String validtime;

	// 年审日期
	private String certificationtime;

	private String updatetime;// 更新时间

	private Integer age;

	// 驾驶证号码
	private String licenseno;

	private Integer state;

	private String remark;

	private Long operid;

	private String opertime;

	private String learntime;// 安全教育学习时长

	private String cars;// 管理的车辆

	private String loginname;// 登录账号

	private String password;// 登录密码

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

	public long getDwid()
	{
		return dwid;
	}

	public void setDwid(long dwid)
	{
		this.dwid = dwid;
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

	public String getValidtime()
	{
		return validtime;
	}

	public void setValidtime(String validtime)
	{
		this.validtime = validtime;
	}

	public String getCertificationtime()
	{
		return certificationtime;
	}

	public void setCertificationtime(String certificationtime)
	{
		this.certificationtime = certificationtime;
	}

	public String getUpdatetime()
	{
		return updatetime;
	}

	public void setUpdatetime(String updatetime)
	{
		this.updatetime = updatetime;
	}

	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public String getLicenseno()
	{
		return licenseno;
	}

	public void setLicenseno(String licenseno)
	{
		this.licenseno = licenseno;
	}

	public DriverVDomContent()
	{

	}

	public DriverVDomContent(Driver driver)
	{
		if (null != driver)
		{
			this.address = driver.getAddress();

			this.age = driver.getAge();

			this.cartype = driver.getCartype();

			this.certificationtime = sdf.format(driver.getCertificationtime());

			this.dwid = driver.getDwid();

			this.identitycard = driver.getIdentitycard();

			this.licenseno = driver.getLicenseno();

			this.name = driver.getName();

			this.phone = driver.getPhone();

			this.sex = driver.getSex();

			this.typeid = driver.getTypeid();

			this.validtime = sdf.format(driver.getValidtime());

			this.operid = driver.getOperid();

			this.opertime = sdf.format(driver.getOpertime());

			this.state = driver.getState();

			this.updatetime = sdf.format(driver.getUpdatetime());

			this.remark = driver.getRemark();

			this.cars = driver.getCars();

			this.learntime = driver.getLearntime();
			
			this.password = driver.getPassword();
			
			this.loginname = driver.getLoginname();

		}
	}
}
