package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.RuleVDomContent;
import com.web.pojo.Rule;
import com.web.service.interfaces.RuleService;

/**
 * 交通违规
 * 
 * @author wqg
 * 
 *         后台管理 2013-9-9上午11:12:59
 */
public class RuleAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private RuleService ruleService;

	private List<Rule> ruleList;

	private List<Rule> ruleList2;

	private static final String title = "交通法规";

	private String ids;

	private String action;

	private static ListActions opt;

	private RuleVDomContent dom;

	private final static int PAGESIZE = 10;

	private Rule searchrule = new Rule();
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

	public Rule getSearchrule()
	{
		return searchrule;
	}

	public void setSearchrule(Rule searchrule)
	{
		this.searchrule = searchrule;
	}

	public List<Rule> getRuleList()
	{
		return ruleList;
	}

	public void setRuleList(List<Rule> ruleList)
	{
		this.ruleList = ruleList;
	}

	public List<Rule> getRuleList2()
	{
		return ruleList2;
	}

	public void setRuleList2(List<Rule> ruleList2)
	{
		this.ruleList2 = ruleList2;
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

	public RuleVDomContent getDom()
	{
		return dom;
	}

	public void setDom(RuleVDomContent dom)
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
		opt.setAddAction("page/admin/page/ruleback_newRule.action");
		opt.setEditAction("page/admin/page/ruleback_editRule.action");
		opt.setDeleteAction("page/admin/page/ruleback_deleteRule.action");
		opt.setDelAllAction("page/admin/page/ruleback_delAllRule.action");// 批量删除
		opt.setShowAction("page/admin/page/ruleback_viewRule.action");
	}

	// 查看所有的信息
	public String viewRuleList()
	{
		String searchtitle = this.getParameter("searchtitle") == null ? ""
				: this.getParameter("searchtitle");
		searchrule.setRuleTitle(searchtitle);

		searchstarttime = this.getParameter("searchstarttime") == null ? ""
				: this.getParameter("searchstarttime");
		searchendtime = this.getParameter("searchendtime") == null ? ""
				: getParameter("searchendtime");

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

		int allnum = ruleService.getCountByAll(querya);

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

		ruleList = ruleService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/ruleback_viewRuleList.action");

		return "default";
	}

	// 查看单条数据
	public String viewRule()
	{
		String id = this.getParameter("id");

		dom = new RuleVDomContent(ruleService.queryDataById(id));// 把查询到的信息保存到dom中

		ruleList2 = ruleService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newRule()
	{
		ruleList = ruleService.queryAll();

		if (ruleList != null)
		{
			getSession().setAttribute("ruleList", ruleList);
		}
		action = "page/admin/page/ruleback_saveNew.action";
		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Rule rule = new Rule();

		rule.setRuleTitle(dom.getRuleTitle());

		int num = ruleService.newOrUpdate(rule);

		if (num != 0)
		{
			message = "'" + dom.getRuleTitle() + "'已存在!";

			action = opt.getAddAction();
		} else
		{
			rule.setRuleType(dom.getRuleType());

			rule.setRuleContent(dom.getRuleContent());

			rule.setOperid((long) getCurrUser());

			rule.setRemark(dom.getRemark());

			rule.setRuleInsertTime(new Date());

			rule.setUpdatetime(new Date());

			rule.setOpertime(new Date());

			rule.setRuleUrl(dom.getRuleUrl());

			action = "page/admin/page/ruleback_viewRuleList.action";
			ruleService.insertRule(rule);
			message = "新增成功!";
		}
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editRule()
	{

		String id = this.getParameter("id");

		Rule rule = ruleService.queryDataById(id);

		dom = new RuleVDomContent(rule);

		action = "page/admin/page/ruleback_saveEdit.action?id=" + id;

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

		Rule rule = new Rule();

		rule.setRuleType(dom.getRuleType());

		rule.setRuleTitle(dom.getRuleTitle());

		rule.setRuleContent(dom.getRuleContent());

		rule.setOperid(dom.getOperid());

		rule.setRemark(dom.getRemark());

		rule.setUpdatetime(new Date());

		rule.setRuleUrl(dom.getRuleUrl());

		rule.setId((long) Integer.parseInt(id));

		action = "page/admin/page/ruleback_viewRuleList.action";

		ruleService.updateRule(rule);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteRule()
	{

		String id = this.getParameter("id");

		ruleService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/ruleback_viewRuleList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllRule()
	{

		ruleService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/ruleback_viewRuleList.action";

		return SUCCESS;
	}

}
