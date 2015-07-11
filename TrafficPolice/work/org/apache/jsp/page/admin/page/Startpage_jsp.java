package org.apache.jsp.page.admin.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Startpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    String path = request.getContextPath();
    String basePath = request.getScheme() 
			+ "://" 
			+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
			+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
			+ path
			+ "/";
            
    Object u = request.getSession().getAttribute("onlineuser");
	
	if(u == null) {
		response.sendRedirect(basePath + "admin/Login.jsp");
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Expires\" CONTENT=\"0\">  \r\n");
      out.write("<meta http-equiv=\"Cache-Control\" CONTENT=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"Pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"/TrafficPolice/page/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function check(imageid){\r\n");
      out.write("\tvar file = document.getElementById(imageid);\r\n");
      out.write("\tif(file.value == ''){\r\n");
      out.write("\t\talert('请选择文件，然后在上传！');\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function checkmail(mailid){\r\n");
      out.write("\tvar file = document.getElementById(mailid);\r\n");
      out.write("\tif(file.value == ''){\r\n");
      out.write("\t\talert('请填写邮箱地址！');\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"contentWrap\">\r\n");
      out.write("\t\t<div class=\"pageTitle\" style=\"background-color:#D2E9F4\">首页-机动车网上交通安全宣传教育监管平台</div>\r\n");
      out.write("\t\t<!--<div class=\"pageButton\"></div>-->\r\n");
      out.write("\t\t<div style=\"margin-top:12px; margin-right:6px\" ></div>\r\n");
      out.write("\t\t<div style=\"background-color:#D2E9F4;height:570px; margin-right:6px\">\r\n");
      out.write("\t\t\t<table bgcolor=\"#D2E9F4\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"30px\"></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"30px\"></td>\r\n");
      out.write("\t\t\t\t\t<td height=\"145px\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t<!--<div style=\"float:left;\" id=\"startpage_ad1_img_div\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"style/index1.jpg\" id=\"startpage_ad1_img\" style=\"width:980px; height:500px;\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"float:left;text-indent:10px;\" id=\"startpage_ad1_text_div\" title=\"长：980 X 宽：129\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"30px\"></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<!--<table style=\"margin-top:40px;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t</table>-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write("//图片上传预览 兼容ie ff\r\n");
      out.write("function startpage_getFullPath(obj,imgobj) {\r\n");
      out.write("\tvar newPreview = imgobj;\r\n");
      out.write("\tif (obj && obj.value != '') {\r\n");
      out.write("\t\t//ie\r\n");
      out.write("\t\tif (window.navigator.userAgent.indexOf(\"MSIE\") >= 1) {\r\n");
      out.write("\t\t\tobj.select();\r\n");
      out.write("\t\t\tnewPreview.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale);\";\r\n");
      out.write("\t\t\tnewPreview.filters.item(\"DXImageTransform.Microsoft.AlphaImageLoader\").src = document.selection.createRange().text;\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t//firefox\r\n");
      out.write("\t\t}else if (window.navigator.userAgent.indexOf(\"Firefox\") >= 1) {\r\n");
      out.write("\t\t\tif (obj.files) {\r\n");
      out.write("\t\t\t\tnewPreview.src = window.URL.createObjectURL(obj.files.item(0));\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tnewPreview.src = obj.value;\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tnewPreview.src = obj.value;\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//图片上传预览 兼容ie ff google\r\n");
      out.write("function startpage_previewImage(ywidth,yheight,imgdivid,imgid,file,textid)\r\n");
      out.write("{\r\n");
      out.write("  var MAXWIDTH  = ywidth;\r\n");
      out.write("  var MAXHEIGHT = yheight;\r\n");
      out.write("  var div = document.getElementById(imgdivid);\r\n");
      out.write("  if (file.files && file.files[0])\r\n");
      out.write("  {\r\n");
      out.write("      //div.innerHTML = '<img id=\"'+imgid+'\">';\r\n");
      out.write("      var img = document.getElementById(imgid);\r\n");
      out.write("      img.onload = function(){\r\n");
      out.write("        var rect = startpage_clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);\r\n");
      out.write("        img.width = rect.width;\r\n");
      out.write("        img.height = rect.height;\r\n");
      out.write("        img.style.marginLeft = rect.left+'px';\r\n");
      out.write("        img.style.marginTop = rect.top+'px';\r\n");
      out.write("      }\r\n");
      out.write("      var reader = new FileReader();\r\n");
      out.write("      reader.onload = function(evt){img.src = evt.target.result;}\r\n");
      out.write("      reader.readAsDataURL(file.files[0]);\r\n");
      out.write("  }\r\n");
      out.write("  else\r\n");
      out.write("  {\r\n");
      out.write("    var sFilter='filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\"';\r\n");
      out.write("    file.select();\r\n");
      out.write("    var src = document.selection.createRange().text;\r\n");
      out.write("    //div.innerHTML = '<img id=\"'+imgid+'\">';\r\n");
      out.write("    var img = document.getElementById(imgid);\r\n");
      out.write("    img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;\r\n");
      out.write("    var rect = startpage_clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);\r\n");
      out.write("    status =('rect:'+rect.top+','+rect.left+','+rect.width+','+rect.height);\r\n");
      out.write("    div.innerHTML = \"<div id='\"+imgid+\"' style='width:\"+rect.width+\"px;height:\"+rect.height+\"px;margin-top:\"+rect.top+\"px;margin-left:\"+rect.left+\"px;\"+sFilter+src+\"\\\"'></div>\";\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 计算图片大小\r\n");
      out.write("function startpage_clacImgZoomParam( maxWidth, maxHeight, width, height ){\r\n");
      out.write("    var param = {top:0, left:0, width:width, height:height};\r\n");
      out.write("    if( width>maxWidth || height>maxHeight )\r\n");
      out.write("    {\r\n");
      out.write("        rateWidth = width / maxWidth;\r\n");
      out.write("        rateHeight = height / maxHeight;\r\n");
      out.write("        \r\n");
      out.write("        if( rateWidth > rateHeight )\r\n");
      out.write("        {\r\n");
      out.write("            param.width =  maxWidth;\r\n");
      out.write("            param.height = Math.round(height / rateWidth);\r\n");
      out.write("        }else\r\n");
      out.write("        {\r\n");
      out.write("            param.width = Math.round(width / rateHeight);\r\n");
      out.write("            param.height = maxHeight;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    param.left = Math.round((maxWidth - param.width) / 2);\r\n");
      out.write("    param.top = Math.round((maxHeight - param.height) / 2);\r\n");
      out.write("    return param;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
