package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.PoliceOrgVDomContent;
import com.web.pojo.PoliceOrg;
import com.web.service.interfaces.PoliceOrgService;

public class OrgAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	@Autowired
	private PoliceOrgService policeOrgService;
	private List<PoliceOrg> policeOrgList;
	private PoliceOrg policeOrg = new PoliceOrg();
	private static final String title = "机构管理";
	private String ids;
	private String action;
	private static ListActions opt;
	private PoliceOrgVDomContent dom;
	private final static int PAGESIZE = 10;

	public PoliceOrgService getPoliceOrgService() {
		return policeOrgService;
	}

	public void setPoliceOrgService(PoliceOrgService policeOrgService) {
		this.policeOrgService = policeOrgService;
	}

	public List<PoliceOrg> getPoliceOrgList() {
		return policeOrgList;
	}

	public void setPoliceOrgList(List<PoliceOrg> policeOrgList) {
		this.policeOrgList = policeOrgList;
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
		OrgAction.opt = opt;
	}

	public PoliceOrgVDomContent getDom() {
		return dom;
	}

	public void setDom(PoliceOrgVDomContent dom) {
		this.dom = dom;
	}

	public String getTitle() {
		return title;
	}

	public int getPAGESIZE() {
		return PAGESIZE;
	}

	public PoliceOrg getPoliceOrg() {
		return policeOrg;
	}

	public void setPoliceOrg(PoliceOrg policeOrg) {
		this.policeOrg = policeOrg;
	}
	
	static {
		opt = new ListActions();
		opt.setAddAction("page/admin/page/policeorgback_addPoliceOrg.action"); // 新增
		opt.setEditAction("page/admin/page/policeorgback_editPoliceOrg.action"); // 修改
		opt.setDeleteAction("page/admin/page/policeorgback_deletePoliceOrg.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/policeorgback_deleteAllPoliceOrg.action"); // 批量删除
	}
	
	// 单个删除
	public String deletePoliceOrg() {
		String id = this.getParameter("id");
		policeOrgService.deleteDataById(id);
		action = "page/admin/page/policeorgback_viewPoliceOrgList.action";
		message = "信息删除成功!";
		return SUCCESS;
	}
	
	// 批量删除
	public String deleteAllPoliceOrg() {
		policeOrgService.deleteDataByIds(ids);
		action = "page/admin/page/policeorgback_viewPoliceOrgList.action";
		message = "信息批量删除成功!";
		return SUCCESS;
	}
	
	//修改-编辑
	public String editPoliceOrg(){
		String id = this.getParameter("id");
		PoliceOrg policeOrg = policeOrgService.queryDataById(id);
		dom = new PoliceOrgVDomContent(policeOrg);
		action = "page/admin/page/policeorgback_updatePoliceOrg.action?id=" + id;
		return "edit";
	}
	
	//修改-提交
	public String updatePoliceOrg(){
		String id = this.getParameter("id");
		PoliceOrg policeOrg = new PoliceOrg();
		policeOrg.setOrgname(dom.getOrgname());
		policeOrg.setPhone(dom.getPhone());
		policeOrg.setAddress(dom.getAddress());
		policeOrg.setId((long)Integer.parseInt(id));
		
		policeOrg.setOperid((long) getCurrUser());
		policeOrg.setOpertime(new Date());
		policeOrg.setRemark(dom.getRemark());
		// 查看地域名称是否重复
		int num = policeOrgService.newOrUpdate(policeOrg);
		if(num != 0){
			message = "'" + dom.getOrgname() + "'单位名称已重复!";
			action = opt.getEditAction() + "?id=" + id;
		}else{
			policeOrgService.updatePoliceOrg(policeOrg);
			message = "信息修改成功!";
			action = "page/admin/page/policeorgback_viewPoliceOrgList.action";
		}
		return SUCCESS;
	}
	
	//新增
	public String addPoliceOrg(){
		String pid = this.getParameter("pid");
		action = "page/admin/page/policeorgback_insertPoliceOrg.action?pid="+pid;
		return "edit";
	}
	
	//新增-提交
	public String insertPoliceOrg(){
		String pid = this.getParameter("pid")==null?"":this.getParameter("pid");
		PoliceOrg policeOrg = new PoliceOrg();
		policeOrg.setOrgname(dom.getOrgname());
		policeOrg.setPhone(dom.getPhone());
		policeOrg.setAddress(dom.getAddress());
		policeOrg.setPid(pid);
		
		policeOrg.setOperid((long) getCurrUser());
		policeOrg.setOpertime(new Date());
		policeOrg.setState(1);
		policeOrg.setRegid((long) getCurrUser());
		policeOrg.setRegtime(new Date());
		policeOrg.setRemark(dom.getRemark());
		// 查看单位名称是否存在
		int num = policeOrgService.newOrUpdate(policeOrg);
		if(num != 0){
			message = "'" + dom.getOrgname() + "'单位名称已存在!";
			action = opt.getAddAction();
		}else{
			action = "page/admin/page/policeorgback_viewPoliceOrgList.action";
			policeOrgService.insertPoliceOrg(policeOrg);
			message = "信息新增成功!";
		}
		return SUCCESS;
	}
	
	public String viewPoliceOrgList() {
		return "default";
	}

	public String viewPoliceOrgSoList() {
		// 获取页面查询的条件值
		String id = this.getParameter("parentid") == null ? "" : this
				.getParameter("parentid");
		if (!id.equals("") && id != null) {
			policeOrg.setId((long)Integer.parseInt(id));
		}
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if (!id.equals("") && id != null) {
			querya.put("id", id);
		}
		int allnum = policeOrgService.getCountByAll(querya);
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
		if (!id.equals("") && id != null) {
			queryp.put("id", id);
		}
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		policeOrgList = policeOrgService.selectPage(queryp);
		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/policeorgback_viewPoliceOrgList.action");
		return "solist";
	}
}
