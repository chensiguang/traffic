<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
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
<link href="page/admin/css/kindeditor/default.css" rel="stylesheet" type="text/css" />
<style type="text/css">
td {
	text-align: left
}
</style>
<script type="text/javascript" src="page/admin/javascript/jquery.min.js"></script>
<script type="text/javascript" src="page/admin/javascript/kindeditor-min.js"></script>
<script type="text/javascript" src="page/admin/javascript/zh_CN.js"></script>
<script type="text/javascript" src="page/admin/javascript/ajaxfileupload.js"></script>
<script type="text/javascript" src="page/admin/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="page/admin/javascript/jquery-html5Validate.js"></script> 
</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form action="${action}" method="post" id="driverform" onsubmit="addcheck()">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				 <tr style="height: 45px">
					<td>部门名称:</td>
					<td><input id="orgname" type="text" style="width: 300px; height: 22px;"
						name="dom.orgname" value="${dom.orgname}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				<tr style="height: 45px">
					<td>父级部门:</td>
					<td>
					<select name="dom.pid" style="width: 300px; height: 22px;">
					<option>请选择--</option>
					<s:iterator value="unitList" status="unit">
					 <option value='<s:property value="id" />' <s:if test="unit.id == dom.pid">selected="selected"</s:if>>
					    <s:property value="orgname" />
					 </option>
					 </s:iterator>
					</select>
					</td>
				</tr>
	
				<tr style="height: 45px">
					<td>电话:</td>
					<td>
					<input style="width: 300px; height: 22px;" type="text" name="dom.phone" value="${dom.phone}"/>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>地址:</td>
					<td>
					<input style="width: 300px; height: 22px;" type="text" name="dom.address" value="${dom.address}"/>
					</td>
				</tr>

				<tr style="height: 45px">
					<td>备注:</td>
					<td>
					<textarea style="width: 300px; height: 40px;" type="text" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr> 
				
				<tr style="height: 45px" align="center">
					<td></td>
					<td><input type="button" value="提 交" onclick="addcheck()" /> 
						<input type="Reset" value="清 空" />
						<input name="text" type="button" value="返 回" onClick="javascript:history.back();"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
<script type="text/javascript">

$(function(){
				$("#driverform").html5Validate(function(){
					this.submit();
				},{
				});
			});


function addcheck()
{
	var login = $("#orgname").val().trim();
	<%
	   List<Unit> list = (List<Unit>)session.getAttribute("unitList");
	
		for(int i = 0; i < list.size(); i++)
		{
			String orgname = list.get(i).getOrgname().trim();
	%>	
			if(login == "<%=orgname %>")
				{
					alert("该交警部门已经存在");
					
					return false;
				}
		<%
		}
		%>	
		$("#driverform").submit();
}

</script>