package com.web.action;

import java.util.Date;
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
public class EduAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private EduVideoService eduService;

	private List<EduVideo> eduList;

	private List<EduVideo> eduList2;

	private static final String title = "宣教中心";

	private String ids;

	private String action;

	private static ListActions opt;

	private EduVideoVDomContent dom;

	private final static int PAGESIZE = 10;

	private String url;

	private String access_token;// 视频上传中的令牌

	private String uploadurl;// 获得的上传地址

	private String videoTitle;// 视频标题

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

	public String getVideoTitle()
	{
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle)
	{
		this.videoTitle = videoTitle;
	}

	public String getUploadurl()
	{
		return uploadurl;
	}

	public void setUploadurl(String uploadurl)
	{
		this.uploadurl = uploadurl;
	}

	public String getAccess_token()
	{
		return access_token;
	}

	public void setAccess_token(String access_token)
	{
		this.access_token = access_token;
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
		EduAction.opt = opt;
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
		opt.setAddAction("page/admin/page/eduback_newEdu.action");
		opt.setEditAction("page/admin/page/eduback_editEdu.action");
		opt.setDeleteAction("page/admin/page/eduback_deleteEdu.action");
		opt.setDelAllAction("page/admin/page/eduback_delAllEdu.action");// 批量删除
		opt.setShowAction("page/admin/page/eduback_viewEdu.action");
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

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/eduback_viewEduList.action");

		return "default";
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

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newEdu()
	{
		eduList = eduService.queryAll();

		action = "page/admin/page/eduback_saveNew.action";

		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{
		EduVideo edu = new EduVideo();

		edu.setVideoTitle(dom.getVideoTitle());

		int num = eduService.newOrUpdate(edu);

		if (num != 0)
		{
			message = "'" + dom.getVideoTitle() + "'已存在!";

			action = opt.getAddAction();
		} else
		{

			edu.setContent(dom.getContent());

			edu.setOperid(getCurrUser());
			
			edu.setImg(dom.getImg());

			edu.setVideoUrl(dom.getVideoUrl());

			edu.setFileName(dom.getFileName());

			edu.setOperid((long) getCurrUser());

			edu.setRemark(dom.getRemark());

			edu.setVideoReleaseTime(new Date());

			edu.setOpertime(new Date());

			edu.setRegtime(new Date());

			edu.setUpdatetime(new Date());

			action = "page/admin/page/eduback_viewEduList.action";

			eduService.insertEduVideo(edu);

			message = "新增成功!";
		}
		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editEdu()
	{

		String id = this.getParameter("id");

		EduVideo edu = eduService.queryDataById(id);

		dom = new EduVideoVDomContent(edu);

		action = "page/admin/page/eduback_saveEdit.action?id=" + id;

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

		EduVideo edu = new EduVideo();

		edu.setVideoType(dom.getVideoType());

		edu.setContent(dom.getContent());

		edu.setImg(dom.getImg());

		edu.setOperid(dom.getOperid());

		edu.setVideoUrl(dom.getVideoUrl());

		edu.setVideoTitle(dom.getVideoTitle());

		edu.setUpdatetime(new Date());

		edu.setRemark(dom.getRemark());

		edu.setId((long) Integer.parseInt(id));

		action = "page/admin/page/eduback_viewEduList.action";

		eduService.updateEduVideo(edu);

		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 删除记录
	 */
	public String deleteEdu()
	{

		String id = this.getParameter("id");

		eduService.deleteDataById(id);

		message = "删除成功";

		action = "page/admin/page/eduback_viewEduList.action";

		return SUCCESS;
	}

	/**
	 * 批量删除
	 */
	public String delAllEdu()
	{

		eduService.deleteDataByIds(ids);

		message = "批量删除成功";

		action = "page/admin/page/eduback_viewEduList.action";

		return SUCCESS;
	}
}
