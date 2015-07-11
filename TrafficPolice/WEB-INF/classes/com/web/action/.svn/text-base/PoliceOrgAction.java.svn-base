package com.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.PoliceOrgVDomContent;
import com.web.pojo.PoliceOrg;
import com.web.service.interfaces.PoliceOrgService;

/**
 * 单位信息
 * 
 * @author wqg
 * 
 *         2013-10-2下午4:17:38
 */
public class PoliceOrgAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private PoliceOrgService orgService;

	private List<PoliceOrg> orgList;

	private List<PoliceOrg> orglist = new ArrayList<PoliceOrg>();

	private static final String title = "交警部门";

	private String ids;

	private String action;

	private static ListActions opt;

	private PoliceOrgVDomContent dom;

	private final static int PAGESIZE = 20;

	private String searchorgname;// 根据单位名称查询

	private String searchstarttime = "";

	private String searchendtime = "";

	public List<PoliceOrg> getOrglist()
	{
		return orglist;
	}

	public void setOrglist(List<PoliceOrg> orglist)
	{
		this.orglist = orglist;
	}

	public List<PoliceOrg> getOrgList()
	{
		return orgList;
	}

	public void setOrgList(List<PoliceOrg> orgList)
	{
		this.orgList = orgList;
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
		PoliceOrgAction.opt = opt;
	}

	public PoliceOrgVDomContent getDom()
	{
		return dom;
	}

	public void setDom(PoliceOrgVDomContent dom)
	{
		this.dom = dom;
	}

	public String getSearchorgname()
	{
		return searchorgname;
	}

	public void setSearchorgname(String searchorgname)
	{
		this.searchorgname = searchorgname;
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
		opt.setAddAction("page/admin/page/orgback_newPoliceOrg.action");
		opt.setEditAction("page/admin/page/orgback_editPoliceOrg.action");
		opt.setDeleteAction("page/admin/page/orgback_deletePoliceOrg.action");
		opt.setDelAllAction("page/admin/page/orgback_delAllPoliceOrg.action");// 批量删除
		opt.setShowAction("page/admin/page/orgback_viewPoliceOrg.action");
	}

	// 查看所有的信息
	public String viewPoliceOrgList()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();

		long userno = (Long) session.getAttribute("userno");// 获得当前登录用户的id用户号

		long dwid = (Long) session.getAttribute("dwid");// 获得当前登录用户所在单位号

		searchorgname = this.getParameter("searchorgname") == null ? "" : this
				.getParameter("searchorgname");

		searchstarttime = this.getParameter("searchstarttime") == null ? ""
				: this.getParameter("searchstarttime");

		searchendtime = this.getParameter("searchendtime") == null ? "" : this
				.getParameter("searchendtime");

		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchorgname != "" && searchorgname != null)
		{
			querya.put("searchorgname", searchorgname);
		}
		if (searchstarttime != "" && searchstarttime != null)
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != "" && searchendtime != null)
		{
			querya.put("searchendtime", searchendtime);
		}
		int allnum = 0;

		if (userno == 0)
		{
			allnum = orgService.getCountByAll(querya);
		} else
		{
			querya.put("id", dwid);
			allnum = orgService.getCountByAll(querya);
			querya.remove("id");
			querya.put("dwid", dwid);
			allnum = orgService.getCountByAll(querya) + orgService.getCountByAll(querya);
		}
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
		if (searchorgname != "" && searchorgname != null)
		{
			queryp.put("searchorgname", searchorgname);
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

		if (userno == 0)
		{
			orgList = orgService.selectPage(queryp);
			
			for(int i = 0; i < orgList.size(); i++)
			{
				orglist.add(orgList.get(i));
			}
		} else
		{
			queryp.put("id", dwid);
			orgList = orgService.selectPage(queryp);
			
			for(int i = 0; i < orgList.size(); i++)
			{
				orglist.add(orgList.get(i));
			}
			queryp.remove("id");
			queryp.put("dwid", dwid);
			orgList = orgService.selectPage(queryp);
			for(int i = 0; i < orgList.size(); i++)
			{
				orglist.add(orgList.get(i));
			}
		}
		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/orgback_viewPoliceOrgList.action");

		return "default";
	}

	// 查看单条数据
	public String viewPoliceOrg()
	{
		String id = this.getParameter("id");

		dom = new PoliceOrgVDomContent(orgService.queryDataById(id));

		orgList = orgService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newPoliceOrg()
	{
		orgList = orgService.selectAll();

		if (orgList != null)
		{
			getSession().setAttribute("orgList", orgList);
		}

		action = "page/admin/page/orgback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		PoliceOrg org = new PoliceOrg();

		org.setOrgname(dom.getOrgname().trim());

		int num = orgService.newOrUpdate(org);

		if (num != 0)
		{
			message = "'" + dom.getOrgname() + "'已存在!";

			action = opt.getAddAction();
		} else
		{

			org.setAddress(dom.getAddress());

			org.setId(dom.getId());

			org.setPid(dom.getPid());

			org.setOperid(getCurrUser());

			org.setRegtime(new Date());

			org.setOpertime(new Date());

			org.setPhone(dom.getPhone());

			org.setRemark(dom.getRemark());

			action = "page/admin/page/orgback_viewPoliceOrgList.action";

			orgService.insertPoliceOrg(org);

			message = "新增成功!";
		}
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editPoliceOrg()
	{

		String id = this.getParameter("id");

		orgList = orgService.selectAll();

		PoliceOrg org = orgService.queryDataById(id);

		dom = new PoliceOrgVDomContent(org);

		action = "page/admin/page/orgback_saveEdit.action?id=" + id;

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

		PoliceOrg org = new PoliceOrg();

		org.setAddress(dom.getAddress());

		org.setId(dom.getId());

		org.setOperid(getCurrUser());

		org.setOpertime(new Date());

		org.setOrgname(dom.getOrgname());

		org.setPid(dom.getPid());

		org.setPhone(dom.getPhone());

		org.setRemark(dom.getRemark());

		org.setId((long) Integer.parseInt(id));

		action = "page/admin/page/orgback_viewPoliceOrgList.action";

		orgService.updatePoliceOrg(org);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deletePoliceOrg()
	{

		String id = this.getParameter("id");

		orgService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/orgback_viewPoliceOrgList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllPoliceOrg()
	{

		orgService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/orgback_viewPoliceOrgList.action";

		return SUCCESS;
	}
}
