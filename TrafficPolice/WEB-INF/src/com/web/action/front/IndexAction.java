package com.web.action.front;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Branch;
import com.web.pojo.Car;
import com.web.pojo.Driver;
import com.web.pojo.EduVideo;
import com.web.pojo.MeetNotice;
import com.web.pojo.Rule;
import com.web.pojo.RuleIllegal;
import com.web.pojo.SafeNotice;
import com.web.pojo.Interchange;
import com.web.pojo.Micromessage;
import com.web.service.interfaces.BranchService;
import com.web.service.interfaces.CarService;
import com.web.service.interfaces.DriverService;
import com.web.service.interfaces.EduVideoService;
import com.web.service.interfaces.MeetNoticeService;
import com.web.service.interfaces.RuleIllegalService;
import com.web.service.interfaces.RuleService;
import com.web.service.interfaces.SafeNoticeService;
import com.web.service.interfaces.InterchangeService;
import com.web.service.interfaces.MicromessageService;

/**
 * 
 * 
 * @ClassName: IndexAction
 * 
 * @Description: TODO
 * 
 * @author ws
 * 
 * @date 2013-7-17 下午02:22:28
 * 
 * 
 */
public class IndexAction extends BaseAction {

	private static final long serialVersionUID = -5240049408930686445L;

	// 交通法规列表
	private List<Rule> rulelist;

	private List<EduVideo> eduList2;

	// 驾驶员信息列表
	private List<Driver> driverlist;

	// 交通违法查询列表
	private List<RuleIllegal> illegallist;

	// 视频
	private EduVideo video;

	// 快熟处理点列表
	private List<Branch> branchlist;

	// 通知列表
	private List<SafeNotice> safenoticelist;

	// 会议通知列表
	private List<MeetNotice> meetingnoticelist;

	// 问题互动信息列表
	private List<Interchange> interchangelist;

	// 微信互动信息列表
	private List<Micromessage> micromessagelist;

	// 车辆管理列表
	private List<Car> carlist;

	// 交通法规Service
	@Autowired
	private RuleService ruleService;

	// 驾驶员Service
	@Autowired
	private DriverService driverService;

	// 违法查询Service
	@Autowired
	private RuleIllegalService ruleIllegalService;

	// 宣教中心Service
	@Autowired
	private EduVideoService eduVideoService;

	// 快速处理点Service
	@Autowired
	private BranchService branchService;

	// 安全提醒Service
	@Autowired
	private SafeNoticeService safeNoticeService;

	// 会议通知Service
	@Autowired
	private MeetNoticeService meetNoticeService;

	// 问题互动Service
	@Autowired
	private InterchangeService interchangeService;

	// 微信互动Service
	@Autowired
	private MicromessageService micromessageService;

	// 车辆管理Service
	@Autowired
	private CarService carService;

	// 进入首页
	public String view() {
		log.info("do index view...");

		ServletActionContext.getRequest().getSession().setAttribute(
				"projectpath",
				ServletActionContext.getRequest().getContextPath());

		// setRulelist(ruleService.selectAllList(0, 20));

		rulelist = ruleService.queryAll();

		setDriverlist(driverService.selectDriverList(0, 20));

		setIllegallist(ruleIllegalService.selectIllegalList(0, 20));

		List<EduVideo> eduList = eduVideoService.selectVideoList(0, 1);

		eduList2 = eduVideoService.queryAll();

		setVideo(eduList.size() > 0 ? eduList.get(0) : null);

		setBranchlist(branchService.selectBranchList(0, 20));

		setMeetingnoticelist(meetNoticeService.selectNoticeList(0, 3));

		setSafenoticelist(safeNoticeService.selectNoticeList(0, 3));
		setInterchangelist(interchangeService.selectInterchangeList(0, 4));

		setMicromessagelist(micromessageService.selectMicromessageList(0, 20));
		setCarlist(carService.selectCarList(0, 20));

		log.info("end index view...");

		return "view";
	}

	public List<Rule> getRulelist() {
		return rulelist;
	}

	public void setRulelist(List<Rule> rulelist) {
		this.rulelist = rulelist;
	}

	public List<Driver> getDriverlist() {
		return driverlist;
	}

	public void setDriverlist(List<Driver> driverlist) {
		this.driverlist = driverlist;
	}

	public List<RuleIllegal> getIllegallist() {
		return illegallist;
	}

	public void setIllegallist(List<RuleIllegal> illegallist) {
		this.illegallist = illegallist;
	}

	public EduVideo getVideo() {
		return video;
	}

	public void setVideo(EduVideo video) {
		this.video = video;
	}

	public List<Branch> getBranchlist() {
		return branchlist;
	}

	public void setBranchlist(List<Branch> branchlist) {
		this.branchlist = branchlist;
	}

	public List<SafeNotice> getSafenoticelist() {
		return safenoticelist;
	}

	public void setSafenoticelist(List<SafeNotice> safenoticelist) {
		this.safenoticelist = safenoticelist;
	}

	public List<MeetNotice> getMeetingnoticelist() {
		return meetingnoticelist;
	}

	public void setMeetingnoticelist(List<MeetNotice> meetingnoticelist) {
		this.meetingnoticelist = meetingnoticelist;
	}

	public List<EduVideo> getEduList2() {
		return eduList2;
	}

	public void setEduList2(List<EduVideo> eduList2) {
		this.eduList2 = eduList2;
	}

	public List<Interchange> getInterchangelist() {
		return interchangelist;
	}

	public void setInterchangelist(List<Interchange> interchangelist) {
		this.interchangelist = interchangelist;
	}

	public List<Micromessage> getMicromessagelist() {
		return micromessagelist;
	}

	public void setMicromessagelist(List<Micromessage> micromessagelist) {
		this.micromessagelist = micromessagelist;
	}

	public List<Car> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<Car> carlist) {
		this.carlist = carlist;
	}

}
