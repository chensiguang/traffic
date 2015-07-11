package org.apache.jsp.page.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

    String message = (String)session.getAttribute("message");
     
     String str = "";
     
     if(message == null)
     {
    	 str = "";
     }
     else
     {
    	 str = message;
     }


	String path = request.getContextPath();

    String basePath = request.getScheme() 
					+ "://" 
					+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
					+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
					+ path
					+ "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>机动车网上交通安全宣传教育后台管理</title>\r\n");
      out.write("<link href=\"/TrafficPolice/page/admin/css/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/TrafficPolice/page/admin/javascript/jquery.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t<div id=\"header\"></div>\r\n");
      out.write("\t\t<div id=\"content-wrap\">\r\n");
      out.write("\t\t\t<div class=\"space\" align=\"center\" ><!--<font style=\"font-size:20px\"><h1>机动车网上交通安全宣传教育后台管理</h1></font>--></div>\r\n");
      out.write("\t\t\t<form action=\"login.action\" method=\"post\" onSubmit=\"return checkInput();\">\r\n");
      out.write("\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t<label>账 户：</label><input id=\"username\" class=\"username\" name=\"loginname\" type=\"text\" onblur=\"clear()\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t<label>密 码：</label><input id=\"pwd\" class=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"password\" type=\"password\" /><br /><br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color=\"red\">");
      out.print(str );
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"msg\" class=\"field\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"btn\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"login-btn\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkInput() {\r\n");
      out.write("\t\tvar n = document.getElementById(\"username\");\r\n");
      out.write("\t\tvar p = document.getElementById(\"pwd\");\r\n");
      out.write("\t\tif (\"\" == n.value) {\r\n");
      out.write("            document.getElementById(\"msg\").innerHTML = \"用户名不能为空\";\r\n");
      out.write("            return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (\"\" == p.value) {\r\n");
      out.write("            document.getElementById(\"msg\").innerHTML = \"密码不能为空\";\r\n");
      out.write("            return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clear()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$(\"#message\").html();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
