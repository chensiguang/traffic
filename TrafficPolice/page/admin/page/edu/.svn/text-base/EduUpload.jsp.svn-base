<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String code = request.getParameter("code"); 
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
<script type="text/javascript" src="page/admin/javascript/kindeditor-min.js"></script>
<script type="text/javascript" src="page/admin/javascript/jquery-html5Validate.js"></script>
</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
				<form action="page/admin/page/eduback_videoUpload.action" method="post">
		<div class="pageTitle"  align="left">宣教中心视频上传</div>
			<table cellpadding="0" cellspacing="5" width="800px">
				 <tr style="height: 45px">
					<td><input type="hidden" name="code" value="<%=code %>"/></td>
				</tr>
				<tr style="height: 45px">
					<td>视频标题:</td>
					<td><input type="text" name="title" required="true" style="width: 400px; height: 22px;" />&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				<tr style="height: 45px">
					<td>视频简介:</td>
					<td><textarea name="content" required="true" style="width: 400px; height: 200px;"></textarea>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				<tr style="height: 45px">
					<td>标签：</td>
					<td> <input type="text" name="tags" required="true" style="width: 400px; height: 22px;"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				<tr style="height: 45px">
					<td>频道：</td>
					<td> 
					   <select name="channelId" required="true" >
					   	<option value="1">娱乐</option>
					   	<option value="3">乐活</option>
					   	<option value="5">搞笑</option>
					   	<option value="9">动画</option>
					   	<option value="10">游戏</option>
					   	<option value="14">音乐</option>
					   	<option value="15">体育</option>
					   	<option value="21">科技</option>
					   	<option value="22">电影</option>
					   	<option value="24">财富</option>
					   	<option value="25">教育</option>
					   	<option value="26">汽车</option>
					   	<option value="27">女性</option>
					   	<option value="28">纪录片</option>
					   	<option value="29">热点</option>
					   	<option value="30">电视剧</option>
					   	<option value="31">综艺</option>
					   	<option value="32">风尚</option>
					   	<option value="99">原创</option>
					   </select>&nbsp;<font color="#FF0000">*</font>
					</td>
				</tr>    
				
				<tr style="height: 45px">
				<td></td>
					<td align="center">
					   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					   <input type="hidden" value="${access_token }">
					   <input type="submit" value="下一步" /> &nbsp;&nbsp;&nbsp;&nbsp;
					   <input name="text" type="button" value="返 回" onClick="javascript:history.back();"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>