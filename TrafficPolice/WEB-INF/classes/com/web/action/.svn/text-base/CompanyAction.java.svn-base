package com.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.CompanyVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Account;
import com.web.pojo.Company;
import com.web.pojo.PoliceOrg;
import com.web.pojo.PoliceOrgCompany;
import com.web.pojo.Role;
import com.web.service.interfaces.AccountService;
import com.web.service.interfaces.CompanyService;
import com.web.service.interfaces.PoliceOrgCompanyService;
import com.web.service.interfaces.PoliceOrgService;
import com.web.service.interfaces.RoleService;

/**
 * 后台管理－企业管理
 * 
 * @author jjl date 2013/9/18
 */
public class CompanyAction extends BaseAction
{

	private static final long serialVersionUID = 1L;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private RoleService roleService;
	private List<Company> companyList;
	private PoliceOrgService policeOrgService;
	private PoliceOrgCompanyService policeOrgCompanyService;
	private List<PoliceOrg> policeOrgList;
	private Company company = new Company();
	private static final String title = "企业管理";
	private String ids;
	private String action;
	private static ListActions opt;
	private CompanyVDomContent dom;
	private final static int PAGESIZE = 10;

	private List<PoliceOrgCompany> policecomList;

	private List<Company> companylist = new ArrayList<Company>();

	public List<Company> getCompanylist()
	{
		return companylist;
	}

	public void setCompanylist(List<Company> companylist)
	{
		this.companylist = companylist;
	}

	public List<PoliceOrgCompany> getPolicecomList()
	{
		return policecomList;
	}

	public void setPolicecomList(List<PoliceOrgCompany> policecomList)
	{
		this.policecomList = policecomList;
	}

	public CompanyService getCompanyService()
	{
		return companyService;
	}

	public void setCompanyService(CompanyService companyService)
	{
		this.companyService = companyService;
	}

	public List<Company> getCompanyList()
	{
		return companyList;
	}

	public void setCompanyList(List<Company> companyList)
	{
		this.companyList = companyList;
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
		CompanyAction.opt = opt;
	}

	public CompanyVDomContent getDom()
	{
		return dom;
	}

	public void setDom(CompanyVDomContent dom)
	{
		this.dom = dom;
	}

	public String getTitle()
	{
		return title;
	}

	public int getPAGESIZE()
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

	public PoliceOrgCompanyService getPoliceOrgCompanyService()
	{
		return policeOrgCompanyService;
	}

	public void setPoliceOrgCompanyService(
			PoliceOrgCompanyService policeOrgCompanyService)
	{
		this.policeOrgCompanyService = policeOrgCompanyService;
	}

	public Company getCompany()
	{
		return company;
	}

	public void setCompany(Company company)
	{
		this.company = company;
	}

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/companyback_addCompany.action"); // 新增
		opt.setEditAction("page/admin/page/companyback_editCompany.action"); // 修改
		opt.setDeleteAction("page/admin/page/companyback_deleteCompany.action"); // 单个删除
		opt.setDelAllAction("page/admin/page/companyback_deleteAllCompany.action"); // 批量删除
		opt.setShowAction("page/admin/page/companyback_detailCompany.action"); // 详情
	}

	// 查询所有、条件查询
	public String viewCompanyList()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();
		long admin = (Long) session.getAttribute("adminflag");// 获得当前登录用户是否为数据管理员的标记
		long dwid = (Long) session.getAttribute("dwid");// 获得当前登录用户所在单位号
		long dwtype = (Long) session.getAttribute("dwtype");// 获得当前登录用户所在单位类型
															// 0代表交警 1代表货运公司
		// 获取页面查询的条件值
		String comid = this.getParameter("comid") == null ? "" : this
				.getParameter("comid");
		//company.setComid((long)Integer.parseInt(comid));
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if (!comid.equals("") && comid != null)
		{
			querya.put("comid", Integer.parseInt(comid));
		}
			int allnum = 0;
			if (admin == 1 || dwtype == 0)
			{
				allnum = companyService.getCountByAll(querya);
			} else
			{
				/*if (dwtype == 0)//交警部门
				{
					policecomList = policecomService.queryAllByDwid(dwid);//根据交警的单位id查询出下属公司的id

					//查询交警下属的公司
					for (int i = 0; i < policecomList.size(); i++)
					{
						long comid = policecomList.get(i).getComid();

						querya.put("comid", comid);

						allnum += companyService.getCountByAll(querya);

					}
				} else//货运公司
				{*/
					companyList = companyService.queryChildCompanyByDwid(dwid);//查询下属公司
					
					for (int i = 0; i < companyList.size(); i++)
					{
						long comids = companyList.get(i).getComid();
						querya.put("comid", comids);
						allnum += companyService.getCountByAll(querya);

					}
					allnum += companyService.getCountByAll(querya);//自己加下属公司的总和
				
				//}
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
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);
		if (!comid.equals("") && comid != null)
		{
			queryp.put("comid", Integer.parseInt(comid));
		}

		if (admin == 1 || dwtype == 0)
		{
			companyList = companyService.selectPage(queryp);
			
			for (int j = 0; j < companyList.size(); j++)
			{
				companylist.add(companyList.get(j));
			}
		} else
		{
			/*if (dwtype == 0)
			{
				policecomList = policecomService.queryAllByDwid(dwid);

				for (int i = 0; i < policecomList.size(); i++)
				{
					long comid = policecomList.get(i).getComid();

					queryp.put("comid", comid);

					companyList = companyService.selectPage(queryp);

					for (int j = 0; j < companyList.size(); j++)
					{
						companylist.add(companyList.get(j));
					}

				}

			} else
			{*/
				//查询自己公司
				queryp.put("comid", dwid);
				companyList = companyService.selectPage(queryp);
				for (int j = 0; j < companyList.size(); j++)
				{
					companylist.add(companyList.get(j));
				}
				queryp.remove("comid");
				
				companyList = companyService.queryChildCompanyByDwid(dwid);//查询下属公司
				
				for (int i = 0; i < companyList.size(); i++)
				{
					long comids = companyList.get(i).getComid();

					queryp.put("comid", comids);
				
					companylist.add(companyList.get(i));
				}
				// 总页数
				int pt = allnum / PAGESIZE;
				int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
				this.pageString = this.getPageNumView(curpage, pagenum,
						"page/admin/page/companyback_viewCompanyList.action");
				return "companydefault";
		}
		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;
		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/companyback_viewCompanyList.action");
		return "default";
	}

	// 详情
	public String detailCompany()
	{
		String id = this.getParameter("id");
		
		dom = new CompanyVDomContent(companyService.queryDataById(id));

		companyList = companyService.selectUsernameById(id);
		action = opt.getEditAction() + "?id=" + id;
		return "view";
	}

	// 新增
	public String addCompany()
	{
		companyList = companyService.queryAll();

		if (companyList != null)
		{
			getSession().setAttribute("companyList", companyList);
		}
		policeOrgList = policeOrgService.selectAll(); // 查询所有单位名称
		action = "page/admin/page/companyback_insertCompany.action";
		return "edit";
	}

	// 新增-提交，并且获取自增长Id号
	public String insertCompany()
	{
		Company company = new Company();
		company.setComname(dom.getComname());
		
		List<Role> rolelist = roleService.queryAllByDwType(1);

		long roleno = rolelist.get(0).getRoleno();
		// 查看企业名称是否重复
		int num = companyService.selectCompanyByComName(company);
		if (num != 0)
		{
			message = "'" + dom.getComname() + "'名称已存在!";
			action = opt.getAddAction();
		} else
		{
			company.setPhone(dom.getPhone());
			company.setMobile(dom.getMobile());
			company.setLinkname(dom.getLinkname());
			company.setLinkmobile(dom.getLinkmobile());
			company.setAddres(dom.getAddres());
			company.setTypeid(3);
			company.setPid(dom.getPid());
			company.setLoginname(dom.getLoginname());
			company.setPassword(dom.getPassword());
			company.setOperid((long) getCurrUser());
			company.setOpertime(new Date());
			company.setState(1);
			company.setRegid((long) getCurrUser());
			company.setRegtime(new Date());
			company.setRemark(dom.getRemark());
			companyService.insertCompanyAndGetId(company);

			// 在中间表"tp_basic_porg_company"插入一条数据
			PoliceOrgCompany policeOrgCompany = new PoliceOrgCompany();
			policeOrgCompany.setOrgid(dom.getOrgid());
			// company.getComid()是获取插入数据成功时返回的自增长id
			policeOrgCompany.setComid(company.getComid());
			policeOrgCompany.setOperid((long) getCurrUser());
			policeOrgCompany.setOpertime(new Date());
			policeOrgCompany.setState(1);
			policeOrgCompany.setRegid((long) getCurrUser());
			policeOrgCompany.setRegtime(new Date());
			policeOrgCompany.setRemark(dom.getRemark());
			policeOrgCompanyService.insertPoliceOrgCompany(policeOrgCompany);
			
			
			// 将已经插入到企业信息表中的这条数据插入到用户表中
			Account account = new Account();

			account.setUsername(company.getComid() + "");

			account.setDwno(company.getComid());

			account.setAddress(company.getAddres());

			account.setEmail("");

			account.setRemark(company.getRemark());

			account.setLoginname(company.getLoginname());

			account.setPassword(company.getPassword());

			account.setRoleno(roleno);

			account.setTypeid(1);

			account.setRegtime(new Date());

			account.setOperid(getCurrUser());

			account.setOpertime(new Date());

			account.setTelephone(company.getPhone());

			accountService.insertAccount(account);
			
			message = "信息新增成功!";
			action = "page/admin/page/companyback_viewCompanyList.action";
		}
		return SUCCESS;
	}

	// 修改-编辑
	public String editCompany()
	{
		policeOrgList = policeOrgService.selectAll(); // 查询所有单位名称
		companyList = companyService.queryAll();
		String id = this.getParameter("id");
		Company company = companyService.queryDataById(id);
		dom = new CompanyVDomContent(company);
		action = "page/admin/page/companyback_updateCompany.action?id=" + id;
		return "edit";
	}

	// 修改-提交
	public String updateCompany()
	{
		List<Role> rolelist = roleService.queryAllByDwType(1);
		long roleno = rolelist.get(0).getRoleno();
		String id = this.getParameter("id");
		Company company = new Company();
		company.setComid((long) Integer.parseInt(id));
		company.setComname(dom.getComname());
		// 查看企业名称是否重复
		int num = companyService.selectCompanyByComName(company);
		if (num != 0)
		{
			message = "'" + dom.getComname() + "'名称已重复!";
			action = opt.getEditAction() + "?id=" + id + "&orgid="
					+ dom.getOrgid();
		} else
		{
			company.setPhone(dom.getPhone());
			company.setPid(dom.getPid());
			company.setMobile(dom.getMobile());
			company.setLinkname(dom.getLinkname());
			company.setAddres(dom.getAddres());
			company.setOperid((long) getCurrUser());
			company.setOpertime(new Date());
			company.setRemark(dom.getRemark());
			company.setLoginname(dom.getLoginname());
			company.setPassword(dom.getPassword());
			companyService.updateCompany(company);
			// 同时要在中间表"tp_basic_porg_company"修改
			PoliceOrgCompany policeOrgCompany = new PoliceOrgCompany();
			policeOrgCompany.setOrgid(dom.getOrgid());
			policeOrgCompany.setComid((long) Integer.parseInt(id));
			policeOrgCompany.setOperid((long) getCurrUser());
			policeOrgCompany.setOpertime(new Date());
			policeOrgCompany.setRemark(dom.getRemark());
			policeOrgCompanyService.updatePoliceOrgCompany(policeOrgCompany);
			
			String userno = id;

			long accountid = accountService.queryDataByUserno(userno).getUserno();

			// 将已经修改插入到驾驶员表中的这条数据插入到用户表中
			Account account = new Account();

			account.setUsername(company.getComid() + "");

			account.setDwno(company.getComid());

			account.setAddress(company.getAddres());

			account.setEmail("");

			account.setRemark(company.getRemark());

			account.setLoginname(company.getLoginname());

			account.setPassword(company.getPassword());

			account.setRoleno(roleno);

			account.setTypeid(1);

			account.setOperid(getCurrUser());

			account.setOpertime(new Date());

			account.setTelephone(company.getPhone());

			account.setId(accountid);

			accountService.updateAccount(account);
			action = "page/admin/page/companyback_viewCompanyList.action";
			message = "信息修改成功!";
		}
		return SUCCESS;
	}

	// 单个删除
	public String deleteCompany()
	{
		//删除企业信息表中的数据
		String id = this.getParameter("id");
		companyService.dropDataById(id);
		
		//删除账号用户表中对应的数据
		String userno = id;
		long accountid = accountService.queryDataByUserno(userno).getUserno();
		accountService.deleteDataById(accountid + "");
		
		message = "信息删除成功!";
		action = "page/admin/page/companyback_viewCompanyList.action";
		return SUCCESS;
	}

	// 批量删除
	public String deleteAllCompany()
	{
		companyService.dropAllDataByIds(ids);//删除企业信息表中的数据
		
		
		//删除账号用户表中对应的数据
		if (ids.endsWith("#"))
		{
			ids = ids.substring(0, ids.length() - 1);
		}
		String[] idsVal = ids.split("#");
		String accountids ="";
		for (int i = 0; i < idsVal.length; i++)
		{
			String userno = idsVal[i];

			String accountid = accountService.queryDataByUserno(userno).getUserno() + "";
			
			accountids += accountid  + "#";
			
		}
		accountService.deleteDataByIds(accountids);
		message = "信息批量删除成功!";
		action = "page/admin/page/companyback_viewCompanyList.action";
		return SUCCESS;
	}
}
