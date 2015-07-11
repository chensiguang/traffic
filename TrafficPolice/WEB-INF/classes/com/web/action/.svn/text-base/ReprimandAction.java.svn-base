/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.ReprimandVDomContent;
import com.web.pojo.Company;
import com.web.pojo.Reprimand;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.ReprimandService;

/**
 * @author wqg
 * 
 *         2013-10-28下午4:12:57
 */
public class ReprimandAction extends BaseAction
{

	@Autowired
	private ReprimandService reService;

	@Autowired
	private CompanyService comService;

	private List<Reprimand> reList;

	private List<Company> comList;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ReprimandVDomContent dom;

	private static final String title = "通报批评";

	private String ids;

	private String action;

	private static ListActions opt;

	private List<Reprimand> distinctList;

	private final static int PAGESIZE = 10;
	private String searchname = "";
	private String searchstarttime = "";
	private String searchendtime = "";

	public List<Reprimand> getDistinctList()
	{
		return distinctList;
	}

	public void setDistinctList(List<Reprimand> distinctList)
	{
		this.distinctList = distinctList;
	}

	public String getSearchname()
	{
		return searchname;
	}

	public void setSearchname(String searchname)
	{
		this.searchname = searchname;
	}

	public List<Company> getComList()
	{
		return comList;
	}

	public void setComList(List<Company> comList)
	{
		this.comList = comList;
	}

	public List<Reprimand> getReList()
	{
		return reList;
	}

	public void setReList(List<Reprimand> reList)
	{
		this.reList = reList;
	}

	public String getSearchstarttime()
	{
		return searchstarttime;
	}

	public void setSearchstarttime(String searchstarttime)
	{
		this.searchstarttime = searchstarttime;
	}

	public String getSearchendtime()
	{
		return searchendtime;
	}

	public void setSearchendtime(String searchendtime)
	{
		this.searchendtime = searchendtime;
	}

	public ReprimandVDomContent getDom()
	{
		return dom;
	}

	public void setDom(ReprimandVDomContent dom)
	{
		this.dom = dom;
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
		ReprimandAction.opt = opt;
	}

	public String getTitle()
	{
		return title;
	}

	public int getPagesize()
	{
		return PAGESIZE;
	}

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/reprimandback_newReprimand.action"); // 新增
		opt.setEditAction("page/admin/page/reprimandback_editReprimand.action"); // 修改
		opt.setDeleteAction("page/admin/page/reprimandback_deleteReprimand.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/reprimandback_deleteAllReprimand.action"); // 批量删除
		opt.setShowAction("page/admin/page/reprimandback_viewReprimand.action"); // 详情
	}

	public String viewReprimandList()
	{

		distinctList = reService.distinctQueryAllByDwid();
		searchname = this.getParameter("searchname") == null ? "" : this
				.getParameter("searchname");
		searchstarttime = this.getParameter("searchstarttime") == null ? ""
				: this.getParameter("searchstarttime");
		searchendtime = this.getParameter("searchendtime") == null ? "" : this
				.getParameter("searchendtime");
		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchname != "" && searchname != null)
		{
			querya.put("searchname", searchname);
		}
		if (searchstarttime != "" && searchstarttime != null)
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != "" && searchendtime != null)
		{
			querya.put("searchendtime", searchendtime);
		}
		querya.put("type", 1);
		int allnum = reService.getCountByAll(querya);

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
		if (searchname != "" && searchname != null)
		{
			queryp.put("searchname", searchname);
		}
		if (searchstarttime != "" && searchstarttime != null)
		{
			queryp.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != "" && searchendtime != null)
		{
			queryp.put("searchendtime", searchendtime);
		}

		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		queryp.put("type", 1);

		reList = reService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/reprimandback_viewReprimandList.action");

		return "default";
	}

	// 查看单条数据
	public String viewReprimand()
	{

		String id = this.getParameter("id");

		dom = new ReprimandVDomContent(reService.queryDataById(id));

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newReprimand()
	{

		comList = comService.queryAll();

		action = "page/admin/page/reprimandback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Reprimand re = new Reprimand();

		re.setContent(dom.getContent());

		re.setDwid(dom.getDwid());

		re.setFlag(dom.getFlag());

		re.setLoginname(getLoginname());

		re.setType(1);

		re.setTime(new Date());

		reService.insertReprimand(re);

		action = "page/admin/page/reprimandback_viewReprimandList.action";

		message = "新增成功!";

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editReprimand()
	{

		String id = this.getParameter("id");

		comList = comService.queryAll();

		Reprimand re = reService.queryDataById(id);

		dom = new ReprimandVDomContent(re);

		action = "page/admin/page/reprimandback_saveEdit.action?id=" + id;

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

		Reprimand re = new Reprimand();

		re.setContent(dom.getContent());

		re.setDwid(dom.getDwid());

		re.setFlag(dom.getFlag());

		re.setLoginname(getLoginname());

		re.setTime(new Date());

		re.setId((long) Integer.parseInt(id));

		action = "page/admin/page/reprimandback_viewReprimandList.action";

		reService.updateReprimand(re);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteReprimand()
	{

		String id = this.getParameter("id");

		reService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/reprimandback_viewReprimandList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllReprimand()
	{

		String ids = this.getParameter("ids");
		reService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/reprimandback_viewReprimandList.action";

		return SUCCESS;
	}
}
