<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
		<form id="meetnotice_search_form" name="meetnotice_search_form" action="<%=basePath%>page/admin/page/meetnoticeback_viewMeetNoticeList.action">
			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="10%" style="text-align:right">信息标题:</td>
					<td width="90%" style="text-align:left">
						<input type="text" name="noticeTitle" id="noticeTitle" value="<s:property value='meetnotice.noticeTitle' />"/>
					</td>
				</tr>
				<tr>
					<td width="100%" colspan="4" style="text-align:center">
						<input type="submit" value="查询" />
						<input type="button" value="取消" onClick="meetnotice_search_reset();"/>
					</td>
				</tr>
			</table>
		</form>
		<form id="meetnotice_list_form" name="meetnotice_list_form" action="${opt.delAllAction}">
			<table width="100%">
				<thead>
				  	<th width="44" style="text-align: center">
				  		<input type="checkbox" name="allbox"  onclick='ckall(this)'/>
				  	</th>
					<th width="55"  >序号</th>
					<th width="78" >创建日期</th>
					<th width="94">信息标题</th>
					<th width="281">通知内容</th>
					<th width="103">发布时间</th>
					<th width="134">更新时间</th>
					<th width="177">操作</th>
				<td width="14"></thead>
				<tbody>
					<s:if test="#request.meetnoticeList.size() == 0">
					<tr>
						<td colspan="8" style="text-align:left">【暂无数据】</td>
					</tr>
					</s:if>
					<s:else>
					<s:iterator value="meetnoticeList" status="meetnotice">
					<tr>
						<td class="table-cell" style="text-align:center">
							<input name="id" type="checkbox" class="idcheck" value="<s:property value='id' />"/>
						</td>
						<td style="text-align:left">&nbsp;&nbsp;<s:property value='#meetnotice.index+1' /> </td>
						<td style="text-align:left">&nbsp;&nbsp;<s:date name="regtime" format="yyyy-MM-dd" /></td>
						<td style="text-align:left">&nbsp;&nbsp;
						<s:if test="%{noticeTitle.length() > 8}">
							<s:property value='noticeTitle.substring(0,8) + "..."' />
						</s:if>
						<s:else>
							<s:property value='noticeTitle' />
						</s:else>
								
						</td>
						<td style="text-align:left">&nbsp;&nbsp;
						<s:if test="%{noticeContent.length() > 30}">
							<c:choose>
							<c:when test="${fn:contains(noticeContent,'<')}">
								${noticeContent}
							</c:when>
							<c:otherwise>
								<s:property value="noticeContent.substring(0,30)+'...'"/>
							</c:otherwise>
							</c:choose>
						</s:if>
						<s:else>
							${noticeContent}
						</s:else>
						</td>
						<td style="text-align:left">&nbsp;&nbsp;<s:date name="noticeTime" format="yyyy-MM-dd HH:mm:ss" /></td>
						<td style="text-align:left">&nbsp;&nbsp;<s:date name="opertime" format="yyyy-MM-dd HH:mm:ss" /></td>
						<td style="text-align:left">&nbsp;&nbsp;
						<a href="${opt.showAction}?id=<s:property value='id' />">【详情】</a>
							<a href="${opt.editAction}?id=<s:property value='id' />">【修改】</a>
							<a href="javascript:deleteData('<s:property value='id' />')">【删除】</a>
						</td>
					</tr>
					</s:iterator>
					</s:else>
					<tr class="trstyle">
						<td colspan="4" style="text-align:left">
						<label>
							<input type="hidden" name="lx" id="lx" value="3"/>
							<input type="button" name="button" id="id" value="删除" onClick="meetnotice_list_batch_del()" class="btn" />
							<input type="button" onClick="location.href='${opt.addAction}'" value="新增"/>
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
	    </div>
	</div>
		
</body>
</html>
<script type="text/javascript">
//重置查询的条件值
function meetnotice_search_reset(){
	$('#noticeTitle').attr('value','');
}

//单个删除
function deleteData(id) {
	if (window.confirm("确定删除记录?")) {
		var action = '<%=basePath%>${opt.deleteAction}';
		action += "?id=" + id;
		location.href = action;
	}
}

<!--批量删除-->
function meetnotice_list_batch_del(){
	if( type = ""){
		alert("请选择操作类型");
		return;
	}
	var type = $('#lx').val();
	if(type = 3){
		var ids = "";
		$('input[name=id]:checked:checked').each(function(){
			ids += $(this).val() + "#";
		});
		if(ids == ""){
			alert("请选择您要操作的数据");
			return ;
		}else if (window.confirm("确定删除记录?")){
			$('#ids').val(ids);
			$('#meetnotice_list_form').submit();
		}
	}else{
		$('#meetnotice_list_form').submit();
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