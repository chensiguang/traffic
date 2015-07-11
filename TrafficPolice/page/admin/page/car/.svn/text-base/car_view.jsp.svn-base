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
<body>
<div id="contentWrap">
	<div class="pageTitle">${title}</div>
	<div class="pageButton">
		<a href="${action}">【修改内容】</a><a href="javascript:history.back()">【返回】</a>
	</div>
	<table align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td>
				<div class="lright">
					<div class="box3 leirong">
						<div class="boxt">
							<div class="l"></div>
							<div class="r"></div>
						</div>
						<div class="boxcr">
							<h1>${dom.busLicPlate}</h1>
							<h2>发布时间：${dom.regtime}
							<s:iterator value="carList">
								&nbsp;&nbsp;&nbsp;&nbsp;操作人:<s:property value="admin.username"/>
							 </s:iterator>
                            </h2>
							<div class="ztlr">
								
								<p style="text-align: center;"></p>
								车辆类型：${dom.busType}
								<div class="c"></div>
								
								<p style="text-align: center;"></p>
								所属公司：${dom.company.comname}
								<div class="c"></div>
								
								<p style="text-align: center;"></p>
								所属地区：${dom.area.areaname}
								<div class="c"></div>
								
								<p style="text-align: center;"></p>
								厂牌型号：${dom.factoryType}
								<div class="c"></div>
								
								<p style="text-align: center;"></p>
								生产厂家：${dom.manufacturer}
								<div class="c"></div>
								
								<p style="text-align: center;"></p>
								操作时间：${dom.opertime}
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