package com.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.action.vo.ConfigVDomContent;

import com.web.action.vo.ListActions;
import com.web.pojo.Config;
import com.web.service.interfaces.IConfigService;


/**网站配置
 * @author wqg
 *
 * 2013-9-12下午4:12:49
 */
public class ConfigAction extends BaseAction
{

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	@Autowired
	private IConfigService configService;

	private List<Config> configList;

	@Autowired
	// private IDynamicInfoService dynamicInfoService;
	private static final String title = "网站配置";

	private String ids;

	private String action;

	private static ListActions opt;

	private ConfigVDomContent dom;

	private final static int PAGESIZE = 10;

	static
	{
		opt = new ListActions();
		opt.setAddAction("page/admin/page/config_newConfig.action");
		opt.setEditAction("page/admin/page/config_editConfig.action");
		opt.setDeleteAction("page/admin/page/config_deleteConfig.action");
		opt.setDelAllAction("page/admin/page/config_delAllConfig.action");// 批量删除
		opt.setShowAction("page/admin/page/config_viewConfig.action");
	}

	public List<Config> getConfigList()
	{
		return configList;
	}

	public void setConfigList(List<Config> configList)
	{
		this.configList = configList;
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
		ConfigAction.opt = opt;
	}

	public ConfigVDomContent getDom()
	{
		return dom;
	}

	public void setDom(ConfigVDomContent dom)
	{
		this.dom = dom;
	}

	public String getTitle()
	{
		return title;
	}

	/**
	 * 后台列表管理
	 * 
	 * @return
	 */
	// 查看网站配置
	public String viewConfig()
	{
		String id = this.getParameter("id");
		dom = new ConfigVDomContent(configService.queryDataById(id));
		action = opt.getEditAction() + "?id=" + id;
		return "view";
	}

	// 列表
	public String viewConfigList()
	{
		// 记录总数
		HashMap<String, Object> querya = new HashMap<String, Object>();
		// querya.put("type", 1);
		int allnum = configService.getCountByAll(querya);

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
		// queryp.put("type", 1);
		queryp.put("curnum", (curpage - 1) * PAGESIZE);
		queryp.put("pagesize", PAGESIZE);

		configList = configService.selectPage(queryp);

		// 总页数
		int pt = allnum / PAGESIZE;
		int pagenum = (allnum % PAGESIZE) > 0 ? pt + 1 : pt;

		this.pageString = this.getPageNumView(curpage, pagenum,
				"page/admin/page/config_viewConfigList.action");

		return "default";
	}

	/**
	 * 创建一条记录
	 * 
	 * @return
	 */
	public String newConfig()
	{
		action = "page/admin/page/config_saveNew.action";
		return "edit";
	}

	/**
	 * 保存新记录
	 * 
	 * @return
	 */
	public String saveNew()
	{

		// private Integer id;
		// private String fileName; //文件名称
		// private int type; //类型
		// private String fileURL; // 文件路径
		// private String pdescribe; // 内容描述
		// private Date addDateTime; //添加时间
		// private Date updateTime; // 更新时间
		// private Long num; // 点击数

		Config c = new Config();

		c.setSiteName(dom.getSiteName());
		c.setKeywords(dom.getKeywords());
		c.setPdescription(dom.getPdescription());
		c.setAddress(dom.getAddress());
		c.setCode(dom.getCode());

		c.setTelephone(dom.getTelephone());
		c.setTelephoneSale(dom.getTelephoneSale());
		c.setTelephoneService(dom.getTelephoneService());
		c.setFax(dom.getFax());
		c.setEmail(dom.getEmail());
		c.setHomePage(dom.getHomePage());
		c.setQq1(dom.getQq1());
		c.setQq2(dom.getQq2());
		c.setMsn1(dom.getMsn1());
		c.setMsn2(dom.getMsn2());

		c.setAddDateTime(new Date());
		c.setUpdateTime(new Date());
		// d.setNum(Parameter.NUM_INIT);

		action = "page/admin/page/config_viewConfigList.action";
		configService.insertConfig(c);

		message = "保存成功!";
		return SUCCESS;
	}

	/**
	 * 保存修改
	 * 
	 * @return
	 */
	public String saveEdit()
	{
		String id = this.getParameter("id");
		Config c = new Config();
		c.setSiteName(dom.getSiteName());
		c.setKeywords(dom.getKeywords());
		c.setPdescription(dom.getPdescription());
		c.setAddress(dom.getAddress());
		c.setCode(dom.getCode());
		c.setTelephone(dom.getTelephone());
		c.setTelephoneSale(dom.getTelephoneSale());
		c.setTelephoneService(dom.getTelephoneService());
		c.setFax(dom.getFax());
		c.setEmail(dom.getEmail());
		c.setHomePage(dom.getHomePage());
		c.setQq1(dom.getQq1());
		c.setQq2(dom.getQq2());
		c.setMsn1(dom.getMsn1());
		c.setMsn2(dom.getMsn2());

		c.setAddDateTime(new Date());
		c.setUpdateTime(new Date());

		// c.setNum(Parameter.NUM_INIT);

		c.setId(Integer.parseInt(id));

		action = "page/admin/page/config_viewConfigList.action";
		configService.updateConfig(c);
		message = "修改成功!";

		return SUCCESS;
	}

	/**
	 * 修改一条记录
	 * 
	 */

	public String editConfig()
	{

		String id = this.getParameter("id");
		Config c = configService.queryDataById(id);
		dom = new ConfigVDomContent(c);
		action = "page/admin/page/config_saveEdit.action?id=" + id;
		return "edit";
	}

	/**
	 * 删除记录 2013-4-18
	 */
	public String deleteConfig()
	{

		String id = this.getParameter("id");
		configService.deleteDataById(id);
		message = "删除成功";
		action = "page/admin/page/config_viewConfigList.action";
		return SUCCESS;
	}

	/**
	 * 批量删除 2013-4-18
	 */

	public String delAllConfig()
	{

		configService.deleteDataByIds(ids);
		
		message = "批量删除成功 ";

		action = "page/admin/page/config_viewConfigList.action";

		return SUCCESS;
	}

}
