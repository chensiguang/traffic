package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.PoliceVDomContent;
import com.web.pojo.Area;
import com.web.pojo.Police;
import com.web.pojo.PoliceOrg;
import com.web.service.interfaces.AccountService;
import com.web.service.interfaces.AreaService;
import com.web.service.interfaces.PoliceOrgService;
import com.web.service.interfaces.PoliceService;

/**
 * 基本信息
 * 
 * @author wqg
 * 
 *         后台管理 2013-9-9上午11:12:59
 */
public class PoliceAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private PoliceService policeService;
	@Autowired
	private AreaService areaService;
	@Autowired
	private AccountService accountService;
	private PoliceOrgService policeOrgService;
	private List<Police> policeList;
	private List<Area> areaList;
	private List<PoliceOrg> policeOrgList;
	private Police policename = new Police();
	private static final String title = "交警基本信息";

	private String ids;

	private String action;

	private static ListActions opt;

	private PoliceVDomContent dom;

	private final static int PAGESIZE = 10;

	public List<Area> getAreaList()
	{
		return areaList;
	}

	public void setAreaList(List<Area> areaList)
	{
		this.areaList = areaList;
	}

	public List<Police> getPoliceList()
	{
		return policeList;
	}

	public void setPoliceList(List<Police> policeList)
	{
		this.policeList = policeList;
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
		PoliceAction.opt = opt;
	}

	public PoliceVDomContent getDom()
	{
		return dom;
	}

	public void setDom(PoliceVDomContent dom)
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

	public PoliceOrgService getPoliceOrgService()
	{
		return policeOrgService;
	}

	public void setPoliceOrgService(PoliceOrgService policeOrgService)
	{
		this.policeOrgService = policeOrgService;
	}

	public List<PoliceOrg> getPoliceOrgList()
	{
		return policeOrgList;
	}

	public void setPoliceOrgList(List<PoliceOrg> policeOrgList)
	{
		this.policeOrgList = policeOrgList;
	}

	public Police getPolicename()
	{
		return policename;
	}

	public void setPolicename(Police policename)
	{
		this.policename = policename;
	}

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/policeback_newPolice.action");
		opt.setEditAction("page/admin/page/policeback_editPolice.action");
		opt.setDeleteAction("page/admin/page/policeback_deletePolice.action");
		opt.setDelAllAction("page/admin/page/policeback_delAllPolice.action");// 批量删除
		opt.setShowAction("page/admin/page/policeback_viewPolice.action");
	}

	// 查看所有的信息
	public String viewPoliceList()
	{
		String searchname = this.getParameter("searchname") == null ? "" : this
				.getParameter("searchname");
		String searchsex = this.getParameter("searchsex") == null ? "" : this
				.getParameter("searchsex");
		String searchpno = this.getParameter("searchpno") == null ? "" : this
				.getParameter("searchpno");
		String searchsex1 = "";
		if (searchsex.equals("") == false && searchsex != null)
		{
			searchsex1 = searchsex.equals("1") ? "男" : "女";
		}
		policename.setName(searchname);
		policename.setSex(searchsex);
		policename.setPno(searchpno);
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if (searchname != "" && searchname != null)
		{
			querya.put("searchname", searchname);
		}
		if (searchsex != "" && searchsex != null)
		{
			querya.put("searchsex", searchsex1);
		}

		if (searchpno != "" && searchpno != null)
		{
			querya.put("searchpno", searchpno);
		}

		int allnum = policeService.getCountByAll(querya);

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

		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);
		if (searchname != "" && searchname != null)
		{
			queryp.put("searchname", searchname);
		}

		if (searchsex != "" && searchsex != null)
		{
			queryp.put("searchsex", searchsex1);
		}

		if (searchpno != "" && searchpno != null)
		{
			queryp.put("searchpno", searchpno);
		}

		policeList = policeService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/policeback_viewPoliceList.action");

		return "default";
	}

	// 查看单条数据
	public String viewPolice()
	{
		String id = this.getParameter("id");

		dom = new PoliceVDomContent(policeService.queryDataById(id));

		policeList = policeService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newPolice()
	{
		policeList = policeService.queryAll();
		policeOrgList = policeOrgService.queryAll(); // 查询所有单位名称
		areaList = areaService.queryAll();// 查看所有的地域
		action = "page/admin/page/policeback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Police police = new Police();

		police.setOrgid(dom.getOrgid());

		police.setTypeid(2);

		police.setTelephone(dom.getTelephone());

		police.setName(dom.getName());

		police.setAddres(dom.getAddres());

		// police.setAreaid(dom.getAreaid());
		police.setAreaid(200);

		police.setOperid((long) getCurrUser());

		police.setOpertime(new Date());

		police.setRemark(dom.getRemark());

		police.setSex(dom.getSex());

		police.setPno(dom.getPno());

		police.setIdentitycard(dom.getIdentitycard());

		int num = policeService.queryPoliceByIdcard(dom.getIdentitycard());
		if (num == 0)
		{
			policeService.insertPolice(police);
			message = "新增成功!";
			action = "page/admin/page/policeback_viewPoliceList.action";
		} else
		{
			message = "该交警的身份证信息已存在!";
			action = opt.getAddAction();
		}

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editPolice()
	{
		policeList = policeService.queryAll();
		policeOrgList = policeOrgService.queryAll(); // 查询所有单位名称
		areaList = areaService.queryAll();// 查看所有的地域
		String id = this.getParameter("id");
		Police police = policeService.queryDataById(id);
		dom = new PoliceVDomContent(police);
		action = "page/admin/page/policeback_saveEdit.action?id=" + id;

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

		Police police = new Police();

		police.setId((long) Integer.parseInt(id));

		police.setOrgid(dom.getOrgid());

		police.setTypeid(2);

		police.setTelephone(dom.getTelephone());

		police.setName(dom.getName());

		police.setAddres(dom.getAddres());
		System.out.println(dom.getAddres());
		// police.setAreaid(dom.getAreaid());
		police.setAreaid(200);

		police.setOperid((long) getCurrUser());

		police.setOpertime(new Date());

		police.setRemark(dom.getRemark());

		police.setSex(dom.getSex());

		police.setPno(dom.getPno());

		police.setIdentitycard(dom.getIdentitycard());

		policeService.updatePolice(police);
		message = "修改成功!";
		action = "page/admin/page/policeback_viewPoliceList.action";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deletePolice()
	{

		String id = this.getParameter("id");

		policeService.deleteDataById(id);
		
		
		accountService.deleteDataByUsername(Integer.parseInt(id));

		message = "删除成功";

		action = "page/admin/page/policeback_viewPoliceList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllPolice()
	{

		policeService.deleteDataByIds(ids);
		
		String username = ids;
		
		accountService.deleteDataByUsernames(username);

		message = "批量删除成功";

		action = "page/admin/page/policeback_viewPoliceList.action";

		return SUCCESS;
	}

}
