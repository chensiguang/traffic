package org.apache.jsp.page.admin.page.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConfigEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

     String basePath = (String)session.getAttribute("basePath");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"page/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"page/admin/css/kindeditor/default.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("td {\r\n");
      out.write("\ttext-align: left\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/kindeditor-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 10px\">\r\n");
      out.write("\t<div id=\"contentWrap\" align=\"center\">\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t   <div class=\"pageTitle\"  align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"5\" width=\"800px\">\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>网站名称:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.siteName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.siteName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>网页关键字:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.keywords\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.keywords}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>网站描述:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.pdescription\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.pdescription}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>公司地址:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>邮编:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>总机:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.telephone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>销售电话:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.telephoneSale\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.telephoneSale}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>客服电话:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.telephoneService\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.telephoneService}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>传真:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.fax\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.fax}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>电子邮件:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>主页:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.homePage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.homePage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>QQ1:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.qq1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.qq1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>QQ2:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.qq2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.qq2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>msn1:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.msn1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.msn1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>msn2:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.msn2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.msn2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"height: 50px; text-align: center\" colspan=\"2\"\r\n");
      out.write("\t\t\t\t\t\tvalign=\"middle\"><input type=\"submit\" value=\"提 交\" /> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"Reset\" value=\"清 空\" />\r\n");
      out.write("\t\t\t\t\t\t<input name=\"text\" type=\"button\" value=\"返 回\" onClick=\"javascript:history.back();\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
