package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.MeetNoticeVDomContent;
import com.web.pojo.MeetNotice;
import com.web.service.interfaces.MeetNoticeService;

/**
 * 后台管理－会议通知
 * 
 * @author jjl date 2013/9/15
 */
public class MeetNoticeAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	@Autowired
	private MeetNoticeService meetnoticeService;
	private List<MeetNotice> meetnoticeList;
	private MeetNotice meetnotice = new MeetNotice();
	private static final String title = "会议通知";
	private String ids;
	private String action;
	private static ListActions opt;
	private MeetNoticeVDomContent dom;
	private final static int PAGESIZE = 10;

	public MeetNoticeService getMeetnoticeService() {
		return meetnoticeService;
	}

	public void setMeetnoticeService(MeetNoticeService meetnoticeService) {
		this.meetnoticeService = meetnoticeService;
	}

	public List<MeetNotice> getMeetnoticeList() {
		return meetnoticeList;
	}

	public void setMeetnoticeList(List<MeetNotice> meetnoticeList) {
		this.meetnoticeList = meetnoticeList;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public ListActions getOpt() {
		return opt;
	}

	public void setOpt(ListActions opt) {
		MeetNoticeAction.opt = opt;
	}

	public MeetNoticeVDomContent getDom() {
		return dom;
	}

	public void setDom(MeetNoticeVDomContent dom) {
		this.dom = dom;
	}

	public String getTitle() {
		return title;
	}

	public int getPAGESIZE() {
		return PAGESIZE;
	}

	public MeetNotice getMeetnotice() {
		return meetnotice;
	}

	public void setMeetnotice(MeetNotice meetnotice) {
		this.meetnotice = meetnotice;
	}

	static {
		opt = new ListActions();
		opt.setAddAction("page/admin/page/meetnoticeback_addMeetNotice.action"); // 新增
		opt.setEditAction("page/admin/page/meetnoticeback_editMeetNotice.action"); // 修改
		opt.setDeleteAction("page/admin/page/meetnoticeback_deleteMeetNotice.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/meetnoticeback_deleteAllMeetNotice.action"); // 批量删除
		opt.setShowAction("page/admin/page/meetnoticeback_detailMeetNotice.action"); // 详情
	}

	// 查询所有、条件查询
	public String viewMeetNoticeList() {
		//获取页面查询的条件值
		String noticeTitle = this.getParameter("noticeTitle")==null?"":this.getParameter("noticeTitle");
		meetnotice.setNoticeTitle(noticeTitle);
		
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if(!noticeTitle.equals("") && noticeTitle != null){
			querya.put("noticeTitle", noticeTitle);
		}
		int allnum = meetnoticeService.getCountByAll(querya);
		// 当前页号
		String pn = this.getParameter("page");
		int curpage = 1;
		if (pn != null) {
			int t = Integer.parseInt(pn);
			if (t > 0) {
				curpage = t;
			}
		}
		HashMap<String, Object> queryp = new HashMap<String, Object>();
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		if(!noticeTitle.equals("") && noticeTitle != null){
			queryp.put("noticeTitle", noticeTitle);
		}
		meetnoticeList = meetnoticeService.selectPage(queryp);
		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/meetnoticeback_viewMeetNoticeList.action");
		return "default";
	}

	// 详情
	public String detailMeetNotice() {
		String id = this.getParameter("id");
		dom = new MeetNoticeVDomContent(meetnoticeService.queryDataById(id));
		meetnoticeList = meetnoticeService.selectUsernameById(id);
		action = opt.getEditAction() + "?id=" + id;
		return "view";
	}

	// 新增
	public String addMeetNotice() {
		meetnoticeList = meetnoticeService.queryAll();
		action = "page/admin/page/meetnoticeback_insertMeetNotice.action";
		return "edit";
	}

	// 新增-提交
	public String insertMeetNotice() {
		MeetNotice meetnotice = new MeetNotice();
		meetnotice.setNoticeTitle(dom.getNoticeTitle());
		// 查看信息标题是否重复
		int num = meetnoticeService.selectMeetNoticeByNoticeTitle(meetnotice);
		if (num != 0) {
			message = "'" + dom.getNoticeTitle() + "'标题已存在!";
			action = opt.getAddAction();
		} else {
			meetnotice.setNoticeType(2);// 1、安全提醒 2、会议通知
			meetnotice.setNoticeTime(new Date());
			meetnotice.setNoticeContent(dom.getNoticeContent());
			meetnotice.setNoticeContentUrl(dom.getNoticeContentUrl());
			meetnotice.setId(dom.getId());
			meetnotice.setOperid((long) getCurrUser());
			meetnotice.setOpertime(new Date());
			meetnotice.setState(1);
			meetnotice.setRegid((long) getCurrUser());
			meetnotice.setRegtime(new Date());
			meetnotice.setRemark(dom.getRemark());

			action = "page/admin/page/meetnoticeback_viewMeetNoticeList.action";
			meetnoticeService.insertMeetNotice(meetnotice);
			message = "信息新增成功!";
		}
		return SUCCESS;
	}

	// 修改-编辑
	public String editMeetNotice() {
		String id = this.getParameter("id");
		MeetNotice meetnotice = meetnoticeService.queryDataById(id);
		dom = new MeetNoticeVDomContent(meetnotice);
		action = "page/admin/page/meetnoticeback_updateMeetNotice.action?id="
				+ id;
		return "edit";
	}

	// 修改-提交
	public String updateMeetNotice() {
		String id = this.getParameter("id");
		MeetNotice meetnotice = new MeetNotice();
		meetnotice.setNoticeTitle(dom.getNoticeTitle());
		meetnotice.setId((long) Integer.parseInt(id));
		// 查看信息标题是否重复
		int num = meetnoticeService.selectMeetNoticeByNoticeTitle(meetnotice);
		if (num != 0) {
			message = "'" + dom.getNoticeTitle() + "'标题已重复!";
			action = opt.getEditAction() + "?id=" + id;
		} else {
			meetnotice.setNoticeContent(dom.getNoticeContent());
			meetnotice.setNoticeContentUrl(dom.getNoticeContentUrl());
			meetnotice.setOperid((long) getCurrUser());
			meetnotice.setOpertime(new Date());
			meetnotice.setRemark(dom.getRemark());

			action = "page/admin/page/meetnoticeback_viewMeetNoticeList.action";
			meetnoticeService.updateMeetNotice(meetnotice);
			message = "信息修改成功!";
		}
		return SUCCESS;
	}

	// 单个删除
	public String deleteMeetNotice() {
		String id = this.getParameter("id");
		meetnoticeService.dropDataById(id);
		action = "page/admin/page/meetnoticeback_viewMeetNoticeList.action";
		message = "信息删除成功!";
		return SUCCESS;
	}

	// 批量删除
	public String deleteAllMeetNotice() {
		meetnoticeService.dropAllDataByIds(ids);
		action = "page/admin/page/meetnoticeback_viewMeetNoticeList.action";
		message = "信息批量删除成功!";
		return SUCCESS;
	}
}
