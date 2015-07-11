package org.apache.jsp.page.admin.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.web.pojo.*;
import java.util.*;
import java.lang.*;

public final class Manage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

   String path = request.getContextPath();
   String basePath = request.getScheme() + "://" + ("xsaqjy".equals(request.getServerName())? "xsaqjy.ljgps.net":request.getServerName())+ (request.getServerPort() == 80 ? "" : ":"+ request.getServerPort()) + path + "/";
   Long userno = (Long)session.getAttribute("userno");//获得当前登录用户的id用户号
   if(userno == null){response.sendRedirect(basePath + "page/admin/login.jsp"); return;}
   Long admin = (Long)session.getAttribute("adminflag");//获得标记当前登录用户是否为数据管理员
   if(admin == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   Long dwtype = (Long)session.getAttribute("dwtype");//获得当前登录用户所在单位类型 0代表交警  1代表货运公司
   if(dwtype == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   String username = (String)request.getSession().getAttribute("username");
   if(username == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   List<String> list = (List<String>)session.getAttribute("list");//获得权限的集合
   if(list == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   Long userid = (long)Integer.parseInt((String)request.getSession().getAttribute("driverid"));
   if(userid == null){response.sendRedirect(basePath + "page/admin/login.jsp"); return;}
	Object u = request.getSession().getAttribute("onlineuser");//获得当前登录用户的对象
	if (u == null) {response.sendRedirect(basePath + "page/admin/login.jsp");}//假如获得不到用户，就重新定向到登录页面
	session.setAttribute("basePath",basePath);//把basepath放到session中以便所有的页面使用

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 获取当前日期，时间，星期 -->\r\n");

String week = ""; 
if(new Date().getDay()==0) week="星期日";
if(new Date().getDay()==1) week="星期一";
if(new Date().getDay()==2) week="星期二" ;
if(new Date().getDay()==3) week="星期三";
if(new Date().getDay()==4) week="星期四";
if(new Date().getDay()==5) week="星期五";
if(new Date().getDay()==6) week="星期六";
java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
java.util.Date currentTime = new java.util.Date();//得到当前系统时间
String date1 = formatter.format(currentTime); //将日期时间格式化
String date2 = currentTime.toString(); //将Date型日期时间转换成字符串形式

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>机动车网上交通安全宣传教育监管平台</title>\r\n");
      out.write("<link href=\"page/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//setMenuHeight\r\n");
      out.write("\t\t$('.menu').height($(window).height() - 56 - 27 - 26);\r\n");
      out.write("\t\t$('.sidebar').height($(window).height() - 56 - 27 - 26);\r\n");
      out.write("\t\t$('.page').height($(window).height() - 56 - 27 - 26);\r\n");
      out.write("\t\t$('.page iframe').width($(window).width() - 15 - 168);\r\n");
      out.write("\t\t$('.subMenu a[href=\"#\"]').next('ul').toggle();\r\n");
      out.write("\t\t//menu on and off\r\n");
      out.write("\t\t$('.btn').click(function() {\r\n");
      out.write("\t\t\t$('.menu').toggle();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($(\".menu\").is(\":hidden\")) {\r\n");
      out.write("\t\t\t\t$('iframe').width($(window).width() - 15 + 5);\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$('iframe').width($(window).width() - 15 - 168);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write(" \r\n");
      out.write("\t\t//\r\n");
      out.write("\t\t$('.subMenu a[href=\"#\"]').click(function() {\r\n");
      out.write("\t\t\t$(this).next('ul').toggle();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickmenu(topage){\r\n");
      out.write("\t\t $('iframe')[0].src = topage;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- 后台页面权限的分配 -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//页面初始化进行\r\n");
      out.write("window.onload = function() \r\n");
      out.write("{\r\n");
      out.write("\tif(\"");
      out.print(admin);
      out.write("\" == \"1\")//数据管理员的id号设置为0，当id号为0时，拥有一切权限\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(\"li\").show();\r\n");
      out.write("\t\t\t$(\"#otherreprimand\").remove();\r\n");
      out.write("\t\t\t$(\"#driverreprimand\").remove();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t$(\"li\").hide();\r\n");
      out.write("\t\t$(\"#subMenu\").show();\r\n");
      out.write("\t\t");

		if(dwtype == 0)//当登录的账号为交警部门时，默认的显示前台页面的8个模块对应的后台数据管理
		{
		
      out.write("\r\n");
      out.write("\t\t    $(\"#firstpage\").show();\r\n");
      out.write("\t\t\t$(\"#rulenmanage\").show();\r\n");
      out.write("\t\t\t$(\"#edunmanage\").show();\r\n");
      out.write("\t\t\t$(\"#baseinfo\").show();\r\n");
      out.write("\t\t\t$(\"#policeorgmanage\").show();\r\n");
      out.write("\t\t\t$(\"#companymanage\").show();\r\n");
      out.write("\t\t\t$(\"#carmanage\").show();\r\n");
      out.write("\t\t\t$(\"#drivermanage\").show();\r\n");
      out.write("\t\t\t$(\"#rulenmanage\").show();\r\n");
      out.write("\t\t\t$(\"#branchmanage\").show();\r\n");
      out.write("\t\t\t$(\"#safenoticemanage\").show();\r\n");
      out.write("\t\t\t$(\"#meetnoticemanage\").show();\r\n");
      out.write("\t\t\t$(\"#interchangemanage\").show();\r\n");
      out.write("\t\t\t$(\"#micromessagemanage\").show();\r\n");
      out.write("\t\t\t$(\"#editpassword\").show();\r\n");
      out.write("\t\t\t$(\"#reprimand\").show();\r\n");
      out.write("\t\t\t$(\"#carlist\").show();\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

	if(dwtype == 1)//当登录的账号为货运部门时，默认显示货运公司对应的后台数据管理
	{
	
      out.write("\r\n");
      out.write("\t    $(\"#firstpage\").show();\r\n");
      out.write("\t\t$(\"#baseinfo\").show();\r\n");
      out.write("\t\t$(\"#interchangemanage\").show();\r\n");
      out.write("\t\t$(\"#editpassword\").show();\r\n");
      out.write("\t\t$(\"#safelearn\").show();\r\n");
      out.write("\t\t$(\"#otherreprimand\").show();\r\n");
      out.write("\t\t$(\"#drivermanage\").show();\r\n");
      out.write("\t\t$(\"#micromessagemanage\").show();\r\n");
      out.write("\t\t$(\"#carmanage\").show();\r\n");
      out.write("\t\t$(\"#companymanage\").show();\r\n");
}
      out.write("\r\n");
      out.write("\r\n");

if(dwtype == 2)//当登录的账号为货运部门的驾驶员时，默认显示货运公司驾驶员对应的后台数据管理
{

      out.write("\r\n");
      out.write("    $(\"#firstpage\").show();\r\n");
      out.write("\t$(\"#baseinfo\").show();\r\n");
      out.write("\t$(\"#drivermanage\").show();\r\n");
      out.write("\t$(\"#editpassword\").show();\r\n");
      out.write("\t$(\"#interchangemanage\").show();\r\n");
      out.write("\t$(\"#safelearn\").show();\r\n");
      out.write("\t$(\"#micromessagemanage\").show();\r\n");
      out.write("\t$(\"#driverreprimand\").show();\r\n");
}
      out.write("\r\n");
      out.write("\t\t");

		if(u != null)
		{
		    String string = "";
			for(int i = 0;  i < list.size(); i++)
			{
					string = list.get(i);
		
      out.write("\r\n");
      out.write("\t\t$(\"#");
      out.print(string );
      out.write("\").show();\r\n");
      out.write("\t\t");
}}
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table border=\"0\" width=\"100%\" height=\"100%\"style=\"margin: 0; padding: 0; background-color: #198bc9\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\" height=\"100%\" style=\"margin: 0; padding: 0;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"50%\" style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t<div class=\"logo fleft\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"30%\"></td>\r\n");
      out.write("\t\t\t\t<td width=\"20%\" style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t<div  class=\"logoright fleft\" align=\"right\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\" align=\"left\">\r\n");
      out.write("\t\t\t<div class=\"logofont\" style=\"margin-left:25px\">\r\n");
      out.write("\t\t\t<table border=\"0\" width=\"100%\" height=\"100%\" style=\"margin: 0; padding: 0;\">\r\n");
      out.write("\t\t\t<tr><td align=\"left\">\r\n");
      out.write("\t\t\t<font>用户:");
      out.print(username );
      out.write("&nbsp;&nbsp;时间:");
      out.print(date1 );
      out.write("&nbsp;&nbsp;");
      out.print(week );
      out.write("&nbsp;&nbsp;</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t<a href=\"loginout.action\"><font color=\"#FFFFF0\">退出&nbsp;&nbsp;</font></a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"168px\">\r\n");
      out.write("\t\t\t\t<div class=\"menu fleft\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenuTitle\" id=\"subMenu\">机动车网安教后台管理</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"firstpage\">首页设置</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"stationmanage\"><a href=\"#\">参数配置</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"javascript:clickmenu('page/admin/page/config_viewConfigList.action')\">网站信息</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"accountmanage\"><a href=\"#\">系统管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"rolemanage\"><a href=\"javascript:clickmenu('page/admin/page/role_viewRoleList.action')\">角色管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"accountmanage\"><a href=\"javascript:clickmenu('page/admin/page/account_viewAccountList.action')\">账号管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"permisionmanage\"><a href=\"javascript:clickmenu('page/admin/page/permission_viewPermissionList.action')\">权限管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li  id=\"areamanage\"><a href=\"javascript:clickmenu('page/admin/page/areaback_viewAreaList.action')\">地域管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"rulenmanage\"><a href=\"javascript:clickmenu('page/admin/page/ruleback_viewRuleList.action')\">交通法规</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"edunmanage\"><a href=\"javascript:clickmenu('page/admin/page/eduback_viewEduList.action')\">宣教中心</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t <li class=\"subMenu\" id=\"baseinfo\"><a href=\"#\">基本信息</a>\r\n");
      out.write("\t\t\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t\t\t    <!-- <li id=\"policeorgmanage\"><a href=\"javascript:clickmenu('page/admin/page/orgback_viewPoliceOrgList.action')\">交警部门</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t    <li  id=\"orgmanage\"><a href=\"javascript:clickmenu('page/admin/page/policeorgback_viewPoliceOrgList.action')\">交警部门</a></li>\r\n");
      out.write("\t\t\t\t\t\t    <li class=\"subMenu\" id=\"carlist\"><a href=\"javascript:clickmenu('page/admin/page/policeback_viewPoliceList.action')\">交警信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"companymanage\"><a href=\"javascript:clickmenu('page/admin/page/companyback_viewCompanyList.action')\">企业安全组</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"carmanage\"><a href=\"javascript:clickmenu('page/admin/page/carback_viewCarList.action')\">车辆管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"drivermanage\"><a href=\"javascript:clickmenu('page/admin/page/driverback_viewDriverList.action')\">驾驶员管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t  \t<li class=\"subMenu\" id=\"editpassword\"><a href=\"javascript:clickmenu('page/admin/page/account_viewPassword.action?id=");
      out.print(userid );
      out.write("')\">修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t\t </li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"rulenmanage\"><a href=\"javascript:clickmenu('page/admin/page/illegalback_viewIllegalList.action')\">违法查询</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"branchmanage\"><a href=\"javascript:clickmenu('page/admin/page/branchback_viewBranchList.action')\">快速处理点</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"safenoticemanage\"><a href=\"javascript:clickmenu('page/admin/page/safenoticeback_viewSafeNoticeList.action')\">安全提醒</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"meetnoticemanage\"><a href=\"javascript:clickmenu('page/admin/page/meetnoticeback_viewMeetNoticeList.action')\">会议通知</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"safelearn\"><a href=\"javascript:clickmenu('page/admin/page/safelearnback_viewEduList.action')\">安全教育学习</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"reprimand\"><a href=\"javascript:clickmenu('page/admin/page/reprimandback_viewReprimandList.action')\">通报批评</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t    <li class=\"subMenu\" id=\"otherreprimand\"><a href=\"javascript:clickmenu('page/admin/page/otherreprimandback_viewReprimandList.action')\">通报批评</a></li>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <li class=\"subMenu\" id=\"driverreprimand\"><a href=\"javascript:clickmenu('page/admin/page/otherreprimandback_showDriverReprimand.action')\">通报批评</a></li>\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t    <li class=\"subMenu\" id=\"interchangemanage\"><a href=\"javascript:clickmenu('page/admin/page/interchangeback_viewInterchangeList.action')\">问题答疑</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"subMenu\" id=\"micromessagemanage\"><a href=\"javascript:clickmenu('page/admin/page/micromessage/micromessagelist.jsp')\">微博互动</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"5px\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar fleft\">\r\n");
      out.write("\t\t\t\t\t<div class=\"btn\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td class=\"page\"><iframe width=\"100%\" scrolling=\"auto\"\r\n");
      out.write("\t\t\t\t\theight=\"100%\" FRAMEBORDER=0 style=\"border: medium none;\"\r\n");
      out.write("\t\t\t\t\tsrc=\"/TrafficPolice/page/admin/page/Startpage.jsp\" id=\"rightMain\"\r\n");
      out.write("\t\t\t\t\tname=\"right\"></iframe>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\"><div id=\"footer\"></div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
