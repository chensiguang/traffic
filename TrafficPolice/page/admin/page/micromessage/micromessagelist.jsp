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


<style type="text/css">
body {
	background: #FFF
}
</style>
<script type="text/javascript">
		
</script>
</head>

<body>
     <form id="ruleform" name="ruleform" action="${opt.delAllAction}">
	<div id="contentWrap">
		<div class="pageTitle">微博互动</div>
			<iframe width="100%" height="550" class="share_self"
										frameborder="0" scrolling="no"
										src="http://widget.weibo.com/weiboshow/index.php?language=&width=0&height=550&fansRow=2&ptype=1&speed=0&skin=1&isTitle=1&noborder=1&isWeibo=1&isFans=1&uid=3768869531&verifier=bc944b64&dpc=1"></iframe>						
		<div >
		  </div>		
	    </div>
	</div>
		<input name="ids" type="hidden" id="ids" value="" />
	</form>
	
</body>
</html>