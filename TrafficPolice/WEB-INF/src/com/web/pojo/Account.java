/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.pojo;

/**
 * 账户管理
 * 
 * @author wqg
 * 
 *         2013-9-25上午10:00:30
 */
public class Account extends BasePojo
{
	private long userno;// 账户id

	private long dwno;// 单位id

	private long roleno;// 角色id

	private String loginname;// 登录名称

	private String username;// 登录名称

	private String password;// 登录密码

	private String telephone;// 联系电话

	private String address;// 地址

	private String email;// 邮编

	private long typeid;// 类型id

	private long adminflag;// 标记是否为数据管理员

	private Role role;// 指向role的引用

	private Company company;// 指向企业company的引用

	private Admin admin;// 指向admin的引用

	private Driver driver;// 指向driver的引用

	private Police police;// 指向police的引用

	private String policename;

	public long getAdminflag()
	{
		return adminflag;
	}

	public void setAdminflag(long adminflag)
	{
		this.adminflag = adminflag;
	}

	public String getPolicename()
	{
		return policename;
	}

	public void setPolicename(String policename)
	{
		this.policename = policename;
	}

	public Police getPolice()
	{
		return police;
	}

	public void setPolice(Police police)
	{
		this.police = police;
	}

	public Driver getDriver()
	{
		return driver;
	}

	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Role getRole()
	{
		return role;
	}

	public void setRole(Role role)
	{
		this.role = role;
	}

	public Company getCompany()
	{
		return company;
	}

	public void setCompany(Company company)
	{
		this.company = company;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public long getUserno()
	{
		return userno;
	}

	public void setUserno(long userno)
	{
		this.userno = userno;
	}

	public long getDwno()
	{
		return dwno;
	}

	public void setDwno(long dwno)
	{
		this.dwno = dwno;
	}

	public long getRoleno()
	{
		return roleno;
	}

	public void setRoleno(long roleno)
	{
		this.roleno = roleno;
	}

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

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public long getTypeid()
	{
		return typeid;
	}

	public void setTypeid(long typeid)
	{
		this.typeid = typeid;
	}
}
