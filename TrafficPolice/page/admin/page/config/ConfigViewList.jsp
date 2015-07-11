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

<script type="text/javascript" src="page/admin/common/jquery-1.6.min.js"></script>


<style type="text/css">
body {
	background: #FFF
}
</style>

</head>  

<body>
<form id="configform" name="configform" action="${opt.delAllAction}">
	<div id="contentWrap">
		<div class="pageTitle">${title}</div>
		<div class="pageColumn">
			<table>
				<thead>
                <td width="7%" align="center" class="">
				<input  type="checkbox"  name="allbox" onclick='ckall(this)'/></td>
					<th width="23%">创建日期</th>
					<th width="20%">网站名称</th>
					<th width="21%">更新日期</th>
					<th width="27%">操作</th>
				<td width="2%"></thead>
				<tbody>
					<s:iterator value="configList" status="config">
						<tr>
                            <td class="table-cell">
						<input name="id" type="checkbox" class="idcheck" value="<s:property value='id' />"/></td>
							<td style="text-align: left">&nbsp;&nbsp;<s:date name="addDateTime" format="yyyy-MM-dd" /></td>
							
							<td style="text-align: left">&nbsp;&nbsp;
									<s:property value='siteName' />
							</td>
							<td style="text-align: left">&nbsp;&nbsp;<s:date name="updateTime" format="yyyy-MM-dd hh:mm:ss" /></td>
							<td style="text-align: left">&nbsp;&nbsp;
								<a href="${opt.showAction}?id=<s:property value='id' />">【详情】</a>
								<a href="${opt.editAction}?id=<s:property value='id' />">【修改】</a>
								<a href="javascript:deleteData('<s:property value='id' />')">【删除】</a>
							</td>
						</tr>
					</s:iterator>
					
										<tr class="trstyle">
								<td colspan="4" style="text-align:left">
								&nbsp;
								<label>
										<input type="hidden" name="lx" id="lx" value="3"/>
										&nbsp;&nbsp;<input type="button" name="button" id="id" value="删 除" onClick="formsubmit()" class="btn" />
										&nbsp;&nbsp;<input type="button" onClick="location.href='<%=basePath%>${opt.addAction}'" value="新 增"/>             
								</label>					  </td>
								 <td colspan="6" style="text-align:right">
								<label>
										<div class="page"><s:property value='pageString' escape='false'/></div>   </label>								
								 </td>
					</tr>
				</tbody>
			</table>
		<div >
			

		</div>
				
		</div>
	</div>
	<input name="ids" type="hidden" id="ids" value="" />
</form>	
</body>
</html>
<script type="text/javascript">

<!--单个删除-->
	function deleteData(id) {
		if (window.confirm("确定删除记录?")) {
			var action = '<%=basePath%>${opt.deleteAction}';
			action += "?id=" + id;
			location.href = action;
		}

	}
		
	<!--批量删除-->
	<!--批量删除-->
	function formsubmit(){

	var type = 3;
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
		$('#configform').submit();
	}else
	{
		$('#configform').submit();
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
