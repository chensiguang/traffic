<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
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
</head>

<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form name="area_edit_form" id="area_edit_form" action="${action}" method="post">
			<table cellpadding="0" cellspacing="0">
				<tr style="height: 45px">
					<td>地域名称:</td>
					<td>
						<input id="areaname" type="text" style="width: 200px; height: 22px;" name="dom.areaname" value="${dom.areaname}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				<tr style="height: 45px">
					<td>邮政编码:</td>
					<td>
						<input type="text" style="width: 100px; height: 22px;" name="dom.mailcode" value="${dom.mailcode}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>区号:</td>
					<td>
						<input type="text" style="width: 100px; height: 22px;" name="dom.callcode" value="${dom.callcode}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>描述:</td>
					<td>
						<input type="text" style="width: 100px; height: 22px;" name="dom.description" value="${dom.description}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">备注:</td>
					<td>
						<textarea style="width: 400px; height: 60px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr>
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2" valign="middle">
						<input type="submit" value="提 交" />
						<input type="reset"  value="清 空" />
						<input type="button" value="返 回" name="text" onClick="parent.hidePopWin(true);"/>
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

//提交
$(function(){
	$("#area_edit_form").html5Validate(function(){
		this.submit();
		parent.hidePopWin(true);
	},{
	});
});
</script>