/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Account;

/**
 * 账号管理
 * 
 * @author wqg
 * 
 *         2013-9-25上午10:13:10
 */
public class AccountVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long useno;// 账户id

	private long dwno;// 单位id

	private long roleno;// 角色id

	private String loginname;// 登录名称

	private String username;// 登录名称

	private String password;// 登录密码

	private String telephone;// 联系电话

	private String address;// 地址

	private String email;// 邮编

	private long typeid;// 类型id

	private long operid;// 操作人id

	private String opertime;// 操作时间

	private Integer state;// 状态

	private String remark;// 备注

	private long regid;// 注册人id

	private String regtime;// 注册时间

	private long adminflag;// 标记是否为数据管理员

	public long getAdminflag()
	{
		return adminflag;
	}

	public void setAdminflag(long adminflag)
	{
		this.adminflag = adminflag;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setRegid(long regid)
	{
		this.regid = regid;
	}

	public long getUseno()
	{
		return useno;
	}

	public void setUseno(long useno)
	{
		this.useno = useno;
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

	public long getOperid()
	{
		return operid;
	}

	public void setOperid(long operid)
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

	public AccountVDomContent()
	{

	}

	public AccountVDomContent(Account account)
	{
		if (null != account)
		{
			this.address = account.getAddress();

			this.dwno = account.getDwno();

			this.email = account.getEmail();

			this.loginname = account.getLoginname();

			this.username = account.getUsername();

			this.opertime = sdf.format(account.getOpertime());

			this.password = account.getPassword();

			this.regtime = sdf.format(account.getRegtime());

			this.remark = account.getRemark();

			this.roleno = account.getRoleno();

			this.state = account.getState();

			this.telephone = account.getTelephone();

			this.typeid = account.getTypeid();
			
			this.adminflag = account.getAdminflag();

		}
	}
}
