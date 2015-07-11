/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.sysmanage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ListActions;
import com.web.action.vo.RolePermissionVDomContent;
import com.web.action.vo.RoleVDomContent;
import com.web.pojo.Permission;
import com.web.pojo.Role;
import com.web.pojo.RolePermission;
import com.web.service.interfaces.PermissionService;
import com.web.service.interfaces.RolePermissionService;
import com.web.service.interfaces.RoleService;

/**
 * 角色管理
 * 
 * @author wqg
 * 
 *         2013-9-25上午9:39:00
 */
public class RoleAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private RoleService roleService;

	@Autowired
	private PermissionService permissionService;

	@Autowired
	private RolePermissionService rpService;

	private List<Role> roleList;

	private List<Permission> permissionList;

	private List<RolePermission> rpList;

	private static final String title = "角色管理";

	List<Integer> list = new ArrayList<Integer>();

	private String ids;

	private String action;

	private static ListActions opt;

	private RoleVDomContent dom;//角色表

	private RolePermissionVDomContent rpdom;//角色权限关联表

	private final static int PAGESIZE = 10;

	private String searchrolename;// 根据角色名查询

	private String searchstarttime;// 开始时间查询

	private String searchendtime;// 结束时间查询

	public String getSearchrolename()
	{
		return searchrolename;
	}

	public void setSearchrolename(String searchrolename)
	{
		this.searchrolename = searchrolename;
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

	public List<RolePermission> getRpList()
	{
		return rpList;
	}

	public void setRpList(List<RolePermission> rpList)
	{
		this.rpList = rpList;
	}

	public RolePermissionVDomContent getRpdom()
	{
		return rpdom;
	}

	public void setRpdom(RolePermissionVDomContent rpdom)
	{
		this.rpdom = rpdom;
	}

	public List<Permission> getPermissionList()
	{
		return permissionList;
	}

	public void setPermisionList(List<Permission> permissionList)
	{
		this.permissionList = permissionList;
	}

	public List<Role> getRoleList()
	{
		return roleList;
	}

	public void setRoleList(List<Role> roleList)
	{
		this.roleList = roleList;
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

	public RoleVDomContent getDom()
	{
		return dom;
	}

	public void setDom(RoleVDomContent dom)
	{
		this.dom = dom;
	}

	public ListActions getOpt()
	{
		return opt;
	}

	public void setOpt(ListActions opt)
	{
		RoleAction.opt = opt;
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
		opt.setAddAction("page/admin/page/role_newRole.action");
		opt.setEditAction("page/admin/page/role_editRole.action");
		opt.setDeleteAction("page/admin/page/role_deleteRole.action");
		opt.setDelAllAction("page/admin/page/role_delAllRole.action");// 批量删除
		opt.setShowAction("page/admin/page/role_viewRole.action");
		opt.setPermissionAction("page/admin/page/role_permission.action");// 权限分配
		opt.setPermissionEditAction("page/admin/page/role_permissionEdit.action");// 权限修改
	}

	// 查看所有的信息
	public String viewRoleList()
	{
		searchrolename = this.getParameter("searchrolename");

		searchstarttime = this.getParameter("searchstarttime");

		searchendtime = this.getParameter("searchendtime");

		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchrolename != null && searchrolename != "")
		{
			querya.put("searchrolename", searchrolename);
		}
		if (searchstarttime != null && searchstarttime != "")
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && searchendtime != "")
		{
			querya.put("searchendtime", searchendtime);
		}

		int allnum = roleService.getCountByAll(querya);

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

		if (searchrolename != null && searchrolename != "")
		{
			queryp.put("searchrolename", searchrolename);
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

		roleList = roleService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/role_viewRoleList.action");

		return "default";
	}

	// 查看单条数据
	public String viewRole()
	{
		String id = this.getParameter("id");

		dom = new RoleVDomContent(roleService.queryDataById(id));

		roleList = roleService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newRole()
	{
		roleList = roleService.queryAll();

		if (roleList != null)
		{
			getSession().setAttribute("roleList", roleList);
		}

		action = "page/admin/page/role_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Role role = new Role();

		role.setRolename(dom.getRolename().trim());

		int num = roleService.newOrUpdate(role);

		if (num != 0)
		{
			message = "'" + dom.getRolename() + "'已存在!";

			action = opt.getAddAction();
		} else
		{

			role.setDescription(dom.getDescription());
			
			role.setDwtype(dom.getDwtype());

			role.setOpertime(new Date());

			role.setRegid(dom.getRegid());

			role.setRegtime(new Date());

			role.setRemark(dom.getRemark());
			
			role.setOperid(getCurrUser());

			role.setRoleno(dom.getRoleno());

			role.setState(dom.getState());

			roleService.insertRole(role);
			
			action = "page/admin/page/role_viewRoleList.action";

			message = "新增成功!";
		}
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editRole()
	{

		String id = this.getParameter("id");

		Role role = roleService.queryDataById(id);

		dom = new RoleVDomContent(role);

		action = "page/admin/page/role_saveEdit.action?id=" + id;

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

		Role role = new Role();

		role.setRoleno(dom.getRoleno());

		role.setDescription(dom.getDescription());

		role.setRolename(dom.getRolename());

		role.setDwtype(dom.getDwtype());

		role.setOpertime(new Date());

		role.setRemark(dom.getRemark());

		role.setId((long) Integer.parseInt(id));

		roleService.updateRole(role);

		action = "page/admin/page/role_viewRoleList.action";

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteRole()
	{

		String id = this.getParameter("id");

		roleService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/role_viewRoleList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllRole()
	{

		roleService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/role_viewRoleList.action";

		return SUCCESS;
	}

	
	
	
	
	
	// 权限分配

	public String permission()
	{
		String id = this.getParameter("id");

		Role role = roleService.queryDataById(id);

		permissionList = permissionService.queryAll();

		dom = new RoleVDomContent(role);

		action = "page/admin/page/role_savePermission.action?id=" + id;

		return "permission";
	}

	// 保存权限
	public String savePermission()
	{
		String ids = this.getParameter("ids");

		RolePermission rp = new RolePermission();

	   String roleno = this.getParameter("roleno");

		if (ids.endsWith("#"))
		{
			ids = ids.substring(0, ids.length() - 1);
		}

		String[] idsVal = ids.split("#");

		for (int i = 0; i < idsVal.length; i++)
		{
			rp.setPerno(Integer.parseInt(idsVal[i]));

			rp.setOperid(getCurrUser());

			rp.setRoleno(Integer.parseInt(roleno));
			
			//rp.setRoleno(dom.getRoleno());

			rp.setRegtime(new Date());

			rp.setOpertime(new Date());

			rpService.insertRolePermission(rp);
		}

		action = "page/admin/page/role_viewRoleList.action";

		message = "权限分配成功!";

		return SUCCESS;
	}

	/**
	 * 修改权限
	 * 
	 */

	public String permissionEdit()
	{
		String id = this.getParameter("id");

		Role role = roleService.queryDataById(id);

		permissionList = permissionService.queryAll();
		
		rpList = rpService.findPermissionByRoleno(Integer.parseInt(id));

		dom = new RoleVDomContent(role);

		action = "page/admin/page/role_savePermisionEdit.action";

		return "permissionedit";
	}

	/**
	 * 保存权限修改
	 * 
	 * @return
	 */
	public String savePermisionEdit()
	{
		String ids = this.getParameter("ids");

		RolePermission rp = new RolePermission();

		if (ids.endsWith("#"))
		{ 
			ids = ids.substring(0, ids.length() - 1);
		}

		String[] idsVal = ids.split("#");

		String roleno = this.getParameter("roleno");

		rpService.deletePermission(roleno);

		for (int i = 0; i < idsVal.length; i++)
		{
			rp.setPerno(Integer.parseInt(idsVal[i]));

			rp.setOperid(getCurrUser());

			rp.setRoleno(Integer.parseInt(roleno));

			rp.setRegtime(new Date());

			rp.setOpertime(new Date());

			rpService.insertRolePermission(rp);

		}

		action = "page/admin/page/role_viewRoleList.action";

		message = "修改权限成功!";

		return SUCCESS;
	}

}
