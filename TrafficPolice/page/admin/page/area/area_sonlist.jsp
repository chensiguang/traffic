<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
     String basePath = (String)session.getAttribute("basePath");
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
<style type="text/css">
body {
	background: #FFF
}
</style>

</head>

<body>

	<div id="contentWrap">
		<div class="pageColumn">
		<form id="area_solist_form" name="area_solist_form" action="${opt.delAllAction}">
			<table>
				<thead>
				  	<th width="20" style="text-align:left">
				  		&nbsp;&nbsp;
				  		<input type="checkbox" name="allbox"  onclick='ckall(this)'/>
				  	</th>
					<th width="31">序号</th>
					<th width="45">地域名称</th>
					<th width="51">描述</th>
					<th width="36">编号</th>
					<th width="36">区号</th>
					<th width="50">操作</th>
				</thead>
				<tbody>
					<s:if test="#request.areaList.size() == 0">
					<tr>
						<td colspan="7" style="text-align:left">【暂无数据】</td>
					</tr>
					</s:if>
					<s:else>
					<s:iterator value="areaList" status="area">
					<tr>
						<td class="table-cell" style="text-align:center">
							&nbsp;<input name="id" type="checkbox" class="idcheck" value="<s:property value='areaid' />"/>
						</td>
						<td style="text-align:center"><s:property value='#area.count' /></td>
						<td style="text-align:center"><s:property value="areaname" /></td>
						<td style="text-align:center"><s:property value="description" /></td>
						<td style="text-align:center"><s:property value="mailcode"/></td>
						<td style="text-align:center"><s:property value="callcode" /></td>
						<td style="text-align:center">
							<a href="javascript:editAreaInfo(<s:property value='areaid'/> );">修改</a>
						</td>
					</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
						<td colspan="3" style="text-align:left">
						<label>
							<input type="hidden" name="lx" id="lx" value="3"/>
							<input type="button" name="button" id="id" value="删除" onClick="area_list_batch_del()" class="btn" />
						</label>
						</td>
						<td colspan="4" style="text-align:left">
							<div class="page"><s:property value='pageString' escape='false'/></div>
						</td>
					</tr>
				</tbody>
			</table>
			<input name="ids" type="hidden" id="ids" value="" />
		</form>	
		</div>		
	    </div>
	</div>
</body>
</html>
<script type="text/javascript">

//地域信息修改
function editAreaInfo(id)
{
	initPopUp(); //初始化模态窗口
	showPopWin(encodeURI('${opt.editAction}?id='+id),600,320,null,null);
    $('#popupTitle').html("地域信息");
}


<!--批量删除-->
function area_list_batch_del(){
	if( type = "")
	{
		alert("请选择操作类型");
		return;
	}
	var type = $('#lx').val();
	if(type = 3)
	{
	var ids = "";
		$('input[name=id]:checked:checked').each(function(){
				ids += $(this).val() + "#";
		});
		if(ids == ""){
		  	alert("请选择您要操作的数据");
			return ;
		}else if (window.confirm("确定删除记录?")){
			$('#ids').val(ids);
			$('#area_solist_form').submit();
		}
	}else
	{
		$('#area_solist_form').submit();
	}		
}

function ckall(t){
	var _a = document.getElementsByTagName('input');
	var _l = _a.length;
	var a =[];
	for(var i=0;i<_l;i++){
		if(_a[i].type=='checkbox'){
			a.push(_a[i]);
		}
	}
	var l = a.length;
	for(var j=0;j<l;j++){
		a[j].checked = t.checked;
		if(a[j]!=t){
			a[j].onclick = function(){
				if(!this.checked){
					t.checked = false;
				}
			}; 
		}
	}
}
</script>