<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
	String basePath = request.getScheme() 
			+ "://" 
			+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
			+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
			+ path
			+ "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="page/admin/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="page/admin/javascript/jquery.js"></script>
<!--模态窗口-->
<link rel="STYLESHEET" type="text/css" href="<%=request.getContextPath()%>/page/css/subModal.css">
<script src="<%=request.getContextPath()%>/page/js/mland/common.js"></script>
<script src="<%=request.getContextPath()%>/page/js/mland/subModal.js"></script>	
<!--树-->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/page/js/tree/css/dhtmlxtree.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/page/js/window/dhtmlxcommon.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/page/js/tree/js/dhtmlxtree.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/page/js/tree/css/MenuSkins/dhtmlxmenu_dhx_blue.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/page/js/tree/js/dhtmlxmenu.js"></script>

</head>	
<body>
<form id="policeorg_list_form" name="policeorg_list_form" action="">
	<div id="contentWrap">
			<table width="100%" border="0" cellpadding="0" cellspacing="5">
				<tr>
					<td valign="top" width="18%" align="left">
						<div class="menu_title" style="width:100%;display:block;border-top:1px solid #9bd3ef;border-left:1px solid #9bd3ef;border-right:1px solid #9bd3ef;overflow:auto; background:repeat-x #9bd3ef; height:27px;">
							<div style="margin-top:5px;">
								<table border="0" cellpadding="0" cellspacing="0" width="100%">
									<tr>
										<td width="70%" align="left" style="color:#075587;font-weight:bold;"><img src="page/images/base/img02.png" style="margin-left:15px;"/>&nbsp;&nbsp;机构列表</td>
										<td width="15%" align="right"><img src="page/admin/images/max.gif" width="14" height="14" border="0" align="absmiddle" style=" cursor:pointer" title="查看所有" onClick="policeorg_list_initmenu(1,1);">&nbsp;</td>
										<td width="15%" align="right" valign="middle"><img src="page/admin/images/add.png" width="14" height="14"  border="0" align="absmiddle" style="cursor:pointer" title="新增机构" onClick="policeorg_list_provicenodeadd(1);">&nbsp;</td>
									</tr>
								</table>
							</div>
						</div>
						<div id="policeorg_treeboxreagent_tree" style="width:100%;display:block; height:740px;background-color:#f5f5f5;overflow:hidden; position:relative; border-bottom:1px solid #9bd3ef;border-left:1px solid #9bd3ef;border-right:1px solid #9bd3ef; z-index:100;" align="left"></div>
					</td>
					<td valign="top" width="72%">
						<div>
							<ul id="policeorg_list_reagentHouse" class="policeorg_list_tabsheader" style="list-style-type:none;"></ul>			
						</div>
						<div>
							<ul class="policeorg_list_tabsheader" style="list-style-type:none;"></ul>
						</div>
						<div id="policeorg_list_right_part" style="height:auto;display:block"></div>
					</td>
				</tr>
			</table>
		</div>
</form>	
</body>
<script language="javascript">
var policeorg_list_tree = null;
var policeorg_list_menu = null;
policeorg_list_initmenu(1,1);

// 右击菜单初始化
function policeorg_list_initmenu(page,perid){
	policeorg_list_menu=new dhtmlXMenuObject("policeorg_treeboxreagent_tree");
	policeorg_list_menu.setImagePath("images/base/tree/");
	policeorg_list_menu.setIconsPath("images/base/tree/");
	policeorg_list_menu.renderAsContextMenu(true);
	policeorg_list_menu.loadXML("page/admin/page/policeorg/righthander/policeorg_rigth.xml"); 
	policeorg_list_menu.attachEvent("onClick",policeorg_list_handle);
	policeorg_list_filter(page,perid);
}

// 产生树状结构
function policeorg_list_filter(page,perid){
	$('#policeorg_treeboxreagent_tree').html('');
	$('#policeorg_treeboxreagent_tree').append("<div id=\"image\"><br/><br/><br/><br/><br/><img src=\"/TrafficPolice/page/images/wait.gif\"><br/><br/>正在载入，请稍后...</div>");
	policeorg_list_tree = null;
	policeorg_list_tree = new dhtmlXTreeObject("policeorg_treeboxreagent_tree","100%","100%",0);
	tree = policeorg_list_tree;
	policeorg_list_tree.setImagePath("/TrafficPolice/page/images/base/tree/");
	policeorg_list_tree.enableDragAndDrop(0);
	policeorg_list_tree.enableContextMenu(policeorg_list_menu);
	policeorg_list_tree.loadXML("page/admin/page/orgtree.action",
	function() {
		$('#image').remove();
		policeorg_list_tree.closeAllItems(100);
		//policeorg_list_tree.openItem(100);
		policeorg_list_loadson(perid);
		//project_public_bodyScrollbyobject($("#policeorg_treeboxreagent_tree").children().eq(0)); // 浏览器滚动条控制内部 树状菜单内容滚动
	});
	tree = policeorg_list_tree;
	policeorg_list_tree.setOnClickHandler(policeorg_list_nodeselect); // 装载点击触发
}

// 左击点击执行
function policeorg_list_nodeselect(nodeId){
	if(nodeId !=null && nodeId !=''){
		policeorg_list_loadson(nodeId);
	}
}

// 右击菜单执行
function policeorg_list_handle(menuid,zoom){
	var id = policeorg_list_tree.rclk_id;
	var name = policeorg_list_tree.getItemText(id);
	if(menuid == "edit"){
		removeAll('policeorg_list_right_part');
		var url = "<%=basePath%>${opt.editAction}?id="+id;
		var obj = {
		}
		doLoadingHtmlpost(url,obj,'#policeorg_list_reagentHouse',null,null);
	}else if(menuid == "insert"){
		policeorg_list_provicenodeadd(id);
	}else if(menuid == "delete"){
		if(confirm("您确定删除该条数据？")){
			var action = '<%=basePath%>${opt.deleteAction}';
			action += "?id=" + id;
			location.href = action;
		}
	}	
}

// 产生父类下的子类
function policeorg_list_loadson(areapid){
	removeAll('policeorg_list_reagentHouse');
	var url = "page/admin/page/policeorgback_viewPoliceOrgSoList.action";
	var obj = {
		'currentpage':1,
		'parentid':areapid
	}
	doLoadingHtmlpost(url,obj,'#policeorg_list_right_part',null,null);
}

//新增
function policeorg_list_provicenodeadd(id){
	removeAll('policeorg_list_right_part');
	var url = "<%=basePath%>${opt.addAction}?pid="+id;
	var obj = {
	}
	doLoadingHtmlpost(url,obj,'#policeorg_list_reagentHouse',null,null);
}

//关闭所有div
function removeAll(titleHouse){
	$("#"+titleHouse).hide();
}
</script>
</html>
