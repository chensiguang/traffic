<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()
			+ "://"
			+ ("xsaqjy".equals(request.getServerName())
					? "xsaqjy.ljgps.net"
					: request.getServerName())
			+ (request.getServerPort() == 80 ? "" : ":"
					+ request.getServerPort()) + path + "/";
	String id = request.getParameter("id");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>机动车网上交通安全宣传教育监管平台</title>
<link href="page/css/css.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="page/js/jquery.js"></script>
<link rel="stylesheet" href="page/js/pagination/pagination.css" />
<script type="text/javascript" src="page/js/pagination/jquery.pagination.js"></script>
<script type="text/javascript" src="page/js/autoscreen.js"></script>
<script type="text/javascript" src="page/js/index.js"></script>
<!-- the mousewheel plugin -->
<script type="text/javascript" src="page/js/jScroll/jquery.mousewheel.js"></script>
<!-- the jScrollPane script -->
<script type="text/javascript" src="page/js/jScroll/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" src="page/js/jScroll/scroll-startstop.events.jquery.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/js/util.js"></script>
</head>

<body>
	<form>
		<table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left">
					<span id="contenthtml"></span>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
<script type="text/javascript">
loadRuleContent(<%=id%>);
function loadRuleContent(id)
{
	var newcontent = '';
	$.ajax({
		type       :'post',									//可选get
		url        :'getSafeNoticeDatainfo.action',			//这里是接收数据的PHP程序
		data       :'noticeid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType   :'Json',									//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success    :function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re = eval('('+elformat(data)+')');
			newcontent +='<p style="text-align:center;font:14px;"><strong>'+re.noticeTitle+'</strong></p>';
			newcontent +='<p style="text-align:center;">时间: '+re.noticeTime+'</p>';
			newcontent +='<p>'+(re.noticeContent == 'null' ? "暂无详细内容":re.noticeContent)+'</p>';
			$('#contenthtml').html(newcontent);
			autoscroll();
		},
		error:function(){
			alert('error');
		}
	});
	
}
</script>

