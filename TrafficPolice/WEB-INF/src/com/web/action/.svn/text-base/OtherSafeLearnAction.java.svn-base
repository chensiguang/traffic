package com.web.action;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.action.vo.EduVideoVDomContent;
import com.web.action.vo.ListActions;
import com.web.pojo.EduVideo;
import com.web.service.interfaces.EduVideoService;

/**
 * 宣教中心
 * 
 * @author wqg
 * 
 *         后台管理 2013-9-9上午11:12:59
 */
public class OtherSafeLearnAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private EduVideoService eduService;

	private List<EduVideo> eduList;

	private List<EduVideo> eduList2;

	private static final String title = "安全教育学习";

	private String ids;

	private String action;

	private static ListActions opt;

	private EduVideoVDomContent dom;

	private final static int PAGESIZE = 10;

	private String url;

	private String content;// 视频简介
	private EduVideo searchedu = new EduVideo();
	private String searchstarttime = "";
	private String searchendtime = "";

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

	public EduVideo getSearchedu()
	{
		return searchedu;
	}

	public void setSearchedu(EduVideo searchedu)
	{
		this.searchedu = searchedu;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public List<EduVideo> getEduList()
	{
		return eduList;
	}

	public void setEduList(List<EduVideo> eduList)
	{
		this.eduList = eduList;
	}

	public List<EduVideo> getEduList2()
	{
		return eduList2;
	}

	public void setEduList2(List<EduVideo> eduList2)
	{
		this.eduList2 = eduList2;
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
		OtherSafeLearnAction.opt = opt;
	}

	public EduVideoVDomContent getDom()
	{
		return dom;
	}

	public void setDom(EduVideoVDomContent dom)
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
		opt.setAddAction("page/admin/page/safelearnback_newEdu.action");
		opt.setEditAction("page/admin/page/safelearnback_editEdu.action");
		opt.setDeleteAction("page/admin/page/safelearnback_deleteEdu.action");
		opt.setDelAllAction("page/admin/page/safelearnback_delAllEdu.action");// 批量删除
		opt.setShowAction("page/admin/page/safelearnback_viewEdu.action");
	}

	// 查看所有的信息
	public String viewEduList()
	{
		String searchtitle = this.getParameter("searchtitle") == null ? ""
				: this.getParameter("searchtitle");
		searchedu.setVideoTitle(searchtitle);
		searchstarttime = this.getParameter("searchstarttime") == null ? ""
				: this.getParameter("searchstarttime");
		searchendtime = this.getParameter("searchendtime") == null ? "" : this
				.getParameter("searchendtime");
		HashMap<String, Object> querya = new HashMap<String, Object>();

		if (searchtitle != "" && searchtitle != null)
		{
			querya.put("searchtitle", searchtitle);
		}
		if (searchstarttime != "" && searchstarttime != null)
		{
			querya.put("searchstarttime", searchstarttime);
		}
		if (searchendtime != "" && searchendtime != null)
		{
			querya.put("searchendtime", searchendtime);
		}
		int allnum = eduService.getCountByAll(querya);

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
		if (searchtitle != "" && searchtitle != null)
		{
			queryp.put("searchtitle", searchtitle);
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

		eduList = eduService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;

		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,"page/admin/page/safelearnback_viewEduList.action");

		return "success";
	}

	// 查看单条数据
	public String viewEdu()
	{
		String id = this.getParameter("id");

		dom = new EduVideoVDomContent(eduService.queryDataById(id));

		eduList2 = eduService.selectUsernameById(id);

		action = opt.getEditAction() + "?id=" + id;

		return "view";
	}
}
