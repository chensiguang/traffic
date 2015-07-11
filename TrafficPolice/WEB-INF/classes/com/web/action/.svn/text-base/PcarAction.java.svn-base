package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.PcarVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.Pcar;
import com.web.pojo.Police;
import com.web.service.interfaces.PcarService;

/**
 * 基本信息
 * 
 * @author wqg
 * 
 *         后台管理 2013-9-9上午11:12:59
 */
public class PcarAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private PcarService pcarService;
	private List<Pcar> pcarList;
	private static final String title = "车辆划归";

	private String ids;

	private String action;

	private static ListActions opt;

	private PcarVDomContent dom;

	private final static int PAGESIZE = 10;


	public List<Pcar> getPcarList()
	{
		return pcarList;
	}

	public void setPcarList(List<Pcar> pcarList)
	{
		this.pcarList = pcarList;
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
		PcarAction.opt = opt;
	}

	public PcarVDomContent getDom()
	{
		return dom;
	}

	public void setDom(PcarVDomContent dom)
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
	
    private Pcar parsearch= new Pcar() ;
	
	public Pcar getParsearch() {
		return parsearch;
	}

	public void setParsearch(Pcar parsearch) {
		this.parsearch = parsearch;
	}

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/pcarback_newPcar.action");
		opt.setEditAction("page/admin/page/pcarback_editPcar.action");
		opt.setDeleteAction("page/admin/page/pcarback_deletePcar.action");
		opt.setDelAllAction("page/admin/page/pcarback_delAllPcar.action");// 批量删除
		opt.setShowAction("page/admin/page/pcarback_viewPcar.action");
	}

	// 查看所有的信息
	public String viewPcarList()
	{
		String id = this.getParameter("id");
		String searchbuslicplate = this.getParameter("searchbuslicplate")==null ? "" : this.getParameter("searchbuslicplate");
		parsearch.setBuslicplate(searchbuslicplate);
		HashMap<String, Object> querya = new HashMap<String, Object>();
		if(searchbuslicplate != "" && searchbuslicplate != null)
		{
			querya.put("searchbuslicplate", searchbuslicplate);
		}
		querya.put("id", id);
		int allnum = pcarService.getCountByAll(querya);

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

		if(searchbuslicplate != "" && searchbuslicplate != null)
		{
			queryp.put("searchbuslicplate", searchbuslicplate);
		}
		queryp.put("pid", id);
		queryp.put("curnum", (curpage - 1) * PAGESIZE);

		queryp.put("pagesize", PAGESIZE);

		pcarList = pcarService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/pcarback_viewPcarList.action");

		return "default";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		String carid = this.getParameter("carid");
		String userid = this.getParameter("userid");
		String pid = this.getParameter("pid");
		String name = this.getParameter("name");
		System.out.print("carid="+carid);
		System.out.print("userid="+userid);
		
		int num = pcarService.querypcardata(carid,userid);
		
		Pcar pcar = new Pcar();
		pcar.setUdid(pcar.getUdid());
		pcar.setCarid((long)Integer.valueOf(carid));
		pcar.setUserid((long)Integer.valueOf(userid));
		pcar.setOperid((long) getCurrUser());
		pcar.setOpertime(new Date());
		
		if(num == 0){
			pcarService.insertPcar(pcar);
			message = "新增成功!";
		} else{
	  
        	message = "该车辆已添加!";
		}
        
        action = "page/admin/page/pcarback_viewPcarList.action?id="+pid+"&name="+name+"&userno="+userid;

		return SUCCESS;
	}
	
	/**
	 * 批量插入管辖车辆
	 * */
	public String saveNews()
	{
		String userid = this.getParameter("userid");
		System.out.println(userid);
		String pid = this.getParameter("pid");
		String name = this.getParameter("name");
		String ids = this.getParameter("ids");
		Pcar pcar = new Pcar();
		if (ids.endsWith("#"))
		{
			ids = ids.substring(0, ids.length() - 1);
		}
		
		String[] idsVal = ids.split("#");
		for (int i = 0; i < idsVal.length; i++)
		{
			int num = pcarService.querypcardata(idsVal[i],userid);
			pcar.setUdid(pcar.getUdid());
			pcar.setCarid((long)Integer.valueOf(idsVal[i]));
			pcar.setUserid((long)Integer.valueOf(userid));
			pcar.setOperid((long) getCurrUser());
			pcar.setOpertime(new Date());
			if(num == 0){
				pcarService.insertPcar(pcar);
			} 
		}
		message = "新增成功!";
        action = "page/admin/page/pcarback_viewPcarList.action?id="+pid+"&name="+name+"&userno="+userid;

		return SUCCESS;
	}


	/**
	 * 删除记录
	 */
	public String deletePcar()
	{

		String id = this.getParameter("id");
		String pid = this.getParameter("pid");
		String name = this.getParameter("name");
		String userno = this.getParameter("userno");

		pcarService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/pcarback_viewPcarList.action?id="+pid+"&name="+name+"&userno="+userno;

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllPcar()
	{
		String pid = this.getParameter("pid");	
		String pname = this.getParameter("pname");
		String userno = this.getParameter("puserno");
		pcarService.deleteDataByIds(ids);
		
		message = "批量删除成功";

		action = "page/admin/page/pcarback_viewPcarList.action?id="+pid+"&name="+pname+"&userno="+userno;

		return SUCCESS;
	}

}
