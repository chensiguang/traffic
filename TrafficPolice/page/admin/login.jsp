<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String message = (String)session.getAttribute("message");
     
     String str = "";
     
     if(message == null)
     {
    	 str = "";
     }
     else
     {
    	 str = message;
     }


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
<title>机动车网上交通安全宣传教育后台管理</title>
<link href="/TrafficPolice/page/admin/css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/TrafficPolice/page/admin/javascript/jquery.js"></script>
</head>
<body>
	<div id="wrap">
		<div id="header"></div>
		<div id="content-wrap">
			<div class="space" align="center" ><!--<font style="font-size:20px"><h1>机动车网上交通安全宣传教育后台管理</h1></font>--></div>
			<form action="login.action" method="post" onSubmit="return checkInput();">
				<div class="content">
					<div class="field">
						<label>账 户：</label><input id="username" class="username" name="loginname" type="text" onblur="clear()"/>
					</div>
					<div class="field">
						<label>密 码：</label><input id="pwd" class="password"
							name="password" type="password" /><br /><br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color="red"><%=str %><%-- ${message} --%></font>
					</div>
					<div id="msg" class="field"></div>
					<div class="btn">
						<input type="submit" class="login-btn" value=""/>
					</div>
				</div>
			</form>
		</div>
		<div id="footer"></div>
	</div>
</body>
<script type="text/javascript">
	function checkInput() {
		var n = document.getElementById("username");
		var p = document.getElementById("pwd");
		if ("" == n.value) {
            document.getElementById("msg").innerHTML = "用户名不能为空";
            return false;
		}
		if ("" == p.value) {
            document.getElementById("msg").innerHTML = "密码不能为空";
            return false;
		}
		return true;
	}
	
	function clear()
	{
		$("#message").html();
	}
</script>


</html>