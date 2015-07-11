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
<%
String name = (String)request.getParameter("name");
String pid = (String)request.getParameter("id");
String userno = (String)request.getParameter("userno");
%>
<style type="text/css">
body {
	background: #FFF
}
</style>

</head>

<body>
	<div id="contentWrap">
		<div class="pageColumn">
			
			<form id="searchform" action="<%=basePath%>page/admin/page/pcarback_viewPcarList.action">
			<table class="main-talbe">
                  <tr class="trstyle" >
					<td style="text-align:left" colspan="6"><b>&nbsp;&nbsp;<%=name%>&nbsp;管辖车辆信息查询</b></td>
				  </tr>
				
				  <tr>
					  <td width="11%" style="text-align:left">&nbsp;车牌号：</td>
					  <td width="38%" style="text-align:left">&nbsp;
				          <input type="text" name="searchbuslicplate" id="searchbuslicplate" value="<s:property value="parsearch.buslicplate"/>"></input>
				    </td>
					   <td width="10%" style="text-align:left">&nbsp;所属公司：</td>
					   <td width="41%" style="text-align:left">
				         <input type="text" name="searchcompany" id="searchcompany" value="<s:property value="pcar.company"/>"></input>
				    </td>
				  </tr>

				  <tr class="trstyle">
					  <td colspan="6" style="text-align:center">
						<label>
							  <input type="submit"  value="查 询"/>&nbsp;&nbsp;
							  <input type="button" value="清 空" onClick="pcar_reset()"/> 
							  <input name="id" type="hidden" id="id" value="<%=pid%>"/>
		                      <input name="name" type="hidden" id="name" value="<%=name%>" />
		                      <input name="userno" type="hidden" id="userno" value="<%=userno%>" /> 
							  
						</label>
					 </td>
				  </tr>
			</table>
		 </form>
		 <form id="pcarform" name="pcarform" action="${opt.delAllAction}">
			<table>
				<thead>
				  <th width="4%" height="100" align="left" >
				  <input type="checkbox" name="allbox"  onclick='ckall(this)'/></th>
					<th width="11%" align="center">序号</th>
					<th width="14%" align="center">车牌号码</th>
					<th width="15%" align="center">所属公司</th>
					<th width="14%" align="center">操作时间</th>
					<th width="14%" align="center">划归人</th>
					<th width="27%" align="center">操作</th>
				<td width="1%"></thead>
				  <tbody>
				   <s:if test="#request.pcarList.size() == 0">
					<tr>
						<td colspan="8" style="text-align:left">【暂无数据】</td>
					</tr>
				  </s:if>
				  <s:else>
					<s:iterator value="pcarList" status="pcar">
						<tr>
						<td class="table-cell">
						<input name="id" type="checkbox" class="idcheck" value="<s:property value='udid' />"/></td>
						<td>
						
						  <s:property value="#pcar.count"/>
						</td>
							<td style="text-align: left">
							 <s:property value='buslicplate' />							
							</td>
							<td><s:property value="comname"/></td>
							<td><s:date name="opertime" format="yyyy-MM-dd"/></td>
							<td><s:property value="opername"/></td>
							<td width="27%">
							<a href="<%=basePath%>page/admin/page/carback_detailCar.action?id=<s:property value='carid' />">【查看车辆详情】</a>
							<a href="javascript:deleteData('<s:property value='udid' />','<%=pid%>','<%=name%>')">【移除】</a>					 </td>
						</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
								<td colspan="4" style="text-align:left">
								&nbsp;
								<label>
										<input type="hidden" name="lx" id="lx" value="3"/>
										<input type="button" name="button" id="id" value="删 除" onClick="formsubmit()" class="btn" />
										<input type="button" onClick="addcarData()" value="新 增"/>             
								</label>					  </td>
								 <td colspan="3" style="text-align:left">
								 <label>
										<span class="page"><s:property value='pageString' escape='false'/></span>   </label>								 </td>
					</tr>
					
				</tbody>
			</table>

	 
		<input name="ids" type="hidden" id="ids" value="" />
		<input name="pid" type="hidden" id="pid" value=""/>
		<input name="pname" type="hidden" id="pname" value="" />
		<input name="puserno" type="hidden" id="puserno" value="" />
	</form>
	   </div>
	</div>
</body>
</html>
<script type="text/javascript">

  <!--表单值重置-->
  function pcar_reset(){
      $('#searchbuslicplate').attr('value','');
	  $('#searchcompany').attr('value','');
  }

 var userno = '<%=userno%>';
 var pid = '<%=pid%>';
 var pname = '<%=name%>';
  <!-- 删除单条记录-->
	function deleteData(id,pid,name) {
		if (window.confirm("确定删除记录?")) {
			var action = '<%=basePath%>${opt.deleteAction}';
			action += "?id=" + id+"&pid="+pid+"&name="+name+"&userno="+userno;
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
		  } else {
		  if (window.confirm("确定删除记录?")) {
		  
		    $('#ids').val(ids);
			$('#pid').val(pid);
			$('#pname').val(pname);
			$('#puserno').val(userno);
		    $('#pcarform').submit();
		  }
		}
	}else
	{
		$('#pcarform').submit();
	}		
}		
    <!--添加车辆-->
	function addcarData(){
		var aciton1="";
		if(userno =="null" || userno == ""){
		   alert("请给该交警人员添加系统的登录账号,添加登录账号后才可以添加管辖车辆！");
		}
		else{
		   aciton1 = "<%=basePath%>page/admin/page/carback_viewCarList_new.action";
		   aciton1 += "?userno="+userno+"&pid="+pid+"&name="+pname;
		   location.href = aciton1;
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