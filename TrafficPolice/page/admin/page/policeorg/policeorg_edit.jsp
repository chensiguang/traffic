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
<div id="contentWrap">
		<div class="pageColumn">
		<form id="policeorg_solist_form" name="policeorg_solist_form" action="${action}" method="post">
			<table>
				<thead>
					<th style="text-align:left" colspan="2">机构信息编辑</th>
				</thead>
				<tr style="height: 45px">
					<td style="text-align:right">单位名称:</td>
					<td style="text-align:left">
						<input type="text" style="width: 200px; height: 22px;" name="dom.orgname" value="${dom.orgname}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				<tr style="height: 45px">
					<td style="text-align:right">电话:</td>
					<td style="text-align:left">
						<input type="text" style="width: 100px; height: 22px;" name="dom.phone" value="${dom.phone}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>

				<tr style="height: 45px">
					<td style="text-align:right">地址:</td>
					<td style="text-align:left">
						<input style="width: 400px; height: 22px;" type="text" name="dom.address" value="${dom.address}"/>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top" style="text-align:right">备注:</td>
					<td style="text-align:left">
						<textarea style="width: 400px; height: 60px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr>
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2" valign="middle">
						<input type="submit" value="提 交" />
						<input type="reset"  value="清 空" />
						<input type="button" value="返 回" name="text" onClick="policeOrgBack();"/>
					</td>
				</tr>
			</table>
			<input name="ids" type="hidden" id="ids" value="" />
		</form>	
		</div>		
	    </div>
	</div>
</body>
</html>
<script language="javascript">
//获取录入的信息
var repeat = '<%=repeat%>';
if(repeat != "" && repeat != "null"){
	history.back();
}

//返回
function policeOrgBack(){
	$('#policeorg_list_right_part').show();
	$('#policeorg_list_reagentHouse').hide();
}

//提交
$(function(){
	$("#company_edit_form").html5Validate(function(){
		this.submit();
	},{
	});
});
</script>