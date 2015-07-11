<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
     String basePath = (String)session.getAttribute("basePath");
	 String orgid = (String)request.getParameter("orgid");
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
<script type="text/javascript">
	$(function() {
		editor = KindEditor.create('#editcontent', {
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
	
	KindEditor.ready(function(K) {
		var editor = K.editor({
			allowFileManager : false,
			allowUpload : true,
		    uploadJson : 'uploadEditImage.action'
		});
		K('#image2').click(function() {
			editor.loadPlugin('image', function() {
				editor.plugin.imageDialog({
					showRemote : false,
					imageUrl : K('#url2').val(),
					clickFn : function(url, title, width, height, border, align) {
						K('#url2').val(url);
						K('#urlimage').attr("src", url);
						K('#imgPath').val(url);
						editor.hideDialog();
					}
				});
			});
		});
	});
	
</script>

<script>
			$(function(){
				$("#policeform").html5Validate(function(){
					this.submit();
				},{
				});
			});
			

/*
* 等"所属单位"遍历完，再执行该函数
* 否则会出现null现象
*/
$(document).ready(function(){
	//根据传过来的值选中对应的下拉框值
	var police_edit_orgidValue = "<%=orgid%>";
	var police_edit_orgid = document.getElementById("orgid");
	for(var i=0;i<police_edit_orgid.options.length;i++){
		if(police_edit_orgid.options[i].value == police_edit_orgidValue){
			police_edit_orgid.options[i].selected = true;
		}
	}
});

//重置时，取得下拉框原来的值
function resetfunction()
{
	$('#policeform')[0].reset();
	$('#orgid').val("<%=orgid%>");
}

$(function(){
	$("#policeform").html5Validate(function(){
		this.submit();
	},{
	});
});

</script> 
</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form action="${action}" method="post" id="policeform">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				 <tr style="height: 45px">
					<td>姓名:</td>
					<td><input type="text" style="width: 200px; height: 22px;"
						name="dom.name" value="${dom.name}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				 <tr style="height: 45px">
					<td>性别:</td>
					<td>
					<input  type="radio" name="dom.sex" value="男" <s:if test='dom.sex == "男"'>checked="checked"</s:if>/>&nbsp;男
					<input  type="radio" name="dom.sex" value="女" <s:if test='dom.sex == "女"'>checked="checked"</s:if>/>&nbsp;女
					</td>
				</tr>
				<tr style="height: 45px">
					<td>编号:</td>
					<td><input type="text" style="width: 200px; height: 22px;"
						name="dom.pno" value="${dom.pno}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				<tr style="height: 45px">
					<td>身份证号:</td>
					<td><input type="text" style="width: 200px; height: 22px;"
						name="dom.identitycard" value="${dom.identitycard}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				 <tr style="height: 45px">
					<td>所属机构:</td>
					<td>
						<select name="dom.orgid" id="orgid" style="width:180px">
							<s:iterator value="policeOrgList" status="policeOrg">
							<option value="<s:property value='id' />"><s:property value="orgname" /></option>
							</s:iterator>
						</select>
						<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>电话:</td>
					<td>
					<input style="width: 200px; height: 22px;" type="tel" name="dom.telephone" value="${dom.telephone}"/>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>所在地:</td>
					<td>
						<select name="dom.areaid" id="areaid" style="width:180px">
							<s:iterator value="areaList" status="area">
							<option value="<s:property value='id' />"><s:property value="area" /></option>
							</s:iterator>
						</select>
						<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>地址:</td>
					<td>
					<input style="width: 400px; height: 22px;" type="text" name="dom.addres" value="${dom.addres}"/>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>备注:</td>
					<td>
					<input style="width: 400px; height: 22px;" type="text" name="dom.remark" value="${dom.remark}"/>
					</td>
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