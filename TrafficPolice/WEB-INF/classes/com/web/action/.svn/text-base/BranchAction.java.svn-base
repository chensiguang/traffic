package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.BranchVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Branch;
import com.web.service.interfaces.BranchService;

/**
 * @author wqg
 * 
 *         后台管理 2013-9-9上午11:12:59
 */
public class BranchAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private BranchService branchService;

	private List<Branch> branchList;

	private List<Branch> branchList2;

	private static final String title = "快速处理点";

	private String ids;

	private String action;

	private static ListActions opt;

	private BranchVDomContent dom;

	private final static int PAGESIZE = 10;
	
	/**
	 * 列表页面中查询变量
	 * */
	private Branch searchbranch = new Branch();
	private String searchstarttime = "";
	private String searchendtime = "";

	public String getSearchendtime() {
		return searchendtime;
	}

	public void setSearchendtime(String searchendtime) {
		this.searchendtime = searchendtime;
	}

	public String getSearchstarttime() {
		return searchstarttime;
	}

	public void setSearchstarttime(String searchstarttime) {
		this.searchstarttime = searchstarttime;
	}

	public Branch getSearchbranch() {
		return searchbranch;
	}

	public void setSearchbranch(Branch searchbranch) {
		this.searchbranch = searchbranch;
	}

	public String getIds()
	{
		return ids;
	}

	public void setIds(String ids)
	{
		this.ids = ids;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public ListActions getOpt()
	{
		return opt;
	}

	public void setOpt(ListActions opt)
	{
		BranchAction.opt = opt;
	}

	public String getTitle()
	{
		return title;
	}

	public int getPagesize()
	{
		return PAGESIZE;
	}

	public List<Branch> getBranchList()
	{
		return branchList;
	}

	public void setBranchList(List<Branch> branchList)
	{
		this.branchList = branchList;
	}

	public List<Branch> getBranchList2()
	{
		return branchList2;
	}

	public void setBranchList2(List<Branch> branchList2)
	{
		this.branchList2 = branchList2;
	}

	public BranchVDomContent getDom()
	{
		return dom;
	}

	public void setDom(BranchVDomContent dom)
	{
		this.dom = dom;
	}

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/branchback_newBranch.action");
		opt.setEditAction("page/admin/page/branchback_editBranch.action");
		opt.setDeleteAction("page/admin/page/branchback_deleteBranch.action");
		opt.setDelAllAction("page/admin/page/branchback_delAllBranch.action");// 批量删除
		opt.setShowAction("page/admin/page/branchback_viewBranch.action");
	}

	// 查看所有的信息
	public String viewBranchList()
	{
		
		String searchbranchname = this.getParameter("searchbranchname") == null ? 
				"" : this.getParameter("searchbranchname");
		String searchbranchaddress = this.getParameter("searchbranchaddress") == null ?
				"" : this.getParameter("searchbranchaddress");
		
		searchbranch.setBranchName(searchbranchname);
		searchbranch.setBranchAddress(searchbranchaddress);
		
		searchstarttime = this.getParameter("searchstarttime") == null ?
				"" : this.getParameter("searchstarttime") ;
		searchendtime = this.getParameter("searchendtime") == null ? 
				"" : this.getParameter("searchendtime");
		
		HashMap<String, Object> querya = new HashMap<String, Object>();
		
		if(searchbranchname != "" && searchbranchname != null){
			querya.put("searchbranchname", searchbranchname);
		}
		
		if(searchbranchaddress != "" && searchbranchaddress != null){
			querya.put("searchbranchaddress", searchbranchaddress);
		}
		
		if(searchstarttime != "" && searchstarttime != null){
			querya.put("searchstarttime", searchstarttime);
		}
		
		if(searchendtime != "" && searchendtime != null){
			querya.put("searchendtime", searchendtime);
		}
		
		int allnum = branchService.getCountByAll(querya);

		// 当前页号
		String pn = this.getParameter("page");

		int curpage = 1;

		if (pn != null)
		{
			int t = Integer.parseInt(pn);
			if (t > 0)
			{
				curpage = t;
			}
		}

		HashMap<String, Object> queryp = new HashMap<String, Object>();
		
		if(searchbranchname != "" && searchbranchname != null){
			queryp.put("searchbranchname", searchbranchname);
		}
		
		if(searchbranchaddress != "" && searchbranchaddress != null){
			queryp.put("searchbranchaddress", searchbranchaddress);
		}
		
		if(searchstarttime != "" && searchstarttime != null){
			queryp.put("searchstarttime", searchstarttime);
		}
		
		if(searchendtime != "" && searchendtime != null){
			queryp.put("searchendtime", searchendtime);
		}
		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		branchList = branchService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/branchback_viewBranchList.action");

		return "default";
	}

	// 查看单条数据
	public String viewBranch()
	{
		String id = this.getParameter("id");

		dom = new BranchVDomContent(branchService.queryDataById(id));
		
		branchList2 = branchService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newBranch()
	{
		branchList = branchService.queryAll();
		
		if(branchList != null)
		{
			getSession().setAttribute("branchList", branchList);
		}

		action = "page/admin/page/branchback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Branch branch = new Branch();

		branch.setBranchAddress(dom.getBranchAddress());

		branch.setBranchName(dom.getBranchName());

		branch.setBranchPhone(dom.getBranchPhone());

		branch.setLat(dom.getLat());

		branch.setLng(dom.getLng());

		branch.setOperid(getCurrUser());

		branch.setOpertime(new Date());

		branch.setUpdatetime(new Date());

		branch.setRemark(dom.getRemark());

		action = "page/admin/page/branchback_viewBranchList.action";

		branchService.insertBranch(branch);

		message = "新增成功!";

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editBranch()
	{

		String id = this.getParameter("id");

		Branch branch = branchService.queryDataById(id);

		dom = new BranchVDomContent(branch);

		action = "page/admin/page/branchback_saveEdit.action?id=" + id;

		return "edit";
	}

	/**
	 * 保存修改
	 * 
	 * @return
	 */
	public String saveEdit()
	{
		String id = this.getParameter("id");

		Branch branch = new Branch();

		branch.setBranchAddress(dom.getBranchAddress());

		branch.setBranchName(dom.getBranchName());

		branch.setBranchPhone(dom.getBranchPhone());

		branch.setLat(dom.getLat());

		branch.setLng(dom.getLng());

		branch.setOperid(getCurrUser());

		branch.setOpertime(new Date());

		branch.setUpdatetime(new Date());

		branch.setRemark(dom.getRemark());

		branch.setId((long) Integer.parseInt(id));

		action = "page/admin/page/branchback_viewBranchList.action";

		branchService.updateBranch(branch);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteBranch()
	{

		String id = this.getParameter("id");

		branchService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/branchback_viewBranchList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllBranch()
	{

		branchService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/branchback_viewBranchList.action";

		return SUCCESS;
	}

}
