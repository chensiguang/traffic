package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.Area;

/**
 * 地域管理
 * 
 * @author jjl date 2013/9/25
 */
public class AreaVDomContent {
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");
	private Long areaid;// 序列
	private String areaname;// 地区
	private Integer parentid;// 父类地区id
	private String description;// 描述
	private Integer orderno;// 顺序
	private String mailcode;// 邮政编码
	private String callcode;// 电话区号

	// 公用字段
	private Integer state; // 状态
	private String remark; // 备注
	private Long operid; // 操作人id
	private String opertime; // 操作时间
	private Long regid; // 注册id
	private String regtime; // 注册时间
	private String str;
	private Area area = new Area();

	public Long getAreaid() {
		return areaid;
	}

	public void setAreaid(Long areaid) {
		this.areaid = areaid;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOrderno() {
		return orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public String getMailcode() {
		return mailcode;
	}

	public void setMailcode(String mailcode) {
		this.mailcode = mailcode;
	}

	public String getCallcode() {
		return callcode;
	}

	public void setCallcode(String callcode) {
		this.callcode = callcode;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getOperid() {
		return operid;
	}

	public void setOperid(Long operid) {
		this.operid = operid;
	}

	public String getOpertime() {
		return opertime;
	}

	public void setOpertime(String opertime) {
		this.opertime = opertime;
	}

	public Long getRegid() {
		return regid;
	}

	public void setRegid(Long regid) {
		this.regid = regid;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public AreaVDomContent() {

	}

	public AreaVDomContent(Area area) {

		if (area != null) {
			this.areaname = area.getAreaname();
			this.parentid = area.getParentid();
			this.description = area.getDescription();
			this.orderno = area.getOrderno();
			this.mailcode = area.getMailcode();
			this.callcode = area.getCallcode();
			// 公用字段
			this.operid = area.getOperid();
			this.opertime = sdf.format(area.getOpertime());
			this.regid = area.getRegid();
			this.regtime = sdf.format(area.getRegtime());
			this.remark = area.getRemark();
			this.state = area.getState();
			this.str = area.getStr();
		}
	}
}
