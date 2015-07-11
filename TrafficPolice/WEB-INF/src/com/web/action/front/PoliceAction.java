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
import com.web.pojo.Police;
import com.web.service.interfaces.PoliceService;

/**
 * ClassName:PoliceAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-02 下午01:17:17 <br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public class PoliceAction extends BaseAction
{
    private static final long serialVersionUID = -2971139896606186802L;

    private static int PAGESIZE = 20;

    private ArrayList<Police> policelist;

    private int count;

    private Police police;

    public ArrayList<Police> getPolicelist()
    {
        return policelist;
    }

    public void setPolicelist(ArrayList<Police> policelist)
    {
        this.policelist = policelist;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public Police getPolice()
    {
        return police;
    }

    public void setPolice(Police police)
    {
        this.police = police;
    }

    @Autowired
    private PoliceService policeService;

    public String list()
    {
        log.info("do police list page...");
        int count = policeService.selectCount(new HashMap());

        setCount(count);
        setPage("policelist.jsp");
        log
                .info("end driver list page... <return Data type: page;Data:> policelist.jsp <Data:>"
                        + count);
        return "success";
    }

    public void info()
    {

        String id = getParameter("policeid");

        log.info("do police info...<param>policeid=" + id);

        police = policeService.selectDetailById(Integer.valueOf(id));

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(police.toJson());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        log.info("end police polist...<return Data type: json;Data:>"
                + police.toJson());

    }

    public void polist()
    {
        String currentpage = getParameter("currentpage");
        log.info("do police drilist...<param>currentpage=" + currentpage);
        if (currentpage == null || currentpage.equals(""))
        {
            currentpage = "1";
        }
        int count = policeService.selectCount(new HashMap());

        ArrayList<Police> policeList = policeService.selectPoliceList((Integer
                .valueOf(currentpage) - 1)
                * PAGESIZE, PAGESIZE);

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(tojson(count, policeList));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        log.info("end driver polist...<return Data type: json;Data:>"
                + tojson(count, policeList));
    }

    private String tojson(int count, ArrayList<Police> policeList)
    {
        StringBuffer newStr = new StringBuffer();
        newStr.append("{'count':'");
        newStr.append(count);
        newStr.append("'");
        int size = 0;
        if (policeList != null && policeList.size() > 0)
        {
            newStr.append(",'polices':[");
            for (Police police : policeList)
            {
                newStr.append(police.toJson());
                newStr.append(",");
            }
            newStr.deleteCharAt(newStr.length() - 1);
            newStr.append("]");
            size = policeList.size();
        }

        newStr.append(",'size':'");
        newStr.append(size);
        newStr.append("'");
        newStr.append("}");
        return newStr.toString();
    }
}
