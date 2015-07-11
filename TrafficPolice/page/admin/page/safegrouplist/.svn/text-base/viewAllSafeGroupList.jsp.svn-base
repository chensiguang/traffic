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
		<form id="company_search_form" name="company_search_form" action="<%=basePath%>page/admin/page/safegrouplistback_viewAllSafeGroupList.action">
			<table class="main-talbe">
				  <tr>
					  <td width="8%" style="text-align:left">&nbsp;安全组名称：</td>
					  <td width="20%" style="text-align:left">&nbsp;
				          <input type="text" name="searchname" id="searchname" value='<s:property value="searchname"/>'/>
				    </td>
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
		<form id="company_list_form" name="company_list_form" action="${opt.delAllAction}">
			<table>
				<thead>
				  	<th width="2%" style="text-align:center">
				  		<input type="checkbox" name="allbox"  onclick='ckall(this)'/>
				  	</th>
					<th width="2%" >序号</th>
					<th width="7%" >添加时间</th>
					<th width="10%" >企业名称</th>
					<th width="12%">安全组组名</th>
					<th width="9%">组长</th>
					<th width="5%">组别成员数</th>
					<th width="5%">组别车辆数</th>
					<th width="11%" >更新时间</th>
					<th width="14%">操作</th>
				<td width="1%"></thead>
				<tbody>
					<s:if test="#request.safeGroupList.size() == 0">
					<tr>
						<td colspan="8" style="text-align:left">【暂无数据】</td>
					</tr>
					</s:if>
					<s:else>
					<s:iterator value="safeGroupList" status="safeGroup">
					<tr>
						<td class="table-cell" style="text-align:center"><input name="id" type="checkbox" class="idcheck" value="<s:property value='groupid' />"/></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="#safeGroup.index + 1"/></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:date name="regtime"  format="yyyy-MM-dd"/></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="company.comname" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value='groupname' /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="zzname" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="drivernum" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="carnum" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:date name="opertime"  format="yyyy-MM-dd hh:mm:ss"/></td>
						<td style="text-align:left">&nbsp;&nbsp;
						<a href="${opt.showAction}?id=<s:property value='groupid' />">【详情】
						</a>
							<a href="${opt.editAction}?id=<s:property value='groupid' />&dwid=<s:property value='dwid' />">【修改】
							</a>
							<a href="javascript:deleteData('<s:property value='groupid' />','<s:property value='dwid' />')">【删除】</a>
						   <input type="hidden" value="<s:property value='dwid' />" name="dwid"/>
						</td>
					</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
						<td colspan="5" style="text-align:left">
						<label>
							<input type="hidden" name="lx" id="lx" value="3"/>
							<input type="button" name="button" id="id" value="删除" onClick="company_list_batch_del()" class="btn" />
							<input type="button" onclick='javascript:$("#form1").submit()' value="新增"/>
							<input type="button" onclick='location.href="page/admin/page/companyback_viewCompanyList.action"' value="返回企业管理"/>
							<input type="button" onclick='location.href="page/admin/page/safegroupback_viewAllSafeGroup.action?id=${dwid}"' value="跳到到人员,车辆分配"/>
							<input type="button" value="返 回上一步" name="text" onclick="javascript:history.back();"/>
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
				<form action="page/admin/page/safegrouplistback_addSafeGroupList.action" id="form1">
			        <input type="hidden" name="dwid" value="${dwid }"/>
		        </form>
		</div>		
	    </div>
</body>
<script type="text/javascript">
//重置查询的条件值
function company_search_reset(){
	$('#comname').attr('value','');
}

//单个删除
function deleteData(id,dwid) {
	if (window.confirm("确定删除记录?")) {
		var action = '<%=basePath%>${opt.deleteAction}';
		action += "?id=" + id +"&dwid=" + dwid;
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
</html>