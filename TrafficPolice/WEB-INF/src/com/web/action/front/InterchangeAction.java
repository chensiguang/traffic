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
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import com.web.action.base.BaseAction;
import com.web.pojo.Interchange;
import com.web.service.interfaces.InterchangeService;

/**
 * ClassName:InterchangeAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-05 下午10:07:17 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public class InterchangeAction extends BaseAction
{
    private static final long serialVersionUID = -2971139896606186802L;

    private static int PAGESIZE = 20;

    private ArrayList<Interchange> interchangelist;

    private int count;

    private Interchange interchange;

    public ArrayList<Interchange> getInterchangelist()
    {
        return interchangelist;
    }

    public void setInterchangelist(ArrayList<Interchange> interchangelist)
    {
        this.interchangelist = interchangelist;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public Interchange getInterchange()
    {
        return interchange;
    }

    public void setInterchange(Interchange interchange)
    {
        this.interchange = interchange;
    }

    @Autowired
    private InterchangeService interchangeService;

    public String list()
    {
        log.info("do driver list page...");
        int count = interchangeService.selectCount(new HashMap());

        setCount(count);
        setPage("interchangelist.jsp");
        log
                .info("end interchange list page... <return Data type: page;Data:> interchangelist.jsp <Data:>"
                        + count);
        return "success";
    }

    public void interlist()
    {
        String currentpage = getParameter("currentpage");
        log.info("do interchange interlist...<param>currentpage=" + currentpage);
        if (currentpage == null || currentpage.equals(""))
        {
            currentpage = "1";
        }
        int count = interchangeService.selectCount(new HashMap());

        ArrayList<Interchange> interchangeList = interchangeService.selectInterchangeList((Integer
                .valueOf(currentpage) - 1)
                * PAGESIZE, PAGESIZE);

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(tojson(count, interchangeList));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        log.info("end driver drilist...<return Data type: json;Data:>"
                + tojson(count, interchangeList));
    }

    private String tojson(int count, ArrayList<Interchange> interchangeList)
    {
        StringBuffer newStr = new StringBuffer();
        newStr.append("{'count':'");
        newStr.append(count);
        newStr.append("'");
        int size = 0;
        if (interchangeList != null && interchangeList.size() > 0)
        {
            newStr.append(",'interchanges':[");
            for (Interchange interchange : interchangeList)
            {
                newStr.append(interchange.toJson());
                newStr.append(",");
            }
            newStr.deleteCharAt(newStr.length() - 1);
            newStr.append("]");
            size = interchangeList.size();
        }

        newStr.append(",'size':'");
        newStr.append(size);
        newStr.append("'");
        newStr.append("}");
        return newStr.toString();
    }
}
