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
<style type="text/css">
body {
	background: #FFF
}
</style>

</head>

<body>

	<div id="contentWrap">
		<div class="pageTitle">${title}</div>
		<div class="pageColumn">
		<form id="car_search_form" name="car_search_form" action="<%=basePath%>page/admin/page/carback_viewCarList.action">
			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="10%" style="text-align:left">车牌号:
						<input type="text" name="busLicPlate" id="busLicPlate" value="<s:property value='car.busLicPlate' />"/>
						<input type="submit" value="查询" />
						<input type="button" value="取消" onClick="car_search_reset();"/>
					</td>
					
				</tr>
			</table>
		</form>
		<form id="car_list_form" name="car_list_form" action="${opt.delAllAction}">
			<table>
				<thead>
				  	<th width="4%" style="text-align:center">
				  		<input type="checkbox" name="allbox"  onclick='ckall(this)'/>
				  	</th>
					<th width="6%">序号</th>
					<th width="11%">车牌号</th>
					<th width="13%">车辆类型</th>
					<th width="12%">所属公司</th>
					<th width="12%">所属地区</th>
					<th width="12%">厂牌型号</th>
					<th width="11%">生产厂家</th>
					<th width="18%">操作</th>
				<td width="1%"></thead>
				<tbody>
					<s:if test="#request.carlist.size() == 0">
					<tr>
						<td colspan="9" style="text-align:left">【暂无数据】</td>
					</tr>
					</s:if>
					<s:else>
					<s:iterator value="carlist" status="car">
					<tr>
						<td class="table-cell" style="text-align:center">
						<input name="id" type="checkbox" class="idcheck" value="<s:property value='carid' />"/>
						</td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value='#car.count' /></td>
						<td style="text-align:left">&nbsp;&nbsp;
								<s:property value='busLicPlate' />
						</td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="busType" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="company.comname" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="area.areaname"/></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="factoryType" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="manufacturer" /></td>
						<td style="text-align:left">&nbsp;&nbsp;
							<a href="${opt.showAction}?id=<s:property value='carid' />">【详情】</a>
							<a href="${opt.editAction}?id=<s:property value='carid' />&comid=<s:property value='comid' />&areaid=<s:property value='areaid' />&busType=<s:property value='busType' />">【修改】</a>
							<a href="javascript:deleteData('<s:property value='carid' />')">【删除】</a>
						</td>
					</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
						<td colspan="5" style="text-align:left">&nbsp;&nbsp;
						<label>
							<input type="hidden" name="lx" id="lx" value="3"/>
							<input type="button" name="button" id="id" value="删除" onClick="car_list_batch_del()" class="btn" />
							<input type="button" onClick="location.href='${opt.addAction}'" value="新增"/>
						</label>
						</td>
						<td colspan="5" style="text-align:left">
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
//重置查询的条件值
function car_search_reset(){
	$('#busLicPlate').attr('value','');
}

//单个删除
function deleteData(id) {
	if (window.confirm("确定删除记录?")) {
		var action = '<%=basePath%>${opt.deleteAction}';
		action += "?id=" + id;
		location.href = action;
	}
}

<!--批量删除-->
function car_list_batch_del(){
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
			$('#car_list_form').submit();
		}
	}else
	{
		$('#car_list_form').submit();
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