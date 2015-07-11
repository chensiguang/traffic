/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.RolePermission;

/**
 * @author wqg
 * 
 *         2013-9-26下午2:46:19
 */
public class RolePermissionVDomContent
{

	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long no;// id

	private long roleno;// 角色id

	private long perno;// 权限id

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private String regtime;// 注册时间

	private int isChecked;// 标记复选框是否选中

	public int getIsChecked()
	{
		return isChecked;
	}

	public void setIsChecked(int isChecked)
	{
		this.isChecked = isChecked;
	}

	public long getNo()
	{
		return no;
	}

	public void setNo(long no)
	{
		this.no = no;
	}

	public long getRoleno()
	{
		return roleno;
	}

	public void setRoleno(long roleno)
	{
		this.roleno = roleno;
	}

	public long getPerno()
	{
		return perno;
	}

	public void setPerno(long perno)
	{
		this.perno = perno;
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

	public String getRegtime()
	{
		return regtime;
	}

	public void setRegtime(String regtime)
	{
		this.regtime = regtime;
	}

	public RolePermissionVDomContent()
	{

	}

	public RolePermissionVDomContent(RolePermission rolePer)
	{
		if (null != rolePer)
		{
			this.no = rolePer.getNo();

			this.operid = rolePer.getOperid();

			this.opertime = sdf.format(rolePer.getOpertime());

			this.perno = rolePer.getPerno();

			this.regtime = sdf.format(rolePer.getRegtime());

			this.remark = rolePer.getRemark();

			this.roleno = rolePer.getRoleno();
			
			this.isChecked = rolePer.getIsChecked();

		}
	}

}
