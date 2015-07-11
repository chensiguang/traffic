package org.apache.jsp.page.admin.page.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PermissionEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
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
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"permissioneditform\">\r\n");
      out.write("\t\t<div class=\"pageTitle\"  align=\"left\">权限分配</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table bgcolor=\"white\" align=\"center\" width=\"30%\" >\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t\t<td style=\"text-align: center\"><h1>角色名称:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.rolename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"roleno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.roleno }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</h1></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td><div id=\"permissionedit_treeboxreagent_tree\" style=\"width:100%;display:block;height:450px;background-color:#f5f5f5;border:1px solid #999999;overflow: hidden;\" align=\"left\"></div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"提 交\" onClick=\"formsubmit()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"Reset\"  value=\"清 空\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"text\" type=\"button\" value=\"返 回\" onClick=\"javascript:history.back();\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"ids\"  type=\"hidden\" id=\"ids\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var permission_tree = null;\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tpersission_filter('1','1');\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// 加载权限树\r\n");
      out.write("function persission_filter(page,perid) {\r\n");
      out.write("\t$('#permissionedit_treeboxreagent_tree').html('');\r\n");
      out.write("\t$('#permissionedit_treeboxreagent_tree').append(\"<div id=\\\"image\\\"><br/><br/><br/><br/><br/><img src=\\\"/TrafficPolice/page/images/wait.gif\\\"><br/><br/>正在载入，请稍后...</div>\");\r\n");
      out.write("\tpermission_tree = null;\r\n");
      out.write("\tpermission_tree = new dhtmlXTreeObject(\"permissionedit_treeboxreagent_tree\",\"100%\",\"100%\",0);\r\n");
      out.write("\ttree = permission_tree;\r\n");
      out.write("\tpermission_tree.setImagePath(\"/TrafficPolice/page/images/base/tree/\");\r\n");
      out.write("\tpermission_tree.enableCheckBoxes(1);\r\n");
      out.write("\tpermission_tree.enableThreeStateCheckboxes(1);\r\n");
      out.write("\tpermission_tree.enableDragAndDrop(0);\r\n");
      out.write("\tpermission_tree.loadXML(\"page/admin/page/pertree.action\",function() {\r\n");
      out.write("\t\t$('#image').remove();\r\n");
      out.write("\t\t//设置默认权限状态\r\n");
      out.write("\t\t$(\"input[name='perno']\").each(function() {\r\n");
      out.write("\t\t\tpermission_tree.setCheck($(this).val(),1);  //设置节点的选中状态\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\ttree = permission_tree;\r\n");
      out.write("\tpermission_tree.setOnCheckHandler(permission_checkbox);//设置checkbox点击事件\r\n");
      out.write("}\r\n");
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
      out.write("\t$('#permissioneditform').submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_s_005fiterator_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent(null);
    // /page/admin/page/role/PermissionEdit.jsp(76,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("rpList");
    // /page/admin/page/role/PermissionEdit.jsp(76,6) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setStatus("rp");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"perno\" value=\"");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /page/admin/page/role/PermissionEdit.jsp(77,49) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("perno");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }
}
