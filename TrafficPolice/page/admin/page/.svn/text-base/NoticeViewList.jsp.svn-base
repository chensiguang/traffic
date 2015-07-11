<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
	String basePath = request.getScheme() 
			+ "://" 
			+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
			+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
			+ path
			+ "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="admin/css/style.css" rel="stylesheet" type="text/css" />
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
</script>
</head>

<body>
	<div id="contentWrap">
		<div class="pageTitle">${title}</div>
		<div class="pageColumn">
			<div class="pageButton">
				<a href="${opt.addAction}">【新建内容】</a>
			</div>
			<table>
				<thead>
					<th width="15%">创建日期</th>
					<th width="70%">内容名称</th>
					<th width="15%">操作</th>
				</thead>
				<tbody>
					<s:iterator value="noticeList" status="notice">
						<tr>
							<td><s:date name="createtime" format="yyyy-MM-dd" />
							</td>
							<td style="text-align: left"><a
								href="${opt.showAction}?id=<s:property value='id' />"><s:property
										value='title' />
							</a>
							</td>
							<td><a href="${opt.editAction}?id=<s:property value='id' />">【修改】</a>
								<a href="javascript:deleteData('<s:property value='id' />')">【删除】</a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<div class="page"><s:property value='pageString' escape='false'/></div>
		</div>
	</div>
</body>
</html>