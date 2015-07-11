/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Account;
import com.web.pojo.Admin;
import com.web.pojo.Permission;
import com.web.pojo.RolePermission;
import com.web.service.interfaces.AdminService;
import com.web.service.interfaces.PermissionService;
import com.web.service.interfaces.RolePermissionService;
import com.web.service.interfaces.RoleService;
import com.web.system.Parameter;

/**
 * @author wqg
 * 
 *         2013-9-9上午9:06:34
 */
public class AdminAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private AdminService adminService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private RolePermissionService rpService;

	@Autowired
	private PermissionService perService;

	private String loginname;// 登录名

	private String name;// 用户姓名

	private long dwid;// 用户所在的单位号

	private String password;

	private Admin admin;

	private long roleno;// 角色号

	private long dwtype;// 角色所对应的单位类型

	private String s;

	private String username;

	protected String message;

	private List<Account> accounList;

	private List<String> list = new ArrayList<String>();

	private List<RolePermission> rpList;

	private Permission permission;

	public long getDwtype()
	{
		return dwtype;
	}

	public void setDwtype(long dwtype)
	{
		this.dwtype = dwtype;
	}

	public long getRoleno()
	{
		return roleno;
	}

	public void setRoleno(long roleno)
	{
		this.roleno = roleno;
	}

	public long getDwid()
	{
		return dwid;
	}

	public void setDwid(long dwid)
	{
		this.dwid = dwid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<Account> getAccounList()
	{
		return accounList;
	}

	public void setAccounList(List<Account> accounList)
	{
		this.accounList = accounList;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Permission getPermission()
	{
		return permission;
	}

	public void setPermission(Permission permission)
	{
		this.permission = permission;
	}

	public List<RolePermission> getRpList()
	{
		return rpList;
	}

	public void setRpList(List<RolePermission> rpList)
	{
		this.rpList = rpList;
	}

	public Admin getAdmin()
	{
		return admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public String getLoginname()
	{
		return loginname;
	}

	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * 鉴权
	 * 
	 * @return
	 */
	public String Authentication()
	{
		loginname = this.getParameter("loginname");//获得登录名

		String password = this.getParameter("password");//获得登录密码

		admin = adminService.findAdminsByName(loginname);//获得数据库是否中登录名对应的对象

		while (admin != null)//当数据库中存在登录名对应的对象
		{
			Boolean hasLogin = SessionUserListener.checkIfHasLogin(admin);//验证用户是否已经登录

			// 如果重复登录了
			if (hasLogin)
			{
				SessionUserListener.removeUserSession(admin.getUserno());

				message = "该账号已经登录";

				getSession().setAttribute("message", message);

				getSession().setMaxInactiveInterval(5);// 以秒为单位

				return "error";

			} else
			{

				// 如果没有重复登录，则将该登录的用户信息添加入session中
				getSession().setAttribute("userInfo", admin);
				// 创建session
				if (SessionUserListener.containsKey(getSession().getId()))
				{
					SessionUserListener.removeSession(getSession().getId());
				}
				SessionUserListener.addUserSession(getSession());

				Long userno = admin.getUserno();

				Long adminflag = admin.getAdminflag();

				getSession().setAttribute("adminflag", adminflag);

				getSession().setAttribute("userno", userno);

				s = admin.getPassword();

				username = admin.getLoginname();

				name = admin.getUsername();

				dwid = admin.getDwno();

				if (loginname.equals(username) && s.equals(password))
				{
					getSession().setAttribute(Parameter.SESSION_KEY_USER, admin);

					getSession().setAttribute("username", username);

					getSession().setAttribute("driverid", name);

					getSession().setAttribute("dwid", dwid);

					roleno = admin.getRoleno();

					rpList = rpService.findRolePermissionByRoleno(roleno);

					// 账号类型 0代表交警部门 1代表货运公司

					dwtype = roleService.selectDwtypeByRoleno(roleno).getDwtype();// 通过角色号查找角色所在的单位类型
									                                        		// 0代表交警部门
					getSession().setAttribute("dwtype", dwtype);

					for (int i = 0; i < rpList.size(); i++)
					{
						long perno = rpList.get(i).getPerno();

						permission = perService.findPermissionByPerno(perno);

						String security = permission.getFunctions();

						list.add(security);

					}
					getSession().setAttribute("list", list);

					return SUCCESS;
				}
			}
		}
		message = "账号或者密码错误";

		getSession().setAttribute("message", message);

		getSession().setMaxInactiveInterval(5);// 以秒为单位

		return "error";
	}

	// 用户退出
	public String Loginout()
	{
		getSession().setAttribute("userInfo", null);

		getSession().setAttribute(Parameter.SESSION_KEY_USER, null);

		getSession().invalidate();

		return "error";
	}

}
