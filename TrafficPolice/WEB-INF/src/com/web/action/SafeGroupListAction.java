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
import com.web.action.vo.SafeGroupListVDomContent;
import com.web.pojo.Account;
import com.web.pojo.Company;
import com.web.pojo.SafeGroupList;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.SafeGroupListService;

/**
 * 安全组组别分类
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:38:01
 */
public class SafeGroupListAction extends BaseAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private CompanyService companyService;

	@Autowired
	private SafeGroupListService safeGroupListService;

	@Autowired
	private CompanyService comService;

	private List<Account> accountList;

	private List<SafeGroupList> safeGroupList;

	private List<Company> comList;

	private static final String title = "安全组分组";

	private String ids;

	private String action;

	private static ListActions opt;

	private SafeGroupListVDomContent dom;

	private final static int PAGESIZE = 10;

	private String dwid;

	private String searchname;

	private String searchstarttime;

	private String searchendtime;

	public String getDwid()
	{
		return dwid;
	}

	public void setDwid(String dwid)
	{
		this.dwid = dwid;
	}

	public List<Company> getComList()
	{
		return comList;
	}

	public void setComList(List<Company> comList)
	{
		this.comList = comList;
	}

	public String getSearchname()
	{
		return searchname;
	}

	public void setSearchname(String searchname)
	{
		this.searchname = searchname;
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

	public List<Account> getAccountList()
	{
		return accountList;
	}

	public void setAccountList(List<Account> accountList)
	{
		this.accountList = accountList;
	}

	public List<SafeGroupList> getSafeGroupList()
	{
		return safeGroupList;
	}

	public void setSafeGroupList(List<SafeGroupList> safeGroupList)
	{
		this.safeGroupList = safeGroupList;
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
		SafeGroupListAction.opt = opt;
	}

	public SafeGroupListVDomContent getDom()
	{
		return dom;
	}

	public void setDom(SafeGroupListVDomContent dom)
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
		opt.setAddAction("page/admin/page/safegrouplistback_addSafeGroupList.action");
		opt.setEditAction("page/admin/page/safegrouplistback_editSafeGroupList.action");//
		opt.setShowAction("page/admin/page/safegrouplistback_viewOneSafeGroupList.action");//
		opt.setDeleteAction("page/admin/page/safegrouplistback_deleteSafeGroupList.action");
		opt.setDelAllAction("page/admin/page/safegrouplistback_delAllSafeGroupList.action");// 批量删除
	}

	// 查看所有的信息
	public String viewAllSafeGroupList()
	{
		// String dwno = this.getParameter("dwid");//获得当前登录用户所在单位的id号

		dwid = this.getParameter("id");

		searchname = this.getParameter("searchname");

		searchstarttime = this.getParameter("searchstarttime");

		searchendtime = this.getParameter("searchendtime");

		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchname != null && "" != searchname)
		{
			querya.put("searchname", searchname);
		}
		if (searchstarttime != null && "" != searchstarttime)
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && "" != searchendtime)
		{
			querya.put("searchendtime", searchendtime);
		}
		if (dwid != null && "" != dwid)
		{
			querya.put("dwid", dwid);
		}

		int allnum = safeGroupListService.getCountByAll(querya);

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

		if (searchname != null && "" != searchname)
		{
			queryp.put("searchname", searchname);
		}
		if (searchstarttime != null && "" != searchstarttime)
		{
			queryp.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && "" != searchendtime)
		{
			queryp.put("searchendtime", searchendtime);
		}
		if (dwid != null && "" != dwid)
		{
			queryp.put("dwid", dwid);
		}
		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		safeGroupList = safeGroupListService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/safegrouplistback_viewAllSafeGroupList.action?id="
						+ dwid);

		return "default";
	}

	// 查看单条数据
	public String viewOneSafeGroupList()
	{
		String id = this.getParameter("id");

		dom = new SafeGroupListVDomContent(
				safeGroupListService.queryDataById(id));

		safeGroupList = safeGroupListService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String addSafeGroupList()
	{
		String dwid = this.getParameter("dwid");

		if (dwid != null)
		{
			comList = comService.queryComnameByDwid(dwid);
		}

		action = "page/admin/page/safegrouplistback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		dwid = this.getParameter("dom.dwid");

		SafeGroupList safeGroupList = new SafeGroupList();

		safeGroupList.setDwid(dom.getDwid());

		safeGroupList.setGroupname(dom.getGroupname().trim());

		int num = safeGroupListService.newOrUpdate(safeGroupList);

		if (num != 0)
		{
			message = "'" + dom.getGroupname() + "'安全分组已存在!";

			action = "page/admin/page/safegrouplistback_addSafeGroupList.action?dwid="
					+ dwid;

			System.out.println(action);
		} else
		{
			safeGroupList.setZzid(dom.getZzid());

			safeGroupList.setGroupname(null);

			int number = safeGroupListService.newOrUpdate(safeGroupList);

			if (number != 0)
			{
				message = "'" + dom.getZzid() + "'已分配为某组的组长!";

				action = "page/admin/page/safegrouplistback_addSafeGroupList.action?dwid="
						+ dwid;
			} else
			{
				safeGroupList.setGroupname(dom.getGroupname().trim());

				safeGroupList.setZzname(dom.getZzname());

				safeGroupList.setGroupname(dom.getGroupname());

				safeGroupList.setCarnum(dom.getCarnum());

				safeGroupList.setDrivernum(dom.getDrivernum());

				safeGroupList.setOperid(getCurrUser());

				safeGroupList.setOpertime(new Date());

				safeGroupList.setRegtime(new Date());

				safeGroupList.setRemark(dom.getRemark());

				safeGroupList.setOperid(dom.getOperid());

				action = "page/admin/page/safegrouplistback_viewAllSafeGroupList.action?id="
						+ dwid;

				safeGroupListService.insertSafeGroupList(safeGroupList);

				companyService.addSafenum(dwid);

				message = "新增成功!";
			}
		}

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editSafeGroupList()
	{

		String id = this.getParameter("id");

		dwid = this.getParameter("dwid");

		if (dwid != null)
		{
			comList = comService.queryComnameByDwid(dwid);
		}

		SafeGroupList safeGroupList = safeGroupListService.queryDataById(id);

		dom = new SafeGroupListVDomContent(safeGroupList);

		action = "page/admin/page/safegrouplistback_saveEdit.action?id=" + id
				+ "&dwid=" + dwid;

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

		// String dwid = this.getParameter("dwid");

		SafeGroupList safeGroupList = new SafeGroupList();

		safeGroupList.setDwid(dom.getDwid());

		safeGroupList.setGroupname(dom.getGroupname().trim());

		safeGroupList.setZzid(dom.getZzid());

		safeGroupList.setId((long) Integer.parseInt(id));

		safeGroupList.setCarnum(dom.getCarnum());

		safeGroupList.setDrivernum(dom.getDrivernum());

		safeGroupList.setZzname(dom.getZzname());

		safeGroupList.setOperid(getCurrUser());

		safeGroupList.setOpertime(new Date());

		safeGroupList.setRemark(dom.getRemark());

		action = "page/admin/page/safegrouplistback_viewAllSafeGroupList.action?id="
				+ dom.getDwid();

		safeGroupListService.updateSafeGroupList(safeGroupList);

		message = "修改成功!";
		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteSafeGroupList()
	{

		String id = this.getParameter("id");

		String dwid = this.getParameter("dwid");

		safeGroupListService.deleteDataById(id);

		companyService.plusSafenum(dwid);

		message = "删除成功";

		action = "page/admin/page/safegrouplistback_viewAllSafeGroupList.action?id="
				+ dwid;

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllSafeGroupList()
	{
		String dwid = this.getParameter("dwid");

		safeGroupListService.deleteDataByIds(ids);

		if (ids.endsWith("#"))
		{
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++)
		{
			companyService.plusSafenum(idsVal[i]);
		}

		message = "批量删除成功";

		action = "page/admin/page/safegrouplistback_viewAllSafeGroupList.action?id="
				+ dwid;

		return SUCCESS;
	}
}
