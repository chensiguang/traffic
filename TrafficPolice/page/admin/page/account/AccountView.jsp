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
<style type="text/css">
body {
	background: #FFF
}
</style>
</head>
<div id="contentWrap">
	<div class="pageTitle">账号管理</div>
	<div class="pageButton">
		<a href="${action}">【修改内容】</a><a href="javascript:history.back()">【返回】</a>
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
							<h1>${dom.loginname}</h1>
							<h2>发布时间：${dom.regtime}
							<s:iterator value="accountList">
								&nbsp;&nbsp;&nbsp;&nbsp;操作人:<s:property value="admin.username"/>
							 </s:iterator>
                            </h2>
							<div class="ztlr">
							<p style="text-align: center;"></p>
								电话：${dom.telephone}
								<div class="c"></div>
								
								<p style="text-align: center;"></p>
								地址:${dom.address}
								<div class="c"></div>
							  
								<p style="text-align: center;"></p>
								邮箱：${dom.email}
								<div class="c"></div>
								
								<p style="text-align: center;"></p>
								备注：${dom.remark}
								<div class="c"></div>
								
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