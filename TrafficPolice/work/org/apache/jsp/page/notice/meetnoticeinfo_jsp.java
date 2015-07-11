package org.apache.jsp.page.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class meetnoticeinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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

	String path = request.getContextPath();
	String basePath = request.getScheme()
			+ "://"
			+ ("xsaqjy".equals(request.getServerName())
					? "xsaqjy.ljgps.net"
					: request.getServerName())
			+ (request.getServerPort() == 80 ? "" : ":"
					+ request.getServerPort()) + path + "/";
	String id = request.getParameter("id");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>机动车网上交通安全宣传教育监管平台</title>\r\n");
      out.write("<link href=\"page/css/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/js/jquery.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"page/js/pagination/pagination.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"page/js/pagination/jquery.pagination.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/js/autoscreen.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/js/index.js\"></script>\r\n");
      out.write("<!-- the mousewheel plugin -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"page/js/jScroll/jquery.mousewheel.js\"></script>\r\n");
      out.write("<!-- the jScrollPane script -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"page/js/jScroll/jquery.jscrollpane.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"page/js/jScroll/scroll-startstop.events.jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/js/util.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form>\r\n");
      out.write("\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t<span id=\"contenthtml\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("loadRuleContent(");
      out.print(id);
      out.write(");\r\n");
      out.write("//右边页面显示栏\r\n");
      out.write("function loadRuleContent(id)\r\n");
      out.write("{\r\n");
      out.write("\tvar newcontent ='';\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype       :'post',\t\t\t\t\t\t\t\t\t//可选get\r\n");
      out.write("\t\turl        :'getMeetNoticeDatainfo.action',\t\t\t//这里是接收数据的PHP程序\r\n");
      out.write("\t\tdata       :'noticeid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接\r\n");
      out.write("\t\tdataType   :'Json',\t\t\t\t\t\t\t\t\t//服务器返回的数据类型 可选XML ,Json jsonp script html text等\r\n");
      out.write("\t\tcontentType:\"application/x-www-form-urlencoded; charset=utf-8\", \r\n");
      out.write("\t\tsuccess    :function(data){\r\n");
      out.write("\t\t//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！\r\n");
      out.write("\t\t\tvar re =eval('('+elformat(data)+')');\r\n");
      out.write("\t\t\tnewcontent +='<p style=\"text-align:center;font:14px;\"><strong>'+re.noticeTitle+'</strong></p>';\r\n");
      out.write("\t\t\tnewcontent +='<p style=\"text-align:center;\">时间: '+re.noticeTime+'</p>';\r\n");
      out.write("\t\t\tnewcontent +='<p>'+(re.noticeContent == 'null' ? \"暂无详细内容\":re.noticeContent)+'</p>';\r\n");
      out.write("\t\t\t$('#contenthtml').html(newcontent);\r\n");
      out.write("\t\t\tautoscroll();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror:function(){\r\n");
      out.write("\t\t\talert('error');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
