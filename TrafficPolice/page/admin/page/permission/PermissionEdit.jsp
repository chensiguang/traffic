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
<link href="page/admin/css/kindeditor/default.css" rel="stylesheet"
	type="text/css" />
<style type="text/css">
td {
	text-align: left
}
</style>
<script type="text/javascript" src="page/admin/javascript/jquery.js"></script>
<script type="text/javascript" src="page/admin/javascript/kindeditor-min.js"></script>
<script type="text/javascript" src="page/admin/javascript/zh_CN.js"></script>
<script type="text/javascript" src="page/admin/javascript/ajaxfileupload.js"></script>
<script type="text/javascript" src="page/admin/javascript/jquery-html5Validate.js"></script>
<script type="text/javascript" src="page/admin/My97DatePicker/WdatePicker.js"></script>
</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form action="${action}" method="post" id="permissionnameform">
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				<tr style="height: 100px">
					<td>权限名称:</td>
					<td><input id="permissionname" type="text" style="width: 400px; height: 22px;"
						name="dom.pername" value="${dom.pername}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">权限码:</td>
					<td><input type="text" style="width: 400px; height: 22px;" name="dom.functions" value="${dom.functions}" maxlength="100" required="true" />&nbsp;<font color="#FF0000">*</font>
					权限码为权限的重要标识，若要修改请联系数据管理员
					</td>
				</tr>
				
				<%-- 	<tr style="height: 100px">
					<td>父类权限:</td>
					<td>
					
					<select name="dom.parentid">
					<s:iterator value="permissionList" status="per">
					  <option value='<s:property value="perno"/>' <s:if test="#per.pername == dom.pername">selected="selected"</s:if>>
					    <s:property value="pername"/>
					  </option>
					</s:iterator>
					</select>
				</tr>	 --%>		

				<tr style="height: 60px">
					<td valign="top">备注:</td>
					<td><textarea style="width: 400px; height: 40px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr>
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2" valign="middle">
					<input type="submit" value="提 交"/> 
					<input type="Reset" value="清 空" />
				    <input name="text" type="button" value="返 回" onClick="javascript:history.back();"/></td>
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
	
				$(function(){
				$("#illegalform").html5Validate(function(){
					this.submit();
				},{
				});
			});
</script>