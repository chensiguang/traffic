<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page import="com.web.pojo.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
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
		<form action="${action}" method="post" id="roleform">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				<tr style="height: 45px">
					<td>角色名称:</td>
					<td><input id="rolename" type="text" style="width: 400px; height: 22px;"
						name="dom.rolename" value="${dom.rolename}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>

				<tr style="height: 45px">
					<td>单位:</td>
					<td>
					     <input type="radio" id="dwtype" name="dom.dwtype" value="0" <s:if test='dom.dwtype==0'>checked="checked"</s:if> />交警部门&nbsp;&nbsp;
					     <input type="radio" id="dwtype" name="dom.dwtype" value="1" <s:if test='dom.dwtype==1'>checked="checked"</s:if> />货运公司&nbsp;&nbsp;
					     <input type="radio" id="dwtype" name="dom.dwtype" value="2" <s:if test='dom.dwtype==2'>checked="checked"</s:if> required="true"/>驾驶员&nbsp;<font color="#FF0000">*</font>
				    </td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">角色描述:</td>
					<td><textarea style="width: 400px; height: 60px;" name="dom.description">${dom.description}</textarea>
					</td>
				</tr>			

				<tr style="height: 60px">
					<td valign="top">备注:</td>
					<td><textarea style="width: 400px; height: 40px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr>
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2" valign="middle">
						<input type="submit" value="提 交"/> 
						<input type="Reset" value="清 空" />
						<input name="text" type="button" value="返 回" onClick="javascript:history.back();"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
<script type="text/javascript">
//获取录入的信息
var repeat = '<%=repeat%>';
if(repeat != "" && repeat != "null"){
	history.back();
}

//提交
$(function(){
	$("#roleform").html5Validate(function(){
		this.submit();
	},{
	});
});
</script>