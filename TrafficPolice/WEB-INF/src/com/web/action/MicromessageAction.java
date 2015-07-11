/**
 * Project Name:TrafficPolice
 * File Name:EduAction.java
 * Package Name:com.web.action
 * Date:2013-7-29下午01:17:17
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Micromessage;
import com.web.service.interfaces.MicromessageService;

/**
 * ClassName:MicromessageAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-9<br/>
 * 
 * @author ln
 * @version
 * @since JDK 1.6
 * @see
 */
public class MicromessageAction extends BaseAction
{
    private static final long serialVersionUID = -2971139896606186802L;

    private static int PAGESIZE = 20;

    private ArrayList<Micromessage> micromessagelist;

    private int count;

    private Micromessage micromessage;

    public ArrayList<Micromessage> getMicromessagelist()
    {
        return micromessagelist;
    }

    public void setMicromessagelist(ArrayList<Micromessage> micromessagelist)
    {
        this.micromessagelist = micromessagelist;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public Micromessage getMicromessage()
    {
        return micromessage;
    }

    public void setMicromessage(Micromessage micromessage)
    {
        this.micromessage = micromessage;
    }

    @Autowired
    private MicromessageService micromessageService;

    public String list()
    {
        log.info("do micromessage list page...");
        int count = micromessageService.selectCount(new HashMap());

        setCount(count);
        setPage("microblog.jsp");
        log
                .info("end micromessage list page... <return Data type: page;Data:> microblog.jsp.jsp <Data:>"
                        + count);
        return "success";
    }

    public void microlist()
    {
        String currentpage = getParameter("currentpage");
        log.info("do micromessage microlist...<param>currentpage=" + currentpage);
        if (currentpage == null || currentpage.equals(""))
        {
            currentpage = "1";
        }
        int count = micromessageService.selectCount(new HashMap());

        ArrayList<Micromessage> micromessageList = micromessageService.selectMicromessageList((Integer
                .valueOf(currentpage) - 1)
                * PAGESIZE, PAGESIZE);

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(tojson(count, micromessageList));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        log.info("end micromessage microlist...<return Data type: json;Data:>"
                + tojson(count, micromessageList));
    }

    private String tojson(int count, ArrayList<Micromessage> micromessageList)
    {
        StringBuffer newStr = new StringBuffer();
        newStr.append("{'count':'");
        newStr.append(count);
        newStr.append("'");
        int size = 0;
        if (micromessageList != null && micromessageList.size() > 0)
        {
            newStr.append(",'micromessages':[");
            for (Micromessage micromessage : micromessageList)
            {
                newStr.append(micromessage.toJson());
                newStr.append(",");
            }
            newStr.deleteCharAt(newStr.length() - 1);
            newStr.append("]");
            size = micromessageList.size();
        }

        newStr.append(",'size':'");
        newStr.append(size);
        newStr.append("'");
        newStr.append("}");
        return newStr.toString();
    }
}
