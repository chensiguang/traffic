<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String basePath = (String)session.getAttribute("basePath");
	String comid   = request.getParameter("comid");
	String areaid  = request.getParameter("areaid");
	String busType = request.getParameter("busType");
	String repeat  = request.getParameter("repeat");
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
		<form name="car_edit_form" id="car_edit_form" action="${action}" method="post">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				<tr style="height: 45px">
					<td>车牌号:</td>
					<td>
						<input type="text" style="width: 200px; height: 22px;" name="dom.busLicPlate" value="${dom.busLicPlate}" maxlength="100" required="true"/>&nbsp;<em>*</em>
					</td>
				</tr>
				<tr style="height: 45px">
					<td>车辆类型:</td>
					<td>
						<select name="dom.busType" id="busType" required="true">
							<option value=""></option>
							<option value="搅拌车">搅拌车</option>
							<option value="油罐车">油罐车</option>
							<option value="货物运输车">货物运输车</option>
						</select>
						<em>*</em>
					</td>
				</tr>
				<tr style="height: 45px">
					<td>所属公司:</td>
					<td>
						<select name="dom.comid" id="comid">
							<s:iterator value="companyList" status="company">
							<option value="<s:property value='comid' />"><s:property value="comname" /></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr style="height: 45px">
					<td>所属地区:</td>
					<td>
						<select name="dom.areaid" id="areaid">
							<s:iterator value="areaList" status="area">
							<option value="<s:property value='areaid' />"><s:property value="areaname" /></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr style="height: 45px">
					<td>厂牌型号:</td>
					<td>
						<input style="width: 400px; height: 22px;" type="text" name="dom.factoryType" value="${dom.factoryType}"/>
					</td>
				</tr>
				
			    <tr style="height: 45px">
					<td>生产厂家:</td>
					<td>
						<input style="width: 400px; height: 22px;" type="text" name="dom.manufacturer" value="${dom.manufacturer}"/>
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
* 等遍历完，再执行该函数
* 否则会出现null现象
*/
$(document).ready(function(){
	//根据传过来的值选中对应的下拉框值
	//所属公司
	var car_edit_comidValue = "<%=comid%>";
	var car_edit_comid = document.getElementById("comid");
	for(var i=0;i<car_edit_comid.options.length;i++){
		if(car_edit_comid.options[i].value == car_edit_comidValue){
			car_edit_comid.options[i].selected = true;
		}
	}
	
	//所属地区
	var car_edit_areaidValue = "<%=areaid%>";
	var car_edit_areaid = document.getElementById("areaid");
	for(var i=0;i<car_edit_areaid.options.length;i++){
		if(car_edit_areaid.options[i].value == car_edit_areaidValue){
			car_edit_areaid.options[i].selected = true;
		}
	}
	
	//车辆类型
	var car_edit_busTypeValue = "<%=busType%>";
	var car_edit_busType = document.getElementById("busType");
	for(var i=0;i<car_edit_busType.options.length;i++){
		if(car_edit_busType.options[i].value == car_edit_busTypeValue){
			car_edit_busType.options[i].selected = true;
		}
	}
});

//重置时，取得下拉框原来的值
function resetfunction()
{
	$('#car_edit_form')[0].reset();
	$('#comid').val("<%=comid%>");
	$('#areaid').val("<%=areaid%>");
	$('#busType').val("<%=busType%>");
}

//提交
$(function(){
	$("#car_edit_form").html5Validate(function(){
		this.submit();
	},{
	});
});
</script>