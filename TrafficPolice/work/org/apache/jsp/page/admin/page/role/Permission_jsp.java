package org.apache.jsp.page.admin.page.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Permission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"page/admin/css/kindeditor/default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"page/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("td {\r\n");
      out.write("\ttext-align: left\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/kindeditor-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/ajaxfileupload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery-html5Validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<!--树-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/page/js/tree/css/dhtmlxtree.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/page/js/window/dhtmlxcommon.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/page/js/tree/js/dhtmlxtree.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/page/js/tree/css/MenuSkins/dhtmlxmenu_dhx_blue.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/page/js/tree/js/dhtmlxmenu.js\"></script>\r\n");
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
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickmenu(topage){\r\n");
      out.write("\t\t $('iframe')[0].src = topage;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 10px\">\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"permissionform\">\r\n");
      out.write("\t\t<div class=\"pageTitle\"  align=\"left\">权限分配</div>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t\t\t<table bgcolor=\"white\" align=\"center\" width=\"30%\" >\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t    <td style=\"text-align: center\"><h1>角色名称:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.rolename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<input type=\"hidden\" name=\"roleno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.roleno }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></h1></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"permission_treeboxreagent_tree\" style=\"width:100%;display:block;height:450px;background-color:#f5f5f5;border:1px solid #999999;overflow: hidden;\" align=\"left\"></div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"提 交\" onClick=\"formsubmit()\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"Reset\"  value=\"清 空\" />\r\n");
      out.write("\t\t\t\t    <input name=\"text\" type=\"button\" value=\"返 回\" onClick=\"javascript:history.back();\"/>\r\n");
      out.write("\t\t\t\t    <input name=\"ids\"  type=\"hidden\" id=\"ids\" value=\"\" />\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var permission_tree = null;\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tpersission_filter('1','1');\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// 加载权限树\r\n");
      out.write("function persission_filter(page,perid) {\r\n");
      out.write("\t$('#permission_treeboxreagent_tree').html('');\r\n");
      out.write("\t$('#permission_treeboxreagent_tree').append(\"<div id=\\\"image\\\"><br/><br/><br/><br/><br/><img src=\\\"/TrafficPolice/page/images/wait.gif\\\"><br/><br/>正在载入，请稍后...</div>\");\r\n");
      out.write("\tpermission_tree = null;\r\n");
      out.write("\tpermission_tree = new dhtmlXTreeObject(\"permission_treeboxreagent_tree\",\"100%\",\"100%\",0);\r\n");
      out.write("\ttree = permission_tree;\r\n");
      out.write("\tpermission_tree.setImagePath(\"/TrafficPolice/page/images/base/tree/\");\r\n");
      out.write("\tpermission_tree.enableCheckBoxes(1);\r\n");
      out.write("\tpermission_tree.enableThreeStateCheckboxes(1);\r\n");
      out.write("\tpermission_tree.enableDragAndDrop(0);\r\n");
      out.write("\tpermission_tree.loadXML(\"page/admin/page/pertree.action\",function() {\r\n");
      out.write("\t\t$('#image').remove();\r\n");
      out.write("\t});\r\n");
      out.write("\ttree = permission_tree;\r\n");
      out.write("\tpermission_tree.setOnCheckHandler(permission_checkbox);//设置checkbox点击事件\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var  nids = \"\";\r\n");
      out.write("//树状－复选框点击事件\r\n");
      out.write("function permission_checkbox(nodeId){\r\n");
      out.write("\t//获取所有被选中节点id，不包括根节点\r\n");
      out.write("\tnids = permission_tree.getAllChecked();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("<!--批量选择-->\r\n");
      out.write("function formsubmit(){\r\n");
      out.write("\tvar ids = \"\";\r\n");
      out.write("\tif(nids == \"\"){\r\n");
      out.write("\t\talert(\"请选择您要操作的数据\");\r\n");
      out.write("\t\treturn ;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(nids.indexOf(\",\") <= 0 && nids != \"\"){  \r\n");
      out.write("    \tids = nids;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t//正则表达式替换全部，g表示全局\r\n");
      out.write("\t\tids = nids.replace(/,/g,\"#\");\r\n");
      out.write("\t}\r\n");
      out.write("\t$('input[name=perno]:checked:checked').each(function(){\r\n");
      out.write("\t\t\tids += $(this).val() + \"#\";\r\n");
      out.write("\t});\r\n");
      out.write("\t$('#ids').val(ids);\r\n");
      out.write("\t$('#permissionform').submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
