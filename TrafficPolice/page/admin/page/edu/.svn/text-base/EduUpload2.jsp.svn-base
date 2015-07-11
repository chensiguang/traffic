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
<script type="text/javascript" src="page/admin/javascript/ajaxsubmit.js"></script>
<script type="text/javascript" src="page/admin/javascript/ajaxsubmit.js"></script>

</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
	<form action="page/admin/page/eduback_saveNew.action" method="post" id="Form1" >
		<table cellpadding="0" cellspacing="5" width="800px">
		  <tr style="height: 45px">
					<td>
						<input name="itemCodes" value='<s:property value="itemCodes"/>'/>
						<input name="videoTitle" value='<s:property value="videoTitle"/>'/>
						<input name="tags" value='<s:property value="tags"/>'/>
						<input name="channelId" value='<s:property value="channelId"/>'/>
						<textarea name="content" ><s:property value="content"/></textarea>
					</td>
				</tr>
	   </table>	     
   </form>

   <form action='<s:property value="uploadurl"/>' enctype="multipart/form-data" method="post" id="Form2">

				<table cellpadding="0" cellspacing="5" width="800px">
				<tr style="height: 45px">
					<td></td>
					<td>
					   <input type="file" name="file" id="upFile">
                         
				   </td>
				</tr>
			</table>	     

	</form>
	
   <input type="button" value="上传" onClick="javascript:Form1.submit();Form2.submit()"/>
   <input name="text" type="button" value="返 回" onClick="javascript:history.back();"/>		
	</div>
</body>
</html>
<script type="text/javascript">
function doLoadingHtml(url,targetDivID,inchingTime,afterFun) {
	var randomseed = Math.round(Math.random()*10000000) ;
	var htmlURL = url ;

	if( htmlURL.indexOf('?') == -1 )
		htmlURL += '?randomseed='+randomseed ;
	else
		htmlURL += '&randomseed='+randomseed ;

	if( afterFun != null ) {
		var arg = [];
		for(var i=6; i<arguments.length; i++) {
			arg.push(arguments[i]);
		}
	}

	var buffer = "" ;
	buffer += "<table width='100%' height='20px' border='0' cellspacing='0' cellpadding='0'>" ;
	buffer += "   <tr valign='middle' height='100%'> " ;
	buffer += "      <td align='center'> ";
	buffer += "      </td> " ;
	buffer += "</tr>" ;
	buffer += "</table>" ;
    
	var buffer_error = "" ;
	buffer_error = "没有记录..." ;

	$("#"+targetDivID).empty();//hide the target block
	$("#"+targetDivID).html(buffer);
   
	$.ajax({
		url: htmlURL,
		dataType: 'json',
		timeout: 50000,
		cache: false,
		success: function(data) {
			$("#"+targetDivID).html(data);
			if( afterFun != null )
				afterFun.apply(this, arg);
		},
		error: function (request, textStatus, errorThrown) {
			$("#"+targetDivID).html(buffer_error);
			$("#"+targetDivID).show(inchingTime);//hide the target block
		}
	});//getting html pages
   	
	$("#"+targetDivID).show(inchingTime);//show the target block
}
</script>