package com.web.action;

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
import com.web.action.vo.DriverVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Account;
import com.web.pojo.Car;
import com.web.pojo.Company;
import com.web.pojo.Driver;
import com.web.pojo.PoliceOrgCompany;
import com.web.pojo.Role;
import com.web.service.interfaces.AccountService;
import com.web.service.interfaces.CarService;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.DriverService;
import com.web.service.interfaces.RoleService;

/**
 * 基本信息
 * 
 * @author wqg
 * 
 *         后台管理 2013-9-9上午11:12:59
 */
public class DriverAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private DriverService driverService;

	@Autowired
	private CompanyService companyService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private CarService carService;

	@Autowired
	private RoleService roleService;

	private List<PoliceOrgCompany> policecomList;

	private List<Company> companylist = new ArrayList<Company>();

	private List<Company> companyList;

	private List<Driver> driverList;

	private List<Driver> driverList2;

	private List<Role> roleList;

	private List<Role> rolelist = new ArrayList<Role>();

	private List<Driver> driverlist = new ArrayList<Driver>();

	private static final String title = "驾驶员管理";

	private String ids;

	private String id;

	private String action;

	private static ListActions opt;

	private DriverVDomContent dom;

	private AccountVDomContent accountdom;

	private final static int PAGESIZE = 10;

	private int count;

	private Driver driver;

	private String dwid;

	private long driveraccountid;

	private String roleno;

	/**
	 * @author ln 列表页面中查询变量
	 * @date 2013-09-30
	 * */
	private Driver searchdriver = new Driver();
	private String searchstarttime = "";
	private String searchendtime = "";

	public String getRoleno()
	{
		return roleno;
	}

	public void setRoleno(String roleno)
	{
		this.roleno = roleno;
	}

	public long getDriveraccountid()
	{
		return driveraccountid;
	}

	public void setDriveraccountid(long driveraccountid)
	{
		this.driveraccountid = driveraccountid;
	}

	public List<Role> getRolelist()
	{
		return rolelist;
	}

	public void setRolelist(List<Role> rolelist)
	{
		this.rolelist = rolelist;
	}

	public List<Role> getRoleList()
	{
		return roleList;
	}

	public void setRoleList(List<Role> roleList)
	{
		this.roleList = roleList;
	}

	public AccountVDomContent getAccountdom()
	{
		return accountdom;
	}

	public void setAccountdom(AccountVDomContent accountdom)
	{
		this.accountdom = accountdom;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getDwid()
	{
		return dwid;
	}

	public void setDwid(String dwid)
	{
		this.dwid = dwid;
	}

	public List<Company> getCompanyList()
	{
		return companyList;
	}

	public void setCompanyList(List<Company> companyList)
	{
		this.companyList = companyList;
	}

	public List<Driver> getDriverlist()
	{
		return driverlist;
	}

	public void setDriverlist(List<Driver> driverlist)
	{
		this.driverlist = driverlist;
	}

	public List<PoliceOrgCompany> getPolicecomList()
	{
		return policecomList;
	}

	public void setPolicecomList(List<PoliceOrgCompany> policecomList)
	{
		this.policecomList = policecomList;
	}

	public Driver getDriver()
	{
		return driver;
	}

	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

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

	public Driver getSearchdriver()
	{
		return searchdriver;
	}

	public void setSearchdriver(Driver searchdriver)
	{
		this.searchdriver = searchdriver;
	}

	public List<Company> getCompanylist()
	{
		return companylist;
	}

	public void setCompanylist(List<Company> companylist)
	{
		this.companylist = companylist;
	}

	public List<Driver> getDriverList()
	{
		return driverList;
	}

	public void setDriverList(List<Driver> driverList)
	{
		this.driverList = driverList;
	}

	public List<Driver> getDriverList2()
	{
		return driverList2;
	}

	public void setDriverList2(List<Driver> driverList2)
	{
		this.driverList2 = driverList2;
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
		DriverAction.opt = opt;
	}

	public DriverVDomContent getDom()
	{
		return dom;
	}

	public void setDom(DriverVDomContent dom)
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
		opt.setAddAction("page/admin/page/driverback_newDriver.action");
		opt.setEditAction("page/admin/page/driverback_editDriver.action");
		opt.setDeleteAction("page/admin/page/driverback_deleteDriver.action");
		opt.setDelAllAction("page/admin/page/driverback_delAllDriver.action");// 批量删除
		opt.setShowAction("page/admin/page/driverback_viewDriver.action");
	}

	// 查看所有的信息
	public String viewDriverList()
	{
		roleno = this.getParameter("roleno");
		HttpSession session = ServletActionContext.getRequest().getSession();
		long admin = (Long) session.getAttribute("adminflag");// 获得当前登录用户是否为数据管理员的标记
		long dwid = (Long) session.getAttribute("dwid");// 获得当前登录用户所在单位号
		long dwtype = (Long) session.getAttribute("dwtype");// 获得当前登录用户所在单位类型
		long driverid = 0;
		if(dwtype == 2)
		{
			driverid = (long) Integer.parseInt((String) session.getAttribute("driverid"));// 获得当前登录用户的id用户号
		}

		String safecomid = this.getParameter("id");// 获得安全组下公司的id号

		String searchname = this.getParameter("searchname") == null ? "" : this
				.getParameter("searchname");
		String searchsex = this.getParameter("searchsex") == null ? "" : this
				.getParameter("searchsex");
		String searchcartype = this.getParameter("searchcartype") == null ? ""
				: this.getParameter("searchcartype");
		searchstarttime = this.getParameter("searchstarttime") == null ? ""
				: this.getParameter("searchstarttime");
		searchendtime = this.getParameter("searchendtime") == null ? ""
				: getParameter("searchendtime");
		searchdriver.setName(searchname);
		searchdriver.setSex(searchsex);
		searchdriver.setCartype(searchcartype);
		String searchsex1 = "";
		if (searchsex.equals("") == false && searchsex != null)
		{
			searchsex1 = searchsex.equals("1") ? "男" : "女";
		}
		// searchdriver.setCompany(searchcomname);
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if (searchname != "" && searchname != null)
		{
			querya.put("searchname", searchname);
		}

		if (searchsex != "" && searchsex != null)
		{
			querya.put("searchsex", searchsex1);
		}
		if (searchcartype != "" && searchcartype != null)
		{
			querya.put("searchcartype", searchcartype);
		}
		if (searchstarttime != "" && searchstarttime != null)
		{
			querya.put("searchstarttime", searchstarttime);
		}

		if (searchendtime != "" && searchendtime != null)
		{
			querya.put("searchendtime", searchendtime);
		}
		if (safecomid != "" && safecomid != null)
		{
			querya.put("safecomid", safecomid);
		}

		int allnum = 0;

		if (admin == 1 || dwtype == 0)// 交警和数据管理员在查看的驾驶员信息时具有同样的权限
		{
			allnum = driverService.getCountByAll(querya);
		} else
		{
			/*
			 * if (dwtype == 0) { policecomList =
			 * policecomService.queryAllByDwid(dwid);// 查询交警下管辖的公司
			 * 
			 * for (int i = 0; i < policecomList.size(); i++) { long comid =
			 * policecomList.get(i).getComid();
			 * 
			 * querya.put("comid", comid);
			 * 
			 * allnum += driverService.getCountByAll(querya);
			 * 
			 * } } else
			 */if (dwtype == 1)// 货运公司
			{
				companyList = companyService.queryChildCompanyByDwid(dwid);// 查询下属公司
				for (int i = 0; i < companyList.size(); i++)
				{
					long comid = companyList.get(i).getComid();
					querya.put("comid", comid);
					allnum += driverService.getCountByAll(querya);

				}
				querya.remove("comid");
				querya.put("comid", dwid);
				allnum += driverService.getCountByAll(querya);
			} else
			// 驾驶员
			{
				querya.put("comid", dwid);
				querya.put("userno", driverid);
				allnum = driverService.getCountByAll(querya);
			}
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
		if (searchname != "" && searchname != null)
		{
			queryp.put("searchname", searchname);
		}
		if (searchsex != "" && searchsex != null)
		{
			queryp.put("searchsex", searchsex1);
		}
		if (searchcartype != "" && searchcartype != null)
		{
			queryp.put("searchcartype", searchcartype);
		}
		if (searchstarttime != "" && searchstarttime != null)
		{
			queryp.put("searchstarttime", searchstarttime);
		}

		if (searchendtime != "" && searchendtime != null)
		{
			queryp.put("searchendtime", searchendtime);
		}
		if (safecomid != "" && safecomid != null)
		{
			queryp.put("safecomid", safecomid);
		}

		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		if (admin == 1 || dwtype == 0)
		{
			driverList = driverService.selectPage(queryp);

			for (int j = 0; j < driverList.size(); j++)
			{
				driverlist.add(driverList.get(j));
			}
		} else
		{
			/*
			 * if (dwtype == 0) { policecomList =
			 * policecomService.queryAllByDwid(dwid);
			 * 
			 * for (int i = 0; i < policecomList.size(); i++) { long comid =
			 * policecomList.get(i).getComid();
			 * 
			 * queryp.put("comid", comid);
			 * 
			 * driverList = driverService.selectPage(queryp);
			 * 
			 * for (int j = 0; j < driverList.size(); j++) {
			 * driverlist.add(driverList.get(j)); }
			 * 
			 * }
			 * 
			 * } else
			 */if (dwtype == 1)
			{
				// 查询自己公司的驾驶员
				queryp.put("comid", dwid);
				driverList = driverService.selectPage(queryp);
				for (int j = 0; j < driverList.size(); j++)
				{
					driverlist.add(driverList.get(j));
				}

				queryp.remove("comid");
				companyList = companyService.queryChildCompanyByDwid(dwid);// 查询下属公司的驾驶员

				for (int i = 0; i < companyList.size(); i++)
				{
					long comid = companyList.get(i).getComid();
					queryp.put("comid", comid);
					driverList = driverService.selectPage(queryp);
					for (int j = 0; j < driverList.size(); j++)
					{
						driverlist.add(driverList.get(j));
					}
				}

			} else
			{
				queryp.put("comid", dwid);
				queryp.put("userno", driverid);
				driverList = driverService.selectPage(queryp);
				for (int j = 0; j < driverList.size(); j++)
				{
					driverlist.add(driverList.get(j));
				}
			}
		}

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/driverback_viewDriverList.action");

		return "default";
	}

	// 查看单条数据
	public String viewDriver()
	{
		String id = this.getParameter("id");

		dom = new DriverVDomContent(driverService.queryDataById(id));

		driverList2 = driverService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newDriver()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();

		long dwtype = (Long) session.getAttribute("dwtype");// 获得当前登录用户所在单位类型

		long dwid = (Long) session.getAttribute("dwid");// 获得当前登录用户所在单位号
		
		driverList = driverService.queryAll();

		companylist = companyService.queryAll();

		if (dwtype == 1)
		{
			companylist = companyService.queryComnameByDwid(dwid + "");
		}
		rolelist = roleService.queryAllByDwType(2);

		long roleno = rolelist.get(0).getRoleno();

		action = "page/admin/page/driverback_saveNew.action?roleno=" + roleno;

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		String roleno = this.getParameter("roleno");

		Driver driver = new Driver();

		driver.setName(dom.getName());

		driver.setAge(dom.getAge());

		driver.setPhone(dom.getPhone());

		driver.setCartype(dom.getCartype());

		driver.setAddress(dom.getAddress());

		driver.setIdentitycard(dom.getIdentitycard());

		driver.setSex(dom.getSex());

		driver.setDwid(dom.getDwid());

		driver.setOperid((long) getCurrUser());

		driver.setOpertime(new Date());

		driver.setRemark(dom.getRemark());

		driver.setLicenseno(dom.getLicenseno());

		driver.setValidtime(new Date());

		driver.setCertificationtime(new Date());

		driver.setUpdatetime(new Date());

		driver.setLoginname(dom.getLoginname());

		driver.setPassword(dom.getPassword());

		action = "page/admin/page/driverback_viewDriverList.action?roleno=" + roleno;

		driverService.insertDriver(driver);

		// 将已经插入到驾驶员表中的这条数据插入到用户表中
		Account account = new Account();

		account.setUsername(driver.getId() + "");

		account.setDwno(driver.getDwid());

		account.setAddress(driver.getAddress());

		account.setEmail("");

		account.setRemark(driver.getRemark());

		account.setLoginname(driver.getLoginname());

		account.setPassword(driver.getPassword());

		account.setRoleno(Integer.parseInt(roleno));

		account.setTypeid(1);

		account.setRegtime(new Date());

		account.setOperid(getCurrUser());

		account.setOpertime(new Date());

		account.setTelephone(driver.getPhone());

		accountService.insertAccount(account);

		message = "新增成功!";

		driveraccountid = driver.getId();

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editDriver()
	{

		String id = this.getParameter("id");

		Driver driver = driverService.queryDataById(id);

		companylist = companyService.queryAll();

		dom = new DriverVDomContent(driver);

		action = "page/admin/page/driverback_saveEdit.action?id=" + id;

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

		Driver driver = new Driver();

		driver.setAddress(dom.getAddress());

		driver.setAge(dom.getAge());

		driver.setCartype(dom.getCartype());

		driver.setRemark(dom.getRemark());

		driver.setIdentitycard(dom.getIdentitycard());

		driver.setLicenseno(dom.getLicenseno());

		driver.setName(dom.getName());

		driver.setPhone(dom.getPhone());

		driver.setSex(dom.getSex());

		driver.setDwid(dom.getDwid());

		driver.setOperid(dom.getOperid());

		driver.setUpdatetime(new Date());

		driver.setCertificationtime(new Date());

		driver.setValidtime(new Date());
		
		driver.setLoginname(dom.getLoginname());
		
		driver.setPassword(dom.getPassword());

		driver.setId((long) Integer.parseInt(id));

		action = "page/admin/page/driverback_viewDriverList.action";

		driverService.updateDriver(driver);

		String userno = id;

		long accountid = accountService.queryDataByUserno(userno).getUserno();

		// 将已经修改插入到驾驶员表中的这条数据插入到用户表中
		Account account = new Account();

		account.setUsername(driver.getId() + "");

		account.setDwno(driver.getDwid());

		account.setAddress(driver.getAddress());

		account.setEmail("");

		account.setRemark(driver.getRemark());

		account.setLoginname(driver.getLoginname());

		account.setPassword(driver.getPassword());
		
		rolelist = roleService.queryAllByDwType(2);

		long roleno = rolelist.get(0).getRoleno();

		account.setRoleno(roleno);

		account.setTypeid(1);

		account.setOperid(getCurrUser());

		account.setOpertime(new Date());

		account.setTelephone(driver.getPhone());

		account.setId(accountid);

		accountService.updateAccount(account);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteDriver()
	{

		String id = this.getParameter("id");

		driverService.deleteDataById(id);
		
		String username = id ;
		
		accountService.deleteDataByUsername(Integer.parseInt(username));

		message = "删除成功";

		action = "page/admin/page/driverback_viewDriverList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllDriver()
	{

		driverService.deleteDataByIds(ids);
		
		String username = ids;
		
		accountService.deleteDataByUsernames(username);

		message = "批量删除成功";

		action = "page/admin/page/driverback_viewDriverList.action";

		return SUCCESS;
	}

	// 车辆分配

	public String carEdit()
	{
		id = this.getParameter("id");

		Driver driver = driverService.queryDataById(id);

		dwid = driver.getDwid() + "";

		companylist = companyService.queryComnameByDwid(dwid);

		dom = new DriverVDomContent(driver);

		action = "page/admin/page/driverback_saveCar.action";

		return "caredit";
	}

	/**
	 * 修改车辆分配
	 * 
	 */

	public String editCar()
	{

		String id = this.getParameter("id");

		Driver driver = driverService.queryDataById(id);

		dwid = driver.getDwid() + "";

		companylist = companyService.queryComnameByDwid(dwid);

		dom = new DriverVDomContent(driver);

		action = "page/admin/page/driverback_saveCar.action?id=" + id;

		return "caredit";
	}

	/**
	 * 保存车辆分配和车辆修改记录
	 * 
	 * @return
	 */
	public String saveCar()
	{
		id = this.getParameter("id");

		Driver driver = new Driver();

		driver.setCars(dom.getCars());

		driver.setId((long) Integer.parseInt(id));

		action = "page/admin/page/driverback_viewDriverList.action";

		driverService.updateCar(driver);

		message = "新增成功!";

		return SUCCESS;
	}

	public void drilist()
	{

		dwid = this.getParameter("dwid");

		int count = driverService.selectCount(new HashMap<Object, Object>());

		ArrayList<Driver> driverList = driverService
				.selectDriverListByDwid(dwid);

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

	public void carlist()
	{

		String dwid = this.getParameter("dwid");

		int count = carService.selectCount();

		ArrayList<Car> carList = carService.selectCarListByDwid(dwid);

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(cartojson(count, carList));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		log.info("end driver drilist...<return Data type: json;Data:>"
				+ cartojson(count, carList));
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

	private String cartojson(int count, ArrayList<Car> carList)
	{
		StringBuffer newStr = new StringBuffer();
		newStr.append("{'count':'");
		newStr.append(count);
		newStr.append("'");
		int size = 0;
		if (carList != null && carList.size() > 0)
		{
			newStr.append(",'cars':[");
			for (Car car : carList)
			{
				newStr.append(car.toJson());
				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);
			newStr.append("]");
			size = carList.size();
		}

		newStr.append(",'size':'");
		newStr.append(size);
		newStr.append("'");
		newStr.append("}");
		return newStr.toString();
	}

}
