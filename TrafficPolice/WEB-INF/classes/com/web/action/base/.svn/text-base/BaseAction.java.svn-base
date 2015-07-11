package com.web.action.base;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.web.pojo.Admin;
import com.web.system.Parameter;

public class BaseAction extends ActionSupport
{

    /**
     * 
     */
    private static final long serialVersionUID = -6670347392429361764L;

    protected Logger log = Logger.getLogger(BaseAction.class);

    protected String message;

    protected String page;
    
    protected String pageString;
    
    protected String getLoginname()
    {
    	Admin admin = (Admin) getSession().getAttribute(
				Parameter.SESSION_KEY_USER);
		return admin.getLoginname();
    }

    protected Long getCurrUser()
    {
    	Admin admin = (Admin) getSession().getAttribute(
				Parameter.SESSION_KEY_USER);
		return admin.getUserno();
    }
/*    
    protected String getAccount()
	{
		Admin admin = (Admin) getSession().getAttribute(
				Parameter.SESSION_KEY_USER);
		return admin.getLoginname();
	}*/

    protected HttpServletRequest getRequest()
    {
        return ServletActionContext.getRequest();
    }

    protected HttpServletResponse getResponse()
    {
        return ServletActionContext.getResponse();
    }

    protected PrintWriter getOutputStream() throws IOException
    {
        return getResponse().getWriter();
    }

    protected HttpSession getSession()
    {
        return getRequest().getSession();
    }

    protected String getParameter(String arg0)
    {
        return getRequest().getParameter(arg0);
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getPage()
    {
        return page;
    }

    public void setPage(String page)
    {
        this.page = page;
    }
    
    
    
    public String getPageString()
	{
		return pageString;
	}

	public void setPageString(String pageString)
	{
		this.pageString = pageString;
	}

	public String getPageNumView(int curpagenum, int lastnum, String action)
	{

		HttpServletRequest request = ServletActionContext.getRequest();
		String path = request.getContextPath();
		String basepath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + path + "/" + action;
		String bp = getRequest().getQueryString();
		ActionContext context = ActionContext.getContext();
		Map<String, Object> params = context.getParameters();
		Object pagenum = params.get("page");
		if (pagenum != null)
		{
			// 移除原有page参数
			String[] st = (String[]) pagenum;
			bp = StringUtils.remove(bp, "page=" + st[0]);
		}

		String baseparam = "?"
				+ (StringUtils.isEmpty(bp) ? StringUtils.EMPTY : (bp
						.endsWith("&") ? bp : bp + "&"));
		String url = basepath + baseparam;

		StringBuffer result = new StringBuffer();
		result.append("<a href=\"" + url + "page="
				+ ((curpagenum > 1) ? curpagenum - 1 : 1) + "\" class=\"up");
		if (1 == curpagenum)
		{
			result.append(" close");
		}
		result.append("\">上一页</a>");
		if (lastnum <= 5)
		{
			for (int i = 1; i <= lastnum; i++)
			{
				if (i != curpagenum)
				{
					result.append("<a href=\"" + url + "page=" + i + "\">" + i
							+ "</a>");
				} else
				{
					result.append("<b>" + i + "</b>");
				}
			}
		} else if (lastnum > 5)
		{
			if (curpagenum <= 3)
			{
				for (int i = 1; i <= 5; i++)
				{
					if (i != curpagenum)
					{
						result.append("<a href=\"" + url + "page=" + i + "\">"
								+ i + "</a>");
					} else
					{
						result.append("<b>" + i + "</b>");
					}
				}
				result.append("<a href=\"" + url + "page=" + lastnum + "\">"
						+ lastnum + "</a>");
			} else if (lastnum - curpagenum < 3)
			{
				result.append("<a href=\"" + url + "page=1\">" + 1 + "</a>");
				for (int i = lastnum - 4; i <= lastnum; i++)
				{
					if (i != curpagenum)
					{
						result.append("<a href=\"" + url + "page=" + i + "\">"
								+ i + "</a>");
					} else
					{
						result.append("<b>" + i + "</b>");
					}
				}
			} else
			{
				result.append("<a href=\"" + url + "page=1\">" + 1 + "</a>");
				for (int i = curpagenum - 2; i <= curpagenum + 2; i++)
				{
					if (i != curpagenum)
					{
						result.append("<a href=\"" + url + "page=" + i + "\">"
								+ i + "</a>");
					} else
					{
						result.append("<b>" + i + "</b>");
					}
				}
				result.append("<a href=\"" + url + "page=" + lastnum + "\">"
						+ lastnum + "</a>");
			}
		}

		result.append("<a href=\"" + url + "page="
				+ ((curpagenum < lastnum) ? curpagenum + 1 : lastnum)
				+ "\" class=\"next");
		if (lastnum == curpagenum)
		{
			result.append(" close");
		}
		result.append("\">下一页</a>");

		return result.toString();
	}

}
