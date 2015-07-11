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
		<form id="company_list_form" name="company_list_form" action="${opt.delAllAction}">
			<table>
				<thead>
				  	<th width="2%" style="text-align:center">
				  		<input type="checkbox" name="allbox"  onclick='ckall(this)'/>
				  	</th>
					<th width="10%" >企业安全组名称</th>
					<th width="4%">安全组长</th>
					<th width="4%" >登陆账号</th>
					<th width="4%" >登陆密码</th>
					<th width="11%">所属交警部门</th>
					<th width="9%">所属企业</th>
					<th width="7%">联系电话</th>
					<th width="14%">联系地址</th>
					<th width="20%">操作</th>
				<td width="1%"></thead>
				<tbody>
					<s:if test="#request.companylist.size() == 0">
					<tr>
						<td colspan="8" style="text-align:left">【暂无数据】</td>
					</tr>
					</s:if>
					<s:else>
					<s:iterator value="companylist" status="company">
					<tr>
					
						<td style="text-align:left">&nbsp;&nbsp;<s:property value='#company.count' /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value='comname' /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="linkname" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="loginname" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="password" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="policeOrg.orgname" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="companyname" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="phone" /></td>
						<td style="text-align:left">&nbsp;&nbsp;
							<s:if test="%{addres.length() > 15}">
								<s:property value="addres.substring(0,15)+'...'" />
							</s:if>
							<s:else>
								<s:property value="addres" />
							</s:else>
						</td>
						<td style="text-align:left">&nbsp;&nbsp;
						<a href="${opt.showAction}?id=<s:property value='comid' />">【详情】
							</a>
						<%-- <a href="page/admin/page/safegrouplistback_viewAllSafeGroupList.action?id=<s:property value='comid' />">【企业安全组】
							</a> --%>
							<a href="page/admin/page/driverback_viewDriverList.action?id=<s:property value='comid' />">【人员信息】
							</a>
							<a href="page/admin/page/carback_viewCarList.action?id=<s:property value='comid' />">【车辆信息】
							</a>
							<%-- <a href="${opt.editAction}?id=<s:property value='comid' />&orgid=<s:property value='policeOrg.id' />">【修改】
							</a>
							<a href="javascript:deleteData('<s:property value='comid' />')">【删除】</a> --%>
						</td>
					</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
						<td colspan="5" style="text-align:left">
						<label>
						<%-- 	<input type="hidden" name="lx" id="lx" value="3"/>
							<input type="button" name="button" id="id" value="删除" onClick="company_list_batch_del()" class="btn" />
							<input type="button" onClick="location.href='${opt.addAction}'" value="新增"/> --%>
							
						</label>
						</td>
						<td colspan="6" style="text-align:left">
							<%-- <div class="page"><s:property value='pageString' escape='false'/></div> --%>
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
function company_search_reset(){
	$('#comid').attr('value','');
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
function company_list_batch_del(){
	if( type = "")
	{
		alert("请选择操作类型");
		return;
	}
	var type = $('#lx').val();
	alert(type);
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
			$('#company_list_form').submit();
		}
	}else
	{
		$('#company_list_form').submit();
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