package org.apache.jsp.page.admin.page.policeorg;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class policeorg_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
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
			+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
			+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
			+ path
			+ "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"page/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/javascript/jquery.js\"></script>\r\n");
      out.write("<!--模态窗口-->\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/page/css/subModal.css\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/page/js/mland/common.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/page/js/mland/subModal.js\"></script>\t\r\n");
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
      out.write("\r\n");
      out.write("</head>\t\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"policeorg_list_form\" name=\"policeorg_list_form\" action=\"\">\r\n");
      out.write("\t<div id=\"contentWrap\">\r\n");
      out.write("\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"5\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\" width=\"18%\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_title\" style=\"width:100%;display:block;border-top:1px solid #9bd3ef;border-left:1px solid #9bd3ef;border-right:1px solid #9bd3ef;overflow:auto; background:repeat-x #9bd3ef; height:27px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"margin-top:5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"70%\" align=\"left\" style=\"color:#075587;font-weight:bold;\"><img src=\"page/images/base/img02.png\" style=\"margin-left:15px;\"/>&nbsp;&nbsp;机构列表</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"right\"><img src=\"page/admin/images/max.gif\" width=\"14\" height=\"14\" border=\"0\" align=\"absmiddle\" style=\" cursor:pointer\" title=\"查看所有\" onClick=\"policeorg_list_initmenu(1,1);\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"right\" valign=\"middle\"><img src=\"page/admin/images/add.png\" width=\"14\" height=\"14\"  border=\"0\" align=\"absmiddle\" style=\"cursor:pointer\" title=\"新增机构\" onClick=\"policeorg_list_provicenodeadd(1);\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"policeorg_treeboxreagent_tree\" style=\"width:100%;display:block; height:740px;background-color:#f5f5f5;overflow:hidden; position:relative; border-bottom:1px solid #9bd3ef;border-left:1px solid #9bd3ef;border-right:1px solid #9bd3ef; z-index:100;\" align=\"left\"></div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\" width=\"72%\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"policeorg_list_reagentHouse\" class=\"policeorg_list_tabsheader\" style=\"list-style-type:none;\"></ul>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"policeorg_list_tabsheader\" style=\"list-style-type:none;\"></ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"policeorg_list_right_part\" style=\"height:auto;display:block\"></div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</form>\t\r\n");
      out.write("</body>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("var policeorg_list_tree = null;\r\n");
      out.write("var policeorg_list_menu = null;\r\n");
      out.write("policeorg_list_initmenu(1,1);\r\n");
      out.write("\r\n");
      out.write("// 右击菜单初始化\r\n");
      out.write("function policeorg_list_initmenu(page,perid){\r\n");
      out.write("\tpoliceorg_list_menu=new dhtmlXMenuObject(\"policeorg_treeboxreagent_tree\");\r\n");
      out.write("\tpoliceorg_list_menu.setImagePath(\"images/base/tree/\");\r\n");
      out.write("\tpoliceorg_list_menu.setIconsPath(\"images/base/tree/\");\r\n");
      out.write("\tpoliceorg_list_menu.renderAsContextMenu(true);\r\n");
      out.write("\tpoliceorg_list_menu.loadXML(\"page/admin/page/policeorg/righthander/policeorg_rigth.xml\"); \r\n");
      out.write("\tpoliceorg_list_menu.attachEvent(\"onClick\",policeorg_list_handle);\r\n");
      out.write("\tpoliceorg_list_filter(page,perid);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 产生树状结构\r\n");
      out.write("function policeorg_list_filter(page,perid){\r\n");
      out.write("\t$('#policeorg_treeboxreagent_tree').html('');\r\n");
      out.write("\t$('#policeorg_treeboxreagent_tree').append(\"<div id=\\\"image\\\"><br/><br/><br/><br/><br/><img src=\\\"/TrafficPolice/page/images/wait.gif\\\"><br/><br/>正在载入，请稍后...</div>\");\r\n");
      out.write("\tpoliceorg_list_tree = null;\r\n");
      out.write("\tpoliceorg_list_tree = new dhtmlXTreeObject(\"policeorg_treeboxreagent_tree\",\"100%\",\"100%\",0);\r\n");
      out.write("\ttree = policeorg_list_tree;\r\n");
      out.write("\tpoliceorg_list_tree.setImagePath(\"/TrafficPolice/page/images/base/tree/\");\r\n");
      out.write("\tpoliceorg_list_tree.enableDragAndDrop(0);\r\n");
      out.write("\tpoliceorg_list_tree.enableContextMenu(policeorg_list_menu);\r\n");
      out.write("\tpoliceorg_list_tree.loadXML(\"page/admin/page/orgtree.action\",\r\n");
      out.write("\tfunction() {\r\n");
      out.write("\t\t$('#image').remove();\r\n");
      out.write("\t\tpoliceorg_list_tree.closeAllItems(100);\r\n");
      out.write("\t\t//policeorg_list_tree.openItem(100);\r\n");
      out.write("\t\tpoliceorg_list_loadson(perid);\r\n");
      out.write("\t\t//project_public_bodyScrollbyobject($(\"#policeorg_treeboxreagent_tree\").children().eq(0)); // 浏览器滚动条控制内部 树状菜单内容滚动\r\n");
      out.write("\t});\r\n");
      out.write("\ttree = policeorg_list_tree;\r\n");
      out.write("\tpoliceorg_list_tree.setOnClickHandler(policeorg_list_nodeselect); // 装载点击触发\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 左击点击执行\r\n");
      out.write("function policeorg_list_nodeselect(nodeId){\r\n");
      out.write("\tif(nodeId !=null && nodeId !=''){\r\n");
      out.write("\t\tpoliceorg_list_loadson(nodeId);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 右击菜单执行\r\n");
      out.write("function policeorg_list_handle(menuid,zoom){\r\n");
      out.write("\tvar id = policeorg_list_tree.rclk_id;\r\n");
      out.write("\tvar name = policeorg_list_tree.getItemText(id);\r\n");
      out.write("\tif(menuid == \"edit\"){\r\n");
      out.write("\t\tremoveAll('policeorg_list_right_part');\r\n");
      out.write("\t\tvar url = \"");
      out.print(basePath);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${opt.editAction}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?id=\"+id;\r\n");
      out.write("\t\tvar obj = {\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdoLoadingHtmlpost(url,obj,'#policeorg_list_reagentHouse',null,null);\r\n");
      out.write("\t}else if(menuid == \"insert\"){\r\n");
      out.write("\t\tpoliceorg_list_provicenodeadd(id);\r\n");
      out.write("\t}else if(menuid == \"delete\"){\r\n");
      out.write("\t\tif(confirm(\"您确定删除该条数据？\")){\r\n");
      out.write("\t\t\tvar action = '");
      out.print(basePath);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${opt.deleteAction}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\taction += \"?id=\" + id;\r\n");
      out.write("\t\t\tlocation.href = action;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 产生父类下的子类\r\n");
      out.write("function policeorg_list_loadson(areapid){\r\n");
      out.write("\tremoveAll('policeorg_list_reagentHouse');\r\n");
      out.write("\tvar url = \"page/admin/page/policeorgback_viewPoliceOrgSoList.action\";\r\n");
      out.write("\tvar obj = {\r\n");
      out.write("\t\t'currentpage':1,\r\n");
      out.write("\t\t'parentid':areapid\r\n");
      out.write("\t}\r\n");
      out.write("\tdoLoadingHtmlpost(url,obj,'#policeorg_list_right_part',null,null);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//新增\r\n");
      out.write("function policeorg_list_provicenodeadd(id){\r\n");
      out.write("\tremoveAll('policeorg_list_right_part');\r\n");
      out.write("\tvar url = \"");
      out.print(basePath);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${opt.addAction}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?pid=\"+id;\r\n");
      out.write("\tvar obj = {\r\n");
      out.write("\t}\r\n");
      out.write("\tdoLoadingHtmlpost(url,obj,'#policeorg_list_reagentHouse',null,null);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//关闭所有div\r\n");
      out.write("function removeAll(titleHouse){\r\n");
      out.write("\t$(\"#\"+titleHouse).hide();\r\n");
      out.write("}\r\n");
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
}
