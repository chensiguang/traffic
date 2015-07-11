package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.RuleIllegalVDomContent;
import com.web.pojo.RuleIllegal;
import com.web.service.interfaces.RuleIllegalService;

/**
 * 违法查询
 * 
 * @author wqg
 * 
 *         后台管理 2013-9-9上午11:12:59
 */
public class IllegalAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private RuleIllegalService illegalService;

	private List<RuleIllegal> illegalList;

	private List<RuleIllegal> illegalList2;

	private static final String title = "违法查询";

	private String ids;

	private String action;

	private static ListActions opt;

	private RuleIllegalVDomContent dom;

	private final static int PAGESIZE = 10;
	private RuleIllegal searchillegal = new RuleIllegal();
	private String searchstarttime = "";
	private String searchendtime = "";

	public String getSearchendtime()
	{
		return searchendtime;
	}

	public void setSearchendtime(String searchendtime)
	{
		this.searchendtime = searchendtime;
	}

	public String getSearchstarttime()
	{
		return searchstarttime;
	}

	public void setSearchstarttime(String searchstarttime)
	{
		this.searchstarttime = searchstarttime;
	}

	public RuleIllegal getSearchillegal()
	{
		return searchillegal;
	}

	public void setSearchillegal(RuleIllegal searchillegal)
	{
		this.searchillegal = searchillegal;
	}

	public List<RuleIllegal> getIllegalList()
	{
		return illegalList;
	}

	public void setIllegalList(List<RuleIllegal> illegalList)
	{
		this.illegalList = illegalList;
	}

	public List<RuleIllegal> getIllegalList2()
	{
		return illegalList2;
	}

	public void setIllegalList2(List<RuleIllegal> illegalList2)
	{
		this.illegalList2 = illegalList2;
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
		IllegalAction.opt = opt;
	}

	public RuleIllegalVDomContent getDom()
	{
		return dom;
	}

	public void setDom(RuleIllegalVDomContent dom)
	{
		this.dom = dom;
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
		opt.setAddAction("page/admin/page/illegalback_newIllegal.action");
		opt.setEditAction("page/admin/page/illegalback_editIllegal.action");
		opt.setDeleteAction("page/admin/page/illegalback_deleteIllegal.action");
		opt.setDelAllAction("page/admin/page/illegalback_delAllIllegal.action");// 批量删除
		opt.setShowAction("page/admin/page/illegalback_viewIllegal.action");
	}

	// 查看所有的信息
	public String viewIllegalList()
	{
		String searchtitle = this.getParameter("searchtitle") == null ? ""
				: this.getParameter("searchtitle");
		searchillegal.setIllegalTitle(searchtitle);

		searchstarttime = this.getParameter("searchstarttime") == null ? ""
				: this.getParameter("searchstarttime");
		searchendtime = this.getParameter("searchendtime") == null ? "" : this
				.getParameter("searchendtime");

		HashMap<String, Object> querya = new HashMap<String, Object>();
		if (searchtitle != "" && searchtitle != null)
		{
			querya.put("searchtitle", searchtitle);
		}

		if (searchstarttime != "" && searchstarttime != null)
		{
			querya.put("searchstarttime", searchstarttime);
		}

		if (searchendtime != "" && searchendtime != null)
		{
			querya.put("searchendtime", searchendtime);
		}

		int allnum = illegalService.getCountByAll(querya);

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
		if (searchtitle != "" && searchtitle != null)
		{
			queryp.put("searchtitle", searchtitle);
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

		illegalList = illegalService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/illegalback_viewIllegalList.action");

		return "default";
	}

	// 查看单条数据
	public String viewIllegal()
	{
		String id = this.getParameter("id");

		dom = new RuleIllegalVDomContent(illegalService.queryDataById(id));

		illegalList2 = illegalService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newIllegal()
	{
		illegalList = illegalService.queryAll();

		if (illegalList != null)
		{
			getSession().setAttribute("illegalList", illegalList);
		}

		action = "page/admin/page/illegalback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		RuleIllegal illegal = new RuleIllegal();

		illegal.setIllegalTitle(dom.getIllegalTitle());

		int num = illegalService.newOrUpdate(illegal);

		if (num != 0)
		{
			message = "'" + dom.getIllegalTitle() + "'已存在!";

			action = opt.getAddAction();
		} else
		{

			illegal.setId(dom.getId());

			illegal.setIllegalContent(dom.getIllegalContent());

			illegal.setIllegalInsertTime(new Date());

			illegal.setOperid((long) getCurrUser());

			illegal.setOpertime(new Date());

			illegal.setRemark(dom.getRemark());

			illegal.setState(dom.getState());

			illegal.setUpdatetime(new Date());

			action = "page/admin/page/illegalback_viewIllegalList.action";

			illegalService.insertRuleIllegal(illegal);

			message = "新增成功!";
		}
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editIllegal()
	{

		String id = this.getParameter("id");

		RuleIllegal illegal = illegalService.queryDataById(id);

		dom = new RuleIllegalVDomContent(illegal);

		action = "page/admin/page/illegalback_saveEdit.action?id=" + id;

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

		RuleIllegal illegal = new RuleIllegal();

		illegal.setIllegalContent(dom.getIllegalContent());

		illegal.setIllegalTitle(dom.getIllegalTitle());

		illegal.setOperid(dom.getOperid());

		illegal.setRemark(dom.getRemark());

		illegal.setState(dom.getState());

		illegal.setUpdatetime(new Date());

		illegal.setId((long) Integer.parseInt(id));

		illegalService.updateRuleIllegal(illegal);

		action = "page/admin/page/illegalback_viewIllegalList.action";

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteIllegal()
	{

		String id = this.getParameter("id");

		illegalService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/illegalback_viewIllegalList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllIllegal()
	{

		illegalService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/illegalback_viewIllegalList.action";

		return SUCCESS;
	}

}
