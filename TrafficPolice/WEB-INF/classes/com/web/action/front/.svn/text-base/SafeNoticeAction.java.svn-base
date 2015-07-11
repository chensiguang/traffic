/**
 * 
 * 
 * 
 *
 * 
 */
package com.web.action.front;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.pojo.SafeNotice;
import com.web.service.interfaces.SafeNoticeService;

/**
 * @author wqg
 * 
 *         2013-9-3下午5:13:19
 */
public class SafeNoticeAction extends BaseAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int PAGESIZE = 15;

	@Autowired
	private SafeNoticeService noticeService;

	private List<SafeNotice> noticeList;

	private int count;

	public String list()
	{
		log.info("do safenotice list page...");

		int count = noticeService.selectCount();

		setCount(count);

		setPage("safenoticelist.jsp");

		log.info("end safenotice list page... <return Data type: page;Data:> noticelist.jsp <Data:>"
				+ count);

		return "success";
	}
	

	public void detailList()
	{
		String currentpage = getParameter("currentpage");

		log.info("do safeNoticeList...<param>currentpage=" + currentpage);

		if (currentpage == null || currentpage.equals(""))
		{
			currentpage = "1";
		}
		int count = noticeService.selectCount();

		ArrayList<SafeNotice> noticelist = noticeService.selectNoticeList(
				(Integer.valueOf(currentpage) - 1) * PAGESIZE, PAGESIZE);

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");

			getResponse().getWriter().write(tojson(count, noticelist));

		} catch (IOException e)
		{
			e.printStackTrace();
		}

		log.info("end safenoticeList...<return Data type: json;Data:>"
				+ tojson(count, noticelist));
	}

	public void info()
	{

		String id = getParameter("noticeid");

		log.info("do safenotice info...<param>noticeid=" + id);

		SafeNotice safeNotice = noticeService.selectNoticeInfoById(Integer.valueOf(id));

		// setRule(rule);

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(safeNotice.toJson());
		} catch (IOException e)
		{
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		log.info("end safenotice info...<return Data type: json;Data:>"
				+ safeNotice.toJson());
	}

	private String tojson(int count, ArrayList<SafeNotice> noticelist)
	{
		// SimpleDateFormat simpleDateFormat = new
		// SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
		log.debug("enter into function  tojson:<pamams>count=" + count);

		StringBuffer newStr = new StringBuffer();

		newStr.append("{'count':'");

		newStr.append(count);

		newStr.append("'");

		int size = 0;

		if (noticelist != null && noticelist.size() > 0)
		{
			newStr.append(",'notices':[");

			for (SafeNotice notice : noticelist)
			{
				newStr.append(notice.toJson());

				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);

			newStr.append("]");

			size = noticelist.size();
		}

		newStr.append(",'size':'");

		newStr.append(size);

		newStr.append("'");

		newStr.append("}");

		log.debug("Data type: json;Data: " + newStr.toString());

		return newStr.toString();
	}

	public List<SafeNotice> getNoticeList()
	{
		return noticeList;
	}

	public void setNoticeList(List<SafeNotice> noticeList)
	{
		this.noticeList = noticeList;
	}

	public static int getPagesize()
	{
		return PAGESIZE;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

}
