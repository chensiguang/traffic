<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
     String basePath = (String)session.getAttribute("basePath");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="page/admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="page/admin/css/kindeditor/default.css" rel="stylesheet"
	type="text/css" />
<style type="text/css">
td {
	text-align: left
}
</style>
<script type="text/javascript" src="page/admin/javascript/jquery.min.js"></script>
<script type="text/javascript" src="page/admin/javascript/kindeditor-min.js"></script>
<script type="text/javascript" src="page/admin/javascript/zh_CN.js"></script>
<script type="text/javascript">

</script>
</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form action="${action}" method="post">
		   <div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				<tr style="height: 45px">
					<td>网站名称:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.siteName" value="${dom.siteName}" maxlength="100" /></td>
				</tr>
				
				<tr style="height: 45px">
					<td>网页关键字:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.keywords" value="${dom.keywords}" maxlength="100" /></td>
				</tr>
				
				
				<tr style="height: 45px">
					<td>网站描述:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.pdescription" value="${dom.pdescription}" maxlength="100" /></td>
				</tr>
				
				
				<tr style="height: 45px">
					<td>公司地址:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.address" value="${dom.address}" maxlength="100" /></td>
				</tr>
				<tr style="height: 45px">
					<td>邮编:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.code" value="${dom.code}" maxlength="100" /></td>
				</tr>
				<tr style="height: 45px">
					<td>总机:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.telephone" value="${dom.telephone}" maxlength="100" /></td>
				</tr>
				
				
				<tr style="height: 45px">
					<td>销售电话:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.telephoneSale" value="${dom.telephoneSale}" maxlength="100" /></td>
				</tr>
				
				<tr style="height: 45px">
					<td>客服电话:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.telephoneService" value="${dom.telephoneService}" maxlength="100" /></td>
				</tr>
				<tr style="height: 45px">
					<td>传真:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.fax" value="${dom.fax}" maxlength="100" /></td>
				</tr>
				<tr style="height: 45px">
					<td>电子邮件:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.email" value="${dom.email}" maxlength="100" /></td>
				</tr>
				
				<tr style="height: 45px">
					<td>主页:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.homePage" value="${dom.homePage}" maxlength="100" /></td>
				</tr>
				
				<tr style="height: 45px">
					<td>QQ1:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.qq1" value="${dom.qq1}" maxlength="100" /></td>
				</tr>
				<tr style="height: 45px">
					<td>QQ2:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.qq2" value="${dom.qq2}" maxlength="100" /></td>
				</tr>
				
				<tr style="height: 45px">
					<td>msn1:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.msn1" value="${dom.msn1}" maxlength="100" /></td>
				</tr>
				<tr style="height: 45px">
					<td>msn2:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.msn2" value="${dom.msn2}" maxlength="100" /></td>
				</tr>
				
				
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2"
						valign="middle"><input type="submit" value="提 交" /> <input
						type="Reset" value="清 空" />
						<input name="text" type="button" value="返 回" onClick="javascript:history.back();"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>