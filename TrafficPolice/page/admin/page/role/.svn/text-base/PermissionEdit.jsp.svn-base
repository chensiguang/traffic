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
<link href="page/admin/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="page/admin/javascript/jquery.min.js"></script>
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
<!--树-->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/page/js/tree/css/dhtmlxtree.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/page/js/window/dhtmlxcommon.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/page/js/tree/js/dhtmlxtree.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/page/js/tree/css/MenuSkins/dhtmlxmenu_dhx_blue.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/page/js/tree/js/dhtmlxmenu.js"></script>
<script type="text/javascript">
	$(function() {
		//setMenuHeight
		$('.menu').height($(window).height() - 56 - 27 - 26);
		$('.sidebar').height($(window).height() - 56 - 27 - 26);
		$('.page').height($(window).height() - 56 - 27 - 26);
		$('.page iframe').width($(window).width() - 15 - 168);
		$('.subMenu a[href="#"]').next('ul').toggle();
		//menu on and off
		$('.btn').click(function() {
			$('.menu').toggle();

			if ($(".menu").is(":hidden")) {
				$('iframe').width($(window).width() - 15 + 5);
			} else {
				$('iframe').width($(window).width() - 15 - 168);
			}
		});
 
		//
		$('.subMenu a[href="#"]').click(function() {
			$(this).next('ul').toggle();
			return false;
		});
	})
	
	function clickmenu(topage){
		 $('iframe')[0].src = topage;
	}
</script>
</head>
<body style="padding-top: 10px">
<form action="${action}" method="post" id="permissioneditform">
		<div class="pageTitle"  align="left">权限分配</div>
		<br>
		<br>
		<table bgcolor="white" align="center" width="30%" >
				<tr style="height: 45px">
						<td style="text-align: center"><h1>角色名称:${dom.rolename}
										<input type="hidden" name="roleno" value="${dom.roleno }">
								</h1></td>
				</tr>
				<tr>
						<s:iterator value="rpList" status="rp">
								<input type="hidden" name="perno" value="<s:property value='perno' />"/>
						</s:iterator>
						<td><div id="permissionedit_treeboxreagent_tree" style="width:100%;display:block;height:450px;background-color:#f5f5f5;border:1px solid #999999;overflow: hidden;" align="left"></div></td>
				</tr>
				<tr>
						<td><div align="center">
										<input type="button" value="提 交" onClick="formsubmit()"/>
										<input type="Reset"  value="清 空" />
										<input name="text" type="button" value="返 回" onClick="javascript:history.back();"/>
										<input name="ids"  type="hidden" id="ids" value="" />
								</div></td>
				</tr>
		</table>
</form>
</body>
<script type="text/javascript">
var permission_tree = null;

$(document).ready(function(){
	persission_filter('1','1');
});

// 加载权限树
function persission_filter(page,perid) {
	$('#permissionedit_treeboxreagent_tree').html('');
	$('#permissionedit_treeboxreagent_tree').append("<div id=\"image\"><br/><br/><br/><br/><br/><img src=\"/TrafficPolice/page/images/wait.gif\"><br/><br/>正在载入，请稍后...</div>");
	permission_tree = null;
	permission_tree = new dhtmlXTreeObject("permissionedit_treeboxreagent_tree","100%","100%",0);
	tree = permission_tree;
	permission_tree.setImagePath("/TrafficPolice/page/images/base/tree/");
	permission_tree.enableCheckBoxes(1);
	permission_tree.enableThreeStateCheckboxes(1);
	permission_tree.enableDragAndDrop(0);
	permission_tree.loadXML("page/admin/page/pertree.action",function() {
		$('#image').remove();
		//设置默认权限状态
		$("input[name='perno']").each(function() {
			permission_tree.setCheck($(this).val(),1);  //设置节点的选中状态
		});

	});
	tree = permission_tree;
	permission_tree.setOnCheckHandler(permission_checkbox);//设置checkbox点击事件
}

var  nids = "";
//树状－复选框点击事件
function permission_checkbox(nodeId){
	//获取所有被选中节点id，不包括根节点
	nids = permission_tree.getAllChecked();
}

<!--批量选择-->
function formsubmit(){
	var ids = "";
	if(nids == ""){
		alert("请选择您要操作的数据");
		return ;
	}
	if(nids.indexOf(",") <= 0 && nids != ""){  
    	ids = nids;
	}else{
		//正则表达式替换全部，g表示全局
		ids = nids.replace(/,/g,"#");
	}
	$('input[name=perno]:checked:checked').each(function(){
			ids += $(this).val() + "#";
	});
	$('#ids').val(ids);
	$('#permissioneditform').submit();
}

</script>
</html>
