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
<link href="page/css/css.css" rel="stylesheet" type="text/css" />

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
		<form id="searchform" action="<%=basePath%>page/admin/page/interchangeback_viewInterchangeList.action">
			<table class="main-talbe">
                  <!--<tr class="trstyle" >
					<td style="text-align:left" colspan="6"><b>&nbsp;${title}查询</b></td>
				  </tr>-->
				
				  <tr>
					  <td width="11%" style="text-align:left">&nbsp;问题：</td>
					  <td width="38%" style="text-align:left">&nbsp;
				          <input type="text" name="searchquestion" id="searchquestion" value="<s:property value="searchinter.question"/>"></input>
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
							  <input type="reset" onClick="interchangereset();" value="清 空" /> 
					 </td>
				  </tr>
			</table>
		 </form>
		 
		<form id="ruleform" name="ruleform" action="${opt.delAllAction}">
			<table class="main_table">
              <thead>
                <th width="10%">序号</th>
                <th width="29%">问题</th>
                <th width="18%">发布日期</th>
                <th width="19%">发布者</th>
                <th width="24%">操作</th>
              <tbody>
			   <s:if test="#request.interchangeList.size() == 0">
					<tr>
						<td colspan="9" style="text-align:left">【暂无数据】</td>
					</tr>
				  </s:if>
				  <s:else>
                 <s:iterator value="interchangeList" status="inter">
                  <tr>
					<td style="text-align:left">&nbsp;&nbsp;<s:property value="#inter.count"/></td>
                    <td style="text-align: left">&nbsp;&nbsp;<a href="${opt.showAction}?id=<s:property value='qid' />&question=<s:property value='question' />">
                      <s:property value='question' />
                    </a> </td>
                    <td style="text-align:left">&nbsp;&nbsp;<s:date name="opertime" format="yyyy-MM-dd HH:mm:ss" /></td>
                    <td style="text-align:left">&nbsp;&nbsp;<s:property value='username' /></td>
                    <td style="text-align:left">&nbsp;&nbsp;
						<a href="${opt.showAction}?id=<s:property value='qid' />&question=<s:property value='question' />">【查看互动信息】</a>
						<a href="${opt.addAction}?id=<s:property value='qid'/>&question=<s:property value='question' />">【回答】</a>
					</td>
                  </tr>
                </s:iterator>
				</s:else>
				<tr class="trstyle">
				  <td colspan="5" style="text-align:left">
				   <label><div class="page"><s:property value='pageString' escape='false'/></div></label>
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
<!--日期格式限定-->
$('.datetime').datepicker({
	dateFormat:"yy-mm-dd"
});
<!--表单重置-->
 function interchangereset(){
 //  $('#searchquestion').attr('value','');
    $('#searchquestion').attr('value','');
   
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