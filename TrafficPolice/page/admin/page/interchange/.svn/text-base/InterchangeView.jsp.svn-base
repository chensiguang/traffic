<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String basePath = (String)session.getAttribute("basePath");
	String question = (String) request.getParameter("question");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="page/admin/css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
body {
	background: #FFF
}
</style>
</head>
<div id="contentWrap">
	<div class="pageTitle">问题互动</div>
	<div class="pageButton">
		<a href="javascript:history.back()">【返回】</a>
	</div>
	<table align="center">
		<tr>
			<td>
				<div class="lright">
					<div class="box3 leirong">
						<div class="boxt">
							<div class="l"></div>
							<div class="r"></div>
						</div>
						<div class="boxcr">
							<h1><%=question%></h1>
							<h2> <!--回答时间:${dom.opertime}--></h2>
							<div class="ztlr">
								 <s:iterator value="interchangeList" status="inter">
								 <p align="left"><h4><s:property value="#inter.count"/>.回答人：<s:property value='username'/>&nbsp;回答时间：<s:date name="opertime" format="yyyy-MM-dd HH:mm:ss" /></h4><a href="${opt.editAction}?id=<s:property value='aid'/>"><font color="#0000FF">【修改内容】</font></a><a href="javascript:deleteData('<s:property value='aid' />')"><font color="#0000FF">【删除】</font></a></p>
								 <p>答：<s:property value='answer'/></p>
								 </s:iterator>
							</div>
							<div class="c"></div>
						</div>
						<div class="boxb">
							<div class="l"></div>
							<div class="r"></div>
						</div>
					</div>
				</div>
			</td>
		</tr>
	</table>
</div>
</body>
</html>
<Script type="text/javascript">
function deleteData(id) {
		if (window.confirm("确定删除记录?")) {
			var action = '<%=basePath%>${opt.deleteAction}';
			action += "?id=" + id;
			location.href = action;
		}

	}
</script>