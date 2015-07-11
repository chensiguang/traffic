package com.web.action.vo;
import java.text.SimpleDateFormat;

import com.web.pojo.PoliceOrg;

/**单位信息
 * 
 * @author wqg
 *
 * 2013-10-2下午3:45:00
 */
public class PoliceOrgVDomContent
{
	protected static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private long id;// 主键id

	private String orgname;// 单位名称

	private long typeid;// 对象类型id

	private String phone;// 单位电话

	private String address;// 单位地址

	private String pid;// 所在父类机构id
	
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

	public String getOrgname()
	{
		return orgname;
	}

	public void setOrgname(String orgname)
	{
		this.orgname = orgname;
	}

	public long getTypeid()
	{
		return typeid;
	}

	public void setTypeid(long typeid)
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

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPid()
	{
		return pid;
	}

	public void setPid(String pid)
	{
		this.pid = pid;
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
	
	public PoliceOrgVDomContent()
	{
		
	}
	
	public PoliceOrgVDomContent(PoliceOrg org)
	{
		if(org != null)
		{
			this.id = org.getId();
			
			this.opertime = sdf.format(org.getOpertime());
			
			this.orgname = org.getOrgname();
			
			this.phone = org.getPhone();
			
			this.regtime = sdf.format(org.getRegtime());
			
			this.remark = org.getRemark();
			
			this.typeid = org.getTypeid();
			
			this.address = org.getAddress();
			
			this.pid = org.getPid();
		}
	}
}
