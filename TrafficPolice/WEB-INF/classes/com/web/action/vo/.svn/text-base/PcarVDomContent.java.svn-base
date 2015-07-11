/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.vo;

import java.text.SimpleDateFormat;
import com.web.pojo.Pcar;

/**
 * @author ln
 * 
 * @Date 2013-9-23
 */
public class PcarVDomContent
{
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");
	// 账户车辆id
	private Long udid;

	// 账户id
	private Long userid;
	
	// 车辆id
	private Long carid;
	
	// 车牌号码
	private String buslicplate;

	// 所属公司id
	private Long comid;

	// 所属公司名称
	private String comname;
	
	//划分人姓名
	private String opername;

	private Integer state;

	private String remark;

	private Long operid;
	private String opertime;
	// 公用字段
	private Long id; // 主键

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

	public Long getUdid()
	{
		return udid;
	}

	public void setUdid(Long udid)
	{
		this.udid = udid;
	}

	public Long getUserid()
	{
		return userid;
	}

	public void setUserid(Long userid)
	{
		this.userid = userid;
	}

	public Long getCarid()
	{
		return carid;
	}

	public void setCarid(Long carid)
	{
		this.carid = carid;
	}

	public String getBuslicplate()
	{
		return buslicplate;
	}

	public void setBuslicplate(String buslicplate)
	{
		this.buslicplate = buslicplate;
	}
	
	public Long getComid()
	{
		return comid;
	}

	public void setComid(Long comid)
	{
		this.comid = comid;
	}

	public String getComname()
	{
		return comname;
	}

	public void setComname(String comname)
	{
		this.comname = comname;
	}

	public String getOpername()
	{
		return opername;
	}

	public void setOpername(String opername)
	{
		this.opername = opername;
	}
	
	public String getOpertime()
	{
		return opertime;
	}

	public void setOpertime(String opertime)
	{
		this.opertime = opertime;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PcarVDomContent()
	{

	}

	public PcarVDomContent(Pcar pcar)
	{
		if (null != pcar)
		{
			this.udid = pcar.getUdid();
			this.userid = pcar.getUserid();
			this.carid = pcar.getCarid();
			this.buslicplate = pcar.getBuslicplate();
			this.comid = pcar.getComid();
			this.comname = pcar.getComname();
			this.operid = pcar.getOperid();
			this.opertime = sdf.format(pcar.getOpertime());
			this.state = pcar.getState();
			this.remark = pcar.getRemark();
			this.opername = pcar.getOpername();
			this.id = pcar.getId();
		}
	}
}
