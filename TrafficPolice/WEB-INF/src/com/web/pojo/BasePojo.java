package com.web.pojo;

import java.util.Date;

/**
 * 
 * @ClassName: BasePojo
 * 
 * @Description: TODO
 * 
 * @author ws
 * 
 * @date 2013-7-17 上午09:57:31
 * 
 * 
 */
public class BasePojo {
	private Long id;// 主键

	private Integer state;// 状态

	private String remark;// 备注

	private Long operid;// 操作人id

	private Date opertime;// 操作时间

	private Long regid;// 注册人id

	private Date regtime;// 注册时间

	private Date updatetime;// 更新时间

	private String str;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getOpertime() {
		return opertime;
	}

	public void setOpertime(Date opertime) {
		this.opertime = opertime;
	}

	public Long getRegid() {
		return regid;
	}

	public void setRegid(Long regid) {
		this.regid = regid;
	}

	public Date getRegtime() {
		return regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public static String replace(String str) {
		return str.replace("'", "\\'").replace(":", "\\:").replace("{", "\\{")
				.replace("}", "\\}").replace("[", "\\[").replace("]", "\\]");
	}

}
