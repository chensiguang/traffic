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
		<form id="policeorg_solist_form" name="policeorg_solist_form" action="${opt.delAllAction}">
			<table>
				<thead>
				  	<th width="20" style="text-align:left">
				  		&nbsp;&nbsp;
				  		<input type="checkbox" name="allbox"  onclick='ckall(this)'/>
				  	</th>
					<th width="31">序号</th>
					<th width="45">单位名称</th>
					<th width="51">电话</th>
					<th width="36">地址</th>
					<th width="36">备注</th>
					<th width="50">操作</th>
				</thead>
				<tbody>
					<s:if test="#request.policeOrgList.size() == 0">
					<tr>
						<td colspan="7" style="text-align:left">【暂无数据】</td>
					</tr>
					</s:if>
					<s:else>
					<s:iterator value="policeOrgList" status="policeOrg">
					<tr>
						<td class="table-cell" style="text-align:center">
							&nbsp;<input name="id" type="checkbox" class="idcheck" value="<s:property value='id' />"/>
						</td>
						<td style="text-align:center"><s:property value='#policeOrg.count' /></td>
						<td style="text-align:center"><s:property value="orgname" /></td>
						<td style="text-align:center"><s:property value="phone" /></td>
						<td style="text-align:center"><s:property value="address"/></td>
						<td style="text-align:center"><s:property value="remark" /></td>
						<td style="text-align:center">
							<a onClick="editPoliceOrgInfo(<s:property value='id'/> );">修改</a>
						</td>
					</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
						<td colspan="3" style="text-align:left">
						<label>
							<input type="hidden" name="lx" id="lx" value="3"/>
							<input type="button" name="button" id="id" value="删除" onClick="policeorg_list_batch_del()" class="btn" />
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
function editPoliceOrgInfo(id)
{
	removeAll('policeorg_list_right_part');
	var url = "<%=basePath%>${opt.editAction}?id="+id;
	var obj = {
	}
	doLoadingHtmlpost(url,obj,'#policeorg_list_reagentHouse',null,null);
}


<!--批量删除-->
function policeorg_list_batch_del(){
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
			$('#policeorg_solist_form').submit();
		}
	}else
	{
		$('#policeorg_solist_form').submit();
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