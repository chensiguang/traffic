/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Type;

/**类型
 * 
 * @author wqg
 * 
 *         2013-9-25下午2:37:35
 */
public class TypeVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private long typeid;// 类型id

	private String typename;// 类型名称

	private long groupid;// 分组id

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private String opertime;// 操作时间

	private long regid;// 注册人id

	private String regtime;// 注册时间

	public long getTypeid()
	{
		return typeid;
	}

	public void setTypeid(long typeid)
	{
		this.typeid = typeid;
	}

	public String getTypename()
	{
		return typename;
	}

	public void setTypename(String typename)
	{
		this.typename = typename;
	}

	public long getGroupid()
	{
		return groupid;
	}

	public void setGroupid(long groupid)
	{
		this.groupid = groupid;
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

	public long getRegid()
	{
		return regid;
	}

	public void setRegid(long regid)
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
	
	public TypeVDomContent()
	{
		
	}
	
	public TypeVDomContent(Type type)
	{
		if(null != type)
		{
			this.operid = type.getOperid();
			
			this.opertime = sdf.format(type.getOpertime());
			
			this.typename = type.getTypename();
			
			this.regtime = sdf.format(type.getRegtime());
			
			this.remark = type.getRemark();
		}
		
	}

}
