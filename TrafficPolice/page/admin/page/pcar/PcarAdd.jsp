<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
   String basePath = (String)session.getAttribute("basePath");
   String userid = (String)request.getParameter("userno");
   String pid = (String)request.getParameter("pid");
   String name = (String)request.getParameter("name");
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
    <form id="car_list_form" name="car_list_form" action="<%=basePath%>page/admin/page/pcarback_saveNews.action">
	<div id="contentWrap">
		<div class="pageTitle">添加管辖车辆</div>
		<div class="pageColumn">
			<div class="pageButton">
				<a href="javascript:history.back()">【返回】</a>
			</div>
			<table>
				<thead>
				  	<th width="4%" style="text-align:left">
				  		&nbsp;<input type="checkbox" name="allbox"  onclick='ckall(this)'/>
				  	</th>
					<th width="6">序号</th>
					<th width="10%">车牌号</th>
					<th width="10%">车辆类型</th>
					<th width="11%">所属公司</th>
					<th width="11%">所属地区</th>
					<th width="12%">厂牌型号</th>
					<th width="24%">生产厂家</th>
					<th width="12%">操作</th>
				</thead>
				<tbody>
					<s:iterator value="carList" status="car">
						<tr>
							<td class="table-cell" style="text-align:left">
								&nbsp;<input name="id" type="checkbox" class="idcheck" value="<s:property value='carid' />"/>
							</td>
							<td style="text-align:left"><s:property value='#car.count' /></td>
							<td style="text-align:left">
								<a href="${opt.showAction}?id=<s:property value='carid' />">
									<s:property value='busLicPlate' />
								</a>
							</td>
							<td style="text-align:left"><s:property value="busType" /></td>
							<td style="text-align:left"><s:property value="company.comname" /></td>
							<td style="text-align:left"><s:property value="area.areaname"/></td>
							<td style="text-align:left"><s:property value="factoryType" /></td>
							<td style="text-align:left"><s:property value="manufacturer" /></td>
							<td style="text-align:left">
								<a href="javascript:addCar('<s:property value='carid' />')">【添加】</a>
							</td>
						</tr>
					</s:iterator>
					<tr class="trstyle">
								<td colspan="5" style="text-align:left">
								&nbsp;
								<label>
										<input type="hidden" name="lx" id="lx" value="3"/>
										<input type="button" name="button" id="id" value="批量添加" onClick="car_list_batch_add()" class="btn" />
										
								</label>					  </td>
								 <td colspan="4" style="text-align:left">
								 <label>
										<span class="page"><s:property value='pageString' escape='false'/></span>   </label>								 </td>
					</tr>
				</tbody>
			</table>
		<!--	<div class="page"><s:property value='pageString' escape='false'/></div>	
		<div >
		<table width="99%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td width="25%">
			  	<label>
					<select name="lx"  id="lx">
						<option value="3">批量添加</option>
					</select>
					<input type="button" name="button" id="id" value="提交" onClick="car_list_batch_add()" class="btn" />
				</label>	
				</td>
				<td width="75%" align="right"></td>
		  </tr>
		</table>-->
		
		</div>		
	    </div>
	</div>
		<input name="ids" type="hidden" id="ids" value="" />
		<input name="userid" type="hidden" id="userid" value="" />
		<input name="pid" type="hidden" id="pid" value="" />
		<input name="name" type="hidden" id="name" value="" />
	</form>	
</body>
</html>
<script type="text/javascript">
var userid = '<%=userid%>';
var pid = '<%=pid%>';
var name = '<%=name%>';
function addCar(id) {
		if (window.confirm("确定要管辖该辆车?")) {
			var action = '<%=basePath%>page/admin/page/pcarback_saveNew.action';
			action += "?carid=" + id+"&userid="+userid+"&pid="+pid+"&name="+name;
			location.href = action;
		}

	}
<!--批量添加-->
function car_list_batch_add(){
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
		}else if (window.confirm("确定添加记录?")){
			$('#ids').val(ids);
			$('#userid').val(userid);
			$('#pid').val(pid);
			$('#name').val(name);
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