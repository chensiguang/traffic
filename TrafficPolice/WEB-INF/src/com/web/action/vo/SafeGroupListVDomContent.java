/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.SafeGroupList;

/**
 * 安全组组别分类
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:05:48
 */
public class SafeGroupListVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long groupid;// 安全组id

	private String groupname;// 安全组组名

	private long zzid;// 组长id

	private String zzname;// 组长的名字

	private long dwid;// 单位id

	private long drivernum;// 组员人数

	private long carnum;// 组别车辆人数

	private Integer state;// 状态

	private long flag;// 标记改组是否已经进行人员，车辆的分配

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private Long regid;// 注册人id

	private String regtime;// 注册时间

	public String getZzname()
	{
		return zzname;
	}

	public void setZzname(String zzname)
	{
		this.zzname = zzname;
	}

	public long getFlag()
	{
		return flag;
	}

	public void setFlag(long flag)
	{
		this.flag = flag;
	}

	public long getDrivernum()
	{
		return drivernum;
	}

	public void setDrivernum(long drivernum)
	{
		this.drivernum = drivernum;
	}

	public long getCarnum()
	{
		return carnum;
	}

	public void setCarnum(long carnum)
	{
		this.carnum = carnum;
	}

	public void setCarnum(Integer carnum)
	{
		this.carnum = carnum;
	}

	public static SimpleDateFormat getSdf()
	{
		return sdf;
	}

	public long getGroupid()
	{
		return groupid;
	}

	public void setGroupid(long groupid)
	{
		this.groupid = groupid;
	}

	public String getGroupname()
	{
		return groupname;
	}

	public void setGroupname(String groupname)
	{
		this.groupname = groupname;
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

	public SafeGroupListVDomContent()
	{

	}

	public SafeGroupListVDomContent(SafeGroupList safeGroupList)
	{
		if (safeGroupList != null)
		{
			this.dwid = safeGroupList.getDwid();

			this.groupname = safeGroupList.getGroupname();

			this.zzid = safeGroupList.getZzid();

			this.zzname = safeGroupList.getZzname();

			this.drivernum = safeGroupList.getDrivernum();

			this.carnum = safeGroupList.getCarnum();

			this.flag = safeGroupList.getFlag();

			this.operid = safeGroupList.getRegid();

			this.remark = safeGroupList.getRemark();

			this.state = safeGroupList.getState();

			this.regtime = sdf.format(safeGroupList.getRegtime());

			this.opertime = sdf.format(safeGroupList.getOpertime());
		}
	}
}
