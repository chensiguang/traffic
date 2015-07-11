package org.apache.jsp.page.admin.page.edu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.web.pojo.*;
import java.util.*;
import java.lang.*;

public final class EduEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
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
      out.write("<link href=\"page/admin/css/kindeditor/default.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("td {\r\n");
      out.write("\ttext-align: left\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/videouploadjs/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/videouploadjs/kindeditor-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/videouploadjs/zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"page/admin/videouploadjs/ajaxfileupload.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 10px\">\r\n");
      out.write("\t<div id=\"contentWrap\" align=\"center\">\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"eduform\"> \r\n");
      out.write("\t\t<div class=\"pageTitle\"  align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"5\" width=\"800px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>视频标题:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"videoTitle\" type=\"text\" style=\"width: 400px; height: 22px;\" name=\"dom.videoTitle\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.videoTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" required=\"true\"/>&nbsp;<font color=\"#FF0000\">*</font>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\">视频简介:</td>\r\n");
      out.write("\t\t\t\t\t<td><textarea style=\"width: 400px; height: 80px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.content\" maxlength=\"200\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>上传文件:</td>\r\n");
      out.write("\t\t\t\t\t<td><div class=\"upload\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" id=\"uploadId\" name=\"upload\" style=\"height:22px;\" onChange=\"$('#fileName').val(this.value)\" ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.fileName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/><em>*</em>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.fileName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"fileName\" name=\"dom.fileName\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"上传\" onClick=\"file_Upload();\"/>&nbsp;大小不超过1G\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>视频存放路径:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.videoUrl\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.videoUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  maxlength=\"100\" id=\"fileURL\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td>截图存放路径:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" style=\"width: 400px; height: 22px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.img\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.img}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  maxlength=\"100\" id=\"picURL\"  readonly/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height: 45px\">\r\n");
      out.write("\t\t\t\t\t<td valign=\"top\">备注:</td>\r\n");
      out.write("\t\t\t\t\t<td><textarea style=\"width: 400px; height: 80px;\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dom.remark\" maxlength=\"100\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dom.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>不超过100字</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"height: 50px; text-align: center\" colspan=\"2\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"提 交\"/> \r\n");
      out.write("\t\t\t\t\t<input type=\"Reset\" value=\"清 空\" />\r\n");
      out.write("\t\t\t\t\t<input name=\"text\" type=\"button\" value=\"返 回\" onClick=\"javascript:history.back();\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//获取录入的信息\r\n");
      out.write("var repeat = '");
      out.print(repeat);
      out.write("';\r\n");
      out.write("if(repeat != \"\" && repeat != \"null\"){\r\n");
      out.write("\thistory.back();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function file_Upload(){\r\n");
      out.write("\tif($(\"#uploadId\").val()==\"\"){\r\n");
      out.write("\t\t\talert(\"请选择文件!\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$.ajaxFileUpload(\r\n");
      out.write("            {\r\n");
      out.write("                url:'fileUpload.action',//用于文件上传的服务器端请求地址\r\n");
      out.write("                secureuri:false,//一般设置为false\r\n");
      out.write("\t\t\t\tdataType:'json',\r\n");
      out.write("                fileElementId:'uploadId',//文件上传空间的id属\r\n");
      out.write("                success: function(data,status)  //服务器成功响应处理函数\r\n");
      out.write("                {\r\n");
      out.write("\t\t\t\t\tobj = eval(\"(\"+ data+\")\");\r\n");
      out.write("\t\t\t\t\t$('#fileURL').val(obj.url);\r\n");
      out.write("\t\t\t\t\t$('#picURL').val(obj.mediaPicPath);\r\n");
      out.write("\t\t\t\t\t$('#fileType').val(obj.fileExt);\r\n");
      out.write("\t\t\t\t\talert(obj.message);\r\n");
      out.write("                },\r\n");
      out.write("\t\t\t\terror: function(data,status,e){\r\n");
      out.write("\t\t\t\t\talert(\"上传失败\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("            }\r\n");
      out.write("        );\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /page/admin/page/edu/EduEdit.jsp(52,116) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("dom == null");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("required=\"true\"");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }
}
