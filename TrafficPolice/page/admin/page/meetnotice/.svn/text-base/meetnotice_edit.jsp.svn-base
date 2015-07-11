<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String basePath = (String)session.getAttribute("basePath");
	String repeat = request.getParameter("repeat");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="page/admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="page/admin/css/kindeditor/default.css" rel="stylesheet" type="text/css" />
<style type="text/css">td {text-align: left}</style>
<script type="text/javascript" src="page/admin/javascript/jquery.min.js"></script>
<script type="text/javascript" src="page/admin/javascript/kindeditor-min.js"></script>
<script type="text/javascript" src="page/admin/javascript/zh_CN.js"></script>
<script type="text/javascript" src="page/admin/javascript/ajaxfileupload.js"></script>
<script type="text/javascript" src="page/admin/javascript/jquery-html5Validate.js"></script>
<link rel="stylesheet" href="../kindeditor/themes/default/default.css" />
<script language="JavaScript" type="text/JavaScript" src="js/mland/ajaxfileupload.js"></script>
</head>

<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form name="meetnotice_edit_form" id="meetnotice_edit_form" action="${action}" method="post">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				<tr style="height: 45px">
					<td>信息标题:</td>
					<td>
						<input type="text" style="width:400px;height:22px;" name="dom.noticeTitle" value="${dom.noticeTitle}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">通知内容:</td>
					<td>
						<input type="hidden" name="content" id="content" value=""/>
						<textarea style="width:600px;height:300px;visibility:hidden;" id="editcontent" name="dom.noticeContent" required="true">${dom.noticeContent}</textarea>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>链接地址:</td>
					<td>
						<input style="width:400px;height:22px;" type="text" name="dom.noticeContentUrl" value="${dom.noticeContentUrl}"/>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">备注:</td>
					<td>
						<textarea style="width:400px;height:60px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr>
				
				<tr>
					<td style="height:50px;text-align:center" colspan="2" valign="middle">
						<input type="submit" value="提 交" />
						<input type="reset"  value="清 空" />
						<input type="button" value="返 回" name="text" onClick="javascript:history.back();"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
<script language="javascript">
//获取录入的信息
var repeat = '<%=repeat%>';
if(repeat != "" && repeat != "null"){
	history.back();
}
//复文本
$(function() {
	var editor = KindEditor.create('#editcontent', {
		filterMode : false,
		width : 700,
		height : 300,
		resizeType : 0,
		items : [ 'source', '|', 'undo', 'redo', '|', 'preview',
				'cut', 'copy', 'paste', 'plainpaste', 'wordpaste', '|',
				'justifyleft', 'justifycenter', 'justifyright',
				'justifyfull', 'insertorderedlist', 'insertunorderedlist',
				'indent', 'outdent', 'subscript', 'superscript',
				'quickformat', 'selectall', '|', 'fullscreen', '/',
				'formatblock', 'fontname', 'fontsize', '|', 'forecolor',
				'hilitecolor', 'bold', 'italic', 'underline',
				'strikethrough', 'lineheight', 'removeformat', '|',
				'image', 'insertfile',
				'table', 'hr', 'emoticons', 'pagebreak', 'link', 'unlink',
				'|' ]
	});
});

//提交
$(function(){
	$("#meetnotice_edit_form").html5Validate(function(){
		this.submit();
	},{
	});
});
</script>