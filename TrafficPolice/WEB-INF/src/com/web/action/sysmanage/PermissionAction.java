/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.sysmanage;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.PermissionVDomContent;
import com.web.pojo.Permission;
import com.web.service.interfaces.PermissionService;

/**
 * 权限管理
 * 
 * @author wqg
 * 
 *         2013-9-25上午9:40:00
 */
public class PermissionAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private PermissionService permissionService;

	private List<Permission> permissionList;

	private static final String title = "权限管理";

	private String ids;

	private String action;

	private static ListActions opt;

	private PermissionVDomContent dom;

	private final static int PAGESIZE = 10;

	private String searchpermissionname;// 根据角色名查询

	private String searchstarttime;// 开始时间查询

	private String searchendtime;// 结束时间查询

	public String getSearchpermissionname()
	{
		return searchpermissionname;
	}

	public void setSearchpermissionname(String searchpermissionname)
	{
		this.searchpermissionname = searchpermissionname;
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

	public List<Permission> getPermissionList()
	{
		return permissionList;
	}

	public void setPermissionList(List<Permission> permissionList)
	{
		this.permissionList = permissionList;
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
		PermissionAction.opt = opt;
	}

	public PermissionVDomContent getDom()
	{
		return dom;
	}

	public void setDom(PermissionVDomContent dom)
	{
		this.dom = dom;
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
		opt.setAddAction("page/admin/page/permission_newPermission.action");
		opt.setEditAction("page/admin/page/permission_editPermission.action");
		opt.setDeleteAction("page/admin/page/permission_deletePermission.action");
		opt.setDelAllAction("page/admin/page/permission_delAllPermission.action");// 批量删除
		opt.setShowAction("page/admin/page/permission_viewPermission.action");
	}

	// 查看所有的信息
	public String viewPermissionList()
	{
		searchpermissionname = this.getParameter("searchpermissionname");

		searchstarttime = this.getParameter("searchstarttime");

		searchendtime = this.getParameter("searchendtime");

		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchpermissionname != null && searchpermissionname != "")
		{
			querya.put("searchpermissionname", searchpermissionname);
		}
		if (searchstarttime != null && searchstarttime != "")
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && searchendtime != "")
		{
			querya.put("searchendtime", searchendtime);
		}

		int allnum = permissionService.getCountByAll(querya);

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

		if (searchpermissionname != null && searchpermissionname != "")
		{
			queryp.put("searchpermissionname", searchpermissionname);
		}
		if (searchstarttime != null && searchstarttime != "")
		{
			queryp.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && searchendtime != "")
		{
			queryp.put("searchendtime", searchendtime);
		}

		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		permissionList = permissionService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/permission_viewPermissionList.action");

		return "default";
	}

	// 查看单条数据
	public String viewPermission()
	{
		String id = this.getParameter("id");

		dom = new PermissionVDomContent(permissionService.queryDataById(id));

		permissionList = permissionService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newPermission()
	{
		permissionList = permissionService.queryAll();

		if (permissionList != null)
		{
			getSession().setAttribute("permissionList", permissionList);
		}

		action = "page/admin/page/permission_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Permission per = new Permission();

		per.setPername(dom.getPername());

		int num = permissionService.newOrUpdate(per);

		if (num != 0)
		{
			message = "'" + dom.getPername() + "'已存在!";

			action = opt.getAddAction();
		} else
		{

			per.setFunctions(dom.getFunctions());

			per.setParentid(dom.getParentid());

			per.setOperid(getCurrUser());

			per.setOpertime(new Date());

			per.setRegtime(new Date());

			per.setRemark(dom.getRemark());

			action = "page/admin/page/permission_viewPermissionList.action";

			permissionService.insertPermission(per);

			message = "新增成功!";
		}
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editPermission()
	{

		String id = this.getParameter("id");

		Permission per = permissionService.queryDataById(id);

		permissionList = permissionService.queryAll();

		dom = new PermissionVDomContent(per);

		action = "page/admin/page/permission_saveEdit.action?id=" + id;

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

		Permission per = new Permission();

		per.setFunctions(dom.getFunctions());

		per.setParentid(dom.getParentid());

		per.setPername(dom.getPername());

		per.setOpertime(new Date());

		per.setRemark(dom.getRemark());

		per.setId((long) Integer.parseInt(id));

		action = "page/admin/page/permission_viewPermissionList.action";

		permissionService.updatePermission(per);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deletePermission()
	{

		String id = this.getParameter("id");

		permissionService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/permission_viewPermissionList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllPermission()
	{

		permissionService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/permission_viewPermissionList.action";

		return SUCCESS;
	}

}
