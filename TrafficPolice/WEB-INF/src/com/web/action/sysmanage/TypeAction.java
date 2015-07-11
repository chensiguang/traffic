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
import com.web.action.vo.TypeVDomContent;
import com.web.pojo.Type;
import com.web.service.interfaces.TypeService;

/**
 * 类型
 * 
 * @author wqg
 * 
 *         2013-9-25上午9:58:48
 */
public class TypeAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private TypeService typeService;

	private List<Type> typeList;

	private static final String title = "类型";

	private String ids;

	private String action;

	private static ListActions opt;

	private TypeVDomContent dom;

	private final static int PAGESIZE = 10;

	private String searchtypename;// 根据角色名查询

	private String searchstarttime;// 开始时间查询

	private String searchendtime;// 结束时间查询

	public String getSearchtypename()
	{
		return searchtypename;
	}

	public void setSearchtypename(String searchtypename)
	{
		this.searchtypename = searchtypename;
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

	public List<Type> getTypeList()
	{
		return typeList;
	}

	public void setTypeList(List<Type> typeList)
	{
		this.typeList = typeList;
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
		TypeAction.opt = opt;
	}

	public TypeVDomContent getDom()
	{
		return dom;
	}

	public void setDom(TypeVDomContent dom)
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
		opt.setAddAction("page/admin/page/type_newType.action");
		opt.setEditAction("page/admin/page/type_editType.action");
		opt.setDeleteAction("page/admin/page/type_deleteType.action");
		opt.setDelAllAction("page/admin/page/type_delAllType.action");// 批量删除
		opt.setShowAction("page/admin/page/type_viewType.action");
	}

	// 查看所有的信息
	public String viewTypeList()
	{
		searchtypename = this.getParameter("searchtypename");

		searchstarttime = this.getParameter("searchstarttime");

		searchendtime = this.getParameter("searchendtime");

		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchtypename != null && searchtypename != "")
		{
			querya.put("searchtypename", searchtypename);
		}
		if (searchstarttime != null && searchstarttime != "")
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != null && searchendtime != "")
		{
			querya.put("searchendtime", searchendtime);
		}

		int allnum = typeService.getCountByAll(querya);

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

		if (searchtypename != null && searchtypename != "")
		{
			queryp.put("searchtypename", searchtypename);
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

		typeList = typeService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/type_viewtypeList.action");

		return "default";
	}

	// 查看单条数据
	public String viewType()
	{
		String id = this.getParameter("id");

		dom = new TypeVDomContent(typeService.queryDataById(id));

		typeList = typeService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newType()
	{
		typeList = typeService.queryAll();

		if (typeList != null)
		{
			getSession().setAttribute("typeList", typeList);
		}

		action = "page/admin/page/type_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		Type type = new Type();

		type.setTypename(dom.getTypename());

		int num = typeService.newOrUpdate(type);

		if (num != 0)
		{
			message = "'" + dom.getTypename() + "'已存在!";

			action = opt.getAddAction();
		} else
		{

			type.setTypeid(dom.getTypeid());

			type.setGroupid(dom.getGroupid());

			type.setOpertime(new Date());

			type.setRegid(dom.getRegid());

			type.setRegtime(new Date());

			type.setRemark(dom.getRemark());

			type.setState(dom.getState());

			action = "page/admin/page/type_viewTypeList.action";

			typeService.insertType(type);

			message = "新增成功!";
		}
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editType()
	{

		String id = this.getParameter("id");

		Type type = typeService.queryDataById(id);

		dom = new TypeVDomContent(type);

		action = "page/admin/page/type_saveEdit.action?id=" + id;

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

		Type type = new Type();

		type.setTypeid(dom.getTypeid());

		type.setTypename(dom.getTypename());

		type.setOpertime(new Date());

		type.setRegtime(new Date());

		type.setRemark(dom.getRemark());

		type.setId((long) Integer.parseInt(id));

		action = "page/admin/page/type_viewTypeList.action";

		typeService.updateType(type);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteType()
	{

		String id = this.getParameter("id");

		typeService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/type_viewTypeList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllType()
	{

		typeService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/type_viewTypeList.action";

		return SUCCESS;
	}

}
