package com.web.action.vo;

import java.text.SimpleDateFormat;

import com.web.pojo.MeetNotice;

/**
 * 后台管理－会议通知
 * 
 * @author jjl date 2013/9/15
 */
public class MeetNoticeVDomContent {
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd");

	private Integer noticeType = 0; // 信息类型

	private String noticeTitle = ""; // 信息标题

	private String noticeTime; // 信息发布时间

	private String noticeContent = ""; // 通知内容

	private String noticeContentUrl = "";// 信息内容地址

	private Long id; // 主键

	private Integer state; // 状态

	private String remark; // 备注

	private Long operid; // 操作人id

	private String opertime; // 操作时间

	private Long regid; // 注册id

	private String regtime; // 注册时间

	private String str;

	private MeetNotice meetnotice = new MeetNotice();

	public Integer getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(Integer noticeType) {
		this.noticeType = noticeType;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(String noticeTime) {
		this.noticeTime = noticeTime;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeContentUrl() {
		return noticeContentUrl;
	}

	public void setNoticeContentUrl(String noticeContentUrl) {
		this.noticeContentUrl = noticeContentUrl;
	}

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

	public MeetNotice getMeetnotice() {
		return meetnotice;
	}

	public void setMeetnotice(MeetNotice meetnotice) {
		this.meetnotice = meetnotice;
	}

	public MeetNoticeVDomContent() {

	}

	public MeetNoticeVDomContent(MeetNotice meetnotice) {

		if (meetnotice != null) {
			this.noticeType = meetnotice.getNoticeType();
			this.noticeTitle = meetnotice.getNoticeTitle();
			this.noticeTime = sdf.format(meetnotice.getNoticeTime());
			this.noticeContent = meetnotice.getNoticeContent();
			this.noticeContentUrl = meetnotice.getNoticeContentUrl();
			// 公用字段
			this.id = meetnotice.getId();
			this.operid = meetnotice.getOperid();
			this.opertime = sdf.format(meetnotice.getOpertime());
			this.regid = meetnotice.getRegid();
			this.regtime = sdf.format(meetnotice.getRegtime());
			this.remark = meetnotice.getRemark();
			this.state = meetnotice.getState();
			this.str = meetnotice.getStr();
		}
	}
}
