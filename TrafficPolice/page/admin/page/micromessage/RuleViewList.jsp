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

<script type="text/javascript" src="page/admin/javascript/jquery-1.6.min.js"></script>


<style type="text/css">
body {
	background: #FFF
}
</style>
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
		  }
		$('#ids').val(ids);
		$('#ruleform').submit();
	}else
	{
		$('#ruleform').submit();
	}		
}
		
</script>
</head>

<body>
 <script type="text/javascript">
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
     <form id="ruleform" name="ruleform" action="${opt.delAllAction}">
	<div id="contentWrap">
		<div class="pageTitle">${title}</div>
		<div class="pageColumn">
			<div class="pageButton">
				<a href="${opt.addAction}">【新建内容】</a>
			</div>
			<table>
				<thead>
				  <td width="1%" align="left" >
				  <input type="checkbox" name="allbox"  onclick='ckall(this)'/></td>
					<th width="7%">创建日期</th>
					<th width="25%">名称</th>
					<th width="38%">内容</th>
					<th width="10%">发布日期</th>
					<th width="10%">更新日期</th>
					<th width="10%">操作</th>
				</thead>
				<tbody>
					<s:iterator value="ruleList" status="rule">
						<tr>
						
						<td class="table-cell">
						<input name="id" type="checkbox" class="idcheck" value="<s:property value='id' />"/></td>
                           
						
							<td><s:date name="ruleInsertTime" format="yyyy-MM-dd" /></td>
							<td style="text-align: left">
								<a href="${opt.showAction}?id=<s:property value='id' />">
									<s:property value='ruleTitle' />
								</a>
							</td>
							<td>
							<s:if test="%{ruleContent.length() > 50}">
							 	<s:property value="ruleContent.substring(0,50) + '...'"/>
							</s:if>
							<s:else>
								<s:property value="ruleContent"/>
							</s:else>
							</td>
							<td><s:date name="ruleInsertTime" format="yyyy-MM-dd hh:mm:ss" /></td>
							
							 <td><s:date name="updatetime" format="yyyy-MM-dd hh:mm:ss" /></td>
							<td>
								<a href="${opt.editAction}?id=<s:property value='id' />">【修改】</a>
								<a href="javascript:deleteData('<s:property value='id' />')">【删除】</a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<div class="page"><s:property value='pageString' escape='false'/></div>
			
				
		<div >
			
		<table width="99%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
			  <td width="25%" align="left">
			  <label>
					 <select name="lx"  id="lx">
						<option value="3">批量删除</option>
					  </select>
					  <input type="button" name="button" id="id" value="提交" onClick="formsubmit()"  class="btn" />
					</label>	
				 </td>
			<td width="75%" align="right"></td>
		  </tr>
		</table>
	
		  </div>		
	    </div>
	</div>
		<input name="ids" type="hidden" id="ids" value="" />
	</form>
	
</body>
</html>