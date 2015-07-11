/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.SafeGroupCarDriver;

/**
 * 安全组
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:05:48
 */
public class SafeGroupCarDriverVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");
	private long groupid;// 安全组id

	private long zzid;// 组长id

	private long dwid;// 单位id

	private String driverid;// 安全组下所有的人员

	private String carid;// 安全组下所有的车辆

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private Long regid;// 注册人id

	private String regtime;// 注册时间

	public String getDriverid()
	{
		return driverid;
	}

	public void setDriverid(String driverid)
	{
		this.driverid = driverid;
	}

	public String getCarid()
	{
		return carid;
	}

	public void setCarid(String carid)
	{
		this.carid = carid;
	}

	public long getGroupid()
	{
		return groupid;
	}

	public void setGroupid(long groupid)
	{
		this.groupid = groupid;
	}
	public long getZzid()
	{
		return zzid;
	}

	public void setZzid(long zzid)
	{
		this.zzid = zzid;
	}

	public long getDwid()
	{
		return dwid;
	}

	public void setDwid(long dwid)
	{
		this.dwid = dwid;
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

	public SafeGroupCarDriverVDomContent()
	{

	}

	public SafeGroupCarDriverVDomContent(SafeGroupCarDriver safeGroup)
	{
		if (safeGroup != null)
		{
			this.dwid = safeGroup.getDwid();

			this.groupid = safeGroup.getGroupid();

			this.zzid = safeGroup.getZzid();
			
			this.carid = safeGroup.getCarid();
			
			this.driverid = safeGroup.getDriverid();

			this.operid = safeGroup.getRegid();

			this.remark = safeGroup.getRemark();

			this.state = safeGroup.getState();

			this.regtime = sdf.format(safeGroup.getRegtime());

			this.opertime = sdf.format(safeGroup.getOpertime());
		}
	}
}
