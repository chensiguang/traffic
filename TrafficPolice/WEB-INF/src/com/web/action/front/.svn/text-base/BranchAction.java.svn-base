/**
 * Project Name:TrafficPolice
 * File Name:BranchAction.java
 * Package Name:com.web.action
 * Date:2013-9-3下午01:06:28
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.action.front;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.action.base.BaseAction;
import com.web.pojo.Branch;
import com.web.service.interfaces.BranchService;

/**
 * ClassName:BranchAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-9-3 下午01:06:28 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class BranchAction extends BaseAction
{
    /**
     * 
     * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
     */

    private static final long serialVersionUID = 1L;

    private static final int PAGESIZE = 15;

    // 快速处理点列表显示
    private ArrayList<Branch> branchlist;

    private int count;

    // 快速处理点详情
    private Branch branch;

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public ArrayList<Branch> getBranchlist()
    {
        return branchlist;
    }

    public void setBranchlist(ArrayList<Branch> branchlist)
    {
        this.branchlist = branchlist;
    }

    public Branch getBranch()
    {
        return branch;
    }

    public void setBranch(Branch branch)
    {
        this.branch = branch;
    }

    // 快速处理点Service
    @Autowired
    private BranchService branchService;

    public String list()
    {
        log.info("do branch list page...");
        int count = branchService.selectCount();

        setCount(count);
        setPage("branchlist.jsp");
        log
                .info("end branch list page... <return Data type: page;Data:> branchlist.jsp <Data:>"
                        + count);
        return "success";
    }

    public void info()
    {

        String id = getParameter("branchid");

        log.info("do branch info...<param>branchid=" + id);

        Branch branch = branchService.selectBranchInfoById(Integer.valueOf(id));

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(branch.toJson());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        log.info("end rule info...<return Data type: json;Data:>"
                + branch.toJson());
    }

    public void detailList()
    {
        String currentpage = getParameter("currentpage");
        log.info("do Branch detailList...<param>currentpage=" + currentpage);
        if (currentpage == null || currentpage.equals(""))
        {
            currentpage = "1";
        }
        int count = branchService.selectCount();

        ArrayList<Branch> branchlist = branchService.selectBranchList((Integer
                .valueOf(currentpage) - 1)
                * PAGESIZE, PAGESIZE);

        try
        {
            getResponse().setContentType("text/html;charset=UTF-8");
            getResponse().getWriter().write(tojson(count, branchlist));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        log.info("end Branch detailList...<return Data type: json;Data:>"
                + tojson(count, branchlist));
    }

    /**
     * 
     * @author:ws
     * @Description: tojson 返回list组成json格式
     * @param @param count
     * @param @param rulelist
     * @param @return 参数类型
     * @return String 返回类型
     * @date 2013-7-19下午03:11:23
     * @throws
     */
    private String tojson(int count, ArrayList<Branch> branchlist)
    {
        log.debug("enter into function  tojson:<pamams>count=" + count);
        StringBuffer newStr = new StringBuffer();
        newStr.append("{'count':'");
        newStr.append(count);
        newStr.append("'");
        int size = 0;
        if (branchlist != null && branchlist.size() > 0)
        {
            newStr.append(",'branchlists':[");
            for (Branch branch : branchlist)
            {
                newStr.append(branch.toJson());
                newStr.append(",");
            }
            newStr.deleteCharAt(newStr.length() - 1);
            newStr.append("]");
            size = branchlist.size();
        }

        newStr.append(",'size':'");
        newStr.append(size);
        newStr.append("'");
        newStr.append("}");
        log.debug("Data type: json;Data: " + newStr.toString());
        return newStr.toString();
    }
}
