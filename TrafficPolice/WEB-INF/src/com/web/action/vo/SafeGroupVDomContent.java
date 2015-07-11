/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.SafeGroup;

/**
 * 安全组
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:05:48
 */
public class SafeGroupVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long id;// 主键

	private long groupid;// 安全组id

	private long zzid;// 组长id

	private long dwid;// 单位id

	private String driverid;// 安全组下所有的人员id

	private String carid;// 安全组下所有的车辆id

	private String drivers;// 安全组下所有的人员

	private String cars;// 安全组下所有的车辆

	private long flag;// 标记改组是否已经进行人员，车辆的分配

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private Long regid;// 注册人id

	private String regtime;// 注册时间

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public long getFlag()
	{
		return flag;
	}

	public void setFlag(long flag)
	{
		this.flag = flag;
	}

	public String getDrivers()
	{
		return drivers;
	}

	public void setDrivers(String drivers)
	{
		this.drivers = drivers;
	}

	public String getCars()
	{
		return cars;
	}

	public void setCars(String cars)
	{
		this.cars = cars;
	}

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

	public SafeGroupVDomContent()
	{

	}

	public SafeGroupVDomContent(SafeGroup safeGroup)
	{
		if (safeGroup != null)
		{
			this.id = safeGroup.getId();
			
			this.dwid = safeGroup.getDwid();

			this.groupid = safeGroup.getGroupid();

			this.zzid = safeGroup.getZzid();

			this.carid = safeGroup.getCarid();

			this.driverid = safeGroup.getDriverid();

			this.cars = safeGroup.getCars();

			this.flag = safeGroup.getFlag();

			this.drivers = safeGroup.getDrivers();

			this.operid = safeGroup.getRegid();

			this.remark = safeGroup.getRemark();

			this.state = safeGroup.getState();

			this.regtime = sdf.format(safeGroup.getRegtime());

			this.opertime = sdf.format(safeGroup.getOpertime());
		}
	}
}
