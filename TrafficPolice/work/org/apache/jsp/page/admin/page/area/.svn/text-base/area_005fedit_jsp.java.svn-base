package org.apache.jsp.page.admin.page.area;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.web.pojo.*;
import java.util.*;
import java.lang.*;

public final class area_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String basePath = (String)session.getAttribute("basePath");
	String orgid  = request.getParameter("orgid");
	String repeat = request.getParameter("repeat");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"page/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"page/admin/css/kindeditor/default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">td {text-align: left}</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/kindeditor-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/ajaxfileupload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery-html5Validate.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"padding-top: 10px\">\r\n");
      out.write("\t<div id=\"contentWrap\" align=\"center\">\r\n");
      out.write("\t\t<form name=\"company_edit_form\" id=\"company_edit_form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"pageTitle\"  align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"5\" width=\"800px\">\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>地域名称:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"areaname\" type=\"text\" style=\"width: 200px; height: 22px;\" name=\"dom.areaname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.areaname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" required=\"true\"/>&nbsp;<em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>邮政编号:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" style=\"width: 100px; height: 22px;\" name=\"dom.phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" required=\"true\"/>&nbsp;<em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>区号:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"tel\" style=\"width: 100px; height: 22px;\" name=\"dom.mobile\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" required=\"true\"/>&nbsp;<em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>描述:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"tel\" style=\"width: 100px; height: 22px;\" name=\"dom.mobile\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" required=\"true\"/>&nbsp;<em>*</em>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\">备注:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<textarea style=\"width: 400px; height: 60px;\" name=\"dom.remark\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"height: 50px; text-align: center\" colspan=\"2\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"提 交\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"清 空\" onClick=\"resetfunction();\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"返 回\" name=\"text\" onClick=\"javascript:history.back();\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("//获取录入的信息\r\n");
      out.write("var repeat = '");
      out.print(repeat);
      out.write("';\r\n");
      out.write("if(repeat != \"\" && repeat != \"null\"){\r\n");
      out.write("\thistory.back();\r\n");
      out.write("}\r\n");
      out.write("/*\r\n");
      out.write("* 等\"所属单位\"遍历完，再执行该函数\r\n");
      out.write("* 否则会出现null现象\r\n");
      out.write("*/\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t//根据传过来的值选中对应的下拉框值\r\n");
      out.write("\tvar company_edit_orgidValue = \"");
      out.print(orgid);
      out.write("\";\r\n");
      out.write("\tvar company_edit_orgid = document.getElementById(\"orgid\");\r\n");
      out.write("\tfor(var i=0;i<company_edit_orgid.options.length;i++){\r\n");
      out.write("\t\tif(company_edit_orgid.options[i].value == company_edit_orgidValue){\r\n");
      out.write("\t\t\tcompany_edit_orgid.options[i].selected = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//重置时，取得下拉框原来的值\r\n");
      out.write("function resetfunction()\r\n");
      out.write("{\r\n");
      out.write("\t$('#company_edit_form')[0].reset();\r\n");
      out.write("\t$('#orgid').val(\"");
      out.print(orgid);
      out.write("\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//提交\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#company_edit_form\").html5Validate(function(){\r\n");
      out.write("\t\tthis.submit();\r\n");
      out.write("\t},{\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>");
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
