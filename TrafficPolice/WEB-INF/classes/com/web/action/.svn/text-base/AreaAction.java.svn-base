package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.AreaVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Area;
import com.web.service.interfaces.AreaService;

/**
 * 地域管理
 * 
 * @author jjl date 2013/9/25
 */
public class AreaAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	@Autowired
	private AreaService areaService;
	private List<Area> areaList;
	private static final String title = "地域管理";
	private String ids;
	private String action;
	private static ListActions opt;
	private AreaVDomContent dom;
	private final static int PAGESIZE = 10;
	private Area area = new Area();

	public AreaService getAreaService() {
		return areaService;
	}

	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}

	public List<Area> getAreaList() {
		return areaList;
	}

	public void setAreaList(List<Area> areaList) {
		this.areaList = areaList;
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
		AreaAction.opt = opt;
	}

	public AreaVDomContent getDom() {
		return dom;
	}

	public void setDom(AreaVDomContent dom) {
		this.dom = dom;
	}

	public String getTitle() {
		return title;
	}

	public int getPAGESIZE() {
		return PAGESIZE;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	static {
		opt = new ListActions();
		opt.setAddAction("page/admin/page/areaback_addArea.action"); // 新增
		opt.setEditAction("page/admin/page/areaback_editArea.action"); // 修改
		opt.setDeleteAction("page/admin/page/areaback_deleteArea.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/areaback_deleteAllArea.action"); // 批量删除
	}
	
	// 单个删除
	public String deleteArea() {
		String id = this.getParameter("id");
		areaService.dropDataById(id);
		action = "page/admin/page/areaback_viewAreaList.action";
		message = "信息删除成功!";
		return SUCCESS;
	}
	
	// 批量删除
	public String deleteAllArea() {
		areaService.dropDataByIds(ids);
		action = "page/admin/page/areaback_viewAreaList.action";
		message = "信息批量删除成功!";
		return SUCCESS;
	}
	
	//新增
	public String addArea(){
		String id = this.getParameter("parentid");
		action = "page/admin/page/areaback_insertArea.action?parentid="+id;
		return "edit";
	}
	
	//新增-提交
	public String insertArea(){
		String parentid = this.getParameter("parentid")==null?"":this.getParameter("parentid");
		Area area = new Area();
		area.setAreaname(dom.getAreaname());
		if(!parentid.equals("") && parentid != null){
			area.setParentid(Integer.parseInt(parentid));
		}
		area.setDescription(dom.getDescription());
		area.setCallcode(dom.getCallcode());
		area.setMailcode(dom.getMailcode());
		area.setOperid((long) getCurrUser());
		area.setOpertime(new Date());
		area.setState(1);
		area.setRegid((long) getCurrUser());
		area.setRegtime(new Date());
		area.setRemark(dom.getRemark());
		// 查看地域名称是否存在
		int num = areaService.selectAreaByAreaName(area);
		if(num != 0){
			message = "'" + dom.getAreaname() + "'地域名称已存在!";
			action = opt.getAddAction();
		}else{
			action = "page/admin/page/areaback_viewAreaList.action";
			areaService.insertArea(area);
			message = "信息新增成功!";
		}
		return SUCCESS;
	}
	
	//修改-编辑
	public String editArea(){
		String id = this.getParameter("id");
		Area area = areaService.queryDataById(Integer.parseInt(id));
		dom = new AreaVDomContent(area);
		action = "page/admin/page/areaback_updateArea.action?id=" + id;
		return "edit";
	}
	
	// 修改-提交
	public String updateArea() {
		String id = this.getParameter("id");
		Area area = new Area();
		area.setAreaname(dom.getAreaname());
		area.setAreaid((long)Integer.parseInt(id));
		area.setDescription(dom.getDescription());
		area.setCallcode(dom.getCallcode());
		area.setMailcode(dom.getMailcode());
		area.setOperid((long) getCurrUser());
		area.setOpertime(new Date());
		area.setRemark(dom.getRemark());
		// 查看地域名称是否重复
		int num = areaService.selectAreaByAreaName(area);
		if(num != 0){
			message = "'" + dom.getAreaname() + "'地域名称已重复!";
			action = opt.getEditAction() + "?id=" + id;
		}else{
			areaService.updateArea(area);
			message = "信息修改成功!";
			action = "page/admin/page/areaback_viewAreaList.action";
		}
		return SUCCESS;
	}
	
	public String viewAreaList(){
		return "default";
	}
	
	public String viewAreaSoList(){
		//获取页面查询的条件值
		String parentid = this.getParameter("parentid")==null?"":this.getParameter("parentid");
		if(!parentid.equals("") && parentid != null){
			area.setParentid(Integer.parseInt(parentid));
		}
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if(!parentid.equals("") && parentid != null){
			querya.put("parentid", parentid);
		}
		int allnum = areaService.getCountByAll(querya);
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
		if(!parentid.equals("") && parentid != null){
			queryp.put("parentid", parentid);
		}
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		areaList = areaService.selectPage(queryp);
		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/areaback_viewAreaList.action");
		return "solist";
	}
}
