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
<script type="text/javascript" src="page/admin/videouploadjs/jquery.js"></script>
<script type="text/javascript" src="page/admin/videouploadjs/kindeditor-min.js"></script>
<script type="text/javascript" src="page/admin/videouploadjs/zh_CN.js"></script>
<script type="text/javascript" src="page/admin/videouploadjs/ajaxfileupload.js"></script>

</head>
<body style="padding-top: 10px">
	<div id="contentWrap" align="center">
		<form action="${action}" method="post" id="eduform"> 
		<div class="pageTitle"  align="left">${title}</div>
			<table cellpadding="0" cellspacing="5" width="800px">

				<tr style="height: 45px">
					<td>视频标题:</td>
					<td>
						<input id="videoTitle" type="text" style="width: 400px; height: 22px;" name="dom.videoTitle" value="${dom.videoTitle}" required="true"/>&nbsp;<font color="#FF0000">*</font>
					</td>
				</tr>
				
                <tr style="height: 45px">
					<td valign="top">视频简介:</td>
					<td><textarea style="width: 400px; height: 80px;"
						name="dom.content" maxlength="200">${dom.content}</textarea></td>
				</tr>
				
				<tr>
					<td>上传文件:</td>
					<td><div class="upload">
						<input type="file" id="uploadId" name="upload" style="height:22px;" onChange="$('#fileName').val(this.value)" <s:if test="dom == null">required="true"</s:if>value="${dom.fileName}"/><em>*</em>
						<input type="hidden" value="${dom.fileName}" id="fileName" name="dom.fileName"/>
						<input type="button" value="上传" onClick="file_Upload();"/>&nbsp;大小不超过1G
						</div>
					</td>
				</tr>	
				<tr style="height: 45px">
					<td>视频存放路径:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.videoUrl" value="${dom.videoUrl}"  maxlength="100" id="fileURL"/>
						</td>
				</tr>
				
				<tr style="height: 45px">
					<td>截图存放路径:</td>
					<td><input type="text" style="width: 400px; height: 22px;"
						name="dom.img" value="${dom.img}"  maxlength="100" id="picURL"  readonly/>
						</td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">备注:</td>
					<td><textarea style="width: 400px; height: 80px;"
						name="dom.remark" maxlength="100">${dom.remark}</textarea>不超过100字</td>
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
<script type="text/javascript">
//获取录入的信息
var repeat = '<%=repeat%>';
if(repeat != "" && repeat != "null"){
	history.back();
}


function file_Upload(){
	if($("#uploadId").val()==""){
			alert("请选择文件!");
			return;
		}
		$.ajaxFileUpload(
            {
                url:'fileUpload.action',//用于文件上传的服务器端请求地址
                secureuri:false,//一般设置为false
				dataType:'json',
                fileElementId:'uploadId',//文件上传空间的id属
                success: function(data,status)  //服务器成功响应处理函数
                {
					obj = eval("("+ data+")");
					$('#fileURL').val(obj.url);
					$('#picURL').val(obj.mediaPicPath);
					$('#fileType').val(obj.fileExt);
					alert(obj.message);
                },
				error: function(data,status,e){
					alert("上传失败");
				}
            }
        );
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
</script>
</html>