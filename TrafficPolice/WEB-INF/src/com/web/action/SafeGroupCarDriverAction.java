/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.SafeGroupCarDriverVDomContent;
import com.web.pojo.Car;
import com.web.pojo.Company;
import com.web.pojo.Driver;
import com.web.pojo.SafeGroup;
import com.web.pojo.SafeGroupCarDriver;
import com.web.pojo.SafeGroupList;
import com.web.service.interfaces.CarService;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.DriverService;
import com.web.service.interfaces.SafeGroupCarDriverService;
import com.web.service.interfaces.SafeGroupListService;
import com.web.service.interfaces.SafeGroupService;

/**
 * 安全组人员，车辆对应关系
 * 
 * @author wqg
 * 
 *         2013-10-12下午1:38:01
 */
public class SafeGroupCarDriverAction extends BaseAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * @Autowired private AccountService accountService;
	 */

	@Autowired
	private SafeGroupCarDriverService safeGroupService;

	@Autowired
	private SafeGroupListService safelistService;

	@Autowired
	private SafeGroupService groupService;

	@Autowired
	private CompanyService comService;

	@Autowired
	private CarService carService;

	@Autowired
	private DriverService driverService;

	private List<SafeGroupCarDriver> safeGroupCarDriverList;// 安全组驾驶员，车辆对应

	private List<SafeGroupList> safeList;// 安全组分组

	private List<SafeGroup> groupList;// 安全组分组

	private List<Car> carList = new ArrayList<Car>();

	private List<Driver> driverList = new ArrayList<Driver>();

	private List<Company> comList;

	private static final String title = "安全组人员,车辆对应关系";

	private String ids;

	private String action;

	private static ListActions opt;

	private SafeGroupCarDriverVDomContent dom;

	private String dwid;

	private String groupid;

	private final static int PAGESIZE = 10;

	private String searchname;

	private String searchstarttime;

	private String searchendtime;

	private Driver zzid;// 查找组长

	public Driver getZzid()
	{
		return zzid;
	}

	public void setZzid(Driver zzid)
	{
		this.zzid = zzid;
	}

	public List<Car> getCarList()
	{
		return carList;
	}

	public void setCarList(List<Car> carList)
	{
		this.carList = carList;
	}

	public List<Driver> getDriverList()
	{
		return driverList;
	}

	public void setDriverList(List<Driver> driverList)
	{
		this.driverList = driverList;
	}

	public List<SafeGroup> getGroupList()
	{
		return groupList;
	}

	public void setGroupList(List<SafeGroup> groupList)
	{
		this.groupList = groupList;
	}

	public List<SafeGroupList> getSafeList()
	{
		return safeList;
	}

	public void setSafeList(List<SafeGroupList> safeList)
	{
		this.safeList = safeList;
	}

	public String getGroupid()
	{
		return groupid;
	}

	public void setGroupid(String groupid)
	{
		this.groupid = groupid;
	}

	public String getDwid()
	{
		return dwid;
	}

	public void setDwid(String dwid)
	{
		this.dwid = dwid;
	}

	public List<SafeGroupCarDriver> getSafeGroupCarDriverList()
	{
		return safeGroupCarDriverList;
	}

	public void setSafeGroupCarDriverList(
			List<SafeGroupCarDriver> safeGroupCarDriverList)
	{
		this.safeGroupCarDriverList = safeGroupCarDriverList;
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
		SafeGroupCarDriverAction.opt = opt;
	}

	public SafeGroupCarDriverVDomContent getDom()
	{
		return dom;
	}

	public void setDom(SafeGroupCarDriverVDomContent dom)
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
		opt.setEditAction("page/admin/page/safegroupcardriverback_editSafeGroupCarDriver.action");// 安全组分配
		opt.setShowAction("page/admin/page/safegroupcardriverback_viewOneSafeGroupCarDriver.action");// 单个安全组详情
		opt.setAddAction("page/admin/page/safegroupcardriverback_addSafeGroupCarDriver.action");
		opt.setDeleteAction("page/admin/page/safegroupcardriverback_deleteSafeGroupCarDriver.action");
		opt.setDelAllAction("page/admin/page/safegroupcardriverback_delAllSafeGroupCarDriver.action");// 批量删除
	}

	// 查看所有的信息
	public String viewAllSafeGroupCarDriver()
	{
		dwid = this.getParameter("dwid");// 获得当前的单位id
		
		groupid = this.getParameter("groupid");// 获得当前的组id

		comList = comService.queryComnameByDwid(dwid);

		safeList = safelistService.queryAllByDwid(dwid);

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

		safeGroupCarDriverList = safeGroupService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this
				.getPageNumView(curpage, pagenum,
						"page/admin/page/safegroupcardriverback_viewAllSafeGroupCarDriver.action?dwid="+ dwid +"&groupid=" + groupid);

		return "default";
	}

	// 查看单条数据
	public String viewOneSafeGroupCarDriver()
	{
		String id = this.getParameter("id");

		dom = new SafeGroupCarDriverVDomContent(
				safeGroupService.queryDataById(id));

		safeGroupCarDriverList = safeGroupService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String addSafeGroupCarDriver()
	{
		 dwid = this.getParameter("dwid");

		 groupid = this.getParameter("groupid");// 获得当前的组id

		safeList = safelistService.queryGroupnameByGroupid(Integer.parseInt(groupid));

		if (dwid != null)
		{
			comList = comService.queryComnameByDwid(dwid);
		}
		HashMap<String, String> query = new HashMap<String, String>();
		query.put("groupid", groupid);
		query.put("dwid", dwid);
		
		groupList = groupService.queryByDwidGroupid(query);// 通过单位id，组id查找人员，车辆信息

		for (int i = 0; i < groupList.size(); i++)
		{
			int zzids = (int) groupList.get(i).getZzid();

			zzid = driverService.queryDataByDriverid(zzids);

			String carids = groupList.get(i).getCarid();
			if (carids.endsWith("#"))
			{
				carids = carids.substring(0, carids.length() - 1);
			}
			String[] idsVal = carids.split("#");
			for (int j = 0; j < idsVal.length; j++)
			{
				int carid = Integer.parseInt(idsVal[i]);
				
				Car car = carService.queryDataByCarid(carid);
				carList.add(car);
			}

			String driverids = groupList.get(i).getDriverid();
			if (driverids.endsWith("#"))
			{
				driverids = driverids.substring(0, driverids.length() - 1);
			}
			String[] driveridsVal = driverids.split("#");
			for (int j = 0; j < driveridsVal.length; j++)
			{
				int driverid = Integer.parseInt(driveridsVal[i]);
				driverList.add(driverService.queryDataByDriverid(driverid));
			}
		}
		action = "page/admin/page/safegroupcardriverback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		SafeGroupCarDriver safeGroup = new SafeGroupCarDriver();

		safeGroup.setDwid(dom.getDwid());

		safeGroup.setGroupid(dom.getGroupid());

		safeGroup.setZzid(dom.getZzid());

		safeGroup.setDriverid(dom.getDriverid());

		safeGroup.setCarid(dom.getCarid());

		safeGroup.setOperid(getCurrUser());

		safeGroup.setOpertime(new Date());

		safeGroup.setRegtime(new Date());

		safeGroup.setRemark(dom.getRemark());

		safeGroup.setState(dom.getState());

		action = "page/admin/page/safegroupcardriverback_viewAllSafeGroupCarDriver.action?dwid="
				+ dom.getDwid() + "&groupid=" + dom.getGroupid();

		safeGroupService.insertSafeGroupCarDriver(safeGroup);

		message = "新增成功!";

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editSafeGroupCarDriver()
	{
		dwid = this.getParameter("dwid");

		groupid = this.getParameter("groupid");// 获得当前的组id

		safeList = safelistService.queryGroupnameByGroupid(Integer.parseInt(groupid));

		if (dwid != null)
		{
			comList = comService.queryComnameByDwid(dwid);
		}
		HashMap<String, String> query = new HashMap<String, String>();
		query.put("groupid", groupid);
		query.put("dwid", dwid);
		groupList = groupService.queryByDwidGroupid(query);// 通过单位id，组id查找人员，车辆信息

		for (int i = 0; i < groupList.size(); i++)
		{
			int zzids = (int) groupList.get(i).getZzid();

			zzid = driverService.queryDataByDriverid(zzids);

			String carids = groupList.get(i).getCarid();
			if (carids.endsWith("#"))
			{
				carids = carids.substring(0, carids.length() - 1);
			}
			String[] idsVal = carids.split("#");
			for (int j = 0; j < idsVal.length; j++)
			{
				int carid = Integer.parseInt(idsVal[i]);
				Car car = carService.queryDataByCarid(carid);
				carList.add(car);
			}

			String driverids = groupList.get(i).getDriverid();
			if (driverids.endsWith("#"))
			{
				driverids = driverids.substring(0, driverids.length() - 1);
			}
			String[] driveridsVal = driverids.split("#");
			for (int j = 0; j < driveridsVal.length; j++)
			{
				int driverid = Integer.parseInt(driveridsVal[i]);
				driverList.add(driverService.queryDataByDriverid(driverid));
			}
		}
		String id = this.getParameter("id");

		SafeGroupCarDriver safeGroup = safeGroupService.queryDataById(id);

		dom = new SafeGroupCarDriverVDomContent(safeGroup);

		action = "page/admin/page/safegroupcardriverback_saveEdit.action?id="
				+ id;

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

		SafeGroupCarDriver safeGroup = new SafeGroupCarDriver();

		safeGroup.setId((long) Integer.parseInt(id));
		
		safeGroup.setDriverid(dom.getDriverid());
		
		safeGroup.setCarid(dom.getCarid());

		safeGroup.setGroupid(dom.getGroupid());

		safeGroup.setZzid(dom.getZzid());

		safeGroup.setOperid(getCurrUser());

		safeGroup.setOpertime(new Date());

		safeGroup.setRemark(dom.getRemark());

		action = "page/admin/page/safegroupcardriverback_viewAllSafeGroupCarDriver.action?dwid="
				+ dom.getDwid() + "&groupid=" + dom.getGroupid();

		safeGroupService.updateSafeGroupCarDriver(safeGroup);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteSafeGroupCarDriver()
	{

		String id = this.getParameter("id");

		dwid = this.getParameter("dwid");

		groupid = this.getParameter("groupid");// 获得当前的组id

		safeGroupService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/safegroupcardriverback_viewAllSafeGroupCarDriver.action?dwid=" + dwid + "&groupid=" + groupid;

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllSafeGroupCarDriver()
	{
		dwid = this.getParameter("dwid");
		
		groupid = this.getParameter("groupid");// 获得当前的组id

		safeGroupService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/safegroupcardriverback_viewAllSafeGroupCarDriver.action?dwid="
				+ dwid+ "&groupid=" + groupid;

		return SUCCESS;
	}
}
