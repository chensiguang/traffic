package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.SafeNoticeVDomContent;
import com.web.pojo.SafeNotice;
import com.web.service.interfaces.SafeNoticeService;

/**
 * 后台管理－安全提醒
 * 
 * @author jjl date 2013/9/12
 */
public class SafeNoticeAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	@Autowired
	private SafeNoticeService safenoticeService;
	private List<SafeNotice> safenoticeList;
	private SafeNotice safenotice = new SafeNotice();
	private static final String title = "安全提醒";
	private String ids;
	private String action;
	private static ListActions opt;
	private SafeNoticeVDomContent dom;
	private final static int PAGESIZE = 10;

	public SafeNoticeService getSafenoticeService() {
		return safenoticeService;
	}

	public void setSafenoticeService(SafeNoticeService safenoticeService) {
		this.safenoticeService = safenoticeService;
	}

	public List<SafeNotice> getSafenoticeList() {
		return safenoticeList;
	}

	public void setSafenoticeList(List<SafeNotice> safenoticeList) {
		this.safenoticeList = safenoticeList;
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
		SafeNoticeAction.opt = opt;
	}

	public SafeNoticeVDomContent getDom() {
		return dom;
	}

	public void setDom(SafeNoticeVDomContent dom) {
		this.dom = dom;
	}

	public String getTitle() {
		return title;
	}

	public int getPAGESIZE() {
		return PAGESIZE;
	}

	public SafeNotice getSafenotice() {
		return safenotice;
	}

	public void setSafenotice(SafeNotice safenotice) {
		this.safenotice = safenotice;
	}

	static {
		opt = new ListActions();
		opt.setAddAction("page/admin/page/safenoticeback_addSafeNotice.action"); // 新增
		opt.setEditAction("page/admin/page/safenoticeback_editSafeNotice.action"); // 修改
		opt.setDeleteAction("page/admin/page/safenoticeback_deleteSafeNotice.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/safenoticeback_deleteAllSafeNotice.action"); // 批量删除
		opt.setShowAction("page/admin/page/safenoticeback_detailSafeNotice.action"); // 详情
	}

	// 查询所有、条件查询
	public String viewSafeNoticeList() {
		//获取页面查询的条件值
		String noticeTitle = this.getParameter("noticeTitle")==null?"":this.getParameter("noticeTitle");
		safenotice.setNoticeTitle(noticeTitle);
		
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if(!noticeTitle.equals("") && noticeTitle != null){
			querya.put("noticeTitle", noticeTitle);
		}
		int allnum = safenoticeService.getCountByAll(querya);
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
		safenoticeList = safenoticeService.selectPage(queryp);
		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/safenoticeback_viewSafeNoticeList.action");
		return "default";
	}

	// 详情
	public String detailSafeNotice() {
		String id = this.getParameter("id");
		dom = new SafeNoticeVDomContent(safenoticeService.queryDataById(id));
		safenoticeList = safenoticeService.selectUsernameById(id);
		action = opt.getEditAction() + "?id=" + id;
		return "view";
	}

	// 新增
	public String addSafeNotice() {
		safenoticeList = safenoticeService.queryAll();
		
		if(safenoticeList != null)
		{
			getSession().setAttribute("safenoticeList", safenoticeList);
		}
		action = "page/admin/page/safenoticeback_insertSafeNotice.action";
		return "edit";
	}

	// 新增-提交
	public String insertSafeNotice() {
		SafeNotice safenotice = new SafeNotice();
		safenotice.setNoticeTitle(dom.getNoticeTitle());
		// 查看信息标题是否重复
		int num = safenoticeService.selectSafeNoticeByNoticeTitle(safenotice);
		if (num != 0) {
			message = "'" + dom.getNoticeTitle() + "'标题已存在!";
			action = opt.getAddAction();
		} else {
			safenotice.setNoticeType(1);// 1、安全提醒 2、会议通知
			safenotice.setNoticeTime(new Date());
			safenotice.setNoticeContent(dom.getNoticeContent());
			safenotice.setNoticeContentUrl(dom.getNoticeContentUrl());
			safenotice.setId(dom.getId());
			safenotice.setOperid((long) getCurrUser());
			safenotice.setOpertime(new Date());
			safenotice.setState(1);
			safenotice.setRegid((long) getCurrUser());
			safenotice.setRegtime(new Date());
			safenotice.setRemark(dom.getRemark());

			action = "page/admin/page/safenoticeback_viewSafeNoticeList.action";
			safenoticeService.insertSafeNotice(safenotice);
			message = "信息新增成功!";
		}
		return SUCCESS;
	}

	// 修改-编辑
	public String editSafeNotice() {
		String id = this.getParameter("id");
		SafeNotice safenotice = safenoticeService.queryDataById(id);
		dom = new SafeNoticeVDomContent(safenotice);
		action = "page/admin/page/safenoticeback_updateSafeNotice.action?id="
				+ id;
		return "edit";
	}

	// 修改-提交
	public String updateSafeNotice() {
		String id = this.getParameter("id");
		SafeNotice safenotice = new SafeNotice();
		safenotice.setNoticeTitle(dom.getNoticeTitle());
		safenotice.setId((long) Integer.parseInt(id));
		// 查看信息标题是否重复
		int num = safenoticeService.selectSafeNoticeByNoticeTitle(safenotice);
		if (num != 0) {
			message = "'" + dom.getNoticeTitle() + "'标题已重复!";
			action = opt.getEditAction() + "?id=" + id;
		} else {
			safenotice.setNoticeContent(dom.getNoticeContent());
			safenotice.setNoticeContentUrl(dom.getNoticeContentUrl());
			safenotice.setOperid((long) getCurrUser());
			safenotice.setOpertime(new Date());
			safenotice.setRemark(dom.getRemark());

			action = "page/admin/page/safenoticeback_viewSafeNoticeList.action";
			safenoticeService.updateSafeNotice(safenotice);
			message = "信息修改成功!";
		}
		return SUCCESS;
	}

	// 单个删除
	public String deleteSafeNotice() {
		String id = this.getParameter("id");
		safenoticeService.dropDataById(id);
		action = "page/admin/page/safenoticeback_viewSafeNoticeList.action";
		message = "信息删除成功!";
		return SUCCESS;
	}

	// 批量删除
	public String deleteAllSafeNotice() {
		safenoticeService.dropAllDataByIds(ids);
		action = "page/admin/page/safenoticeback_viewSafeNoticeList.action";
		message = "信息批量删除成功!";
		return SUCCESS;
	}
}
