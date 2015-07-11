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
import com.web.pojo.Driver;
import com.web.service.interfaces.DriverService;

/**
 * ClassName:DriverAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-02 下午01:17:17 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class DriverAction extends BaseAction
{
    private static final long serialVersionUID = -2971139896606186802L;

    private static int PAGESIZE = 20;

    private ArrayList<Driver> driverlist;

    private int count;

    private Driver driver;

    public ArrayList<Driver> getDriverlist()
    {
        return driverlist;
    }

    public void setDriverlist(ArrayList<Driver> driverlist)
    {
        this.driverlist = driverlist;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public Driver getDriver()
    {
        return driver;
    }

    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }

    @Autowired
    private DriverService driverService;

    public String list()
    {
        log.info("do driver list page...");
        
        int count = driverService.selectCount(new HashMap<Object, Object>());

        setCount(count);
        setPage("driverlist.jsp");
        log
                .info("end driver list page... <return Data type: page;Data:> driverlist.jsp <Data:>"
                        + count);
        return "success";
    }

    public void info()
    {

        String id = getParameter("driverid");

        log.info("do driver info...<param>driverid=" + id);

        driver = driverService.selectDetailById(Integer.valueOf(id));

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(driver.toJson());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        log.info("end driver drilist...<return Data type: json;Data:>"
                + driver.toJson());

    }

    public void drilist()
    {
        String currentpage = getParameter("currentpage");
        log.info("do driver drilist...<param>currentpage=" + currentpage);
        if (currentpage == null || currentpage.equals(""))
        {
            currentpage = "1";
        }
        int count = driverService.selectCount(new HashMap());

        ArrayList<Driver> driverList = driverService.selectDriverList((Integer
                .valueOf(currentpage) - 1)
                * PAGESIZE, PAGESIZE);

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(tojson(count, driverList));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        log.info("end driver drilist...<return Data type: json;Data:>"
                + tojson(count, driverList));
    }

    private String tojson(int count, ArrayList<Driver> driverList)
    {
        StringBuffer newStr = new StringBuffer();
        newStr.append("{'count':'");
        newStr.append(count);
        newStr.append("'");
        int size = 0;
        if (driverList != null && driverList.size() > 0)
        {
            newStr.append(",'drivers':[");
            for (Driver driver : driverList)
            {
                newStr.append(driver.toJson());
                newStr.append(",");
            }
            newStr.deleteCharAt(newStr.length() - 1);
            newStr.append("]");
            size = driverList.size();
        }

        newStr.append(",'size':'");
        newStr.append(size);
        newStr.append("'");
        newStr.append("}");
        System.out.println(newStr.toString());
        return newStr.toString();
    }
}
