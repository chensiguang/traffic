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

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.ReprimandVDomContent;
import com.web.pojo.Company;
import com.web.pojo.Driver;
import com.web.pojo.Reprimand;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.DriverService;
import com.web.service.interfaces.ReprimandService;

/**
 * @author wqg
 * 
 *         2013-10-28下午4:12:57
 */
public class OtherReprimandAction extends BaseAction
{

	@Autowired
	private ReprimandService reService;

	@Autowired
	private CompanyService comService;

	@Autowired
	private DriverService driverService;

	private List<Reprimand> reList;

	private List<Reprimand> distinctList;

	private List<Company> comList;

	private List<Driver> driverList;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ReprimandVDomContent dom;

	private static final String title = "通报批评";

	private String ids;

	private String action;

	private static ListActions opt;

	private final static int PAGESIZE = 10;

	private Driver driver;

	private String searchname = "";
	private String searchstarttime = "";
	private String searchendtime = "";

	private String id;

	public Driver getDriver()
	{
		return driver;
	}

	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}

	public List<Reprimand> getDistinctList()
	{
		return distinctList;
	}

	public void setDistinctList(List<Reprimand> distinctList)
	{
		this.distinctList = distinctList;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
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

	public List<Reprimand> getReList()
	{
		return reList;
	}

	public void setReList(List<Reprimand> reList)
	{
		this.reList = reList;
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
		OtherReprimandAction.opt = opt;
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
		opt.setAddAction("page/admin/page/otherreprimandback_newReprimand.action"); // 新增
		opt.setEditAction("page/admin/page/otherreprimandback_editReprimand.action"); // 修改
		opt.setDeleteAction("page/admin/page/otherreprimandback_deleteReprimand.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/otherreprimandback_deleteAllReprimand.action"); // 批量删除
		opt.setShowAction("page/admin/page/otherreprimandback_viewReprimand.action"); // 详情
	}

	// 用于企业安全组组长
	public String viewReprimandList()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();
		long dwid = (Long) session.getAttribute("dwid");// 获得当前登录用户所在单位号

		long dwtype = (Long) session.getAttribute("dwtype");// 获得当前登录用户所在单位类型

		long driverid = (long) Integer.parseInt((String) session
				.getAttribute("driverid"));// 获得当前登录用户的id用户号

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
		querya.put("dwid", dwid);
		querya.put("type", 1);

		if (dwtype == 2)
		{
			querya.put("driverid", driverid);
		}
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

		queryp.put("dwid", dwid);

		queryp.put("type", 1);

		if (dwtype == 2)
		{
			queryp.put("driverid", driverid);
		}

		reList = reService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/otherreprimandback_viewReprimandList.action");

		return "default";
	}

	// 用于安全组的其他安全组
	public String otherviewReprimandList()
	{
		String otherdwid = this.getParameter("otherdwid");

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
		querya.put("otherdwid", otherdwid);
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

		queryp.put("otherdwid", otherdwid);

		queryp.put("type", 1);

		reList = reService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this
				.getPageNumView(curpage, pagenum,
						"page/admin/page/otherreprimandback_otherviewReprimandList.action");

		return "viewother";
	}

	// 用于驾驶员
	public String showDriverReprimand()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();
		long driverid = (long) Integer.parseInt((String) session
				.getAttribute("driverid"));// 获得当前登录用户的id用户号

		searchstarttime = this.getParameter("searchstarttime") == null ? ""
				: this.getParameter("searchstarttime");
		searchendtime = this.getParameter("searchendtime") == null ? "" : this
				.getParameter("searchendtime");
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if (searchstarttime != "" && searchstarttime != null)
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != "" && searchendtime != null)
		{
			querya.put("searchendtime", searchendtime);
		}
		querya.put("driverid", driverid);

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

		queryp.put("driverid", driverid);

		reList = reService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this
				.getPageNumView(curpage, pagenum,
						"page/admin/page/otherreprimandback_showDriverReprimand.action");

		return "viewdriver";
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

		action = "page/admin/page/otherreprimandback_saveNew.action";

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

		re.setTime(new Date());

		re.setType(1);

		reService.insertReprimand(re);

		action = "page/admin/page/otherreprimandback_viewReprimandList.action";

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

		action = "page/admin/page/otherreprimandback_saveEdit.action?id=" + id;

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

		re.setLoginname(dom.getLoginname());

		re.setTime(new Date());

		re.setId((long) Integer.parseInt(id));

		action = "page/admin/page/otherreprimandback_viewReprimandList.action";

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

		action = "page/admin/page/otherreprimandback_viewReprimandList.action";

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

		action = "page/admin/page/otherreprimandback_viewReprimandList.action";

		return SUCCESS;
	}

	// 模态窗口显示
	public String subMod()
	{
		String dwid = this.getParameter("dwid");

		id = this.getParameter("id");

		driverList = driverService.queryAllComnameByDwid(dwid);

		return "sub";
	}

	// 保存模态窗口提交的数据，倒查数据保存
	public String saveSubMod()
	{
		String content = this.getParameter("contents");

		String driverid = this.getParameter("driverids");

		String dwid = this.getParameter("dwid");

		String id = this.getParameter("id");

		Reprimand reprimand = reService.queryDataById(id);

		long flag = reprimand.getFlag();

		if (flag != 1)
		{
			Reprimand re = new Reprimand();

			if (content.endsWith("#"))
			{
				content = content.substring(0, content.length() - 1);
			}

			if (driverid.endsWith("#"))
			{
				driverid = driverid.substring(0, driverid.length() - 1);
			}

			String[] contentVal = content.split("#");

			String[] driveridVal = driverid.split("#");
			for (int i = 0; i < contentVal.length; i++)
			{

				re.setContent(contentVal[i]);

				re.setTime(new Date());

				re.setLoginname(getLoginname());

				re.setDwid(Integer.parseInt(dwid));

				re.setPid(Integer.parseInt(id));

				re.setDriverid(Integer.parseInt(driveridVal[i]));

				reService.insertReprimand(re);
			}
			reService.updateFlag(id);

			message = "倒查成功";
		} else
		{
			message = "该条信息已被倒查，请勿重复倒查";
		}

		action = "page/admin/page/otherreprimandback_viewReprimandList.action";

		return SUCCESS;
	}

	// 倒查详情
	public String reprimandDetail()
	{
		String dwid = this.getParameter("dwid");

		String id = this.getParameter("id");

		HashMap<String, Object> querya = new HashMap<String, Object>();

		querya.put("dwid", dwid);

		querya.put("id", id);

		reList = reService.queryAllByDwidAndType(querya);

		return "detail";
	}

	/**
	 * 修改一条倒查记录
	 * 
	 */

	public String editSubMod()
	{

		String id = this.getParameter("id");

		Reprimand re = reService.queryDataById(id);

		long driverid = re.getDriverid();

		driver = driverService.queryDataByDriverid((int) driverid);

		long pid = re.getPid();

		long dwid = re.getDwid();

		dom = new ReprimandVDomContent(re);

		action = "page/admin/page/otherreprimandback_saveSubModEdit.action?id="
				+ id + "&dwid=" + dwid + "&pid=" + pid;

		return "editsubmod";
	}
	
	//查看单个驾驶员的倒查详情
	public String viewSubMod()
	{

		String id = this.getParameter("id");

		Reprimand re = reService.queryDataById(id);

		long driverid = re.getDriverid();

		driver = driverService.queryDataByDriverid((int) driverid);

		long pid = re.getPid();

		long dwid = re.getDwid();

		dom = new ReprimandVDomContent(re);

		action = "page/admin/page/otherreprimandback_saveSubModEdit.action?id="
				+ id + "&dwid=" + dwid + "&pid=" + pid;

		return "viewsubmod";
	}

	/**
	 * 保存倒查修改
	 * 
	 * @return
	 */
	public String saveSubModEdit()
	{
		String id = this.getParameter("id");

		String dwid = this.getParameter("dwid");

		String pid = this.getParameter("pid");

		Reprimand re = new Reprimand();

		re.setContent(dom.getContent());

		re.setDwid(Integer.parseInt(dwid));

		re.setLoginname(getLoginname());

		re.setTime(new Date());

		re.setId((long) Integer.parseInt(id));

		action = "page/admin/page/otherreprimandback_reprimandDetail.action?id="
				+ pid + "&dwid=" + dwid;

		reService.updateReprimand(re);

		message = "修改倒查成功!";

		return SUCCESS;
	}

	/**
	 * 删除倒查详情记录
	 */
	public String deleteReprimandSubMod()
	{

		String id = this.getParameter("id");

		String dwid = this.getParameter("dwid");

		String pid = this.getParameter("pid");

		reService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/otherreprimandback_reprimandDetail.action?id="
				+ pid + "&dwid=" + dwid;

		return SUCCESS;
	}

}
