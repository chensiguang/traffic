/**
 * Project Name:TrafficPolice
 * File Name:EduAction.java
 * Package Name:com.web.action
 * Date:2013-7-29下午01:17:17
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.action.front;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.EduVideo;
import com.web.service.interfaces.EduVideoService;

/**
 * ClassName:EduAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-7-29 下午01:17:17 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class EduAction extends BaseAction
{
	private static final long serialVersionUID = -2971139896606186802L;

	private static int PAGESIZE = 4;

	private ArrayList<EduVideo> eduVideolist;

	private int count;
	
	private List<EduVideo> eduList2;

	private EduVideo eduVideo;
	
	// 宣教中心Service
	@Autowired
	private EduVideoService eduVideoService;

	
	public List<EduVideo> getEduList2()
	{
		return eduList2;
	}

	public void setEduList2(List<EduVideo> eduList2)
	{
		this.eduList2 = eduList2;
	}

	public ArrayList<EduVideo> getEduVideolist()
	{
		return eduVideolist;
	}

	public void setEduVideolist(ArrayList<EduVideo> eduVideolist)
	{
		this.eduVideolist = eduVideolist;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public EduVideo getEduVideo()
	{
		return eduVideo;
	}

	public void setEduVideo(EduVideo eduVideo)
	{
		this.eduVideo = eduVideo;
	}

	@Autowired
	private EduVideoService edvVideoService;

	public String list()
	{
	
		log.info("do edvVideo list page...");
		
		List<EduVideo> eduList = eduVideoService.selectVideoList(0, 1);

		eduList2 = eduVideoService.queryAll();

		setEduVideo(eduList.size() > 0 ? eduList.get(0) : null);
		int count = edvVideoService.selectCount();

		setCount(count);
		setPage("eduVideolist.jsp");
		log.info("end edvVideo list page... <return Data type: page;Data:> edvVideolist.jsp <Data:>"
				+ count);
		
		eduList = eduVideoService.queryAll();
		return "success";
	}

	public void info()
	{

		String id = getParameter("eduid");

		log.info("do EduVideo info...<param>eduid=" + id);

		EduVideo eduVideo = edvVideoService.selectVideoDetailById(Integer.valueOf(id));

		//setPage("eduVideoinfo.jsp");
	    try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(eduVideo.toJson());
        }
        catch(IOException e)
        {

			e.printStackTrace();
		}
		log.info("end EduVideo info page... <return Data type: page;Data:>"
				+ eduVideo.toJson());
	}

	public void edulist()
	{
		String currentpage = getParameter("currentpage");
		log.info("do eduvideo eduList...<param>currentpage=" + currentpage);
		if (currentpage == null || currentpage.equals(""))
		{
			currentpage = "1";
		}
		int count = edvVideoService.selectCount();

		ArrayList<EduVideo> eduList = edvVideoService.selectVideoList(
				(Integer.valueOf(currentpage) - 1) * PAGESIZE, PAGESIZE);

		try
		{
			getResponse().setContentType("text/html;charset=UTF-8");
			getResponse().getWriter().write(tojson(count, eduList));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		log.info("end rule eduList...<return Data type: json;Data:>"
				+ tojson(count, eduList));
	}

	private String tojson(int count, ArrayList<EduVideo> eduList)
	{
		// SimpleDateFormat simpleDateFormat = new
		// SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
		StringBuffer newStr = new StringBuffer();
		newStr.append("{'count':'");
		newStr.append(count);
		newStr.append("'");
		int size = 0;
		if (eduList != null && eduList.size() > 0)
		{
			newStr.append(",'eduvideos':[");
			for (EduVideo eduVideo : eduList)
			{
				newStr.append(eduVideo.toJson());
				newStr.append(",");
			}
			newStr.deleteCharAt(newStr.length() - 1);
			newStr.append("]");
			size = eduList.size();
		}

		newStr.append(",'size':'");
		newStr.append(size);
		newStr.append("'");
		newStr.append("}");
		return newStr.toString();
	}
}
