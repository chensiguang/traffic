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
			<form id="searchform" action="<%=basePath%>page/admin/page/ruleback_viewRuleList.action">
			<table class="main-talbe">
				
				  <tr>
					  <td width="11%" style="text-align:left">&nbsp;标题：</td>
					  <td width="38%" style="text-align:left">&nbsp;
				          <input type="text" name="searchtitle" id="searchtitle" value="<s:property value="searchrule.ruleTitle"/>"></input>
				    </td>
					   <td width="10%" style="text-align:left">&nbsp;发布日期：</td>
					   <td width="41%" style="text-align:left">
				         <input type="text" name="searchstarttime" id="searchstarttime"  class="datetime" value="<s:property value="searchstarttime"/>"></input>&nbsp;至&nbsp;
						 <input type="text" name="searchendtime"  id="searchendtime" class="datetime" value="<s:property value="searchendtime"/>"></input>
				    </td>
				  </tr>

				  <tr class="trstyle">
					  <td colspan="6" style="text-align:center">
							  <input type="submit"  value="查 询"/>&nbsp;&nbsp;
							  <input type="reset" onClick="rule_reset();" value="清 空" /> 
					 </td>
				  </tr>
			 </table>
		 </form>
		 <form id="ruleform" name="ruleform" action="${opt.delAllAction}">
			   <table width="44%">
                 <thead>
                    <td width="5%" align="center" ><input type="checkbox" name="allbox"  onClick='ckall(this)'/></td>
                     <th width="6%">序号</th>
                     <th width="9%">创建日期</th>
                     <th width="18%">标题</th>
                     <th width="30%">内容</th>
                     <th width="16%">更新日期</th>
                     <th width="16%">操作</th>            
                 <tbody>
				  <s:if test="#request.ruleList.size() == 0">
					<tr>
						<td colspan="9" style="text-align:left">【暂无数据】</td>
					</tr>
				  </s:if>
				  <s:else>
                   <s:iterator value="ruleList" status="rule">
                     <tr>
                       <td class="table-cell"><input name="id" type="checkbox" class="idcheck" value="<s:property value='id' />"/></td>
                       <td style="text-align:left">&nbsp;&nbsp;<s:property value="#rule.index+1"/></td>
                       <td style="text-align:left">&nbsp;&nbsp;<s:date name="ruleInsertTime" format="yyyy-MM-dd" /></td>
                       <td style="text-align:left">&nbsp;&nbsp;
                       <s:if test="%{ruleTitle.length() > 15}">
                         <s:property value='ruleTitle.substring(0,15) + "..."' />
                         </s:if>
                         <s:else>
                         <s:property value='ruleTitle' />
                         </s:else>
                        </td>
                       <td style="text-align: left">&nbsp;&nbsp;<s:if test="%{ruleContent.length() > 30}">
                           <s:property value="ruleContent.substring(0,30) + '...'"/>
                         </s:if>
                           <s:else>
                             <s:property value="ruleContent"/>
                           </s:else>
                        </td>
                       <td style="text-align:left">&nbsp;&nbsp;<s:date name="ruleInsertTime" format="yyyy-MM-dd hh:mm:ss" /></td>
                       <!-- <td><s:date name="updatetime" format="yyyy-MM-dd hh:mm:ss" /></td>-->
                       <td style="text-align: left">&nbsp;&nbsp;
                       <a href="${opt.showAction}?id=<s:property value='id' />">【详情】</a>
                       <a href="${opt.editAction}?id=<s:property value='id' />">【修改】</a> 
                       <a href="javascript:deleteData('<s:property value='id' />')">【删除】</a> </td>
                     </tr>
                   </s:iterator>
				   </s:else>
                   <tr class="trstyle">
                     <td colspan="4" style="text-align:left">&nbsp;
                         <label>
                         <input type="hidden" name="lx" id="lx" value="3"/>
                         <input type="button" name="button" id="id" value="删 除" onClick="formsubmit()" class="btn" />
                         <input name="button" type="button" onClick="location.href='<%=basePath%>${opt.addAction}'" value="新 增"/>
                         </label>
                     </td>
                     <td colspan="4" style="text-align:left">
					 <label> 
                         <div class="page">
                           <s:property value='pageString' escape='false'/>
                         </div>
					 </label>
					 </td>
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
function rule_reset(){
  $('#searchtitle').attr('value','');
  $('#searchstarttime').attr('value','');
  $('#searchendtime').attr('value','');
}
   <!--日期格式限定-->
  $('.datetime').datepicker({
    	dateFormat:"yy-mm-dd"
   });
   
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