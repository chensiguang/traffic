package org.apache.jsp.page.admin.page.branch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.web.pojo.*;
import java.util.*;
import java.lang.*;

public final class BranchEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/ajaxfileupload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery-html5Validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 10px\">\r\n");
      out.write("\t<div id=\"contentWrap\" align=\"center\">\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"branchform\" onsubmit=\"addcheck()\">\r\n");
      out.write("\t\t<div class=\"pageTitle\"  align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"5\" width=\"800px\">\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>名称:</td>\r\n");
      out.write("\t\t\t\t\t<td><input id=\"branchname\" type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.branchName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.branchName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" maxlength=\"100\" required=\"true\"/>&nbsp;<font color=\"#FF0000\">*</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>地址:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input style=\"width: 400px; height: 22px;\" type=\"text\" name=\"dom.branchAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.branchAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" required=\"true\"/>&nbsp;<font color=\"#FF0000\">*</font>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr >\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t   <tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>电话:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input style=\"width: 400px; height: 22px;\" type=\"text\" name=\"dom.branchPhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.branchPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td >经度:</td>\r\n");
      out.write("\t\t\t\t\t<td><input style=\"width: 400px; height: 22px;\" name=\"dom.lng\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.lng}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td >纬度:</td>\r\n");
      out.write("\t\t\t\t\t<td><input style=\"width: 400px; height: 22px;\" name=\"dom.lat\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.lat}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\">备注:</td>\r\n");
      out.write("\t\t\t\t\t<td><textarea style=\"width: 400px; height: 60px;\" name=\"dom.remark\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"height: 50px; text-align: center\" colspan=\"2\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"提 交\" onclick=\"addcheck()\"/> \r\n");
      out.write("\t\t\t\t\t<input type=\"Reset\" value=\"清 空\" />\r\n");
      out.write("\t\t\t\t\t<input name=\"text\" type=\"button\" value=\"返 回\" onClick=\"javascript:history.back();\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\teditor = KindEditor.create('#editcontent', {\r\n");
      out.write("\t\t\tfilterMode : false,\r\n");
      out.write("\t\t\twidth : 700,\r\n");
      out.write("\t\t\theight : 300,\r\n");
      out.write("\t\t\tresizeType : 0,\r\n");
      out.write("\t\t\titems : [ 'source', '|', 'undo', 'redo', '|', 'preview',\r\n");
      out.write("\t\t\t\t\t'cut', 'copy', 'paste', 'plainpaste', 'wordpaste', '|',\r\n");
      out.write("\t\t\t\t\t'justifyleft', 'justifycenter', 'justifyright',\r\n");
      out.write("\t\t\t\t\t'justifyfull', 'insertorderedlist', 'insertunorderedlist',\r\n");
      out.write("\t\t\t\t\t'indent', 'outdent', 'subscript', 'superscript',\r\n");
      out.write("\t\t\t\t\t'quickformat', 'selectall', '|', 'fullscreen', '/',\r\n");
      out.write("\t\t\t\t\t'formatblock', 'fontname', 'fontsize', '|', 'forecolor',\r\n");
      out.write("\t\t\t\t\t'hilitecolor', 'bold', 'italic', 'underline',\r\n");
      out.write("\t\t\t\t\t'strikethrough', 'lineheight', 'removeformat', '|',\r\n");
      out.write("\t\t\t\t\t'image', 'insertfile',\r\n");
      out.write("\t\t\t\t\t'table', 'hr', 'emoticons', 'pagebreak', 'link', 'unlink',\r\n");
      out.write("\t\t\t\t\t'|' ]\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tKindEditor.ready(function(K) {\r\n");
      out.write("\t\tvar editor = K.editor({\r\n");
      out.write("\t\t\tallowFileManager : false,\r\n");
      out.write("\t\t\tallowUpload : true,\r\n");
      out.write("\t\t    uploadJson : 'uploadEditImage.action'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tK('#image2').click(function() {\r\n");
      out.write("\t\t\teditor.loadPlugin('image', function() {\r\n");
      out.write("\t\t\t\teditor.plugin.imageDialog({\r\n");
      out.write("\t\t\t\t\tshowRemote : false,\r\n");
      out.write("\t\t\t\t\timageUrl : K('#url2').val(),\r\n");
      out.write("\t\t\t\t\tclickFn : function(url, title, width, height, border, align) {\r\n");
      out.write("\t\t\t\t\t\tK('#url2').val(url);\r\n");
      out.write("\t\t\t\t\t\tK('#urlimage').attr(\"src\", url);\r\n");
      out.write("\t\t\t\t\t\tK('#imgPath').val(url);\r\n");
      out.write("\t\t\t\t\t\teditor.hideDialog();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t$(\"#branchform\").html5Validate(function(){\r\n");
      out.write("\t\t\t\t\tthis.submit();\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("                function addcheck()\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tvar login = $(\"#branchname\").val().trim();\r\n");
      out.write("\t\t\t\t\t");

					   List<Branch> list = (List<Branch>)session.getAttribute("branchList");
					
						for(int i = 0; i < list.size(); i++)
						{
							String branchname = list.get(i).getBranchName().trim();
					
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\tif(login == \"");
      out.print(branchname );
      out.write("\")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(\"该快速处理点已经存在\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#branchform\").submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\r\n");
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
