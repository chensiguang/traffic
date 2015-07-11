/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.SafeGroupVDomContent;
import com.web.pojo.Account;
import com.web.pojo.Company;
import com.web.pojo.Driver;
import com.web.pojo.SafeGroup;
import com.web.pojo.SafeGroupList;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.DriverService;
import com.web.service.interfaces.SafeGroupListService;
import com.web.service.interfaces.SafeGroupService;

/**
 * 安全组人员，车辆分配
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:38:01
 */
public class SafeGroupAction extends BaseAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * @Autowired private AccountService accountService;
	 */

	@Autowired
	private SafeGroupService safeGroupService;

	@Autowired
	private DriverService driverService;

	@Autowired
	private SafeGroupListService safeGroupListService;

	@Autowired
	private CompanyService comService;

	private List<Account> accountList;

	private List<Driver> driverList;

	private List<SafeGroup> safeGroupList;

	private List<SafeGroupList> safelistList;

	private List<Company> comList;

	private static final String title = "安全组人员,车辆分配";

	private String ids;

	private String action;

	private static ListActions opt;

	private SafeGroupVDomContent dom;

	private String dwid;

	private String groupid;

	private final static int PAGESIZE = 10;

	private String searchname;

	private String searchstarttime;

	private String searchendtime;

	public String getGroupid()
	{
		return groupid;
	}

	public void setGroupid(String groupid)
	{
		this.groupid = groupid;
	}

	public List<Driver> getDriverList()
	{
		return driverList;
	}

	public void setDriverList(List<Driver> driverList)
	{
		this.driverList = driverList;
	}

	public String getDwid()
	{
		return dwid;
	}

	public void setDwid(String dwid)
	{
		this.dwid = dwid;
	}

	public List<SafeGroupList> getSafelistList()
	{
		return safelistList;
	}

	public void setSafelistList(List<SafeGroupList> safelistList)
	{
		this.safelistList = safelistList;
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

	public List<SafeGroup> getSafeGroupList()
	{
		return safeGroupList;
	}

	public void setSafeGroupList(List<SafeGroup> safeGroupList)
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
		SafeGroupAction.opt = opt;
	}

	public SafeGroupVDomContent getDom()
	{
		return dom;
	}

	public void setDom(SafeGroupVDomContent dom)
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
		opt.setEditAction("page/admin/page/safegroupback_editSafeGroup.action");// 安全组分配
		opt.setShowAction("page/admin/page/safegroupback_viewOneSafeGroup.action");// 单个安全组详情
		opt.setAddAction("page/admin/page/safegroupback_addSafeGroup.action");
		opt.setDeleteAction("page/admin/page/safegroupback_deleteSafeGroup.action");
		opt.setDelAllAction("page/admin/page/safegroupback_delAllSafeGroup.action");// 批量删除
	}

	// 查看所有的信息
	public String viewAllSafeGroup()
	{
		if (this.getParameter("id") != null)
		{
			dwid = this.getParameter("id");
		} else
		{
			dwid = this.getParameter("dwid");
		}

		groupid = this.getParameter("groupid");
		
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

		int allnum = safeGroupService.getCountByAll(querya);

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

		safeGroupList = safeGroupService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/safegroupback_viewAllSafeGroup.action");

		return "default";
	}

	// 查看单条数据
	public String viewOneSafeGroup()
	{
		String id = this.getParameter("id");

		dom = new SafeGroupVDomContent(safeGroupService.queryDataById(id));

		safeGroupList = safeGroupService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String addSafeGroup()
	{
		dwid = this.getParameter("dwid");


		if (dwid != null)
		{
			comList = comService.queryComnameByDwid(dwid);
		}

		// safeGroupList = safeGroupService.queryAll();

		if (dwid != null)
		{
			safelistList = safeGroupListService.queryGroupnameByDwid(Integer.parseInt(dwid));
		}

		action = "page/admin/page/safegroupback_saveNew.action?dwid=" + dwid;

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		if (this.getParameter("dom.dwid") != null)
		{
			dwid = this.getParameter("dom.dwid");
		} else
		{
			dwid = this.getParameter("dwid");
		}

		String groupid = this.getParameter("dom.groupid");

		SafeGroup safeGroup = new SafeGroup();

		safeGroup.setGroupid(dom.getGroupid());

		int num = safeGroupService.newOrUpdate(safeGroup);

		if (num != 0)
		{
			message = "'" + dom.getGroupid() + "'人员，车辆已分配完毕,!";

			action = "page/admin/page/safegroupback_addSafeGroup.action?dwid="
					+ dwid;
		} else
		{
			safeGroup.setDwid(dom.getDwid());

			safeGroup.setGroupid(dom.getGroupid());

			safeGroup.setZzid(dom.getZzid());

			safeGroup.setDriverid(dom.getDriverid());
			safeGroup.setDrivers(dom.getDrivers());

			safeGroup.setCarid(dom.getCarid());
			safeGroup.setCars(dom.getCars());

			safeGroup.setOperid(getCurrUser());

			safeGroup.setOpertime(new Date());

			safeGroup.setRegtime(new Date());

			safeGroup.setRemark(dom.getRemark());

			safeGroup.setState(dom.getState());

			action = "page/admin/page/safegroupback_viewAllSafeGroup.action?dwid="
					+ dwid;

			safeGroupService.insertSafeGroup(safeGroup);

			safeGroupListService.updateFlag(Integer.parseInt(groupid));

			message = "新增成功!";
		}

		return SUCCESS;

	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editSafeGroup()
	{
		dwid = this.getParameter("dwid");

		groupid = this.getParameter("id");

		if (dwid != null)
		{
			comList = comService.queryComnameByDwid(dwid);
		}
		//safeGroupList = safeGroupService.queryAllByGroupId(Integer.parseInt(groupid));
		
		safelistList = safeGroupListService.queryByGroupid(groupid);

		SafeGroup safeGroup = safeGroupService.queryDataById(groupid);

		dom = new SafeGroupVDomContent(safeGroup);

		action = "page/admin/page/safegroupback_saveEdit.action?id=" + groupid;

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

		SafeGroup safeGroup = new SafeGroup();

		safeGroup.setGroupid(dom.getGroupid());

		safeGroup.setId((long) Integer.parseInt(id));

		safeGroup.setDwid(dom.getDwid());

		safeGroup.setGroupid(dom.getGroupid());

		safeGroup.setZzid(dom.getZzid());

		safeGroup.setOperid(getCurrUser());

		safeGroup.setDrivers(dom.getDrivers());

		safeGroup.setCarid(dom.getCarid());

		safeGroup.setDriverid(dom.getDriverid());

		safeGroup.setCars(dom.getCars());

		safeGroup.setOpertime(new Date());

		safeGroup.setRegtime(new Date());

		safeGroup.setRemark(dom.getRemark());

		safeGroup.setState(dom.getState());

		action = "page/admin/page/safegroupback_viewAllSafeGroup.action";

		safeGroupService.updateSafeGroup(safeGroup);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteSafeGroup()
	{

		String id = this.getParameter("id");

		safeGroupService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/safegroupback_viewAllSafeGroup.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllSafeGroup()
	{

		safeGroupService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/safegroupback_viewAllSafeGroup.action";

		return SUCCESS;
	}

	ArrayList<Driver> driverlist = null;

	public void drilist()
	{
		int count = driverService.selectCount(new HashMap<Object, Object>());

		String groupid = this.getParameter("groupid");

		if (groupid != null)
		{
			safeGroupListService.queryGroupnameByGroupid(Integer
					.parseInt(groupid));

			for (int i = 0; i < safeGroupListService.queryGroupnameByGroupid(
					Integer.parseInt(groupid)).size(); i++)
			{
				long zzid = safeGroupListService
						.queryGroupnameByGroupid(Integer.parseInt(groupid))
						.get(i).getZzid();

				driverlist = (ArrayList<Driver>) driverService
						.queryNameById(zzid);

			}
		}

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(drivertojson(count, driverlist));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		log.info("end driver drilist...<return Data type: json;Data:>"
				+ drivertojson(count, driverlist));
	}

	private String drivertojson(int count, ArrayList<Driver> driverList)
	{
		StringBuffer newStr = new StringBuffer();
		newStr.append("{'count':'");
		newStr.append(count);
		newStr.append("'");
		int size = 0;
		if (driverList != null && driverList.size() > 0)
		{
			newStr.append(",'drivers':[");
			for (Driver driver : driverList)
			{
				newStr.append(driver.toJson());
				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);
			newStr.append("]");
			size = driverList.size();
		}

		newStr.append(",'size':'");
		newStr.append(size);
		newStr.append("'");
		newStr.append("}");
		return newStr.toString();
	}
}
