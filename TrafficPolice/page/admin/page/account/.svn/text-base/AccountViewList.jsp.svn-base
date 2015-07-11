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
<script type="text/javascript" src="page/admin/javascript/jquery-1.6.min.js"></script>
<!-- jquery日历插件 -->
	<link rel="stylesheet" type="text/css" href="page/admin/javascript/newdate/jquery-ui-1.8.13.custom.css"/>
	<script type="text/javascript" language="javascript" src="page/admin/javascript/newdate/jquery-ui-1.8.9.custom.js"></script>
	<script type="text/javascript" language="javascript" src="page/admin/javascript/newdate/jquery.ui.datepicker-zh-CN.js"></script>
	<script type="text/javascript" language="javascript" src="page/admin/javascript/newdate/jquery-ui-timepicker-addon.js"></script>
	<script type="text/javascript" src="page/admin/javascript/newdate/date.js"></script>


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
		<form id="searchform" name="searchform" action="page/admin/page/account_viewAccountList.action">
			<table class="main-talbe">
				  <tr>
					  <td width="8%" style="text-align:left">&nbsp;登录名称：</td>
					  <td width="20%" style="text-align:left">&nbsp;
				          <input type="text" name="searchname" id="searchname" value='<s:property value="searchname"/>'/>
				    </td>
				    
				<%--<td width="8%" style="text-align:left">&nbsp;角色：</td>
				      <td width="26%" style="text-align:left">
				      
				      <select name="searchroleno" id="searchroleno">
				      <option>请选择角色</option>
				      <s:iterator value="accountList">
				      <option value='<s:property value="roleno"/>'><s:property value="role.rolename"/></option>
				      </s:iterator>
				      </select>
				    </td> --%>
					   <td width="10%" style="text-align:left">&nbsp;创建日期：</td>
					   <td width="28%" style="text-align:left">
				         <input type="text" name="searchstarttime" id="searchstarttime" value="<s:property value="searchstarttime"/>" class="datetime"></input>&nbsp;至
						 <input type="text" name="searchendtime" id="searchendtime" value="<s:property value="searchendtime"/>" class="datetime"></input>
				    </td>
				  </tr>
				  <tr class="trstyle">
					  <td colspan="6" style="text-align:center">
						
							  <input type="submit"  value="查 询"/>&nbsp;&nbsp;
							  <input type="reset" value="清 空" onClick="account_reset()" />  
						
					 </td>
				  </tr>
			</table>
			</form>
		
			<form id="accountform" name="accountform" action="${opt.delAllAction}">					
			<table>
				<thead>
				  <td width="2%" align="center" ><input type="checkbox" name="allbox"  onclick='ckall(this)'/></td>
					<th width="2%" align="center">序号</th>
					<th width="4%" align="center">创建日期</th>
					<th width="5%" align="center">登录名称</th>
					<th width="5%" align="center">密码</th>
					<th width="10%" align="center">用户姓名</th>
					<th width="6%" align="center">角色</th>
					<th width="11%" align="center">所属单位</th>
					<th width="5%" align="center">账号类型</th>
					<th width="8%" align="center">电话</th>
					<th width="6%" align="center">数据管理员</th>
					<th width="8%" align="center">更新日期</th>
					<th width="23%" align="center">操作</th>
				<td width="1%"></thead>
				<tbody>
				 <s:if test="#request.accountList.size() == 0">
					<tr>
						<td colspan="12" style="text-align:left">【暂无数据】</td>
					</tr>
				  </s:if>
				  <s:else>
					<s:iterator value="accountList" status="account">
						<tr>
						<td class="table-cell">
						<input align="left" name="id" type="checkbox" class="idcheck" value="<s:property value='userno' />"/></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="#account.index + 1" /></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:date name="regtime" format="yyyy-MM-dd" /></td>
							<td style="text-align: left">&nbsp;&nbsp;<s:property value='loginname' /></td>
							<td style="text-align: left">&nbsp;&nbsp;<s:property value='password' /></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="driver.name" /><s:property value="police.policename" /></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="role.rolename" /></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="company.comname" /></td>
							<td style="text-align:left">&nbsp;&nbsp;
							<s:if test="typeid == 0">交警部门</s:if>
							<s:else>货运公司</s:else>
							</td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="telephone" /></td>
							<td style="text-align:left">&nbsp;&nbsp;
							<s:if test="adminflag == 0">否</s:if>
							<s:else>是</s:else>
							</td>
						    <td><s:date name="opertime" format="yyyy-MM-dd hh:mm:ss" /></td>
							
							<td style="text-align:left">&nbsp;&nbsp;
							    <a href="${opt.showAction}?id=<s:property value='userno' />">【详情】</a>
								<a href="${opt.editAction}?id=<s:property value='userno' />">【修改】</a>
								<a href="javascript:deleteData('<s:property value='userno' />')">【删除】</a>
								<a href="javascript:updateAdminflag('<s:property value='userno' />')">【设为数据管理员】</a>
								<a href="javascript:deleteAdminflag('<s:property value='userno' />')">【撤销】</a>
							</td>
						</tr>
					</s:iterator>
					</s:else>
						<tr class="trstyle">
								<td colspan="6" style="text-align:left">
								&nbsp;
								<label>
										<input type="hidden" name="lx" id="lx" value="3"/>
										<input type="button" name="button" id="id" value="批量删除" onClick="formsubmit()" class="btn" />
										<input type="button" onClick="location.href='<%=basePath%>${opt.addPoliceAction}?dwtype=0'" value="交警部门账号新增"/>  
										<input type="button" onClick="location.href='<%=basePath%>${opt.addOrgAction}?dwtype=1'" value="货运企业账号新增"/> 
										<input type="button" onClick="location.href='<%=basePath%>${opt.addOrgAction}?dwtype=2'" value="驾驶员账号新增"/>           
								</label>					  </td>
								 <td colspan="5" align="right">
								 <label>
										<div class="page" align="right"><s:property value='pageString' escape='false'/></div> 
								</label></td>
					</tr>
				</tbody>
			</table>
					<input name="ids" type="hidden" id="ids" value="" />
	</form>
	    </div>
	</div>

	
</body>
</html>
<script type="text/javascript">
function account_reset(){
	  $('#searchname').attr('value','');
	  $('#searchroleno').attr('value','');
	  $('#searchstarttime').attr('value','');
	  $('#searchendtime').attr('value','');
	}


	<!--日期格式限定-->
	$('.datetime').datepicker({
		dateFormat:"yy-mm-dd"
	});
	
	function deleteData(id) {
		if (window.confirm("确定删除记录?")) 
		{
			var action = '<%=basePath%>${opt.deleteAction}';
			if(id==0)
				{
				alert("总权限账号不能被删除!")
				return;
				location.href = action;
				}
			else{
				action += "?id=" + id;
				location.href = action;
			}
		}
	}
	
	<!--批量删除-->
	function formsubmit(){
	var type = 3;
	if(type == 3)
	{
	var ids = "";
		$('input[name=id]:checked:checked').each(function(){
				ids += $(this).val() + "#";
				if($(this).val()==0)
				{
					alert("总权限账号不能被删除!")
					return;
					location.href = action;
				}
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

	//设置账号为数据管理员
function updateAdminflag(id) {
		if (window.confirm("确定设置该账号为数据管理员?")) 
		{
			var action = '<%=basePath%>page/admin/page/account_updateAdminflag.action';
			if(id==0)
			{
			alert("总权限账号请勿重复设置!")
			return;
			location.href = action;
			}
		else{
			action += "?id=" + id;
			location.href = action;
		}
		}
	}
	
//取消账号为数据管理员
function deleteAdminflag(id) {
		if (window.confirm("确定取消该账号数据管理员身份?")) 
		{
			var action = '<%=basePath%>page/admin/page/account_deleteAdminflag.action';
			if(id==0)
			{
			alert("总权限账号不能取消数据管理员身份!")
			return;
			location.href = action;
			}
		else{
			action += "?id=" + id;
			location.href = action;
		}
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