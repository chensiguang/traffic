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
		<div class="pageColumn" >
			<form id="searchform" name="searchform" action="<%=basePath%>page/admin/page/policeback_viewPoliceList.action">
			<table class="main-talbe">
                  <!--tr class="trstyle" >
					<td style="text-align:left" colspan="6"><b>&nbsp;交警基本信息查询</b></td>
				  </tr>-->
				
				  <tr>
					  <td width="8%" style="text-align:left">&nbsp;姓名：</td>
					  <td width="24%" style="text-align:left">&nbsp;
				          <input type="text" name="searchname" id="searchname" value="<s:property value="policename.name"/>"></input>
					  </td>
					  <td width="11%" style="text-align:left">&nbsp;性别:</td>
				      <td width="23%" style="text-align:left">
						   <select id="searchsex" name="searchsex">
							 <option value="" >请选择</option>
							 <option value="1" <s:if test="policename.sex==1"> selected="selected" </s:if>> 男 </option>
							 <option value="2" <s:if test="policename.sex==2"> selected="selected" </s:if>> 女 </option>
						   </select>
					  </td>
					   <td width="8%" style="text-align:left">&nbsp;编号：</td>
					   <td width="26%" style="text-align:left">
				         <input type="text" name="searchpno" id="searchpno" value="<s:property value="policename.pno"/>"></input>
					   </td>
				  </tr>
				  <!--<tr>
				    <td width="8%" style="text-align:left">&nbsp;身份证号：</td>
					<td width="24%" style="text-align:left">&nbsp;
				       <input type="text" id="identitycard"></input>
					</td>
					<td width="11%" style="text-align:left">&nbsp;所属机构:</td>
					<td width="23%" style="text-align:left"><input type="text" id="orgid"></input></td>
					<td width="8%" style="text-align:left">&nbsp;所在地区：</td>
				    <td width="26%" style="text-align:left">
				    <input type="text" id="areaid"></input></td>
				  </tr>-->
				  <tr class="trstyle">
					  <td colspan="6" style="text-align:center">
						
							  <input type="submit"  value="查 询"/>&nbsp;&nbsp;
							  <input type="button" value="清 空" onClick="police_reset()" />  
						
					 </td>
				  </tr>
			</table>
			</form>
			<form id="ruleform" name="ruleform" action="${opt.delAllAction}">
			<table>
				<thead>
			  <th width="5%" height="100" align="left" >
			    <input type="checkbox" name="allbox"  onclick='ckall(this)'/></th>
				<th width="7%" align="center">序号</th>
					<th width="7%" align="center">姓名</th>
					<th width="8%" align="center">性别</th>
					<th width="13%" align="center">编号</th>
					<!--<th width="9%" align="center">身份证号码</th>-->
					<th width="16%" align="center">所属交警部门</th>
					<th width="9%" align="center">电话</th>
					<th width="11%" align="center">所在地区</th>
					<!--<th width="11%" align="center">详细地址</th>-->
					<th width="23%" align="center">操作</th>
				<td width="1%">
			  <tbody>
			      <s:if test="#request.policeList.size() == 0">
					<tr>
						<td colspan="9" style="text-align:left">【暂无数据】</td>
					</tr>
				  </s:if>
				  <s:else>
				 <s:iterator value="policeList" status="police">
						<tr>
						<td class="table-cell">
						<input name="id" type="checkbox" class="idcheck" value="<s:property value='id' />"/></td>
						<td  style="text-align:left">&nbsp;&nbsp;
						  <s:property value="#police.count"/>						</td>
							<td style="text-align:left">&nbsp;&nbsp;
									<s:property value='name'/>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="sex"/></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="pno"/></td>
							<!--<td style="text-align:left"><s:property value="identitycard"/></td>-->
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="orgname"/></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="telephone"/></td>
							<td style="text-align:left">&nbsp;&nbsp;<s:property value="areaname"/></td>
							<!--<td style="text-align:left"><s:property value="addres"/></td>-->
							<td  style="text-align:left">&nbsp;&nbsp;
							<a href="${opt.showAction}?id=<s:property value='id' />">【详情】</a>
							<a href="javascript:showpcar('<s:property value='id' />','<s:property value='name' />','<s:property value='userno' />')">【查看管辖车辆】</a>		
								<a href="${opt.editAction}?id=<s:property value='id' />&orgid=<s:property value='orgid' />">【修改】</a>
								<a href="javascript:deleteData('<s:property value='id' />')">【删除】</a>					 </td>
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
								 <td colspan="5" style="text-align:left">
								 <label>
										<div class="page"><s:property value='pageString' escape='false'/></div>   </label>								 </td>
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
<!--表单重置-->
function police_reset()
{
   $('#searchname').attr('value','');
   $('#searchsex').attr('value','');
   $('#searchpno').attr('value','');
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
	alert(1);
	$('#ruleform').submit();
}		
}

<!--查看管辖车辆-->
function showpcar(id,name,userno){
  var action = '<%=basePath%>page/admin/page/pcarback_viewPcarList.action';
  action += "?id=" + id+"&name="+name+"&userno="+userno;
  location.href = action;
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