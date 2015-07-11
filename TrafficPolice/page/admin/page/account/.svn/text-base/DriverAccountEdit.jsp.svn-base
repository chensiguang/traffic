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
<meta http-equiv="Content-Type" content="text/javascript; charset=UTF-8">
<link href="page/admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="page/admin/css/kindeditor/default.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="page/js/jquery.js"></script>
<script type="text/javascript" src="page/admin/javascript/kindeditor-min.js"></script>
<script type="text/javascript" src="page/admin/javascript/zh_CN.js"></script>
<script type="text/javascript" src="page/admin/javascript/jquery-html5Validate.js"></script>
<script type="text/javascript" src="page/admin/My97DatePicker/WdatePicker.js"></script>
<!-- jquery日历插件 -->
	<link rel="stylesheet" type="text/css" href="page/admin/javascript/newdate/jquery-ui-1.8.13.custom.css"/>
	<script type="text/javascript" language="javascript" src="page/admin/javascript/newdate/jquery-ui-1.8.9.custom.js"></script>
	<script type="text/javascript" language="javascript" src="page/admin/javascript/newdate/jquery.ui.datepicker-zh-CN.js"></script>
	<script type="text/javascript" language="javascript" src="page/admin/javascript/newdate/jquery-ui-timepicker-addon.js"></script>
	<script type="text/javascript" src="page/admin/javascript/newdate/date.js"></script>
</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form action="${action}" method="post" id="accountform">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="600px">
				<tr style="height: 45px">
					<td>登录名称:</td>
					<td><input id="loginname" type="text" style="width: 200px; height: 22px;"
						name="dom.loginname" value="${dom.loginname}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font>
						<input name="dom.typeid" value="1" type="hidden">	
					</td>
				</tr>

				<tr style="height: 45px">
					<td>所属单位:</td>
					<td>
					<select name="dom.dwno" id="dwno" style="width: 200px; height: 22px;" required="true" onchange="selectdrivername()">
						<option value="">请选择单位...</option>
					<s:iterator value="comList" status="com">
						 <option value='<s:property value="comid"/>' <s:if test="comid == dom.dwno">selected="selected"</s:if>><s:property value="comname"/></option>
					</s:iterator>
					</select>&nbsp;<font color="#FF0000">*</font>
					</td>
				</tr >
								
				<tr style="height: 45px">
					<td>用户姓名:</td>
					<td>
					<select name="dom.username"  style="width: 200px; height: 22px;" required="true" id="driverhtml">
					</select></td>
				</tr>
				
				<tr style="height: 45px">
					<td>密码:</td>
					<td>
					<input style="width: 200px; height: 22px;" type="text" name="dom.password" value="${dom.password}"/>&nbsp;<!-- 密码默认为123456 -->
					</td>
			  </tr>
			
				<tr style="height: 45px">
					<td>角色:</td>
					<td>
					<select name="dom.roleno" id="roleno" style="width: 200px; height: 22px;" required="true">
						<option value="">请选择角色...</option>
					<s:iterator value="roleList" status="role">
						 <option value='<s:property value="roleno"/>' <s:if test="roleno == dom.roleno">selected="selected"</s:if>><s:property value="rolename"/></option>
					</s:iterator>
					</select>&nbsp;<font color="#FF0000">*</font>
					</td>
				</tr >
			<tr style="height: 45px">
					<td>电话:</td>
					<td>
					<input style="width: 200px; height: 22px;" type="text" name="dom.telephone" value="${dom.telephone}"/>
					</td>
			</tr>
			
							
			<tr style="height: 45px">
					<td>地址:</td>
					<td>
					<input style="width: 200px; height: 22px;" type="text" name="dom.address" value="${dom.address}"/>
					</td>
			</tr>
				<tr style="height: 45px">
					<td valign="top">备注:</td>
					<td><textarea style="width: 200px; height: 60px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr>
				
				<tr>
					<td style="height: 50px; text-align:left" colspan="2" valign="middle"><br>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="submit" value="提 交"/> 
						<input type="Reset" value="清 空" />
						<input name="text" type="button" value="返 回" onClick="javascript:history.back();"/></td>
				</tr>
			</table>
		</form>
		<form action="" id="dwnoform">
		<input id="dwnoinput" type="hidden" name="dwid">
		</form>
	</div>
</body>
<script type="text/javascript">
//获取录入的信息
var repeat = '<%=repeat%>';
if(repeat != "" && repeat != "null")
{
	history.back();
}

$(document).ready(function selectdrivername()
{
	var dwid = $("#dwno").val();
	//alert(dwid);
		var driver ='<option value="">请选择用户姓名...</option>';
	$.ajax({
		type:'post',//可选get
		url:'/TrafficPolice/page/admin/page/account_drilist.action',//这里是接收数据的PHP程序
		data:'dwid='+dwid+'',//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
	//	alert(data);
		var re =eval('('+data+')');
			if(re.size > 0)
			{
				for(var i =0 ; i<re.drivers.length;i++)
				{
					driver +='<option <s:if test="dom.username == '+re.drivers[i].id+'">selected="selected"</s:if> value='+re.drivers[i].id+'>'+re.drivers[i].name+'</option>';
				}
			}
			$('#driverhtml').html(driver);
			
		},
		error:function(){
			alert('error');
		}
	}); 
});

function selectdrivername()
{
	var dwid = $("#dwno").val();
	//alert(dwid);
		var driver ='<option value="">请选择用户姓名...</option>';
	$.ajax({
		type:'post',//可选get
		url:'/TrafficPolice/page/admin/page/account_drilist.action',//这里是接收数据的PHP程序
		data:'dwid='+dwid+'',//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
	//	alert(data);
		var re =eval('('+data+')');
			if(re.size > 0)
			{
				for(var i =0 ; i<re.drivers.length;i++)
				{
					driver +='<option <s:if test="dom.userno == '+re.drivers[i].id+'">selected="selected"</s:if> value='+re.drivers[i].id+'>'+re.drivers[i].name+'</option>';
				}
			}
			$('#driverhtml').html(driver);
			
		},
		error:function(){
			alert('error');
		}
	}); 
}

</script>
</html>