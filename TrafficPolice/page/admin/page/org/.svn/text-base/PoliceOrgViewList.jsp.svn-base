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
			
				<form id="searchform" name="searchform" action="<%=basePath%>page/admin/page/orgback_viewPoliceOrgList.action">
			<table class="main-talbe">
				  <tr>
					  <td width="8%" style="text-align:left">&nbsp;部门名称：</td>
					  <td width="20%" style="text-align:left">&nbsp;
				          <input type="text" name="searchorgname" id="searchorgname" value='<s:property value="searchorgname"/>'/>
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
							  <input type="reset" value="清 空" onClick="unit_reset()" />  
						
					 </td>
				  </tr>
			</table>
			</form>
			
			  <form id="ruleform" name="ruleform" action="${opt.delAllAction}">
			<table>
				<thead>
				  <td width="5%" align="center" >
				  <input type="checkbox" name="allbox"  onclick='ckall(this)'/></td>
				  <th width="7%">序号</th>
				  	<th width="9%">创建日期</th>
					<th width="12%">部门名称</th>
					<th width="13%">上级单位</th>
					<th width="12%">电话</th>
					<th width="13%">地址</th>
					<th width="13%">更新日期</th>
					<th width="15%">操作</th>
				<td width="1%"></thead>
				<tbody>
				 <s:if test="#request.orglist.size() == 0">
					<tr>
						<td colspan="12" style="text-align:left">【暂无数据】</td>
					</tr>
				  </s:if>
				  <s:else>
					<s:iterator value="orglist" status="org">
						<tr>
						
						<td class="table-cell">
						<input name="id" type="checkbox" class="idcheck" value="<s:property value='id' />"/></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value="#org.index+1"/></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:date name="regtime" format="yyyy-MM-dd"/></td>
							<td style="text-align: left">&nbsp;&nbsp;
									<s:property value='orgname' />
							</td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="policeOrg.name"/></td>
							<td style="text-align: left">&nbsp;&nbsp;<s:property value="phone"/></td>
							<td style="text-align: left">&nbsp;&nbsp;<s:property value="address"/></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:date name="opertime" format="yyyy-MM-dd hh:mm:ss"/></td>
							<td style="text-align:left">&nbsp;&nbsp;
							<a href="${opt.showAction}?id=<s:property value='id' />">【详情】</a>
								<a href="${opt.editAction}?id=<s:property value='id' />">【修改】</a>
								<a href="javascript:deleteData('<s:property value='id' />')">【删除】</a>
							</td>
						</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
								<td colspan="5" style="text-align:left">
								&nbsp;
								<label>
										<input type="hidden" name="lx" id="lx" value="3"/>
										<input type="button" name="button" id="id" value="删 除" onClick="formsubmit()" class="btn" />
										<input type="button" onClick="location.href='<%=basePath%>${opt.addAction}'" value="新 增"/>             
								</label>					  </td>
								 <td colspan="6" style="text-align:left">
								 <label>
										<div class="page"><s:property value='pageString' escape='false'/></div>   </label> </td>
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

 <!--日期格式限定-->
$('.datetime').datepicker({
	dateFormat:"yy-mm-dd"
});
  <!--表单重置-->
 function unit_reset(){
   $('#searchorgname').attr('value','');
   $('#searchstarttime').attr('value','');
   $('#searchendtime').attr('value','');
 }


   <!--删除单条记录-->
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