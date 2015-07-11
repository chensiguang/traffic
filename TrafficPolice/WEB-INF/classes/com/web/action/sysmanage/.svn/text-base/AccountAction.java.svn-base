/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.sysmanage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.AccountVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Account;
import com.web.pojo.Company;
import com.web.pojo.Driver;
import com.web.pojo.Police;
import com.web.pojo.PoliceOrg;
import com.web.pojo.Role;
import com.web.pojo.Type;
import com.web.service.interfaces.AccountService;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.DriverService;
import com.web.service.interfaces.PoliceOrgService;
import com.web.service.interfaces.PoliceService;
import com.web.service.interfaces.RoleService;
import com.web.service.interfaces.TypeService;

/**
 * @author wqg
 * 
 *         2013-9-25上午9:37:50
 */
public class AccountAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private AccountService accountService;

	@Autowired
	private PoliceService policeService;

	@Autowired
	private DriverService driverService;

	@Autowired
	private PoliceOrgService orgService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private TypeService typeService;

	@Autowired
	private CompanyService comService;

	private List<Role> roleList = new ArrayList<Role>();

	private List<Role> rolelist;

	private List<Type> typeList;

	private List<PoliceOrg> orgList;

	private List<Account> accountList;

	private List<Account> accountList2;

	private List<Company> comList;

	private List<Driver> driverList;

	private static final String title = "账号管理";

	private String ids;

	private String action;

	private static ListActions opt;

	private AccountVDomContent dom;

	private final static int PAGESIZE = 10;

	private Account account2;

	private Account account;

	private String searchname;// 根据登录名查询

	private long searchroleno;// 根据角色id查询

	private String searchstarttime;// 开始时间查询

	private String searchendtime;// 结束时间查询

	public Account getAccount()
	{
		return account;
	}

	public void setAccount(Account account)
	{
		this.account = account;
	}

	public List<Driver> getDriverList()
	{
		return driverList;
	}

	public void setDriverList(List<Driver> driverList)
	{
		this.driverList = driverList;
	}

	public List<Company> getComList()
	{
		return comList;
	}

	public void setComList(List<Company> comList)
	{
		this.comList = comList;
	}

	public List<PoliceOrg> getOrgList()
	{
		return orgList;
	}

	public void setOrgList(List<PoliceOrg> orgList)
	{
		this.orgList = orgList;
	}

	public String getSearchname()
	{
		return searchname;
	}

	public void setSearchname(String searchname)
	{
		this.searchname = searchname;
	}

	public long getSearchroleno()
	{
		return searchroleno;
	}

	public void setSearchroleno(long searchroleno)
	{
		this.searchroleno = searchroleno;
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

	public Account getAccount2()
	{
		return account2;
	}

	public void setAccount2(Account account2)
	{
		this.account2 = account2;
	}

	public List<Account> getAccountList2()
	{
		return accountList2;
	}

	public void setAccountList2(List<Account> accountList2)
	{
		this.accountList2 = accountList2;
	}

	public List<Role> getRoleList()
	{
		return roleList;
	}

	public void setRoleList(List<Role> roleList)
	{
		this.roleList = roleList;
	}

	public List<Type> getTypeList()
	{
		return typeList;
	}

	public void setTypeList(List<Type> typeList)
	{
		this.typeList = typeList;
	}

	public List<Account> getAccountList()
	{
		return accountList;
	}

	public void setAccountList(List<Account> accountList)
	{
		this.accountList = accountList;
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
		AccountAction.opt = opt;
	}

	public AccountVDomContent getDom()
	{
		return dom;
	}

	public void setDom(AccountVDomContent dom)
	{
		this.dom = dom;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public String getTitle()
	{
		return title;
	}

	public static int getPagesize()
	{
		return PAGESIZE;
	}

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/account_newAccount.action");
		opt.setAddPoliceAction("page/admin/page/account_newPoliceAccount.action");
		opt.setAddOrgAction("page/admin/page/account_newOrgAccount.action");
		opt.setEditAction("page/admin/page/account_editAccount.action");
		opt.setDeleteAction("page/admin/page/account_deleteAccount.action");
		opt.setDelAllAction("page/admin/page/account_delAllAccount.action");// 批量删除
		opt.setShowAction("page/admin/page/account_viewAccount.action");
		opt.setPasswordAction("page/admin/page/account_viewPassword.action");// 查看密码
		opt.setPasswordEditAction("page/admin/page/account_editPassword.action");// 修改密码
	}

	// 查看所有的信息
	public String viewAccountList()
	{
		searchname = this.getParameter("searchname");

		if (this.getParameter("searchroleno") != null
				&& "" != this.getParameter("searchroleno"))
		{
			searchroleno = Integer.parseInt(this.getParameter("searchroleno"));
		}

		searchstarttime = this.getParameter("searchstarttime");

		searchendtime = this.getParameter("searchendtime");

		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchname != null && "" != searchname)
		{
			querya.put("searchname", searchname);
		}
		if (this.getParameter("searchroleno") != null
				&& "" != this.getParameter("searchroleno"))
		{
			querya.put("searchroleno", searchroleno);
		}
		if (searchstarttime != null && "" != searchstarttime)
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && "" != searchendtime)
		{
			querya.put("searchendtime", searchendtime);
		}

		int allnum = accountService.getCountByAll(querya);

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
		if (this.getParameter("searchroleno") != null
				&& "" != this.getParameter("searchroleno"))
		{
			queryp.put("searchroleno", searchroleno);
		}
		if (searchstarttime != null && "" != searchstarttime)
		{
			queryp.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && "" != searchendtime)
		{
			queryp.put("searchendtime", searchendtime);
		}
		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		accountList = accountService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/account_viewAccountList.action");

		return "default";
	}

	// 查看单条数据
	public String viewAccount()
	{
		String id = this.getParameter("id");

		dom = new AccountVDomContent(accountService.queryDataById(id));

		accountList = accountService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newAccount()
	{
		long dwtype = Integer.parseInt(this.getParameter("dwtype"));

		if (dwtype == 0)
		{
			orgList = orgService.queryAll();

			roleList = roleService.queryAllByDwType(dwtype);
		}
		if (dwtype == 1 || dwtype == 2)
		{
			comList = comService.queryAll();

			roleList = roleService.queryAllByDwType(dwtype);
		}

		accountList = accountService.queryAll();

		accountList = accountService.queryAll();

		action = "page/admin/page/account_saveNew.action";

		return "edit";
	}

	/**
	 * 创建一条交警账号记录
	 * 
	 * @return
	 */
	public String newPoliceAccount()
	{
		long dwtype = Integer.parseInt(this.getParameter("dwtype"));

		orgList = orgService.selectAll();

		roleList = roleService.queryAllByDwType(dwtype);

		accountList = accountService.queryAll();

		action = "page/admin/page/account_saveNew.action";

		return "editorg";
	}

	/**
	 * 创建一条货运企业账号记录
	 * 
	 * @return
	 */
	public String newOrgAccount()
	{
		if (this.getParameter("dwid") != null)
		{
			long dwid = Integer.parseInt(this.getParameter("dwid"));

			driverList = driverService.selectDrivernameByDwid(dwid);

			comList = comService.queryAll();
		}
		if (this.getParameter("dwtype") != null)
		{
			long dwtype = Integer.parseInt(this.getParameter("dwtype"));

			comList = comService.queryAll();

			if (dwtype == 1)
			{
				rolelist = roleService.queryAllByDwType(dwtype);

				for (int i = 0; i < rolelist.size(); i++)
				{
					roleList.add(rolelist.get(i));
				}
			}
			if (dwtype == 2)
			{
				rolelist = roleService.queryAllByDwType(dwtype);

				for (int i = 0; i < rolelist.size(); i++)
				{
					roleList.add(rolelist.get(i));
				}
				
				accountList = accountService.queryAll();

				action = "page/admin/page/account_saveNew.action";

				return "editdriver";
				
			}
		}
		accountList = accountService.queryAll();

		action = "page/admin/page/account_saveNew.action";

		return "editcom";

	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Account account = new Account();

		account.setLoginname(dom.getLoginname().trim());

		int num = accountService.newOrUpdate(account);

		if (num != 0)
		{
			message = "'" + dom.getLoginname() + "'登录名已存在!";

			action = opt.getAddOrgAction();
		} else
		{

			account.setAddress(dom.getAddress());

			account.setDwno(dom.getDwno());

			account.setEmail(dom.getEmail());

			account.setOperid(dom.getOperid());

			account.setUsername(dom.getUsername());

			account.setOpertime(new Date());

			account.setPassword(dom.getPassword());

			account.setRegtime(new Date());

			account.setRemark(dom.getRemark());

			account.setRoleno(dom.getRoleno());

			account.setState(dom.getState());

			account.setTelephone(dom.getTelephone());

			account.setTypeid(dom.getTypeid());

			accountService.insertAccount(account);

			action = "page/admin/page/account_viewAccountList.action";

			message = "新增成功!";
		}

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editAccount()
	{

		String id = this.getParameter("id");

		Account account = accountService.queryDataById(id);

		long typeid = account.getTypeid();

		if (typeid == 0)
		{
			roleList = roleService.queryAllByDwType(typeid);

			orgList = orgService.queryAll();

			dom = new AccountVDomContent(account);

			action = "page/admin/page/account_saveEdit.action?id=" + id;

			return "editorg";
		} else
		{
			typeid = 1;
			rolelist = roleService.queryAllByDwType(typeid);

			for (int i = 0; i < rolelist.size(); i++)
			{
				roleList.add(rolelist.get(i));
			}

			typeid = 2;
			rolelist = roleService.queryAllByDwType(typeid);

			for (int i = 0; i < rolelist.size(); i++)
			{
				roleList.add(rolelist.get(i));
			}

			comList = comService.queryAll();

			dom = new AccountVDomContent(account);

			action = "page/admin/page/account_saveEdit.action?id=" + id;

			return "editcom";
		}
	}

	/**
	 * 保存修改
	 * 
	 * @return
	 */
	public String saveEdit()
	{
		String id = this.getParameter("id");

		Account account = new Account();

		account.setLoginname(dom.getLoginname());

		account.setId((long) Integer.parseInt(id));

		account.setAddress(dom.getAddress());

		account.setDwno(dom.getDwno());

		account.setEmail(dom.getEmail());

		account.setOperid(dom.getOperid());

		account.setUsername(dom.getUsername());

		account.setOpertime(new Date());

		account.setPassword(dom.getPassword());

		account.setRegid(dom.getRegid());

		account.setRemark(dom.getRemark());

		account.setRoleno(dom.getRoleno());

		account.setState(dom.getState());

		account.setTelephone(dom.getTelephone());

		account.setTypeid(dom.getTypeid());

		action = "page/admin/page/account_viewAccountList.action";

		accountService.updateAccount(account);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteAccount()
	{

		String id = this.getParameter("id");

		if (id == "0")
		{
			message = "总权限账号不能删除";

		} else
		{
			accountService.deleteDataById(id);

			message = "删除成功";
		}
		action = "page/admin/page/account_viewAccountList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllAccount()
	{

		accountService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/account_viewAccountList.action";

		return SUCCESS;
	}

	// 查看密码
	public String viewPassword()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();
		
		long dwid = (Long) session.getAttribute("dwid");// 获得当前登录用户所在单位号

		long dwtype = (Long) session.getAttribute("dwtype");// 获得当前登录用户所在单位类型
		
		String userno = this.getParameter("id");
		
		if(userno.equals("null"))//==比较的是对象在内存中的地址，equals比较是对象的值
		{
			driverList = driverService.selectDrivernameByDwid(dwid);
			
			return "adddriver";
		}
		
		account2 = accountService.queryDataByUserno(userno);

		action = "page/admin/page/account_viewPassword.action";

		return "viewpassword";
	}

	// 编辑密码
	public String editPassword()
	{
		String id = this.getParameter("id");

		account = accountService.queryDataByUserno(id);

		roleList = roleService.queryAll();

		typeList = typeService.queryAll();

		dom = new AccountVDomContent(account);

		action = "page/admin/page/account_saveEditPassword.action?id=" + id;

		return "editpassword";
	}

	// 保存密码
	public String saveEditPassword()
	{
		String id = this.getParameter("id");

		String password = this.getParameter("password");

		Account account = new Account();

		account.setPassword(password);

		account.setId((long) Integer.parseInt(id));

		accountService.updatePassword(account);

		action = "page/admin/page/account_viewPassword.action?id=" + id;

		message = "密码修改成功!";

		return SUCCESS;
	}

	// 修改是否为数据管理员的标记
	public String updateAdminflag()
	{
		String id = this.getParameter("id");

		accountService.updateAdminflag(id);

		message = "设置数据管理员成功!";

		action = "page/admin/page/account_viewAccountList.action";

		return SUCCESS;
	}
	
	// 修改是否为数据管理员的标记
	public String deleteAdminflag()
	{
		String id = this.getParameter("id");

		accountService.deleteAdminflag(id);

		message = "取消数据管理员成功!";

		action = "page/admin/page/account_viewAccountList.action";

		return SUCCESS;
	}

	public void drilist()
	{

		String dwid = this.getParameter("dwid");

		int count = driverService.selectCount(new HashMap<Object, Object>());

		ArrayList<Driver> driverList = driverService.selectDriverListByDwid(dwid);

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(drivertojson(count, driverList));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		log.info("end driver drilist...<return Data type: json;Data:>"
				+ drivertojson(count, driverList));
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
		System.out.println(newStr.toString());
		return newStr.toString();
	}

	public void policelist()
	{
		String dwid = this.getParameter("dwid");

		String currentpage = getParameter("currentpage");
		log.info("do police drilist...<param>currentpage=" + currentpage);
		if (currentpage == null || currentpage.equals(""))
		{
			currentpage = "1";
		}
		// int count = policeService.selectCount(new HashMap<Object, Object>());
		int count = 0;
		ArrayList<Police> policeList = null;
		if (dwid != null)
		{
			policeList = policeService.selectPoliceListByDwid(Integer
					.parseInt(dwid));
		}

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(tojson(count, policeList));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		log.info("end driver polist...<return Data type: json;Data:>"
				+ tojson(count, policeList));
	}

	private String tojson(int count, ArrayList<Police> policeList)
	{
		StringBuffer newStr = new StringBuffer();
		newStr.append("{'count':'");
		newStr.append(count);
		newStr.append("'");
		int size = 0;
		if (policeList != null && policeList.size() > 0)
		{
			newStr.append(",'polices':[");
			for (Police police : policeList)
			{
				newStr.append(police.toJson());
				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);
			newStr.append("]");
			size = policeList.size();
		}

		newStr.append(",'size':'");
		newStr.append(size);
		newStr.append("'");
		newStr.append("}");
		System.out.println(newStr.toString());
		return newStr.toString();
	}
}
