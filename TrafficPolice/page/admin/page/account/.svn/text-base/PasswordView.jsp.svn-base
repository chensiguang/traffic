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
     <form id="accountform" name="accountform" action="${opt.delAllAction}">
	<div id="contentWrap">
		<div class="pageTitle">个人信息</div>
		<div class="pageColumn">
			<div class="pageButton">
			</div>
			<table>
				<thead>
					<th width="7%" align="center">创建日期</th>
					<th width="7%" align="center">登录名称</th>
					<th width="11%" align="center">用户名称</th>
					<th width="7%" align="center">登录密码</th>
					<th width="10%" align="center">角色</th>
					<th width="8%" align="center">电话</th>
					<th width="24%" align="center">地址</th>
					<th width="8%" align="center">更新日期</th> 
					<th width="10%" align="center">操作</th>
				</thead>
				<tbody>
						<tr>
							<td><s:date name="account2.regtime" format="yyyy-MM-dd" /></td>
							<td style="text-align: left">${account2.loginname }</td>
							<td>${account2.driver.name}${account2.policename }</td>
							<td><s:property value="account2.password" /></td>
							<td><s:property value="account2.role.rolename" /></td>
							<td><s:property value="account2.telephone" /></td>
							<td><s:property value="account2.address" /></td>
						    <td><s:date name="account2.opertime" format="yyyy-MM-dd hh:mm:ss" /></td>
							
							<td>
								<a href="${opt.passwordEditAction}?id=<s:property value='account2.username' />">【修改密码】</a>
							</td>
						</tr>
				</tbody>
			</table>
			<div class="page"><s:property value='pageString' escape='false'/></div>
		<div >
		  </div>		
	    </div>
	</div>
		<input name="ids" type="hidden" id="ids" value="" />
	</form>
	
</body>
</html>
<script type="text/javascript">
	function deleteData(id) {
		if (window.confirm("确定删除记录?")) {
			var action = '<%=basePath%>${opt.deleteAction}';
			action += "?id=" + id;
			location.href = action;
		}

	}
	<!--批量删除-->
	function formsubmit(){
	if(type == "")
	{
		alert("请选择操作类型");
		return;
	}
	var type = $("#lx").val();
	if(type == 3)
	{
	var ids = "";
		$('input[name=id]:checked:checked').each(function(){
				ids += $(this).val() + "#";
		});
		if(ids == ""){
		  	alert("请选择您要操作的数据");
			return ;
		  }
		$('#ids').val(ids);
		
		$('#accountform').submit();
	}else
	{
		$('#accountform').submit();
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