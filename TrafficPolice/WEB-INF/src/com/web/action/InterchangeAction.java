package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.InterchangeVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Interchange;
import com.web.service.interfaces.InterchangeService;

/**
 * @author ln
 * 
 *  后台管理 2013-9-16
 */
public class InterchangeAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private InterchangeService interchangeService;

	private List<Interchange> interchangeList;

	private static final String title = "问题互动";

	private String ids;

	private String action;

	private static ListActions opt;

	private InterchangeVDomContent dom;

	private final static int PAGESIZE = 10;

	private Interchange searchinter = new Interchange();
	
	private String searchstarttime = "";
	
	private String searchendtime = "";
	
	public String getSearchstarttime() {
		return searchstarttime;
	}

	public void setSearchstarttime(String searchstarttime) {
		this.searchstarttime = searchstarttime;
	}

	public String getSearchendtime() {
		return searchendtime;
	}

	public void setSearchendtime(String searchendtime) {
		this.searchendtime = searchendtime;
	}

	
	
	public Interchange getSearchinter() {
		return searchinter;
	}

	public void setSearchinter(Interchange searchinter) {
		this.searchinter = searchinter;
	}

	public List<Interchange> getInterchangeList()
	{
		return interchangeList;
	}

	public void setInterchangeList(List<Interchange> interchangeList)
	{
		this.interchangeList = interchangeList;
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
		InterchangeAction.opt = opt;
	}

	public InterchangeVDomContent getDom()
	{
		return dom;
	}

	public void setDom(InterchangeVDomContent dom)
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
		opt.setAddAction("page/admin/page/interchangeback_newInterchange.action");
		opt.setEditAction("page/admin/page/interchangeback_editInterchange.action");
		opt.setDeleteAction("page/admin/page/interchangeback_deleteInterchange.action");
		opt.setDelAllAction("page/admin/page/interchangeback_delAllInterchange.action");// 批量删除
		opt.setShowAction("page/admin/page/interchangeback_viewInterchange.action");
	}

	// 查看所有的信息
	public String viewInterchangeList()
	{
		String searchquestion = this.getParameter("searchquestion") == null ? "" : this.getParameter("searchquestion");
		searchinter.setQuestion(searchquestion);
		
		searchstarttime = this.getParameter("searchstarttime") == null ? "" : this.getParameter("searchstarttime");
		searchendtime = this.getParameter("searchendtime") == null ? "" : this.getParameter("searchendtime");
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if(searchquestion != "" && searchquestion != null)
		{
			querya.put("searchquestion", searchquestion);
		}
		
		if(searchstarttime != "" && searchstarttime != null)
		{
			querya.put("searchstarttime", searchstarttime);
		}
		
		if(searchendtime != "" && searchendtime != null)
		{
			querya.put("searchendtime", searchendtime);
		}

		int allnum = interchangeService.getCountByAll(querya);

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
		
		if(searchquestion != "" && searchquestion != null)
		{
			queryp.put("searchquestion", searchquestion);
		}
		
		if(searchstarttime != "" && searchstarttime != null)
		{
			queryp.put("searchstarttime", searchstarttime);
		}
		
		if(searchendtime != "" && searchendtime != null)
		{
			queryp.put("searchendtime", searchendtime);
		}

		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		interchangeList = interchangeService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/interchangeback_viewInterchangeList.action");

		return "default";
	}

	// 查看单条数据
	public String viewInterchange()
	{
		String id = this.getParameter("id");
		System.out.println(id);

		//dom = new InterchangeVDomContent(interchangeService.queryDataById(id));
		interchangeList = interchangeService.queryDataById(id);
		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newInterchange()
	{
		interchangeList = interchangeService.queryAll();
		
		action = "page/admin/page/interchangeback_saveNew.action";
		
		return "add";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Interchange interchange = new Interchange();
		String id = this.getParameter("id");
		interchange.setQid(Long.valueOf(id));
		
		interchange.setAnswer(dom.getAnswer());
		
		interchange.setOpertime(new Date());
		
		interchange.setOperid((long) getCurrUser());
		
		action = "page/admin/page/interchangeback_viewInterchangeList.action";
		
		interchangeService.insertInterchange(interchange);
		
		message = "新增成功!";
		
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editInterchange()
	{

		String id = this.getParameter("id");

		Interchange interchange = interchangeService.queryEditDataById(id);

		dom = new InterchangeVDomContent(interchange);

		action = "page/admin/page/interchangeback_saveEdit.action?id=" + id;

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
		
		Interchange interchange = new Interchange();
		
		interchange.setAnswer(dom.getAnswer());
		
		interchange.setOpertime(new Date());
		
		interchange.setOperid((long)getCurrUser());
	
		interchange.setId((long)Integer.parseInt(id));
		action = "page/admin/page/interchangeback_viewInterchangeList.action";

		interchangeService.updateInterchange(interchange);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteInterchange()
	{

		String id = this.getParameter("id");

		interchangeService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/interchangeback_viewInterchangeList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllInterchange()
	{

		interchangeService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/interchangeback_viewInterchangeList.action";

		return SUCCESS;
	}

}
