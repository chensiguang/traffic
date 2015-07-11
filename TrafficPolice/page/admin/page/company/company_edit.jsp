<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String basePath = (String)session.getAttribute("basePath");
	String orgid  = request.getParameter("orgid");
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
		<form name="company_edit_form" id="company_edit_form" action="${action}" method="post">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				<tr style="height: 45px">
					<td>企业名称:</td>
					<td>
						<input id="comname" type="text" style="width: 200px; height: 22px;" name="dom.comname" value="${dom.comname}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
					<tr style="height: 45px">
					<td>登录账号:</td>
					<td>
						<input type="text" style="width: 200px; height: 22px;" name="dom.loginname" value="${dom.loginname}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
					<tr style="height: 45px">
					<td>登录密码:</td>
					<td>
						<input type="text" style="width: 200px; height: 22px;" name="dom.password" value="${dom.password}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
				 <tr style="height: 45px">
					<td>安全组长:</td>
					<td>
						<input type="text" style="width: 200px; height: 22px;" name="dom.linkname" value="${dom.linkname}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>电话:</td>
					<td>
						<input type="text" style="width: 200px; height: 22px;" name="dom.phone" value="${dom.phone}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				<tr style="height: 45px">
					<td>所属交警部门:</td>
					<td>
						<select name="dom.orgid" id="orgid" style="width: 200px; height: 22px;">
							<option value="0">请选择所属交警部门,若无请不选---</option>
							<s:iterator value="policeOrgList" status="policeOrg">
							<option value="<s:property value='id' />" <s:if test="id==dom.orgid">selected="selected"</s:if>><s:property value="orgname" /></option>
							</s:iterator>
						</select>
						<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>所属企业:</td>
					<td>
						<select name="dom.pid" id="pid" style="width: 200px; height: 22px;">
						    <option value="0">请选择所属企业，若无请不选---</option>
							<s:iterator value="companyList" status="com">
							<option value="<s:property value='comid' />" <s:if test="comid==dom.pid">selected="selected"</s:if>><s:property value="comname" /></option>
							</s:iterator>
						</select>
						<em>*</em>
					</td>
				</tr>
			
				<tr style="height: 45px">
					<td>联系地址:</td>
					<td>
						<input style="width: 200px; height: 22px;" type="text" name="dom.addres" value="${dom.addres}"/>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">备注:</td>
					<td>
						<textarea style="width: 200px; height: 60px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr>
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2" valign="middle">
						<input type="submit" value="提 交" />
						<input type="button" value="清 空" onClick="resetfunction();"/>
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
/*
* 等"所属单位"遍历完，再执行该函数
* 否则会出现null现象
*/
$(document).ready(function(){
	//根据传过来的值选中对应的下拉框值
	var company_edit_orgidValue = "<%=orgid%>";
	var company_edit_orgid = document.getElementById("orgid");
	for(var i=0;i<company_edit_orgid.options.length;i++){
		if(company_edit_orgid.options[i].value == company_edit_orgidValue){
			company_edit_orgid.options[i].selected = true;
		}
	}
});

//重置时，取得下拉框原来的值
function resetfunction()
{
	$('#company_edit_form')[0].reset();
	$('#orgid').val("<%=orgid%>");
}

//提交
$(function(){
	$("#company_edit_form").html5Validate(function(){
		this.submit();
	},{
	});
});
</script>